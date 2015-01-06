package tda593.hotel.california.integration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.junit.Before;
import org.junit.Test;

import tda593.hotel.california.billing.BankingManager;
import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.CreditCardManager;
import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.facilities.AdminKeyCardManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

public class CheckOutTest extends AbstractHotelCaliforniaIntegrationTest {
	
	private BookingManager bookingManager;
	private BillManager billManager;
	private LegalEntityManager legalEntityManager;
	private RoomManager roomManager;
	private CreditCardManager creditCardManager;
	private BankingManager bankingManager;
	private AdminKeyCardManager keyCardManager;
	private TestAdminBankingManager adminBankingManager;
	
	private List<KeyCard> keyCards = new ArrayList<KeyCard>();
	private Calendar c = Calendar.getInstance();
	
	private Person customer;
	private Room room101, room102;
	
	private static String personBobFirstName = "Bob";
	private static String personBobLastName = "Smith";

	@Before
	public void setUpData() {
		bookingManager = managersHandler.getBookingManager();
		legalEntityManager = managersHandler.getLegalEntityManager();
		roomManager = managersHandler.getRoomManager();
		creditCardManager = managersHandler.getCreditCardManager();
		bankingManager = managersHandler.getBankingManager();
		billManager = managersHandler.getBillManager();
		keyCardManager = managersHandler.getAdminKeyCardManager();
		adminBankingManager = managersHandler.getTestAdminBankingManager();
		
		LegalEntityManager legalEntityManager = managersHandler.getLegalEntityManager();
		AdminRoomManager adminRoomManager = managersHandler.getAdminRoomManager();

		// Create some persons
		legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");
		customer = legalEntityManager.createPerson(personBobFirstName, personBobLastName, "2", "0712345678", "bob@smith.com");

		// Create some room types
		adminRoomManager.addRoomType("RoomType1", "", null, 10);
		adminRoomManager.addRoomType("RoomType2", "", null, 5);

		// Create a room for each room type
		int floor = 1;
		for(RoomType roomType : adminRoomManager.getRoomTypes()) {
			adminRoomManager.addGuestRoom("1"+floor, floor++, "N/A", null, null, roomType, 2, 0);
		}
		
		room101 = adminRoomManager.addGuestRoom("101", 1, "", null, null, adminRoomManager.getRoomTypes().get(0), 2, 0);
		room102 = adminRoomManager.addGuestRoom("102", 1, "", null, null, adminRoomManager.getRoomTypes().get(1), 2, 0);
		
		keyCardManager.removeKeyCard("KEYCARD_01");
		keyCardManager.removeKeyCard("KEYCARD_02");
		keyCardManager.removeKeyCard("KEYCARD_03");
		
		keyCards.add(keyCardManager.getKeyCard("KEYCARD_01"));
		keyCards.add(keyCardManager.getKeyCard("KEYCARD_02"));
		keyCards.add(keyCardManager.getKeyCard("KEYCARD_03"));
	}

	private void bookAndCheckIn(Date from, Date to, Room room) {
		Booking booking = bookingManager.createBooking(from, to, customer, room.getRoomType());
		bookingManager.registerRoom(booking, room);
		BasicEList<Person> guests = new BasicEList<Person>();
		guests.add(customer);
		bookingManager.checkIn(booking, guests);
		billManager.createBookingBill(customer, booking);
	}
	
	/**
	 * This test represents the main flow of the use case: Check out
	 */
	@Test
	public void testCheckOut() {
		// Time span of booking: yesterday to now
		c.setTimeInMillis (System.currentTimeMillis() + 100000);
		Date to = c.getTime();
		c.add(Calendar.DATE, -1);
		Date from = c.getTime();
		bookAndCheckIn(from, to, room101);
		
		// Add a valid credit card to the bankingManager
		c.set(18, 5, 5);
		adminBankingManager.addCreditCard("153819 2910 2910 2910 9201", "669", c.get(Calendar.MONTH),
				c.get(Calendar.YEAR), "John", "Doe");
		adminBankingManager.makeDeposit("153819 2910 2910 2910 9201", "669", c.get(Calendar.MONTH),
				c.get(Calendar.YEAR), "John", "Doe", 20000000);
		assertTrue(creditCardManager.setCreditCardInformation(customer,
				"John", "Doe", "153819 2910 2910 2910 9201", "669", c.getTime(), bankingManager));
		
		// Actor enters the room number.
		// Assume: room number is valid and exists.
		// Assume: the booking existed and it was active.
		String roomNumber = room101.getRoomNumber();
		Booking booking = bookingManager.getActiveBooking(roomNumber);
		assertTrue(booking != null);
		
		// System deactivates the booking (room stay) associated with that room
		bookingManager.checkOut(booking);
		
		// Make sure there is no active booking anymore
		Booking deactivatedBooking = bookingManager.getActiveBooking(roomNumber);
		assertTrue(deactivatedBooking == null);
		
		// The system unregisters key cards from the room
		// Make sure the key card is unregistered
		List<KeyCard> allowedKeyCards = booking.getRoomStay().getRoom().getAllowedKeyCards();
		for(KeyCard keyCard : keyCards) {
			assertFalse(allowedKeyCards.contains(keyCard));
		}
		
		// The system publishes a bill containing all the purchases contained in the room bill
		Bill bill = billManager.getBookingBill(booking);
		assertTrue(bill != null);
		billManager.publishBill(bill);
		
		// Assume: the bill is not paid
		// Actor chooses to pay the bill
		assertTrue(billManager.markBillAsPaid(bill, true, bankingManager, creditCardManager));
	}
	
	@Test
	public void testCheckOutWithInvalidOrNonExistentRoomNumber() {
		// Actor enters the room number.
		// Alt flow: Invalid room number...
		String roomNumber = "£$&21_1";
		Booking booking = bookingManager.getActiveBooking(roomNumber);
		assertTrue(booking == null);
		
		// ..or non-existing room number
		roomNumber = "103";
		booking = bookingManager.getActiveBooking(roomNumber);
		assertTrue(booking == null);
	}
	
	@Test
	public void testCheckOutWithNoAssociatedBooking() {
		// Insert a booking currently active, but on another room
		c.setTimeInMillis (System.currentTimeMillis() + 1000);
		Date to = c.getTime();
		c.add(Calendar.DATE, -1);
		Date from = c.getTime();
		bookAndCheckIn(from, to, room101);
		
		// Insert an inactive booking on the specified room  
		bookingManager.createBooking(from, to, customer, room102);
		
		// Actor enters the room number.
		// Assume: room number is valid and exists.
		// Assume: the booking existed and it was active.
		String roomNumber = room102.getRoomNumber();
		Booking booking = bookingManager.getActiveBooking(roomNumber);
		assertTrue(booking == null);
	}
	
	@Test
	public void testCheckOutUnsucessfulPayment() {
		// Time span of booking: yesterday to now
		c.setTimeInMillis (System.currentTimeMillis() + 1000);
		Date to = c.getTime();
		c.add(Calendar.DATE, -1);
		Date from = c.getTime();
		bookAndCheckIn(from, to, room101);
		
		// The system publishes a bill containing all the purchases contained in the room bill
		Bill bill = billManager.getBookingBill(bookingManager.getActiveBooking(room101.getRoomNumber()));
		// Set the credit card info to be invalid
		creditCardManager.setCreditCardInformation(bill.getCustomer(), 
				"John", "Doe", "150000 0000 0000 000", "000", from, bankingManager);
		
		assertTrue(bill != null);
		billManager.publishBill(bill);
		
		// Assume: the bill is not paid
		// Actor chooses to pay the bill
		// Payment does not go through, actor wants to retry the payment a few times
		int retries = 3;
		for(int i=0; i < retries; i++) {
			assertFalse(billManager.markBillAsPaid(bill, true, bankingManager, creditCardManager));
		}
		
		// actor wants to change credit card information and tries again
		c.set(18, 5, 5);
		adminBankingManager.addCreditCard("153819 2910 2910 2910 9201", "669", c.get(Calendar.MONTH),
				c.get(Calendar.YEAR), "John", "Doe");
		adminBankingManager.makeDeposit("153819 2910 2910 2910 9201", "669", c.get(Calendar.MONTH),
				c.get(Calendar.YEAR), "John", "Doe", 20000000);

		creditCardManager.setCreditCardInformation(bill.getCustomer(), 
				"John", "Doe", "153819 2910 2910 2910 9201", "669", c.getTime(), bankingManager);
		// Correct info was entered
		assertTrue(billManager.markBillAsPaid(bill, true, bankingManager, creditCardManager));
		
		// Make sure that if the bill is paid, it does not charge again
		assertFalse(billManager.markBillAsPaid(bill, true, bankingManager, creditCardManager));
	}
}

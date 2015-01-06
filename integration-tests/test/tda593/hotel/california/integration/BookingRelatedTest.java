package tda593.hotel.california.integration;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import tda593.hotel.california.billing.BankingManager;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.CreditCardManager;
import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.StayRequest;
import tda593.hotel.california.booking.util.BookingSwitch;
import tda593.hotel.california.facilities.AdminKeyCardManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.GuestRoom;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

public class BookingRelatedTest extends AbstractHotelCaliforniaIntegrationTest {

	private BookingManager bookingManager;
	private BillManager billManager;
	private LegalEntityManager legalEntityManager;
	private RoomManager roomManager;
	private AdminRoomManager adminRoomManager;
	private CreditCardManager creditCardManager;
	private BankingManager bankingManager;
	private AdminKeyCardManager keyCardManager;
	private TestAdminBankingManager adminBankingManager;
	
	private List<KeyCard> keyCards = new ArrayList<KeyCard>();
	private Calendar c = Calendar.getInstance();
	
	private Person customer1, customer2;
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
		adminRoomManager = managersHandler.getAdminRoomManager();

		// Create some persons
		customer1 = legalEntityManager.createPerson(personBobFirstName, personBobLastName, "2", "0712345678", "bob@smith.com");
		customer2 = legalEntityManager.createPerson("somename", "somelastname", "3", "0712345678", "hej@smith.com");

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

	}

	private Booking bookAndCheckIn(Date from, Date to, Room room, Person customer) {
		Booking booking = bookingManager.createBooking(from, to, customer, room.getRoomType());
		bookingManager.registerRoom(booking, room);
		BasicEList<Person> guests = new BasicEList<Person>();
		guests.add(customer);
		bookingManager.checkIn(booking, guests);
		billManager.createBookingBill(customer, booking);
		
		return booking;
	}
	
	/**
	 * Tests the FRs #026, #026a, #026b and #045:
	 * A receptionist should be able to register a request 
	 * (such as extra towels or tooth paste), made by a guest during his/her stay.
	 */
	@Test
	public void testRegisterStayRequest() {
		// Time span of bookings: yesterday to now
		c.setTimeInMillis (System.currentTimeMillis() + 100000);
		Date to = c.getTime();
		c.add(Calendar.DATE, -1);
		Date from = c.getTime();
		bookAndCheckIn(from, to, room101, customer1);
		
		bookAndCheckIn(from, to, room102, customer2);
		
		// A guest now asks for some extra towels
		// The receptionist asks which room he's staying in and system finds the booking
		Booking booking1 = bookingManager.getActiveBooking(room101.getRoomNumber());
		assertTrue(bookingManager.addStayRequest(booking1, "Extra towls requested") != null);
		assertEquals(booking1.getStayRequests().size(), 1);
		
		Booking booking2 = bookingManager.getActiveBooking(room102.getRoomNumber());
		// Now another guest comes comes down and asks for some water
		assertTrue(bookingManager.addStayRequest(booking2, "Some water") != null);
		assertEquals(booking2.getStayRequests().size(), 1);
		
		// Before anyone can tend to the requests the first guest wants some complimentary tooth paste
		assertTrue(bookingManager.addStayRequest(booking2, "Send some up some tooth paste") != null);
		assertEquals(booking2.getStayRequests().size(), 2);
		assertEquals(booking2.getStayRequests().get(1).getText(), "Send some up some tooth paste");
		
		// Now a staff member tends to the requests
		Map<Booking, EList<StayRequest>> stayRequests = bookingManager.getStayRequests();
		assertEquals(2, stayRequests.size());
		
		// The staff member reviews the requests by booking
		for(Entry<Booking, EList<StayRequest>> entry : stayRequests.entrySet()) {
			assertTrue(entry.getValue().size() > 0);
			for(StayRequest request : entry.getValue()) {
				bookingManager.removeStayRequest(entry.getKey(), request);
			}
		}
		
		booking1 = bookingManager.getActiveBooking(room101.getRoomNumber());
		booking2 = bookingManager.getActiveBooking(room102.getRoomNumber());
		
		// Make sure the requests are removed
		assertEquals(0, booking1.getStayRequests().size());
		assertEquals(0, booking2.getStayRequests().size());
		
		assertEquals(0, bookingManager.getStayRequests().size());
	}
	
	/**
	 * Tests FR #022: "A receptionist should be able to register special
	 * requests, as comments, made by customer, regarding the booking."
	 */
	@Test
	public void testRegisterSpecialRequest() {
		// Time span of bookings: yesterday to now
		c.setTimeInMillis (System.currentTimeMillis() + 100000);
		Date to = c.getTime();
		c.add(Calendar.DATE, -1);
		Date from = c.getTime();
		
		bookAndCheckIn(from, to, room101, customer1);
		Booking booking1 = bookingManager.getActiveBooking(room101.getRoomNumber());
		
		bookAndCheckIn(from, to, room102, customer2);
		Booking booking2 = bookingManager.getActiveBooking(room102.getRoomNumber());
		
		bookingManager.setSpecialRequest(booking1, "TEST1-1");
		bookingManager.setSpecialRequest(booking1, "TEST1-2");
		bookingManager.setSpecialRequest(booking2, "TEST2");
		
		// Reload
		booking1 = bookingManager.getActiveBooking(room101.getRoomNumber());
		booking2 = bookingManager.getActiveBooking(room102.getRoomNumber());
		
		assertEquals(booking1.getSpecialRequest(), "TEST1-2");
		assertEquals(booking2.getSpecialRequest(), "TEST2");
	}
	
	/**
	 * Tests FR #008: "A receptionist should be able to get an overview of all
	 * the registered guests in the hotel at the moment."
	 */
	@Test
	public void testViewRegisteredGuests() {
		c.setTimeInMillis (System.currentTimeMillis() + 100000);
		
		Date to1 = c.getTime();
		c.add(Calendar.DATE, -1);
		Date from1 = c.getTime();
		bookAndCheckIn(from1, to1, room101, customer1);
		
		Date to2 = c.getTime();
		c.add(Calendar.DATE, -1);
		Date from2 = c.getTime();
		bookAndCheckIn(from2, to2, room102, customer2);
		
		c.add(Calendar.HOUR_OF_DAY, 12);
		Date pseudoCurrent = c.getTime();
		
		List<Booking> bookings = bookingManager.getBookings(pseudoCurrent, pseudoCurrent);
		assertEquals(bookings.size(), 1);
		assertEquals(bookings.get(0).getRoomStay().getRegisteredPersons().get(0), customer2);
	}

	/**
	 * Tetsts FR #023: "A receptionist should be able to view a guest���s hotel
	 * history, such as bookings, personal information etc."
	 */
	@Test
	public void testViewGuestBookingHistory() {
		c.setTimeInMillis (System.currentTimeMillis() + 100000);
		Date to1 = c.getTime();
		c.add(Calendar.DATE, -1);
		Date from1 = c.getTime();
		c.add(Calendar.DATE, -1);
		Date to2 = c.getTime();
		c.add(Calendar.DATE, -1);
		Date from2 = c.getTime();
		
		bookAndCheckIn(from1, to1, room101, customer1);
		bookingManager.checkOut(bookingManager.getActiveBooking(room101.getRoomNumber()));
		bookAndCheckIn(from2, to2, room101, customer1);
		bookAndCheckIn(from1, to1, room102, customer1);
		
		assertEquals(3, bookingManager.getBookings(customer1).size());
	}
	
	/**
	 * Tests FR #010: "A receptionist should be able to modify a booking."
	 */
	@Test
	public void testModifyBookingDates() {
		RoomType limitedRoomType = adminRoomManager.addRoomType("LimtiedRoomType", "", null, 10);
		GuestRoom room = adminRoomManager.addGuestRoom("999", 1, "", null, null, limitedRoomType, 2, 0);
		
		Date from, to;
		
		// Customer 2 booking, later than customer 1's booking until the collision check below
		c.set(2015, 1, 21);
		from = c.getTime();
		c.set(2015, 1, 22);
		to = c.getTime();
		bookAndCheckIn(from, to, room, customer2);
		
		// Customer 1 booking and changes follow...
		c.set(2015, 1, 10);
		from = c.getTime();
		c.set(2015, 1, 20);
		to = c.getTime();
		Booking booking = bookAndCheckIn(from, to, room, customer1);
		
		// Shrink start
		c.set(2015, 1, 11);
		from = c.getTime();
		c.set(2015, 1, 20);
		to = c.getTime();
		assertTrue(bookingManager.changeBookingDates(booking, from, to));
		booking = bookingManager.getBooking(booking.getId());// Reload
		assertEquals(from, booking.getStartDate());
		assertEquals(to, booking.getEndDate());
		
		// Shrink end
		c.set(2015, 1, 11);
		from = c.getTime();
		c.set(2015, 1, 19);
		to = c.getTime();
		assertTrue(bookingManager.changeBookingDates(booking, from, to));
		booking = bookingManager.getBooking(booking.getId());// Reload
		assertEquals(from, booking.getStartDate());
		assertEquals(to, booking.getEndDate());
		
		// Extend both sides of interval
		c.set(2015, 1, 10);
		from = c.getTime();
		c.set(2015, 1, 20);
		to = c.getTime();
		assertTrue(bookingManager.changeBookingDates(booking, from, to));
		booking = bookingManager.getBooking(booking.getId());// Reload
		assertEquals(from, booking.getStartDate());
		assertEquals(to, booking.getEndDate());
		
		// Extend end, end just touches but doesn't overlap the next booking
		c.set(2015, 1, 10);
		from = c.getTime();
		c.set(2015, 1, 21);
		to = c.getTime();
		assertTrue(bookingManager.changeBookingDates(booking, from, to));
		booking = bookingManager.getBooking(booking.getId());// Reload
		assertEquals(from, booking.getStartDate());
		assertEquals(to, booking.getEndDate());
		
		// Extend beginning
		c.set(2015, 1, 9);
		from = c.getTime();
		c.set(2015, 1, 21);
		to = c.getTime();
		assertTrue(bookingManager.changeBookingDates(booking, from, to));
		booking = bookingManager.getBooking(booking.getId());// Reload
		assertEquals(from, booking.getStartDate());
		assertEquals(to, booking.getEndDate());
		
		// Overlap at end and fail, don't modify booking
		Date lastTo = to;
		c.set(2015, 1, 9);
		from = c.getTime();
		c.set(2015, 1, 22);
		to = c.getTime();
		assertFalse(bookingManager.changeBookingDates(booking, from, to));
		booking = bookingManager.getBooking(booking.getId());// Reload
		assertEquals(from, booking.getStartDate());
		assertEquals(lastTo, booking.getEndDate());
	}
	
	/**
	 * Tests FR #009b: A receptionist should be able to cancel a booking for a customer 
	 * 					without restrictions (other than when the booking is checked in), 
	 * 					including being able to bill the customer even though he/she didn’t 
	 * 					stay at the hotel.
	 */
	@Test
	public void testSetBookingAsCanceled() {
		// Time span of bookings: yesterday to about now
		c.setTimeInMillis (System.currentTimeMillis() - 100000);
		Date to = c.getTime();
		c.add(Calendar.DATE, -1);
		Date from = c.getTime();
		
		
		Booking booking = bookingManager.createBooking(from, to, customer1, room101);
		assertEquals(1, bookingManager.getBookings(customer1).size());
		bookingManager.cancelBooking(booking);
		
		// If canceled, the booking manager shouldn't return a booking
		assertEquals(0, bookingManager.getBookings(customer1).size());
		
		// Make a new booking, check it in and make sure it can't be canceled
		bookAndCheckIn(from, to, room102, customer1);
		assertEquals(1, bookingManager.getBookings(customer1).size());
		
		// Billing the customer is already tested in BillCustomerTest
	}
}

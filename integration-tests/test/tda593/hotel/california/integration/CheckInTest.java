package tda593.hotel.california.integration;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tda593.hotel.california.billing.BankingManager;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.CreditCardManager;
import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Organization;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.facilities.AdminKeyCardManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

public class CheckInTest extends AbstractHotelCaliforniaIntegrationTest {

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
	
	
	private RoomType roomType1, roomType2;
	private Room room101, room102;
	private KeyCard keyCard1, keyCard2;
	
	private Person customer, sam;
	private Organization organization;
	private static String personBobFirstName = "Bob";
	private static String personBobLastName = "Smith";

	private static String personSamFirstName = "Sam";
	private static String personSamLastName = "Smith";
	
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
		sam = legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");
		customer = legalEntityManager.createPerson(personBobFirstName, personBobLastName, "2", "0712345678", "bob@smith.com");
		organization = this.legalEntityManager.createOrganization("The company", "6786876-12", "+460000000021", "admin@thecompany.se");
		
		// Create some room types
		roomType1 = adminRoomManager.addRoomType("RoomType1", "", null, 10);
		roomType2 = adminRoomManager.addRoomType("RoomType2", "", null, 5);

		room101 = adminRoomManager.addGuestRoom("101", 1, "", null, null, adminRoomManager.getRoomTypes().get(0), 2, 0);
		room102 = adminRoomManager.addGuestRoom("102", 1, "", null, null, adminRoomManager.getRoomTypes().get(1), 2, 0);
		
		keyCardManager.addKeyCard("KEYCARD_01");
		keyCardManager.addKeyCard("KEYCARD_02");
		keyCardManager.addKeyCard("KEYCARD_03");
		
		keyCards.add(keyCardManager.getKeyCard("KEYCARD_01"));
		keyCards.add(keyCardManager.getKeyCard("KEYCARD_02"));
		keyCards.add(keyCardManager.getKeyCard("KEYCARD_03"));
	}


	/**
	 * This is the main flow of the use case: Check in
	 */
	@Test
	public void testCheckIn() {
		// Set up two bookings, one which has already expired and one which the customer is to check in now
		c.set(2012, 9, 10);
		Date from = c.getTime();
		c.set(2012, 9, 14);
		Date to = c.getTime();
		//Booking pastBooking = bookingManager.createBooking(from, to, customer, room101);
		//bookingManager.checkIn(pastBooking, null);
		
		c.setTimeInMillis(System.currentTimeMillis() - 3600000);
		from = c.getTime();
		c.add(Calendar.DATE, 3);
		to = c.getTime();
		bookingManager.createBooking(from, to, customer, roomType1);
		
		// The actor enters the name of the customer responsible for the booking.
		List<Person> results = legalEntityManager.findPerson(personBobFirstName, personBobLastName);
		// Assume: there is at least one registered customer by that name.
		assertTrue(results.size() > 0);
		// Actor chooses the correct customer.
		Person customer = results.get(0);
		
		// Assume: there is at least one “not checked in yet”-booking with the entered customer name, 
		//         which end date has not passed
		c.setTimeInMillis(System.currentTimeMillis());
		List<Booking> bookings = bookingManager.getBookings(c.getTime(), c.getTime(), customer);
		assertTrue(bookings.size() > 0);
		
		// The system finds the booking(s) and presents them.
		// The actor chooses which booking(s) to check in.
		Booking booking = bookings.get(0);
		
		// Choice: the actor enters person(s) that should be guest(s) on on the room(s).
		try {
			results = legalEntityManager.findPerson(personSamFirstName, personSamLastName);
			// Assume: the entered persons exist in the system
			EList<Person> guests = new BasicEList<Person>();
			// Choose person
			guests.add(results.get(0));
			guests.add(customer);
			
			// The system finds available room, initiates rooms stay and registers the entered Persons on the room.
			bookingManager.checkIn(booking, guests);
		} catch (IllegalStateException e) {
			fail("The system failed to provide a room type.");
		}
		
		String roomNumber = booking.getRoomStay().getRoom().getRoomNumber();
		
		// Assume the booking hasn’t been paid: The system creates the booking bill and adds the booking to it.
		// NOTE: The alternative flow: The bill has been paid would just end here
		assertTrue(billManager.getBookingBill(booking) == null);
		
		billManager.createBookingBill(customer, booking);
		
		// The actor enters key cards to be registered. Include (Use Case: Register Key Card)
		// Brief summary of the main flow in the "Register key card use case"
		// This is probably done by some external key card scanner component later on
		KeyCard bobKeyCard = keyCardManager.getKeyCard(keyCard1.getId());
		KeyCard samKeyCard = keyCardManager.getKeyCard(keyCard2.getId());
		
		roomManager.registerKeyCard(bobKeyCard, roomNumber);
		roomManager.registerKeyCard(samKeyCard, roomNumber);
		
		// POST CONDITION
		// Provided that the actor finds a customer and chooses to check in a room the customer 
		// has booked that also is available at the moment, the room and customer have an active 
		// room stay that matches the booking. 
		Booking controllBooking = bookingManager.getActiveBooking(roomNumber); 
		assertTrue(controllBooking != null); // The booking is active
		
		// For each valid key card number that the actor supplies, 
		// the card is registered on the assigned room of the booking
		assertTrue(roomManager.getRoom(roomNumber).getAllowedKeyCards().contains(samKeyCard));
		assertTrue(roomManager.getRoom(roomNumber).getAllowedKeyCards().contains(bobKeyCard));
		
		// Additionally, if the actor chooses to register any person that exists, they become guests on that room stay.
		assertTrue(booking.getRoomStay().getRegisteredPersons().contains(customer));
		assertTrue(booking.getRoomStay().getRegisteredPersons().contains(sam));
	}
	
	/**
	 * Tests the alternative flow: No registered customer on entered name
	 */
	@Test
	public void testCheckInNoValidCustomer() {
		// The actor enters the name of the customer responsible for the booking.
		List<Organization> results = legalEntityManager.findOrganization("The compan");
		// No registered customer on entered name'
		// System alerts the actor of the error.
		assertTrue(results.size() == 0);
		
		// Start from action step 1 (rewrite name).
		results = legalEntityManager.findOrganization(organization.getName());
		assertTrue(results.size() > 0);
		
		// Go back to the main flow....
		// Actor chooses the correct customer.
		LegalEntity customer = results.get(0);
	}
	
	/**
	 * Tests the alternative flow: No “not checked in yet”-bookings with the entered name.
	 */
	@Test
	public void testCheckInNoCheckInBooking() {
		// Set up three bookings, one which has already expired and one in the future
		// and one currently active (already checked in)
		c.set(2012, 9, 10);
		Date from = c.getTime();
		c.set(2012, 9, 14);
		Date to = c.getTime();
		//Booking pastBooking = bookingManager.createBooking(from, to, customer, room101);
		//bookingManager.checkIn(pastBooking, null);
		
		c.setTimeInMillis(System.currentTimeMillis());
		c.add(Calendar.MONTH, 1);
		from = c.getTime();
		c.add(Calendar.DATE, 3);
		to = c.getTime();
		bookingManager.createBooking(from, to, customer, roomType1);
		
		c.setTimeInMillis(System.currentTimeMillis() - 3600000);
		from = c.getTime();
		c.add(Calendar.DATE, 3);
		to = c.getTime();
		bookingManager.createBooking(from, to, customer, roomType1);
		//bookingManager.checkIn(pastBooking, null);
		
		// Get bookings in which has a time span that includes the current time stamp
		c.setTimeInMillis(System.currentTimeMillis());
		List<Booking> bookings = bookingManager.getBookings(c.getTime(), c.getTime(), customer);
		
		// No “not checked in yet”-bookings with the entered name.
		// There is one active booking for which the customer is responsible
		assertTrue(bookings.size() == 1);
		// That booking is however already checked in
		assertTrue(bookings.get(0).getRoomStay() != null);
		// The system alerts the actor of the error...
		
		// Back to main flow to try another customer or exit..
	}
	
	@Test
	public void TestCustomerCanCheckInNoRoomOfThatRoomTypeAvailable() {
		// Set up two bookings, one the same room type, right after one another
		c.setTimeInMillis(System.currentTimeMillis() - 1000);
		Date to = c.getTime();
		c.add(Calendar.DATE, -3);
		Date from = c.getTime();
		//Booking pastBooking = bookingManager.createBooking(from, to, customer, roomType1);
		//bookingManager.checkIn(pastBooking, null);
		
		c.add(Calendar.DATE, 3);
		from = c.getTime();
		c.add(Calendar.DATE, 3);
		to = c.getTime();
		bookingManager.createBooking(from, to, customer, roomType1);
		
		c.setTimeInMillis(System.currentTimeMillis());
		List<Booking> bookings = bookingManager.getBookings(c.getTime(), c.getTime(), customer);
		// Should return the 2nd booking above
		assertEquals(1, bookings.size());
		
		Booking booking = bookings.get(0);
		
		// No available room of that room type, but of others (because previous guests have not checked out).
		try {	
			bookingManager.checkIn(booking, new BasicEList<Person> () {});
			fail("There is no available room of that room type, since the first booking hasn't been checked out");
		} catch (IllegalStateException e) {
			// The system tells the actor that room(s) of that type isn't available.
		}
		
		// Choice: the actor queries the system for other available rooms of a different room type
		List<Room> availableRooms = bookingManager.getAvailableRooms(from, to);
		// Assume: there is at least one available room of a different room type. 
		assertTrue(availableRooms.size() > 0);
		Room chosenRoom = availableRooms.get(0);
		
		bookingManager.registerRoom(booking, chosenRoom);
		
		// Now try check in
		try {	
			bookingManager.checkIn(booking, new BasicEList<Person> () {});
		} catch (IllegalStateException e) {
			fail("The booking is now assigned a room and should be able to be checked in");
		}
		
	}
	
	@Test
	public void TestCustomerCanCheckIn() {
		// Get THE customer
		Person customer = legalEntityManager.getPerson("1");

		// Create a new booking for some room
		Room room = roomManager.getRooms().get(0);
		bookingManager.createBooking(new Date(0), new Date(60 * 60 * 24), customer, room);

		// Create a list of guests
		EList<Person> guests = new BasicEList<>();
		guests.add(customer);

		// Get the booking
		List<Booking> bookings = bookingManager.getBookings(customer);
		Booking booking = bookings.get(0);

		assertFalse(booking.getRoomStay().isActive());

		bookingManager.checkIn(booking, guests);

		assertTrue(booking.getRoomStay().isActive());
		assertTrue(booking.getRoomStay().getRegisteredPersons().contains(customer));
	}
}

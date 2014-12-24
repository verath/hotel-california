package tda593.hotel.california.integration;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.util.BookingSwitch;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;


public class BookSpecificRoomTest extends AbstractHotelCaliforniaIntegrationTest {

	private BookingManager bookingManager;
	private LegalEntityManager legalEntityManager;
	private RoomManager roomManager;
	
	private Calendar c = Calendar.getInstance();

	private static String personBobFirstName = "Bob";
	private static String personBoblastname = "Smith";
	
	@BeforeClass
	public static void setUpData() {
		LegalEntityManager legalEntityManager = managersHandler.getLegalEntityManager();
		AdminRoomManager adminRoomManager = managersHandler.getAdminRoomManager();

		// Create some persons
		legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");
		legalEntityManager.createPerson(personBobFirstName, personBoblastname, "2", "0712345678", "bob@smith.com");

		// Create some room types
		adminRoomManager.addRoomType("RoomType1", "", null, 10);
		adminRoomManager.addRoomType("RoomType2", "", null, 5);

		// Create a room for each room type
		int floor = 1;
		for(RoomType roomType : adminRoomManager.getRoomTypes()) {
			adminRoomManager.addRoom("1"+floor, floor++, "N/A", null, null, roomType);
		}

	}
	
	public BookSpecificRoomTest() {
		bookingManager = managersHandler.getBookingManager();
		legalEntityManager = managersHandler.getLegalEntityManager();
		roomManager = managersHandler.getRoomManager();
	}

	/**
	 * This test represents the main flow of the use case: Book Specific room
	 */
	@Test
	public void testBookSpecificRoom() {
		// Actor enters the date range and room number.
		c.set(2015, 5, 19);
		Date from = c.getTime();
		c.set(2015, 5, 21);
		Date to = c.getTime();
		Room room = roomManager.getRooms().get(1);
		
		// Assume: date range and room number are valid and room is available.
		assertTrue(bookingManager.isRoomAvailable(from, to, room.getRoomNumber()));
		
		// Actor enters customer name.
		// Assume: valid input and the customer exists.
		List<Person> hits = legalEntityManager.findPerson(personBobFirstName, personBoblastname);
		assertTrue(hits.size() > 0);
		
		// Actor chooses the correct customer.
		Person customer = hits.get(0);
		
		// Assume: credit card information is valid
		// System asks for a confirmation of the booking.
		// Assume: actor confirmed the booking. 
		int countBefore = bookingManager.getBookings(from, to).size();
		int customerCountBefore = bookingManager.getBookings(customer).size();
		bookingManager.createBooking(from, to, customer, roomManager.getRooms().get(1));
		int countAfter = bookingManager.getBookings(from, to).size();
		
		// Make sure exactly 1 booking was made
		assertEquals(countAfter, countBefore +1);
		
		// Make sure the booking is registered on the right customer,
		// room and time span
		EList<Booking> bookings = bookingManager.getBookings(customer);
		assertEquals(bookings.size(), customerCountBefore + 1);
		Booking booking = bookings.get(customerCountBefore);
		
		// Room checks
		assertNotEquals(booking.getRoomStay(), null);
		assertFalse(booking.getRoomStay().isActive());
		assertEquals(booking.getRoomStay().getRoom().getRoomNumber(), room.getRoomNumber());
		assertEquals(booking.getRoomType().getName(), room.getRoomType().getName());
		
		// Date checks
		assertEquals(booking.getStartDate(), from);
		assertEquals(booking.getEndDate(), to);
		
		// Customer check
		assertEquals(customer.getId(), booking.getResponsible().getId());
	}
	
	/**
	 * This test represents the actions which causes the "Room is not available" 
	 * alternative flow.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testBookSpecificRoomThatIsUnavailable() {
		// Create a booking to make the room unavailable
		c.set(2015, 2, 9);
		Date otherFrom = c.getTime();
		c.set(2015, 2, 14);
		Date otherTo = c.getTime();
		Room room = roomManager.getRooms().get(0);
		bookingManager.createBooking(otherFrom, otherTo, legalEntityManager.getPerson("1"), room);
		System.out.println("hejsan" + (bookingManager.isRoomAvailable(otherFrom, otherTo, room.getRoomNumber())? "True" : "false"));
		
		// Actor enters the date range and room number.
		c.set(2015, 2, 9);
		Date from = c.getTime();
		c.set(2015, 2, 12);
		Date to = c.getTime();
		
		// Assume: ...room is available. 
		assertFalse(bookingManager.isRoomAvailable(from, to, room.getRoomNumber()));
		
		// If the actor enters a time span which overlaps that of the booking above
		c.set(2015, 2, 12);
		from = c.getTime();
		c.set(2015, 2, 15);
		to = c.getTime();
		assertFalse(bookingManager.isRoomAvailable(from, to, room.getRoomNumber()));
		
		// Test overlapping at the other end
		c.set(2015, 2, 8);
		from = c.getTime();
		c.set(2015, 2, 10);
		to = c.getTime();
		assertFalse(bookingManager.isRoomAvailable(from, to, room.getRoomNumber()));

		// Make sure you canno't book an unavailable room
		int countBefore = bookingManager.getBookings(from, to).size();
		bookingManager.createBooking(from, to, legalEntityManager.getPerson("1"), room);
		int countAfter = bookingManager.getBookings(from, to).size();
		assertEquals(countBefore, countAfter);
	}

	@Test
	public void testBookSpecificRoomWithInvalidInput() {
		
	}
	
	@Test
	public void testBookSpeciciRoomWithNoRegisteredCustomer() {
		
	}
	
	@Test
	public void testBookSpecificRoomThatDoesNotExist() {
		
	}
	
	@Test
	public void testBookSpecificRoomWithNoValidCreditCard() {
		
	}
}

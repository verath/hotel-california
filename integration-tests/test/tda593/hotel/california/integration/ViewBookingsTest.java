package tda593.hotel.california.integration;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

public class ViewBookingsTest extends AbstractHotelCaliforniaIntegrationTest{

	private BookingManager bookingManager;
	private RoomManager roomManager;
	private LegalEntityManager legalEntityManager; 
	
	private Calendar c = Calendar.getInstance();
	
	@Before
	public void setUpData() {
		bookingManager = managersHandler.getBookingManager();
		roomManager = managersHandler.getRoomManager();
		legalEntityManager = managersHandler.getLegalEntityManager();
		
		AdminRoomManager adminRoomManager = managersHandler.getAdminRoomManager();

		// Create some room types
		adminRoomManager.addRoomType("RoomType1", "", null, 1);
		adminRoomManager.addRoomType("RoomType2", "", null, 2);
		adminRoomManager.addRoomType("RoomType3", "", null, 3);

		// Create two room for each room type, eight room in total
		int floor = 1;
		for(RoomType roomType : adminRoomManager.getRoomTypes()) {
			adminRoomManager.addGuestRoom(floor+"1", floor++, "N/A", null, null, roomType, 2, 0);
			adminRoomManager.addGuestRoom(floor+"2", floor++, "N/A", null, null, roomType, 2, 0);
		}

		// Create some persons
		legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");
		legalEntityManager.createPerson("Bob", "Smith", "2", "0712345678", "bob@smith.com");
		
		
	}

	/**
	 * This is more or less main flow of the use case: Search for available rooms
	 */
	@Test
	public void testViewBookings() {	
	
		// Actor enters time period.
		c.set(2015, 5, 10);
		Date from = c.getTime();
		c.set(2015, 5, 14);
		Date to = c.getTime();
		
		// Lets create a booking and try searching
		bookingManager.createBooking(from, to, legalEntityManager.getPerson("1"), roomManager.getRoomTypes().get(0));
		
		// |-----Searching-----|
		//          |------Booking------|
		// Should result in a hit
		c.set(2015, 5, 8);
		from = c.getTime();
		c.set(2015, 5, 12);
		to = c.getTime();
		assertEquals(1, bookingManager.getBookings(from, to).size());
		
		//          |-----Searching-----|
		// |------Booking------|
		// Should result in a hit
		c.set(2015, 5, 13);
		from = c.getTime();
		c.set(2015, 5, 20);
		to = c.getTime();
		assertEquals(1, bookingManager.getBookings(from, to).size());
		
		// |----------Searching----------|
		//      |------Booking------|
		// Should result in a hit
		c.set(2015, 5, 5);
		from = c.getTime();
		c.set(2015, 5, 20);
		to = c.getTime();
		assertEquals(1, bookingManager.getBookings(from, to).size());
		
		//     |------Searching------|
		// |-----------Booking-----------|
		// Should result in a hit
		c.set(2015, 5, 11);
		from = c.getTime();
		c.set(2015, 5, 13);
		to = c.getTime();
		assertEquals(1, bookingManager.getBookings(from, to).size());
		
		// |-----Searching-----|
		//                         |------Booking------|
		// Should not result in a hit
		c.set(2015, 5, 5);
		from = c.getTime();
		c.set(2015, 5, 8);
		to = c.getTime();
		assertEquals(0, bookingManager.getBookings(from, to).size());
		
		//                         |-----Searching-----|
		// |------Booking------|
		// Should not result in a hit
		c.set(2015, 5, 18);
		from = c.getTime();
		c.set(2015, 5, 20);
		to = c.getTime();
		assertEquals(0, bookingManager.getBookings(from, to).size());
		
		// |-----Searching-----|
		// |------Booking------|
		// Should result in a hit
		c.set(2015, 5, 10);
		from = c.getTime();
		c.set(2015, 5, 14);
		to = c.getTime();
		assertEquals(1, bookingManager.getBookings(from, to).size());
		
		// |-------Searching-------|
		//     |------Booking------|
		// Should result in a hit
		c.set(2015, 5, 8);
		from = c.getTime();
		c.set(2015, 5, 14);
		to = c.getTime();
		assertEquals(1, bookingManager.getBookings(from, to).size());
		
		// |-------Searching-------|
		// |------Booking------|
		// Should result in a hit
		c.set(2015, 5, 10);
		from = c.getTime();
		c.set(2015, 5, 16);
		to = c.getTime();
		assertEquals(1, bookingManager.getBookings(from, to).size());
		
		// Actor enters another time period.
		c.set(2015, 5, 16);
		from = c.getTime();
		c.set(2015, 5, 20);
		to = c.getTime();
		
		// Lets create another booking and try searching
		bookingManager.createBooking(from, to, legalEntityManager.getPerson("2"), roomManager.getRoomTypes().get(0));
		
		//      |----Searching----|
		// |------Booking------|     |------Booking------|
		// Should result two hits
		c.set(2015, 5, 12);
		from = c.getTime();
		c.set(2015, 5, 15);
		to = c.getTime();
		assertEquals(1, bookingManager.getBookings(from, to).size());
		
		//               |----Searching----|
		// |------Booking------|     |------Booking------|
		// Should result two hits
		c.set(2015, 5, 12);
		from = c.getTime();
		c.set(2015, 5, 17);
		to = c.getTime();
		assertEquals(2, bookingManager.getBookings(from, to).size());
		
		// |----LegalEntity----|
		// |------Booking------|     |------Booking------|
		// Should result one hits
		assertEquals(1, bookingManager.getBookings(legalEntityManager.getPerson("1")).size());
		
		//                           |----LegalEntity----|
		// |------Booking------|     |------Booking------|
		// Should result one hit
		assertEquals(1, bookingManager.getBookings(legalEntityManager.getPerson("2")).size());
		
		// |-----------Date range and LegalEntity------------|
		//   |------Booking------|     |------Booking------|
		// Should result two hits
		c.set(2015, 5, 3);
		from = c.getTime();
		c.set(2015, 5, 27);
		to = c.getTime();
		assertEquals(1, bookingManager.getBookings(from, to, legalEntityManager.getPerson("2")).size());
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidDateRange() {
		// Actor enters time period.
		c.set(2015, 5, 15);
		Date to = c.getTime();
		c.set(2015, 5, 25);
		Date from = c.getTime();
		
		// The system tells the actor the time period is invalid
		bookingManager.getBookings(from, to);
		// The system asks the actor the re-enter the date range
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidDateRangeWithFilter() {
		// Actor enters time period.
		c.set(2015, 5, 15);
		Date to = c.getTime();
		c.set(2015, 5, 25);
		Date from = c.getTime();
		
		// The system tells the actor the time period is invalid
		bookingManager.getBookings(from, to, legalEntityManager.getPerson("2"));
		// The system asks the actor the re-enter the date range
	}
}

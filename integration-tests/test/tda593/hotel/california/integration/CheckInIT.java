package tda593.hotel.california.integration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

public class CheckInIT extends AbstractHotelCaliforniaIntegrationTest {

	private BookingManager bookingManager;
	private LegalEntityManager legalEntityManager;
	private RoomManager roomManager;

	@Before
	public void setUpData() {
		LegalEntityManager legalEntityManager = managersHandler.getLegalEntityManager();
		AdminRoomManager adminRoomManager = managersHandler.getAdminRoomManager();

		// Create some persons
		legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");
		legalEntityManager.createPerson("Bob", "Smith", "2", "0712345678", "bob@smith.com");

		// Create some room types
		adminRoomManager.addRoomType("RoomType1", "", null, 10);
		adminRoomManager.addRoomType("RoomType2", "", null, 5);

		// Create a room for each room type
		int floor = 1;
		for(RoomType roomType : adminRoomManager.getRoomTypes()) {
			adminRoomManager.addRoom("1" + floor, floor, "N/A", null, null, roomType);
			floor++;
		}
	}

	@Before
	public void setUpManagers() {
		bookingManager = managersHandler.getBookingManager();
		legalEntityManager = managersHandler.getLegalEntityManager();
		roomManager = managersHandler.getRoomManager();
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

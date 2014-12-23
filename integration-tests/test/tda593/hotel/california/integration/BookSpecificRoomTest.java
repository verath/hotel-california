package tda593.hotel.california.integration;
import static org.junit.Assert.*;

import java.util.Date;

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
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;


public class BookSpecificRoomTest extends AbstractHotelCaliforniaIntegrationTest {

	private BookingManager bookingManager;
	private LegalEntityManager legalEntityManager;
	private RoomManager roomManager;
	
	@BeforeClass
	public static void setUpData() {
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
			adminRoomManager.addRoom("1"+floor, floor++, "N/A", null, null, roomType);
		}
		
		System.out.println("TEST OUTPUT STARTS");
		for(RoomType roomType : adminRoomManager.getRoomTypes()) {
			System.out.println(roomType.getName());
		}
	}
	
	@Before
	public void setUp() throws Exception {
		bookingManager = managersHandler.getBookingManager();
		legalEntityManager = managersHandler.getLegalEntityManager();
		roomManager = managersHandler.getRoomManager();
	}

	@Test
	public void testBookSpecificRoom() {
		Person customer = legalEntityManager.getPerson("1");
		System.out.println("NAME IS: " + customer.getFirstname());
		bookingManager.createBooking(new Date(0), new Date(60*60*24), customer, roomManager.getRooms().get(0));
		
		EList<Booking> bookings = bookingManager.getBookings(customer);
		assertFalse(bookings.size() == 0);

		Booking booking = bookings.get(0);
		assertTrue(booking.getRoomStay() != null);
		assertTrue(!booking.getRoomStay().isActive());
		
	}
	
	@Test
	public void testBookSpecificRoomThatIsUnavailable() {
		
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

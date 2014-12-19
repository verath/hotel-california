package tda593.hotel.california.integration;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntityManager;
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
			adminRoomManager.addRoom("1", floor++, "N/A", null, null, roomType);
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
		fail("Not yet implemented");
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

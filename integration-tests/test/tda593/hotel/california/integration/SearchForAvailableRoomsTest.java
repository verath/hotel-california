package tda593.hotel.california.integration;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import tda593.hotel.california.billing.BankingManager;
import tda593.hotel.california.billing.CreditCardManager;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

public class SearchForAvailableRoomsTest extends AbstractHotelCaliforniaIntegrationTest {

	private BookingManager bookingManager;
	private RoomManager roomManager;
	
	private Calendar c = Calendar.getInstance();
	
	@Before
	public void setUpData() {
		bookingManager = managersHandler.getBookingManager();
		roomManager = managersHandler.getRoomManager();
		
		LegalEntityManager legalEntityManager = managersHandler.getLegalEntityManager();
		AdminRoomManager adminRoomManager = managersHandler.getAdminRoomManager();

		// Create some persons
		legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");
		legalEntityManager.createPerson("Axel", "Nilsson", "2", "0712345678", "bob@smith.com");

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

	}

	/**
	 * This is more or less main flow of the use case: Search for available rooms
	 */
	@Test
	public void testSearchForAvaiableRooms() {	
		// Actor enters time period.
		c.set(2015, 5, 15);
		Date from = c.getTime();
		c.set(2015, 5, 25);
		Date to = c.getTime();
		
		// Assume time period is valid
		EList<Room> listOfRooms = bookingManager.getAvailableRooms(from, to);
		// System "displays" a list of currently available rooms during the time span 
		// Should be all of the rooms in the hotel
		assertEquals(roomManager.getRooms(), listOfRooms);
		
		// System also "displays" a list of filtering options of room types
		// Actor chooses to filter by a room type
		RoomType roomType = roomManager.getRoomTypes().get(0);
		EList<Room> filteredListOfRooms = bookingManager.getAvailableRooms(from, to, roomType);
		// System "displays" a list of currently available rooms during the time span, filtered by a room type 
		EList<Room> allRooms = roomManager.getRooms();
		EList<Room> expectedRooms = new BasicEList<Room>();
		
		for(Room room: allRooms) {
			if(room.getRoomType().equals(roomType)) {
				expectedRooms.add(room);
			}
		}
		
		assertEquals(expectedRooms, filteredListOfRooms);
		expectedRooms.clear();
		
		// Lets create some bookings in the same time period and try searching for rooms again
		bookingManager.createBooking(from, to, null, roomManager.getRoomTypes().get(0));
		bookingManager.createBooking(from, to, null, roomManager.getRoomTypes().get(1));
		bookingManager.createBooking(from, to, null, roomManager.getRoomTypes().get(1));
		bookingManager.createBooking(from, to, null, roomManager.getRooms().get(roomManager.getRooms().size()-1));
		
		// Searching for all available rooms again
		listOfRooms = bookingManager.getAvailableRooms(from, to);
		
		allRooms = roomManager.getRooms();
		expectedRooms.add(allRooms.get(0));
		expectedRooms.add(allRooms.get(1));
		expectedRooms.add(allRooms.get(4));
		
		assertEquals(expectedRooms, listOfRooms);
		expectedRooms.clear();
		
		// Choose a room type to filter by
		roomType = roomManager.getRoomTypes().get(0);
		filteredListOfRooms = bookingManager.getAvailableRooms(from, to, roomType);
		
		allRooms = roomManager.getRooms();
		expectedRooms.add(allRooms.get(0));
		expectedRooms.add(allRooms.get(1));
		
		assertEquals(expectedRooms, filteredListOfRooms);
		expectedRooms.clear();
		
		// Choose another room type to filter by
		roomType = roomManager.getRoomTypes().get(2);
		filteredListOfRooms = bookingManager.getAvailableRooms(from, to, roomType);

		allRooms = roomManager.getRooms();
		expectedRooms.add(allRooms.get(4));
		
		assertEquals(expectedRooms, filteredListOfRooms);
		expectedRooms.clear();
		
		// Choose another room type to filter by
		roomType = roomManager.getRoomTypes().get(1);
		filteredListOfRooms = bookingManager.getAvailableRooms(from, to, roomType);
		
		assertEquals(expectedRooms, filteredListOfRooms);
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidDateRange() {
		// Actor enters time period.
		c.set(2015, 5, 15);
		Date to = c.getTime();
		c.set(2015, 5, 25);
		Date from = c.getTime();
		
		// The system tells the actor the time period is invalid
		bookingManager.getAvailableRooms(from, to);
		// The system asks the actor the re-enter the date range
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidDateRangeWithFilter() {
		// Actor enters time period.
		c.set(2015, 5, 15);
		Date to = c.getTime();
		c.set(2015, 5, 25);
		Date from = c.getTime();
		
		// Choose a room type to filter by
		RoomType roomType = roomManager.getRoomTypes().get(0);
		
		// The system tells the actor the time period is invalid
		bookingManager.getAvailableRooms(from, to, roomType);
		// The system asks the actor the re-enter the date range
	}
	
}

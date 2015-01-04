package tda593.hotel.california.integration;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;


import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;


import tda593.hotel.california.booking.*;
import tda593.hotel.california.booking.impl.TravelInformationImpl;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.ConferenceRoom;
import tda593.hotel.california.facilities.GuestRoom;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

public class RoomRelatedTest extends AbstractHotelCaliforniaIntegrationTest {

	private RoomManager roomManager;
	private AdminRoomManager adminRoomManager;
	private GuestRoom guestRoom;
	private ConferenceRoom conferenceRoom;
	private BookingManager bookingManager;
	private LegalEntityManager legalEntityManager;
	private Booking booking;
	private Room room;
	private RoomType roomType;

	private EList<String> photos;

	@Before
	public void setUpData() {
		

		bookingManager = managersHandler.getBookingManager();
		legalEntityManager = managersHandler.getLegalEntityManager();
		roomManager = managersHandler.getRoomManager();
		roomManager = managersHandler.getRoomManager();
		adminRoomManager = managersHandler.getAdminRoomManager();
		
		//Photos
		photos = new BasicEList<String>();
		photos.add("Photo1");
		photos.add("src/photos/rooms/photo1.jpg");

	
		// Create some persons
		legalEntityManager.createPerson("Dave", "Cross", "1", "0756249984", "dave@cross.io");

		// Create some room types
		adminRoomManager.addRoomType("RoomType1", "", null, 10);
		RoomType type = adminRoomManager.addRoomType("RoomType1", "", null, 10);
		adminRoomManager.addRoomType("RoomType2", "", null, 5);

		// Create a room for each room type
		int floor = 1;
		for(RoomType roomType : adminRoomManager.getRoomTypes()) {
			adminRoomManager.addGuestRoom("1" + floor, floor, "N/A", null, null, roomType, 2, 0);
			floor++;
		}
		
		//Create Rooms without loop
		guestRoom = adminRoomManager.addGuestRoom("101", 1, "", null, photos, adminRoomManager.getRoomTypes().get(0), 2, 0);
		conferenceRoom = adminRoomManager.addConferenceRoom("201", 2, "Big Room", null, photos, type, 12, null);

		
		Person customer = legalEntityManager.getPerson("1");
		room = roomManager.getRooms().get(0);
		bookingManager.createBooking(new Date(0), new Date(60 * 60 * 24), customer, room);

		// Create a list of guests
		EList<Person> guests = new BasicEList<>();
		guests.add(customer);
		List<Booking> bookings = bookingManager.getBookings(customer);
		booking = bookings.get(0);
		bookingManager.checkIn(booking, guests);

	}
		
		



	/**
	 * Tests the FR #043: A customer should be able to preview different room types by viewing photos.
	 */
	@Test
	public void testViewRoomPhotos() {
		Room room = roomManager.getRoom(guestRoom.getRoomNumber());
		int i = 0;
		
		// Make sure there are actually any photos in the room, else loop below will not be entered
		assertNotNull(room.getPhotos());
		assertEquals(room.getPhotos().size(), photos.size());
		for(String s : room.getPhotos()) {
			assertEquals(photos.get(i++), s);
		}
		
	}
	/**
	 * Tests the FR #029b:
	 */
	@Test
	public void createRoom() {
		//RoomType is needed first
		RoomType type1 = adminRoomManager.addRoomType("Deluxe", "Room with nice view", null, 10);
		Room newRoom = adminRoomManager.addGuestRoom("3", 4, "A nice Room", null, photos, type1, 1, 0);
		assertTrue(newRoom != null);
	}
	
	@Test
	public void createRoomType() {
		//RoomType is needed first
		RoomType type1 = adminRoomManager.addRoomType("Deluxe", "Room with nice view", null, 10);
		assertTrue(type1 != null);
	}
	
	@Test
	public void deleteRoom() {
		if(booking.getRoomStay().isActive() == false){
		boolean Result = adminRoomManager.removeRoom(room.getRoomNumber());
		assertTrue(Result == true);
		//Another way of doing this, would be to deactivate a room 
		//instead of actually removing the room and all it's information.
		//The way I would that is to set it to false and then test it. Just like the commented code under
		// room.setIsOperational(false); 
		//assertEquals(room.isOperational(), false);
		}
	}
	
	@Test
	public void deleteRoomType(){
		adminRoomManager.removeRoomType(roomType);
		

}
	@Test
	public void setTravelInformation() {
		TravelInformation travel;
		travel = BookingFactory.eINSTANCE.createTravelInformation();
		travel.setId(1);
		travel.setComment("Some comment");
		travel.setTrackingId("501");
		travel.setPredecessor(null);
		booking.setTravelInformation(travel);
		assertNotNull(booking.getTravelInformation());
	}
}
		
		
		
	
	
	



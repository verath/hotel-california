package tda593.hotel.california.integration;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import tda593.hotel.california.billing.BankingManager;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.CreditCardManager;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.facilities.AdminKeyCardManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.ConferenceRoom;
import tda593.hotel.california.facilities.GuestRoom;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

public class RoomRelatedTest extends AbstractHotelCaliforniaIntegrationTest {

	private RoomManager roomManager;
	private AdminRoomManager adminRoomManager;
	
	private GuestRoom guestRoom;
	private ConferenceRoom conferenceRoom;

	private EList<String> photos;

	@Before
	public void setUpData() {
		roomManager = managersHandler.getRoomManager();
		adminRoomManager = managersHandler.getAdminRoomManager();
		
		// Create some room types
		RoomType type = adminRoomManager.addRoomType("RoomType1", "", null, 10);
		adminRoomManager.addRoomType("RoomType2", "", null, 5);
		
		photos = new BasicEList<String>();
		photos.add("Photo1");
		photos.add("src/photos/rooms/photo1.jpg");
		
		guestRoom = adminRoomManager.addGuestRoom("101", 1, "", null, photos, adminRoomManager.getRoomTypes().get(0), 2, 0);
		conferenceRoom = adminRoomManager.addConferenceRoom("201", 2, "HEJSAN", null, photos, type, 12, null);

	}

	/**
	 * Tests the FR #043: A customer should be able to preview different room types by viewing photos.
	 */
	@Test
	public void viewRoomPhotos() {
		Room room = roomManager.getRoom(guestRoom.getRoomNumber());
		int i = 0;
		for(String s : room.getPhotos()) {
			assertEquals(photos.get(i++), s);
		}
		
	}
	/**
	 * Tests the FR #029b:
	 */
	@Test
	public void createAddRoom() {
		//RoomType is needed first
		RoomType type1 = adminRoomManager.addRoomType("Deluxe", "Room with nice view", null, 10);
		Room newRoom = adminRoomManager.addGuestRoom("3", 4, "A nice Room", null, photos, type1, 1, 0);
		assertTrue(newRoom != null);
	}
	
	

}

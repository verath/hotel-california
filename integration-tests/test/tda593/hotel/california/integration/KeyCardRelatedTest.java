package tda593.hotel.california.integration;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.TravelInformation;
import tda593.hotel.california.facilities.AdminKeyCardManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.ConferenceRoom;
import tda593.hotel.california.facilities.GuestRoom;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.KeyCardManager;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

public class KeyCardRelatedTest extends AbstractHotelCaliforniaIntegrationTest {

	private BookingManager bookingManager;
	private LegalEntityManager legalEntityManager;
	private RoomManager roomManager;
	private AdminRoomManager adminRoomManager;
	private KeyCardManager keyCardManager;
	private AdminKeyCardManager adminKeyCardManager;
	
	private Booking booking;
	private Room room;

	private GuestRoom guestRoom;
	private ConferenceRoom conferenceRoom;

	@Before
	public void setUpData() {
		bookingManager = managersHandler.getBookingManager();
		legalEntityManager = managersHandler.getLegalEntityManager();
		roomManager = managersHandler.getRoomManager();
		adminRoomManager = managersHandler.getAdminRoomManager();
		keyCardManager = managersHandler.getKeyCardManager();
		adminKeyCardManager = managersHandler.getAdminKeyCardManager();
		
		adminRoomManager.addRoomType("RoomType1", "", null, 10);
		adminRoomManager.addRoomType("RoomType2", "", null, 5);
		guestRoom = adminRoomManager.addGuestRoom("101", 1, "", null, null, adminRoomManager.getRoomTypes().get(0), 2, 0);
		conferenceRoom = adminRoomManager.addConferenceRoom("102", 1, "", null, null, adminRoomManager.getRoomTypes().get(1), 2, null);
		
		legalEntityManager.createPerson("Dave", "Cross", "1", "0756249984", "dave@cross.io");
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
	 * Tests use case from FR #021a: "A receptionist should be able to register
	 * one or more key cards for a room."
	 */
	@Test
	public void testRegisterKeyCard() {
		assertEquals(0, guestRoom.getAllowedKeyCards().size());
		assertEquals(0, conferenceRoom.getAllowedKeyCards().size());
		
		adminKeyCardManager.addKeyCard("KEYCARD1");
		adminKeyCardManager.addKeyCard("KEYCARD2");
		adminKeyCardManager.addKeyCard("KEYCARD3");
		adminKeyCardManager.addKeyCard("KEYCARD4");
		adminKeyCardManager.addKeyCard("KEYCARD5");
		
		roomManager.registerKeyCard("KEYCARD1", guestRoom.getRoomNumber());
		roomManager.registerKeyCard("KEYCARD2", guestRoom.getRoomNumber());
		
		roomManager.registerKeyCard("KEYCARD3", conferenceRoom.getRoomNumber());
		roomManager.registerKeyCard("KEYCARD4", conferenceRoom.getRoomNumber());
		roomManager.registerKeyCard("KEYCARD5", conferenceRoom.getRoomNumber());
		
		
		Room guestRoomReloaded = roomManager.getRoom(guestRoom.getRoomNumber());
		Room conferenceRoomReloaded = roomManager.getRoom(conferenceRoom.getRoomNumber());
		
		Set<KeyCard> guestRoomKeyCards = new HashSet<KeyCard>(guestRoomReloaded.getAllowedKeyCards());
		Set<KeyCard> conferenceRoomKeyCards = new HashSet<KeyCard>(conferenceRoomReloaded.getAllowedKeyCards());
		
		assertEquals(2, guestRoomKeyCards.size());
		assertEquals(3, conferenceRoomKeyCards.size());
		
		assertTrue(guestRoomKeyCards.contains(keyCardManager.getKeyCard("KEYCARD1")));
		assertTrue(guestRoomKeyCards.contains(keyCardManager.getKeyCard("KEYCARD2")));
		
		assertTrue(conferenceRoomKeyCards.contains(keyCardManager.getKeyCard("KEYCARD3")));
		assertTrue(conferenceRoomKeyCards.contains(keyCardManager.getKeyCard("KEYCARD4")));
		assertTrue(conferenceRoomKeyCards.contains(keyCardManager.getKeyCard("KEYCARD5")));
		
		// A key card should be able to open two rooms
		//roomManager.registerKeyCard("KEYCARD3", guestRoom.getRoomNumber());
		
		//guestRoomReloaded = roomManager.getRoom(guestRoom.getRoomNumber());
		//conferenceRoomReloaded = roomManager.getRoom(conferenceRoom.getRoomNumber());
		//guestRoomKeyCards = new HashSet<KeyCard>(guestRoomReloaded.getAllowedKeyCards());
		//conferenceRoomKeyCards = new HashSet<KeyCard>(conferenceRoomReloaded.getAllowedKeyCards());
		
		//assertEquals(3, guestRoomKeyCards.size());
		//assertEquals(3, conferenceRoomKeyCards.size());
		//assertTrue(guestRoomKeyCards.contains(keyCardManager.getKeyCard("KEYCARD3")));
		//assertTrue(conferenceRoomKeyCards.contains(keyCardManager.getKeyCard("KEYCARD3")));
	}
}
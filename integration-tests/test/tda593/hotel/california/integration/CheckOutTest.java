package tda593.hotel.california.integration;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tda593.hotel.california.billing.BankingManager;
import tda593.hotel.california.billing.CreditCardManager;
import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

public class CheckOutTest extends AbstractHotelCaliforniaIntegrationTest {
	
	private BookingManager bookingManager;
	private LegalEntityManager legalEntityManager;
	private RoomManager roomManager;
	private CreditCardManager creditCardManager;
	private BankingManager bankingManager;
	
	private static String personBobFirstName = "Bob";
	private static String personBobLastName = "Smith";
	
	@BeforeClass
	public static void setUpData() {
		LegalEntityManager legalEntityManager = managersHandler.getLegalEntityManager();
		AdminRoomManager adminRoomManager = managersHandler.getAdminRoomManager();

		// Create some persons
		legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");
		legalEntityManager.createPerson(personBobFirstName, personBobLastName, "2", "0712345678", "bob@smith.com");

		// Create some room types
		adminRoomManager.addRoomType("RoomType1", "", null, 10);
		adminRoomManager.addRoomType("RoomType2", "", null, 5);

		// Create a room for each room type
		int floor = 1;
		for(RoomType roomType : adminRoomManager.getRoomTypes()) {
			adminRoomManager.addRoom("1"+floor, floor++, "N/A", null, null, roomType);
		}

	}

	public CheckOutTest() {
		bookingManager = managersHandler.getBookingManager();
		legalEntityManager = managersHandler.getLegalEntityManager();
		roomManager = managersHandler.getRoomManager();
		creditCardManager = managersHandler.getCreditCardManager();
		bankingManager = managersHandler.getBankingManager();
	}
	
	/**
	 * This test represents the main flow of the use case: Check out
	 */
	@Test
	public void testCheckOut() {
		// Actor enters the room number.
		// Assume: room number is valid and exists.
		String roomNumber = "101A";
		Booking booking = bookingManager.getActiveBooking(roomNumber);
		assertTrue(booking != null);
		
		// Assume: the room stay existed and it was active.
		
	}
	
	@Test
	public void testCheckOutWithInvalidOrNonExistentRoomNumber() {
		
	}
	
	@Test
	public void testCheckOutWithNoAssociatedBooking() {
		
	}
	
	@Test
	public void testCheckOutWhenBillIsPaid() {
		
	}
	
	@Test
	public void testCheckOutUnsucessfulPayment() {
		
	}
}

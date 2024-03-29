package tda593.hotel.california.integration;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import tda593.hotel.california.billing.AdminServiceManager;
import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.Service;
import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

public class RegisterPurchaseTest extends AbstractHotelCaliforniaIntegrationTest {

	private BillManager billManager;
	private AdminServiceManager adminServiceManager;
	private BookingManager bookingManager;
	private RoomManager roomManager;
	
	private Calendar c = Calendar.getInstance();
	
	private Service bananas, champagne;
	private Person customer;
	
	@Before
	public void setUpData() {
		billManager = managersHandler.getBillManager();
		adminServiceManager = managersHandler.getAdminServiceManager();
		bookingManager = managersHandler.getBookingManager();
		roomManager = managersHandler.getRoomManager();
		
		LegalEntityManager legalEntityManager = managersHandler.getLegalEntityManager();
		AdminRoomManager adminRoomManager = managersHandler.getAdminRoomManager();

		// Create room type
		adminRoomManager.addRoomType("RoomType1", "", null, 1);
		RoomType roomType = adminRoomManager.getRoomTypes().get(0);
		
		// Create a room
		adminRoomManager.addGuestRoom("1", 1, "N/A", null, null, roomType, 2, 0);
		
		// Create a customer
		customer = legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");	
		
		// Set up some services
		bananas = adminServiceManager.createService("Bananas", 12.250);
		champagne = adminServiceManager.createService("Champagne", 99.99);
		
		// Create a booking
		c.set(2014, 5, 10);
		Date from = c.getTime();
		c.set(2015, 5, 14);
		Date to = c.getTime();
		
		Room room = roomManager.getRooms().get(0);
		
		Booking booking = bookingManager.createBooking(from, to, customer, room.getRoomType());
		bookingManager.registerRoom(booking, room);
		BasicEList<Person> guests = new BasicEList<Person>();
		guests.add(customer);
		bookingManager.checkIn(booking, guests);
		billManager.createBookingBill(customer, booking);
	}

	/**
	 * This is more or less main flow of the use case: Register purchase
	 */
	@Test
	public void testRegisterPurchase() {
		// System asks for a room number.
		// Actor enters the room number.
		// Assume: room number is valid and there is an active room stay.
		
		Booking activeBooking = bookingManager.getActiveBooking("1");
		
		// System returns the registered legal entities on the room stay (customer and all registered guests that are also customers to the hotel).
		// Assume: the actor confirms the legal entity making the purchase.
		LegalEntity customer = activeBooking.getGuests().get(0);
		
		// Find suitable bill
		EList<Bill> bills = billManager.getBills(customer);
		Bill activeBill = null;
		
		for(Bill bill: bills) {
			if(!bill.isPublished()) {
				activeBill = bill;
			}
		}
		
		if(activeBill==null) {
			activeBill = billManager.createBill(customer);
		}
		
		// System asks for the items and their respective quantity.
		// Actor enters the items and their respective quantity.
		// Assume: all entered items exist and their respective quantity is valid.
		// System asks for for confirmation.
		// Assume: actor confirms purchase.
		// System registers the items, as purchased, on the room bill connected to the room stay.
		
		billManager.billItem(activeBill, 1, bananas);
		billManager.billItem(activeBill, 7, champagne);
		
		//Testing
		EList<Bill> billsToTest = billManager.getBills(customer);
		Bill activeBillToTest = billsToTest.get(0);
		
		int quantity;
		Service service;
		
		quantity = activeBillToTest.getPurchases().get(0).getQuantity();
		service = activeBillToTest.getPurchases().get(0).getService();
		
		assertEquals(1, quantity);
		assertEquals(bananas.getId(), service.getId());
		
		quantity = activeBillToTest.getPurchases().get(1).getQuantity();
		service = activeBillToTest.getPurchases().get(1).getService();
		
		assertEquals(7, quantity);
		assertEquals(champagne.getId(), service.getId());
		
	}
	
	@Test
	public void testRegisterPurchaseWithNoActiveRoomStay() {
		// System asks for a room number.
		// Actor enters the room number.
		
		Booking activeBooking = bookingManager.getActiveBooking("2");
		
		assertTrue(activeBooking==null);
		// System tells the actor the room number is invalid
		// Back to the start of main flow..
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRegisterPurchaseWithInvalidQuantity() {
		// System asks for a room number.
		// Actor enters the room number.
		// Assume: room number is valid and there is an active room stay.
		
		Booking activeBooking = bookingManager.getActiveBooking("1");
		
		// System returns the registered legal entities on the room stay (customer and all registered guests that are also customers to the hotel).
		// Assume: the actor confirms the legal entity making the purchase.
		LegalEntity customer = activeBooking.getGuests().get(0);
		
		// Find suitable bill
		EList<Bill> bills = billManager.getBills(customer);
		Bill activeBill = null;
		
		for(Bill bill: bills) {
			if(!bill.isPublished()) {
				activeBill = bill;
			}
		}
		
		if(activeBill==null) {
			activeBill = billManager.createBill(customer);
		}
		
		// System asks for the items and their respective quantity.
		// Actor enters the items and their respective quantity.
		
		billManager.billItem(activeBill, -5, bananas);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRegisterPurchaseWithInvalidService() {
		// System asks for a room number.
		// Actor enters the room number.
		// Assume: room number is valid and there is an active room stay.
		
		Booking activeBooking = bookingManager.getActiveBooking("1");
		
		// System returns the registered legal entities on the room stay (customer and all registered guests that are also customers to the hotel).
		// Assume: the actor confirms the legal entity making the purchase.
		LegalEntity customer = activeBooking.getGuests().get(0);
		
		// Find suitable bill
		EList<Bill> bills = billManager.getBills(customer);
		Bill activeBill = null;
		
		for(Bill bill: bills) {
			if(!bill.isPublished()) {
				activeBill = bill;
			}
		}
		
		if(activeBill==null) {
			activeBill = billManager.createBill(customer);
		}
		
		// System asks for the items and their respective quantity.
		// Actor enters the items and their respective quantity.
		
		billManager.billItem(activeBill, 5, null);
	}
	
}

package tda593.hotel.california.integration;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.junit.BeforeClass;
import org.junit.Test;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.CreditCardInformation;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.FacilitiesFactory;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;
import tda593.hotel.california.util.DateUtil;


public class BookRoomTypeTest extends AbstractHotelCaliforniaIntegrationTest {

	private BookingManager bookingManager;
	private LegalEntityManager legalEntityManager;
	private RoomManager roomManager;
	
	private Calendar c = Calendar.getInstance();

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
	
	public BookRoomTypeTest() {
		bookingManager = managersHandler.getBookingManager();
		legalEntityManager = managersHandler.getLegalEntityManager();
		roomManager = managersHandler.getRoomManager();
	}

	/**
	 * This test represents the main flow of the use case: Book Specific room
	 */
	@Test
	public void testBookRoomType() {
		// Actor enters the date range and room number.
		c.set(2015, 5, 19);
		Date from = c.getTime();
		c.set(2015, 5, 21);
		Date to = c.getTime();
		RoomType roomType = roomManager.getRoomTypes().get(1);
		
		// Assume: date range and room type are valid and room type is available.
		assertTrue(bookingManager.isRoomTypeAvailable(from, to, roomType));
		
		// Actor enters customer name.
		// Assume: valid input and the customer exists.
		List<Person> hits = legalEntityManager.findPerson(personBobFirstName, personBobLastName);
		assertTrue(hits.size() > 0);
		
		// Actor chooses the correct customer.
		Person customer = hits.get(0);
		
		// Assume: credit card information is valid
		// System asks for a confirmation of the booking.
		// Assume: actor confirmed the booking. 
		int countBefore = bookingManager.getBookings(from, to).size();
		int customerCountBefore = bookingManager.getBookings(customer).size();
		bookingManager.createBooking(from, to, customer, roomType);
		int countAfter = bookingManager.getBookings(from, to).size();
		
		// Make sure exactly 1 booking was made
		assertEquals(countAfter, countBefore +1);
		
		// Make sure the booking is registered on the right customer,
		// room and time span
		EList<Booking> bookings = bookingManager.getBookings(customer);
		assertEquals(bookings.size(), customerCountBefore + 1);
		Booking booking = bookings.get(customerCountBefore);
		
		// Room checks
		assertTrue(booking.getRoomStay() == null);
		
		// Date checks
		assertEquals(booking.getStartDate(), from);
		assertEquals(booking.getEndDate(), to);
		
		// Customer check
		assertEquals(customer.getId(), booking.getResponsible().getId());
	}
	
	/**
	 * This test represents the actions which causes the "Room type is not available" 
	 * alternative flow.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testBookRoomTypeThatIsUnavailable() {
		// Create a booking to make the room type unavailable
		c.set(2015, 2, 9);
		Date otherFrom = c.getTime();
		c.set(2015, 2, 14);
		Date otherTo = c.getTime();
		RoomType roomType = roomManager.getRoomTypes().get(0);
		bookingManager.createBooking(otherFrom, otherTo, legalEntityManager.getPerson("1"), roomType);
		
		// Actor enters the date range and room type.
		c.set(2015, 2, 9);
		Date from = c.getTime();
		c.set(2015, 2, 12);
		Date to = c.getTime();
		
		// Assume: ...room is available. 
		assertFalse(bookingManager.isRoomTypeAvailable(from, to, roomType));
		
		// If the actor enters a time span which overlaps that of the booking above
		c.set(2015, 2, 12);
		from = c.getTime();
		c.set(2015, 2, 15);
		to = c.getTime();
		assertFalse(bookingManager.isRoomTypeAvailable(from, to, roomType));
		
		// Test overlapping at the other end
		c.set(2015, 2, 8);
		from = c.getTime();
		c.set(2015, 2, 10);
		to = c.getTime();
		assertFalse(bookingManager.isRoomTypeAvailable(from, to, roomType));

		// Make sure you cannot book an unavailable room type
		int countBefore = bookingManager.getBookings(from, to).size();
		bookingManager.createBooking(from, to, legalEntityManager.getPerson("1"), roomType);
		int countAfter = bookingManager.getBookings(from, to).size();
		assertEquals(countBefore, countAfter);
	}

	@Test
	public void testBookRoomTypeWithInvalidInput() {
		// Starting date cannot be after end date
		c.set(2015, 2, 5);
		Date from = c.getTime();
		c.set(2015, 2, 4);
		Date to = c.getTime();
		
		assertFalse(DateUtil.isDateRangeValid(from, to));
		
		// TODO: What does a malformed room type name look like?
		
//		String roomTypeName1 = "abc";
//		String roomTypeName2 = "-1";
//		String roomTypeName3 = "@1231€#1#5";
//		
//		String[] roomTypeNames = new String[] {
//			roomTypeName1,
//			roomTypeName2,
//			roomTypeName3
//		};
//		
//		// TODO: this does not work as I want it to right now. Better solution?
//		for(String roomTypeName : roomTypeNames) {
////			try {
//				roomManager.getRoomType(roomTypeName);
////			} catch (IllegalArgumentException e) {
////				assertInvalidInput(roomManager, roomNumber);
////			}
//		}
	}
	
	private void assertInvalidInput(RoomManager roomManager, String roomNumber) {
		try {
			roomManager.getRoom(roomNumber);
		} catch (IllegalArgumentException e) {
			
		}
	}
	
	@Test
	public void testBookRoomTypeWithNoRegisteredCustomer() {
		// Get a customer that does not exist
		String firstNameThatDoesNotExist = "Goran";
		String lastNameThatDoesNotExist = "Goransson";
		EList<Person> matches = legalEntityManager.findPerson(firstNameThatDoesNotExist, lastNameThatDoesNotExist);
		assertTrue(matches.size() == 0);
	
		// Alternative flow, customer wants to register
		// Assume that this is a person that wants to book
		String firstName = "Bob";
		String lastName = "Hansson";
		String SSN = "097251285935";
		String phone = "349389413894";
		String email = "reirjaei@gejia.com";
		CreditCardInformation cc = BookingFactory.eINSTANCE.createCreditCardInformation();
		cc.setCardNumber("5351351");
		cc.setCcv("stuff");
		
		legalEntityManager.createPerson(firstName, lastName, SSN, phone, email, cc);
		// TODO: how do we check that it was created? Is the only way by getting and then checking for null?
		// maybe throw some error instead?
		
		// Assure that customer was put in database
		Person person = legalEntityManager.getPerson(SSN);
		assertTrue(person != null);
		assertEquals(person.getSocialSecurityNumber(), SSN);
	}
	
	@Test
	public void testBookRoomTypeThatDoesNotExist() {
		String nonExistingRoomTypeName = "asdfasdfasdf";
		RoomType roomType = roomManager.getRoomType(nonExistingRoomTypeName);
		
		assertTrue(roomType == null);
	}
	
	@Test
	public void testBookRoomTypeWithNoValidCreditCard() {
		// TODO: verify current credit card is not valid (assume for now), provided by banking component
		
		LegalEntity legalEntity = legalEntityManager.getLegalEntity(1);
		c.set(2015, 2, 4);
		
		String firstname = "Hans";
		String lastname = "Johansson";
		String cardNumber = "5353553";
		String ccv = "555";
		Date expirationDate = c.getTime();
		
		legalEntityManager.setCreditCardInformation(legalEntity, firstname, lastname, cardNumber, ccv, expirationDate);
		
		LegalEntity legalEntityFromDatabase = legalEntityManager.getLegalEntity(1);
		
		assertTrue(legalEntityFromDatabase.getCreditCardInformation() != null);
	}
}

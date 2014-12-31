package tda593.hotel.california.integration;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import tda593.hotel.california.billing.BankingManager;
import tda593.hotel.california.billing.CreditCardInformation;
import tda593.hotel.california.billing.CreditCardManager;
import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;
import tda593.hotel.california.util.DateUtil;

import static org.junit.Assert.*;


public class BookRoomTypeTest extends AbstractHotelCaliforniaIntegrationTest {

	private BookingManager bookingManager;
	private LegalEntityManager legalEntityManager;
	private CreditCardManager creditCardManager;
	private RoomManager roomManager;
	private BankingManager bankingManager;
	
	private Calendar c = Calendar.getInstance();

	private static String personBobFirstName = "Bob";
	private static String personBobLastName = "Smith";
	
	@Before
	public void setUpData() {
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
			adminRoomManager.addGuestRoom("1"+floor, floor++, "N/A", null, null, roomType, 2, 0);
		}

	}

	@Before
	public void setUpManagers() {
		bookingManager = managersHandler.getBookingManager();
		legalEntityManager = managersHandler.getLegalEntityManager();
		roomManager = managersHandler.getRoomManager();
		creditCardManager = managersHandler.getCreditCardManager();
		bankingManager = managersHandler.getBankingManager();
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
		
		String[] invalidRoomTypes = new String[] { 
			"abc",
			"-1", 
			"@1231���#1#5", 
			"0x12"
		};
		List<String> acceptedRoomTypes = new ArrayList<>();

		for (String roomType : invalidRoomTypes) {
			try {
				roomManager.getRoom(roomType);
				acceptedRoomTypes.add(roomType);
			} catch (IllegalArgumentException e) {
			}
		}

		if (!acceptedRoomTypes.isEmpty()) {
			fail("Expected no room types to be accepted, but these were: "
					+ acceptedRoomTypes);
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
		
		String cardNumber = "5351351";
		String ccv = "091";
		c.set(2019, 5, 19);
		Date expirationDate = c.getTime();
		
		Person p = legalEntityManager.createPerson(firstName, lastName, SSN, phone, email);
		assertTrue(p != null);
		
		creditCardManager.setCreditCardInformation(p, firstName, lastName, cardNumber, ccv, expirationDate, bankingManager);
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

		boolean ccAccepted = creditCardManager.setCreditCardInformation(legalEntity, firstname, lastname, cardNumber, ccv, expirationDate, bankingManager);

		assertFalse(ccAccepted);
		LegalEntity legalEntityFromDatabase = legalEntityManager.getLegalEntity(1);
		CreditCardInformation legalEntityCCInfo = creditCardManager.getCreditCardInformation(legalEntityFromDatabase);
		assertNull(legalEntityCCInfo);
	}
}

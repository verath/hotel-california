package tda593.hotel.california.integration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.BeforeClass;
import org.junit.Test;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.Person;

public class CheckInIT extends AbstractHotelCaliforniaIntegrationTest {

	@BeforeClass
	public void initialize() {
		super.initializeHotelCaliforniaComponents();
	}
	
	@Test
	public void TestCustomerCanCheckInAsGuest() {
		// Get a booking
		Person customer = legalEntityManager.getPerson("123");
		List<Booking> bookings = bookingManager.getBookings(customer);
		Booking booking = bookings.get(0);

		// Create a list of guests
		EList<Person> guests = new BasicEList<>();
		guests.add(customer);

		assertFalse(booking.getRoomStay().isActive());
		
		bookingManager.checkIn(booking, guests);
		
		assertTrue(booking.getRoomStay().isActive());
		assertTrue(booking.getRoomStay().getRegisteredPersons().contains(customer));
	}
}

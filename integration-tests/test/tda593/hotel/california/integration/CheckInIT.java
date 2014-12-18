package tda593.hotel.california.integration;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.BookingManagerImpl;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.impl.BookingManagerImplImpl;
import tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl;
import tda593.hotel.california.integration.util.PersistenceHelper;

public class CheckInIT extends AbstractHotelCaliforniaIntegrationTest {

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
	}
}

package tda593.hotel.california.integration;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.BookingManagerImpl;
import tda593.hotel.california.booking.impl.BookingManagerImplImpl;
import util.IntegrationTestEntityManagerFactory;

public class CheckInIT extends AbstractPersistenceIntegrationTest {
	
	private BookingManagerImpl bookingManager;
	
	@Before
	public void setUp() {
		
		bookingManager = new BookingManagerImplImpl();
	}
	
	@Test
	public void customerCanCheckInIT() {
		
	}
}

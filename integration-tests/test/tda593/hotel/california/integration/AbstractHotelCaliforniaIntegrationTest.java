package tda593.hotel.california.integration;

import org.junit.BeforeClass;

import tda593.hotel.california.integration.util.HotelCaliforniaManagersHandler;

/**
 * An abstract helper class for setting up the hotel california system.
 * 
 * Extends the class and make sure to call
 * {@link #initializeHotelCaliforniaComponents()} to set up the components. This
 * should most likely be done in either a method annotated by @Before or
 * 
 * @BeforeClass.
 * 
 * @author Peter
 *
 */
public abstract class AbstractHotelCaliforniaIntegrationTest {

	protected static HotelCaliforniaManagersHandler managersHandler = new HotelCaliforniaManagersHandler();;

	@BeforeClass
	public static void initialize() {
		managersHandler.initialize();
	}
}

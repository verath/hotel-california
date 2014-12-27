package tda593.hotel.california.integration;

import org.junit.BeforeClass;

import tda593.hotel.california.util.HotelCaliforniaManagersHandler;

/**
 * An abstract helper class for setting up the hotel california system.
 * 
 * @author Peter
 *
 */
public abstract class AbstractHotelCaliforniaIntegrationTest {

	protected static HotelCaliforniaManagersHandler managersHandler = new HotelCaliforniaManagersHandler();

	@BeforeClass
	public static void initialize() throws Exception {
		managersHandler.initialize();
	}
}

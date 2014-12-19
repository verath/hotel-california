package tda593.hotel.california.integration;

import javax.persistence.EntityManager;

import org.junit.BeforeClass;

import tda593.hotel.california.billing.AdminDiscountManager;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.DiscountDataService;
import tda593.hotel.california.billing.DiscountManager;
import tda593.hotel.california.billing.impl.BillDataServiceImpl;
import tda593.hotel.california.billing.impl.BillManagerImplImpl;
import tda593.hotel.california.billing.impl.DiscountDataServiceImpl;
import tda593.hotel.california.billing.impl.DiscountManagerImplImpl;
import tda593.hotel.california.booking.BookingDataService;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntityDataService;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.impl.BookingDataServiceImpl;
import tda593.hotel.california.booking.impl.BookingManagerImplImpl;
import tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl;
import tda593.hotel.california.booking.impl.LegalEntityManagerImplImpl;
import tda593.hotel.california.facilities.AdminKeyCardManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.KeyCardDataService;
import tda593.hotel.california.facilities.KeyCardManager;
import tda593.hotel.california.facilities.RoomDataService;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomTypeDataService;
import tda593.hotel.california.facilities.impl.AdminKeyCardManagerImplImpl;
import tda593.hotel.california.facilities.impl.AdminRoomManagerImplImpl;
import tda593.hotel.california.facilities.impl.KeyCardDataServiceImpl;
import tda593.hotel.california.facilities.impl.KeyCardManagerImplImpl;
import tda593.hotel.california.facilities.impl.RoomDataServiceImpl;
import tda593.hotel.california.facilities.impl.RoomManagerImplImpl;
import tda593.hotel.california.facilities.impl.RoomTypeDataServiceImpl;
import tda593.hotel.california.integration.util.PersistenceHelper;

/**
 * An abstract helper class for setting up the hotel california system.
 * 
 * Extends the class and make sure to call
 * {@link #initializeHotelCaliforniaComponents()} to set up the components. This
 * should most likely be done in either a method annotated by @Before or
 * @BeforeClass.
 * 
 * @author Peter
 *
 */
public abstract class AbstractHotelCaliforniaIntegrationTest {
	protected EntityManager entityManager;

	// Facilities Services
	private KeyCardDataService keyCardDataService;
	private RoomDataService roomDataService;
	private RoomTypeDataService roomTypeDataService;

	// Booking Services
	private BookingDataService bookingDataService;
	private LegalEntityDataService legalEntityDataService;

	// Billing Services
	private BillDataService billDataService;
	private DiscountDataService discountDataService;

	// Facilities Managers
	protected AdminKeyCardManager adminKeyCardManager;
	protected AdminRoomManager adminRoomManager;
	protected KeyCardManager keyCardManager;
	protected RoomManager roomManager;

	// Booking Managers
	protected BookingManager bookingManager;
	protected LegalEntityManager legalEntityManager;

	// Billing Managers
	protected AdminDiscountManager adminDiscountManager;
	protected BillManager billManager;
	protected DiscountManager discountManager;

	protected void initializeEntityManager() {
		if(entityManager != null) {
			entityManager.close();
		}
		entityManager = PersistenceHelper.createEntityManager();
	}

	private void initializeServices() {
		// Facilities
		keyCardDataService = new KeyCardDataServiceImpl(entityManager);
		roomDataService = new RoomDataServiceImpl(entityManager);
		roomTypeDataService = new RoomTypeDataServiceImpl(entityManager);

		// Booking
		bookingDataService = new BookingDataServiceImpl(entityManager);
		legalEntityDataService = new LegalEntityDataServiceImpl(entityManager);

		// Billing
		billDataService = new BillDataServiceImpl(entityManager);
		discountDataService = new DiscountDataServiceImpl(entityManager);
	}

	private void initializeManagers() {
		// Facilities
		adminKeyCardManager = new AdminKeyCardManagerImplImpl();
		adminRoomManager = new AdminRoomManagerImplImpl(roomTypeDataService);
		keyCardManager = new KeyCardManagerImplImpl();
		roomManager = new RoomManagerImplImpl(roomTypeDataService);

		// Booking
		bookingManager = new BookingManagerImplImpl();
		legalEntityManager = new LegalEntityManagerImplImpl();

		// Billing
		adminDiscountManager = new AdminDiscountManagerImpl();
		billManager = new BillManagerImplImpl();
		discountManager = new DiscountManagerImplImpl();
	}

	/**
	 * Method for (re)setting the hotel california component. This method also
	 * recreates the entity manager and the database.
	 */
	public void initializeHotelCaliforniaComponents() {
		initializeEntityManager();
		initializeServices();
		initializeManagers();
	}
}

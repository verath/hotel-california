package tda593.hotel.california.integration;

import javax.persistence.EntityManager;

import org.junit.BeforeClass;

import tda593.hotel.california.billing.AdminDiscountManager;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.DiscountDataService;
import tda593.hotel.california.billing.DiscountManager;
import tda593.hotel.california.billing.impl.BillDataServiceImpl;
import tda593.hotel.california.billing.impl.DiscountDataServiceImpl;
import tda593.hotel.california.booking.BookingDataService;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntityDataService;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.impl.BookingDataServiceImpl;
import tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl;
import tda593.hotel.california.facilities.AdminKeyCardManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.KeyCardDataService;
import tda593.hotel.california.facilities.KeyCardManager;
import tda593.hotel.california.facilities.RoomDataService;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomTypeDataService;
import tda593.hotel.california.facilities.impl.KeyCardDataServiceImpl;
import tda593.hotel.california.facilities.impl.RoomDataServiceImpl;
import tda593.hotel.california.facilities.impl.RoomTypeDataServiceImpl;
import tda593.hotel.california.integration.util.PersistenceHelper;

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
		adminKeyCardManager = new AdminKeyCardManagerImpl();
		adminRoomManager = new AdminRoomManagerImpl();
		keyCardManager = new KeyCardManagerImpl();
		roomManager = new RoomManagerImpl();

		// Booking
		bookingManager = new BookingManagerImpl();
		legalEntityManager = new LegalEntityManagerImpl();

		// Billing
		adminDiscountManager = new AdminDiscountManagerImpl();
		billManager = new BillManagerImpl();
		discountManager = new DiscountManagerImpl();
	}

	@BeforeClass
	public void initializeHotelCaliforniaComponents() {
		initializeEntityManager();
		initializeServices();
		initializeManagers();
	}
}

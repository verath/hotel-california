package tda593.hotel.california.util;

import javax.persistence.EntityManager;

import tda593.hotel.california.billing.AdminDiscountManager;
import tda593.hotel.california.billing.BankingManager;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.BillingFactory;
import tda593.hotel.california.billing.CreditCardInformationDataService;
import tda593.hotel.california.billing.CreditCardManager;
import tda593.hotel.california.billing.DiscountDataService;
import tda593.hotel.california.billing.DiscountManager;
import tda593.hotel.california.billing.impl.BillDataServiceImpl;
import tda593.hotel.california.billing.impl.BillManagerImplImpl;
import tda593.hotel.california.billing.impl.CreditCardInformationDataServiceImpl;
import tda593.hotel.california.billing.impl.CreditCardManagerImplImpl;
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
import tda593.hotel.california.integration.mock.MockTestAdminBankingManager;
import tda593.hotel.california.integration.TestAdminBankingManager;

public class HotelCaliforniaManagersHandler {
	public final boolean mockBankingComponent;

	private EntityManager entityManager;

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
	private CreditCardInformationDataService creditCardDataService;

	// Facilities Managers
	private AdminKeyCardManager adminKeyCardManager;
	private AdminRoomManager adminRoomManager;
	private KeyCardManager keyCardManager;
	private RoomManager roomManager;

	// Booking Managers
	private BookingManager bookingManager;
	private LegalEntityManager legalEntityManager;

	// Billing Managers
	private AdminDiscountManager adminDiscountManager;
	private BillManager billManager;
	private DiscountManager discountManager;
	private CreditCardManager creditCardManager;
	private BankingManager bankingManager;

	// Test only manager
	private TestAdminBankingManager testAdminBankingManager;

	public HotelCaliforniaManagersHandler(boolean mockBankingComponent)
			throws Exception {
		this.mockBankingComponent = mockBankingComponent;

		initializeEntityManager();
		initializeServices();
		initializeManagers();
	}

	private void initializeEntityManager() throws Exception {
		PersistenceHelper.initialize();
		entityManager = PersistenceHelper.getEntityManager();
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
		creditCardDataService = new CreditCardInformationDataServiceImpl(
				entityManager);
	}

	private void initializeManagers() throws Exception {
		// Facilities
		adminKeyCardManager = new AdminKeyCardManagerImplImpl(
				keyCardDataService);
		adminRoomManager = new AdminRoomManagerImplImpl(roomTypeDataService,
				roomDataService, keyCardManager);
		keyCardManager = new KeyCardManagerImplImpl(keyCardDataService);
		roomManager = new RoomManagerImplImpl(roomTypeDataService,
				roomDataService, keyCardManager);

		// Booking
		bookingManager = new BookingManagerImplImpl(bookingDataService,
				roomManager);
		legalEntityManager = new LegalEntityManagerImplImpl(
				legalEntityDataService);

		// Billing
		billManager = new BillManagerImplImpl(billDataService, bookingManager);
		discountManager = new DiscountManagerImplImpl(discountDataService);
		creditCardManager = new CreditCardManagerImplImpl(creditCardDataService);

		if (mockBankingComponent) {
			MockTestAdminBankingManager mockTestAdminBankingManager = new MockTestAdminBankingManager();

			testAdminBankingManager = mockTestAdminBankingManager;
			bankingManager = mockTestAdminBankingManager.getBankingManager();
		} else {
			bankingManager = BillingFactory.eINSTANCE
					.createBankingManagerImpl();
			testAdminBankingManager = new TestAdminBankingManager();
		}
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public KeyCardDataService getKeyCardDataService() {
		return keyCardDataService;
	}

	public RoomDataService getRoomDataService() {
		return roomDataService;
	}

	public RoomTypeDataService getRoomTypeDataService() {
		return roomTypeDataService;
	}

	public BookingDataService getBookingDataService() {
		return bookingDataService;
	}

	public LegalEntityDataService getLegalEntityDataService() {
		return legalEntityDataService;
	}

	public BillDataService getBillDataService() {
		return billDataService;
	}

	public DiscountDataService getDiscountDataService() {
		return discountDataService;
	}

	public AdminKeyCardManager getAdminKeyCardManager() {
		return adminKeyCardManager;
	}

	public AdminRoomManager getAdminRoomManager() {
		return adminRoomManager;
	}

	public KeyCardManager getKeyCardManager() {
		return keyCardManager;
	}

	public RoomManager getRoomManager() {
		return roomManager;
	}

	public BookingManager getBookingManager() {
		return bookingManager;
	}

	public LegalEntityManager getLegalEntityManager() {
		return legalEntityManager;
	}

	public AdminDiscountManager getAdminDiscountManager() {
		return adminDiscountManager;
	}

	public BillManager getBillManager() {
		return billManager;
	}

	public DiscountManager getDiscountManager() {
		return discountManager;
	}

	public CreditCardManager getCreditCardManager() {
		return creditCardManager;
	}

	public BankingManager getBankingManager() {
		return bankingManager;
	}

	public TestAdminBankingManager getTestAdminBankingManager() {
		return testAdminBankingManager;
	}
}

/**
 */
package tda593.hotel.california.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tda593.hotel.california.Bill;
import tda593.hotel.california.BillDataService;
import tda593.hotel.california.BillManagerImpl;
import tda593.hotel.california.Booking;
import tda593.hotel.california.BookingBill;
import tda593.hotel.california.BookingDataService;
import tda593.hotel.california.BookingManagerImpl;
import tda593.hotel.california.CaliforniaFactory;
import tda593.hotel.california.CaliforniaPackage;
import tda593.hotel.california.CreditCardInformation;
import tda593.hotel.california.LegalEntity;
import tda593.hotel.california.Organization;
import tda593.hotel.california.Person;
import tda593.hotel.california.Purchase;
import tda593.hotel.california.RoomStay;
import tda593.hotel.california.Service;
import tda593.hotel.california.StayRequest;
import tda593.hotel.california.TravelInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CaliforniaFactoryImpl extends EFactoryImpl implements CaliforniaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaliforniaFactory init() {
		try {
			CaliforniaFactory theCaliforniaFactory = (CaliforniaFactory)EPackage.Registry.INSTANCE.getEFactory(CaliforniaPackage.eNS_URI);
			if (theCaliforniaFactory != null) {
				return theCaliforniaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CaliforniaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaliforniaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CaliforniaPackage.BILL_DATA_SERVICE: return createBillDataService();
			case CaliforniaPackage.BILL: return createBill();
			case CaliforniaPackage.LEGAL_ENTITY: return createLegalEntity();
			case CaliforniaPackage.CREDIT_CARD_INFORMATION: return createCreditCardInformation();
			case CaliforniaPackage.PURCHASE: return createPurchase();
			case CaliforniaPackage.SERVICE: return createService();
			case CaliforniaPackage.BILL_MANAGER_IMPL: return createBillManagerImpl();
			case CaliforniaPackage.BOOKING: return createBooking();
			case CaliforniaPackage.ROOM_STAY: return createRoomStay();
			case CaliforniaPackage.STAY_REQUEST: return createStayRequest();
			case CaliforniaPackage.PERSON: return createPerson();
			case CaliforniaPackage.TRAVEL_INFORMATION: return createTravelInformation();
			case CaliforniaPackage.BOOKING_DATA_SERVICE: return createBookingDataService();
			case CaliforniaPackage.BOOKING_MANAGER_IMPL: return createBookingManagerImpl();
			case CaliforniaPackage.ORGANIZATION: return createOrganization();
			case CaliforniaPackage.BOOKING_BILL: return createBookingBill();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillDataService createBillDataService() {
		BillDataServiceImpl billDataService = new BillDataServiceImpl();
		return billDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntity createLegalEntity() {
		LegalEntityImpl legalEntity = new LegalEntityImpl();
		return legalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformation createCreditCardInformation() {
		CreditCardInformationImpl creditCardInformation = new CreditCardInformationImpl();
		return creditCardInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purchase createPurchase() {
		PurchaseImpl purchase = new PurchaseImpl();
		return purchase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillManagerImpl createBillManagerImpl() {
		BillManagerImplImpl billManagerImpl = new BillManagerImplImpl();
		return billManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStay createRoomStay() {
		RoomStayImpl roomStay = new RoomStayImpl();
		return roomStay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StayRequest createStayRequest() {
		StayRequestImpl stayRequest = new StayRequestImpl();
		return stayRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelInformation createTravelInformation() {
		TravelInformationImpl travelInformation = new TravelInformationImpl();
		return travelInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingDataService createBookingDataService() {
		BookingDataServiceImpl bookingDataService = new BookingDataServiceImpl();
		return bookingDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingManagerImpl createBookingManagerImpl() {
		BookingManagerImplImpl bookingManagerImpl = new BookingManagerImplImpl();
		return bookingManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingBill createBookingBill() {
		BookingBillImpl bookingBill = new BookingBillImpl();
		return bookingBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaliforniaPackage getCaliforniaPackage() {
		return (CaliforniaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CaliforniaPackage getPackage() {
		return CaliforniaPackage.eINSTANCE;
	}

} //CaliforniaFactoryImpl

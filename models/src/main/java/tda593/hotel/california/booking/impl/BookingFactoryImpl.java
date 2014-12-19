/**
 */
package tda593.hotel.california.booking.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingDataService;
import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.BookingManagerImpl;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.CreditCardInformation;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityDataService;
import tda593.hotel.california.booking.LegalEntityManagerImpl;
import tda593.hotel.california.booking.Organization;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.RoomStay;
import tda593.hotel.california.booking.StayRequest;
import tda593.hotel.california.booking.TravelInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingFactoryImpl extends EFactoryImpl implements BookingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookingFactory init() {
		try {
			BookingFactory theBookingFactory = (BookingFactory)EPackage.Registry.INSTANCE.getEFactory(BookingPackage.eNS_URI);
			if (theBookingFactory != null) {
				return theBookingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BookingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingFactoryImpl() {
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
			case BookingPackage.ORGANIZATION: return createOrganization();
			case BookingPackage.PERSON: return createPerson();
			case BookingPackage.BOOKING: return createBooking();
			case BookingPackage.TRAVEL_INFORMATION: return createTravelInformation();
			case BookingPackage.ROOM_STAY: return createRoomStay();
			case BookingPackage.STAY_REQUEST: return createStayRequest();
			case BookingPackage.CREDIT_CARD_INFORMATION: return createCreditCardInformation();
			case BookingPackage.BOOKING_MANAGER_IMPL: return createBookingManagerImpl();
			case BookingPackage.BOOKING_DATA_SERVICE: return createBookingDataService();
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL: return createLegalEntityManagerImpl();
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE: return createLegalEntityDataService();
			case BookingPackage.LEGAL_ENTITY: return createLegalEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
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
	public TravelInformation createTravelInformation() {
		TravelInformationImpl travelInformation = new TravelInformationImpl();
		return travelInformation;
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
	public BookingManagerImpl createBookingManagerImpl() {
		BookingManagerImplImpl bookingManagerImpl = new BookingManagerImplImpl();
		return bookingManagerImpl;
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
	public LegalEntityManagerImpl createLegalEntityManagerImpl() {
		LegalEntityManagerImplImpl legalEntityManagerImpl = new LegalEntityManagerImplImpl();
		return legalEntityManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityDataService createLegalEntityDataService() {
		LegalEntityDataServiceImpl legalEntityDataService = new LegalEntityDataServiceImpl();
		return legalEntityDataService;
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
	public BookingPackage getBookingPackage() {
		return (BookingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BookingPackage getPackage() {
		return BookingPackage.eINSTANCE;
	}

} //BookingFactoryImpl

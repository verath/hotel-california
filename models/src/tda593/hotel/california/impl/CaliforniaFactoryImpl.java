/**
 */
package tda593.hotel.california.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
import tda593.hotel.california.ConferenceRoom;
import tda593.hotel.california.CreditCardInformation;
import tda593.hotel.california.DisabilityApproval;
import tda593.hotel.california.DiscountLimit;
import tda593.hotel.california.GuestRoom;
import tda593.hotel.california.KeyCard;
import tda593.hotel.california.LegalEntity;
import tda593.hotel.california.Organization;
import tda593.hotel.california.PercentageDiscount;
import tda593.hotel.california.Person;
import tda593.hotel.california.Purchase;
import tda593.hotel.california.Room;
import tda593.hotel.california.RoomApproval;
import tda593.hotel.california.RoomStay;
import tda593.hotel.california.RoomType;
import tda593.hotel.california.Service;
import tda593.hotel.california.StayRequest;
import tda593.hotel.california.SumDiscount;
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
			case CaliforniaPackage.DISCOUNT_LIMIT: return createDiscountLimit();
			case CaliforniaPackage.BILL_MANAGER_IMPL: return createBillManagerImpl();
			case CaliforniaPackage.BOOKING: return createBooking();
			case CaliforniaPackage.ROOM_STAY: return createRoomStay();
			case CaliforniaPackage.STAY_REQUEST: return createStayRequest();
			case CaliforniaPackage.PERSON: return createPerson();
			case CaliforniaPackage.ROOM_TYPE: return createRoomType();
			case CaliforniaPackage.TRAVEL_INFORMATION: return createTravelInformation();
			case CaliforniaPackage.BOOKING_DATA_SERVICE: return createBookingDataService();
			case CaliforniaPackage.ROOM: return createRoom();
			case CaliforniaPackage.KEY_CARD: return createKeyCard();
			case CaliforniaPackage.BOOKING_MANAGER_IMPL: return createBookingManagerImpl();
			case CaliforniaPackage.ORGANIZATION: return createOrganization();
			case CaliforniaPackage.SUM_DISCOUNT: return createSumDiscount();
			case CaliforniaPackage.BOOKING_BILL: return createBookingBill();
			case CaliforniaPackage.GUEST_ROOM: return createGuestRoom();
			case CaliforniaPackage.CONFERENCE_ROOM: return createConferenceRoom();
			case CaliforniaPackage.PERCENTAGE_DISCOUNT: return createPercentageDiscount();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CaliforniaPackage.ROOM_APPROVAL:
				return createRoomApprovalFromString(eDataType, initialValue);
			case CaliforniaPackage.DISABILITY_APPROVAL:
				return createDisabilityApprovalFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CaliforniaPackage.ROOM_APPROVAL:
				return convertRoomApprovalToString(eDataType, instanceValue);
			case CaliforniaPackage.DISABILITY_APPROVAL:
				return convertDisabilityApprovalToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public BillManagerImpl createBillManagerImpl() {
		BillManagerImplImpl billManagerImpl = new BillManagerImplImpl();
		return billManagerImpl;
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
	public DiscountLimit createDiscountLimit() {
		DiscountLimitImpl discountLimit = new DiscountLimitImpl();
		return discountLimit;
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
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
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
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCard createKeyCard() {
		KeyCardImpl keyCard = new KeyCardImpl();
		return keyCard;
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
	public SumDiscount createSumDiscount() {
		SumDiscountImpl sumDiscount = new SumDiscountImpl();
		return sumDiscount;
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
	public GuestRoom createGuestRoom() {
		GuestRoomImpl guestRoom = new GuestRoomImpl();
		return guestRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoom createConferenceRoom() {
		ConferenceRoomImpl conferenceRoom = new ConferenceRoomImpl();
		return conferenceRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageDiscount createPercentageDiscount() {
		PercentageDiscountImpl percentageDiscount = new PercentageDiscountImpl();
		return percentageDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomApproval createRoomApprovalFromString(EDataType eDataType, String initialValue) {
		RoomApproval result = RoomApproval.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomApprovalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisabilityApproval createDisabilityApprovalFromString(EDataType eDataType, String initialValue) {
		DisabilityApproval result = DisabilityApproval.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisabilityApprovalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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

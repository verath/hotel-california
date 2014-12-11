/**
 */
package Classes.impl;

import Classes.Bill;
import Classes.Booking;
import Classes.BookingBill;
import Classes.BookingDataService;
import Classes.BookingManagerImpl;
import Classes.ClassesFactory;
import Classes.ClassesPackage;
import Classes.ConferenceRoom;
import Classes.CreditCardInformation;
import Classes.DisabilityApproval;
import Classes.DiscountLimit;
import Classes.GuestRoom;
import Classes.KeyCard;
import Classes.LegalEntity;
import Classes.Organization;
import Classes.PercentageDiscount;
import Classes.Person;
import Classes.Purchase;
import Classes.Room;
import Classes.RoomApproval;
import Classes.RoomStay;
import Classes.RoomType;
import Classes.Service;
import Classes.StayRequest;
import Classes.SumDiscount;
import Classes.TravelInformation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassesFactoryImpl extends EFactoryImpl implements ClassesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassesFactory init() {
		try {
			ClassesFactory theClassesFactory = (ClassesFactory)EPackage.Registry.INSTANCE.getEFactory(ClassesPackage.eNS_URI);
			if (theClassesFactory != null) {
				return theClassesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesFactoryImpl() {
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
			case ClassesPackage.BOOKING_DATA_SERVICE: return createBookingDataService();
			case ClassesPackage.BOOKING: return createBooking();
			case ClassesPackage.ROOM_STAY: return createRoomStay();
			case ClassesPackage.STAY_REQUEST: return createStayRequest();
			case ClassesPackage.PERSON: return createPerson();
			case ClassesPackage.LEGAL_ENTITY: return createLegalEntity();
			case ClassesPackage.CREDIT_CARD_INFORMATION: return createCreditCardInformation();
			case ClassesPackage.ROOM_TYPE: return createRoomType();
			case ClassesPackage.TRAVEL_INFORMATION: return createTravelInformation();
			case ClassesPackage.BOOKING_MANAGER_IMPL: return createBookingManagerImpl();
			case ClassesPackage.ROOM: return createRoom();
			case ClassesPackage.KEY_CARD: return createKeyCard();
			case ClassesPackage.DISCOUNT_LIMIT: return createDiscountLimit();
			case ClassesPackage.GUEST_ROOM: return createGuestRoom();
			case ClassesPackage.CONFERENCE_ROOM: return createConferenceRoom();
			case ClassesPackage.ORGANIZATION: return createOrganization();
			case ClassesPackage.BILL: return createBill();
			case ClassesPackage.PURCHASE: return createPurchase();
			case ClassesPackage.SERVICE: return createService();
			case ClassesPackage.BOOKING_BILL: return createBookingBill();
			case ClassesPackage.PERCENTAGE_DISCOUNT: return createPercentageDiscount();
			case ClassesPackage.SUM_DISCOUNT: return createSumDiscount();
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
			case ClassesPackage.ROOM_APPROVAL:
				return createRoomApprovalFromString(eDataType, initialValue);
			case ClassesPackage.DISABILITY_APPROVAL:
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
			case ClassesPackage.ROOM_APPROVAL:
				return convertRoomApprovalToString(eDataType, instanceValue);
			case ClassesPackage.DISABILITY_APPROVAL:
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
	public BookingDataService createBookingDataService() {
		BookingDataServiceImpl bookingDataService = new BookingDataServiceImpl();
		return bookingDataService;
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
	public BookingManagerImpl createBookingManagerImpl() {
		BookingManagerImplImpl bookingManagerImpl = new BookingManagerImplImpl();
		return bookingManagerImpl;
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
	public DiscountLimit createDiscountLimit() {
		DiscountLimitImpl discountLimit = new DiscountLimitImpl();
		return discountLimit;
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
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
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
	public BookingBill createBookingBill() {
		BookingBillImpl bookingBill = new BookingBillImpl();
		return bookingBill;
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
	public SumDiscount createSumDiscount() {
		SumDiscountImpl sumDiscount = new SumDiscountImpl();
		return sumDiscount;
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
	public ClassesPackage getClassesPackage() {
		return (ClassesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassesPackage getPackage() {
		return ClassesPackage.eINSTANCE;
	}

} //ClassesFactoryImpl

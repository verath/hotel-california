/**
 */
package Classes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Classes.ClassesFactory
 * @model kind="package"
 * @generated
 */
public interface ClassesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Classes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassesPackage eINSTANCE = Classes.impl.ClassesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.DataService <em>Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.DataService
	 * @see Classes.impl.ClassesPackageImpl#getDataService()
	 * @generated
	 */
	int DATA_SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___GET__OBJECT = 0;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___GET_ALL = 1;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___COUNT = 2;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___SET__OBJECT = 3;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___SET_ALL__ELIST = 4;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___DELETE__OBJECT = 5;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___EXIST__OBJECT = 6;

	/**
	 * The number of operations of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link Classes.impl.BookingDataServiceImpl <em>Booking Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.BookingDataServiceImpl
	 * @see Classes.impl.ClassesPackageImpl#getBookingDataService()
	 * @generated
	 */
	int BOOKING_DATA_SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Booking Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE_FEATURE_COUNT = DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___GET__OBJECT = DATA_SERVICE___GET__OBJECT;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___GET_ALL = DATA_SERVICE___GET_ALL;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___COUNT = DATA_SERVICE___COUNT;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___SET__OBJECT = DATA_SERVICE___SET__OBJECT;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___SET_ALL__ELIST = DATA_SERVICE___SET_ALL__ELIST;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___DELETE__OBJECT = DATA_SERVICE___DELETE__OBJECT;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___EXIST__OBJECT = DATA_SERVICE___EXIST__OBJECT;

	/**
	 * The number of operations of the '<em>Booking Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE_OPERATION_COUNT = DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.BookingImpl
	 * @see Classes.impl.ClassesPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Special Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__SPECIAL_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Room Stay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_STAY = 5;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Travel Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__TRAVEL_INFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__RESPONSIBLE = 8;

	/**
	 * The feature id for the '<em><b>Is Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__IS_CANCELED = 9;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECK_IN = 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECK_OUT = 1;

	/**
	 * The operation id for the '<em>Register Travel Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___REGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION = 2;

	/**
	 * The operation id for the '<em>Unregister Travel Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___UNREGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION = 3;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Classes.impl.RoomStayImpl <em>Room Stay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.RoomStayImpl
	 * @see Classes.impl.ClassesPackageImpl#getRoomStay()
	 * @generated
	 */
	int ROOM_STAY = 3;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Stay Request</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY__STAY_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Registered Persons</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY__REGISTERED_PERSONS = 2;

	/**
	 * The number of structural features of the '<em>Room Stay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room Stay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.impl.StayRequestImpl <em>Stay Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.StayRequestImpl
	 * @see Classes.impl.ClassesPackageImpl#getStayRequest()
	 * @generated
	 */
	int STAY_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST__TIME_STAMP = 1;

	/**
	 * The number of structural features of the '<em>Stay Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stay Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.LegalEntityImpl
	 * @see Classes.impl.ClassesPackageImpl#getLegalEntity()
	 * @generated
	 */
	int LEGAL_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__PHONE = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__CREDIT_CARD_INFORMATION = 2;

	/**
	 * The number of structural features of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Operation1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY___OPERATION1 = 0;

	/**
	 * The number of operations of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Classes.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.PersonImpl
	 * @see Classes.impl.ClassesPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 5;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONE = LEGAL_ENTITY__PHONE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = LEGAL_ENTITY__EMAIL;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREDIT_CARD_INFORMATION = LEGAL_ENTITY__CREDIT_CARD_INFORMATION;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRSTNAME = LEGAL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LASTNAME = LEGAL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SOCIAL_SECURITY_NUMBER = LEGAL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = LEGAL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Operation1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___OPERATION1 = LEGAL_ENTITY___OPERATION1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = LEGAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.impl.CreditCardInformationImpl <em>Credit Card Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.CreditCardInformationImpl
	 * @see Classes.impl.ClassesPackageImpl#getCreditCardInformation()
	 * @generated
	 */
	int CREDIT_CARD_INFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION__CARD_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Card Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION__CARD_HOLDER = 1;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION__EXPIRATION_DATE = 2;

	/**
	 * The number of structural features of the '<em>Credit Card Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Credit Card Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.RoomTypeImpl
	 * @see Classes.impl.ClassesPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Room Approvals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ROOM_APPROVALS = 3;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.impl.TravelInformationImpl <em>Travel Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.TravelInformationImpl
	 * @see Classes.impl.ClassesPackageImpl#getTravelInformation()
	 * @generated
	 */
	int TRAVEL_INFORMATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Tracking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION__TRACKING_ID = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION__PREDECESSOR = 3;

	/**
	 * The number of structural features of the '<em>Travel Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Predecessor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION___ADD_PREDECESSOR__TRAVELINFORMATION = 0;

	/**
	 * The number of operations of the '<em>Travel Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Classes.BookingManager <em>Booking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.BookingManager
	 * @see Classes.impl.ClassesPackageImpl#getBookingManager()
	 * @generated
	 */
	int BOOKING_MANAGER = 11;

	/**
	 * The number of structural features of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE = 0;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE_LEGALENTITY = 1;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKINGS__LEGALENTITY = 2;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE = 3;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE = 4;

	/**
	 * The operation id for the '<em>Get Available Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE = 5;

	/**
	 * The operation id for the '<em>Get Available Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE = 6;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE = 7;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM = 8;

	/**
	 * The operation id for the '<em>Is Room Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___IS_ROOM_AVAILABLE__DATE_DATE_INT = 9;

	/**
	 * The operation id for the '<em>Register Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___REGISTER_ROOM__BOOKING_ROOM = 10;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CHECK_IN__BOOKING_ELIST = 11;

	/**
	 * The operation id for the '<em>Is Room Type Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE = 12;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_ROOM_TYPES = 13;

	/**
	 * The operation id for the '<em>Get Active Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_ACTIVE_BOOKING__INT = 14;

	/**
	 * The operation id for the '<em>Get Related Legal Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_RELATED_LEGAL_ENTITIES__BOOKING = 15;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CHECK_OUT__BOOKING = 16;

	/**
	 * The number of operations of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_OPERATION_COUNT = 17;

	/**
	 * The meta object id for the '{@link Classes.impl.BookingManagerImplImpl <em>Booking Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.BookingManagerImplImpl
	 * @see Classes.impl.ClassesPackageImpl#getBookingManagerImpl()
	 * @generated
	 */
	int BOOKING_MANAGER_IMPL = 10;

	/**
	 * The feature id for the '<em><b>Booking Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE = BOOKING_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL_FEATURE_COUNT = BOOKING_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_BOOKINGS__DATE_DATE = BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_BOOKINGS__DATE_DATE_LEGALENTITY = BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE_LEGALENTITY;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_BOOKINGS__LEGALENTITY = BOOKING_MANAGER___GET_BOOKINGS__LEGALENTITY;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOMS__DATE_DATE = BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE = BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE;

	/**
	 * The operation id for the '<em>Get Available Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE = BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Available Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE = BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE = BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM = BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM;

	/**
	 * The operation id for the '<em>Is Room Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___IS_ROOM_AVAILABLE__DATE_DATE_INT = BOOKING_MANAGER___IS_ROOM_AVAILABLE__DATE_DATE_INT;

	/**
	 * The operation id for the '<em>Register Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___REGISTER_ROOM__BOOKING_ROOM = BOOKING_MANAGER___REGISTER_ROOM__BOOKING_ROOM;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___CHECK_IN__BOOKING_ELIST = BOOKING_MANAGER___CHECK_IN__BOOKING_ELIST;

	/**
	 * The operation id for the '<em>Is Room Type Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE = BOOKING_MANAGER___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_ROOM_TYPES = BOOKING_MANAGER___GET_ROOM_TYPES;

	/**
	 * The operation id for the '<em>Get Active Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_ACTIVE_BOOKING__INT = BOOKING_MANAGER___GET_ACTIVE_BOOKING__INT;

	/**
	 * The operation id for the '<em>Get Related Legal Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_RELATED_LEGAL_ENTITIES__BOOKING = BOOKING_MANAGER___GET_RELATED_LEGAL_ENTITIES__BOOKING;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___CHECK_OUT__BOOKING = BOOKING_MANAGER___CHECK_OUT__BOOKING;

	/**
	 * The number of operations of the '<em>Booking Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL_OPERATION_COUNT = BOOKING_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.RoomImpl
	 * @see Classes.impl.ClassesPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 12;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__FLOOR = 0;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_OPERATIONAL = 2;

	/**
	 * The feature id for the '<em><b>Is Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_CLEANED = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PHOTOS = 5;

	/**
	 * The feature id for the '<em><b>Allowed Key Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ALLOWED_KEY_CARDS = 6;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM = 8;

	/**
	 * The feature id for the '<em><b>Disability Approvals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DISABILITY_APPROVALS = 9;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___REGISTER_KEY_CARD__KEYCARD = 0;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___UNREGISTER_KEY_CARD__KEYCARD = 1;

	/**
	 * The operation id for the '<em>Unregister Key Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___UNREGISTER_KEY_CARDS = 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Classes.impl.KeyCardImpl <em>Key Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.KeyCardImpl
	 * @see Classes.impl.ClassesPackageImpl#getKeyCard()
	 * @generated
	 */
	int KEY_CARD = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD__ID = 0;

	/**
	 * The number of structural features of the '<em>Key Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Key Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.DiscountManager <em>Discount Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.DiscountManager
	 * @see Classes.impl.ClassesPackageImpl#getDiscountManager()
	 * @generated
	 */
	int DISCOUNT_MANAGER = 14;

	/**
	 * The number of structural features of the '<em>Discount Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER___GET_DISCOUNT__INT = 0;

	/**
	 * The number of operations of the '<em>Discount Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Classes.impl.DiscountImpl <em>Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.DiscountImpl
	 * @see Classes.impl.ClassesPackageImpl#getDiscount()
	 * @generated
	 */
	int DISCOUNT = 15;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Discount Limit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__DISCOUNT_LIMIT = 2;

	/**
	 * The number of structural features of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Price With Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE = 0;

	/**
	 * The number of operations of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Classes.impl.DiscountLimitImpl <em>Discount Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.DiscountLimitImpl
	 * @see Classes.impl.ClassesPackageImpl#getDiscountLimit()
	 * @generated
	 */
	int DISCOUNT_LIMIT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Allowed Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT__ALLOWED_USERS = 3;

	/**
	 * The number of structural features of the '<em>Discount Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Discount Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.RoomManager <em>Room Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.RoomManager
	 * @see Classes.impl.ClassesPackageImpl#getRoomManager()
	 * @generated
	 */
	int ROOM_MANAGER = 17;

	/**
	 * The number of structural features of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOM_TYPES = 0;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___REGISTER_KEY_CARD__KEYCARD = 1;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___REGISTER_KEY_CARD__STRING = 2;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOMS = 3;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___UNREGISTER_KEY_CARD__KEYCARD = 4;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___UNREGISTER_KEY_CARD__STRING = 5;

	/**
	 * The operation id for the '<em>Unregister All Key Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___UNREGISTER_ALL_KEY_CARDS__ROOM = 6;

	/**
	 * The number of operations of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link Classes.AdminDiscountManager <em>Admin Discount Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.AdminDiscountManager
	 * @see Classes.impl.ClassesPackageImpl#getAdminDiscountManager()
	 * @generated
	 */
	int ADMIN_DISCOUNT_MANAGER = 18;

	/**
	 * The number of structural features of the '<em>Admin Discount Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_FEATURE_COUNT = DISCOUNT_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___GET_DISCOUNT__INT = DISCOUNT_MANAGER___GET_DISCOUNT__INT;

	/**
	 * The operation id for the '<em>Add Sum Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___ADD_SUM_DISCOUNT__DOUBLE = DISCOUNT_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Percentage Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___ADD_PERCENTAGE_DISCOUNT__FLOAT = DISCOUNT_MANAGER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Amount Limit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___SET_AMOUNT_LIMIT__DISCOUNT_INT = DISCOUNT_MANAGER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Allowed Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___ADD_ALLOWED_USERS__DISCOUNT_ELIST = DISCOUNT_MANAGER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Date Range Limit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___SET_DATE_RANGE_LIMIT__DISCOUNT_DATE_DATE = DISCOUNT_MANAGER_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Admin Discount Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_OPERATION_COUNT = DISCOUNT_MANAGER_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link Classes.AdminRoomManager <em>Admin Room Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.AdminRoomManager
	 * @see Classes.impl.ClassesPackageImpl#getAdminRoomManager()
	 * @generated
	 */
	int ADMIN_ROOM_MANAGER = 19;

	/**
	 * The number of structural features of the '<em>Admin Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_FEATURE_COUNT = ROOM_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___GET_ROOM_TYPES = ROOM_MANAGER___GET_ROOM_TYPES;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___REGISTER_KEY_CARD__KEYCARD = ROOM_MANAGER___REGISTER_KEY_CARD__KEYCARD;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___REGISTER_KEY_CARD__STRING = ROOM_MANAGER___REGISTER_KEY_CARD__STRING;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___GET_ROOMS = ROOM_MANAGER___GET_ROOMS;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___UNREGISTER_KEY_CARD__KEYCARD = ROOM_MANAGER___UNREGISTER_KEY_CARD__KEYCARD;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___UNREGISTER_KEY_CARD__STRING = ROOM_MANAGER___UNREGISTER_KEY_CARD__STRING;

	/**
	 * The operation id for the '<em>Unregister All Key Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___UNREGISTER_ALL_KEY_CARDS__ROOM = ROOM_MANAGER___UNREGISTER_ALL_KEY_CARDS__ROOM;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___ADD_ROOM__INT_INT_STRING_ELIST_ELIST = ROOM_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___REMOVE_ROOM__INT = ROOM_MANAGER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Admin Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_OPERATION_COUNT = ROOM_MANAGER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Classes.impl.GuestRoomImpl <em>Guest Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.GuestRoomImpl
	 * @see Classes.impl.ClassesPackageImpl#getGuestRoom()
	 * @generated
	 */
	int GUEST_ROOM = 20;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__FLOOR = ROOM__FLOOR;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__ROOM_NUMBER = ROOM__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__IS_OPERATIONAL = ROOM__IS_OPERATIONAL;

	/**
	 * The feature id for the '<em><b>Is Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__IS_CLEANED = ROOM__IS_CLEANED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__DESCRIPTION = ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__PHOTOS = ROOM__PHOTOS;

	/**
	 * The feature id for the '<em><b>Allowed Key Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__ALLOWED_KEY_CARDS = ROOM__ALLOWED_KEY_CARDS;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__ROOM_TYPE = ROOM__ROOM_TYPE;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__ROOM = ROOM__ROOM;

	/**
	 * The feature id for the '<em><b>Disability Approvals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__DISABILITY_APPROVALS = ROOM__DISABILITY_APPROVALS;

	/**
	 * The feature id for the '<em><b>Number Of Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__NUMBER_OF_BEDS = ROOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Extrabeds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM__NUMBER_OF_EXTRABEDS = ROOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Guest Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM___REGISTER_KEY_CARD__KEYCARD = ROOM___REGISTER_KEY_CARD__KEYCARD;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM___UNREGISTER_KEY_CARD__KEYCARD = ROOM___UNREGISTER_KEY_CARD__KEYCARD;

	/**
	 * The operation id for the '<em>Unregister Key Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM___UNREGISTER_KEY_CARDS = ROOM___UNREGISTER_KEY_CARDS;

	/**
	 * The number of operations of the '<em>Guest Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.ConferenceRoomImpl
	 * @see Classes.impl.ClassesPackageImpl#getConferenceRoom()
	 * @generated
	 */
	int CONFERENCE_ROOM = 21;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__FLOOR = ROOM__FLOOR;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__ROOM_NUMBER = ROOM__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__IS_OPERATIONAL = ROOM__IS_OPERATIONAL;

	/**
	 * The feature id for the '<em><b>Is Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__IS_CLEANED = ROOM__IS_CLEANED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__DESCRIPTION = ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__PHOTOS = ROOM__PHOTOS;

	/**
	 * The feature id for the '<em><b>Allowed Key Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__ALLOWED_KEY_CARDS = ROOM__ALLOWED_KEY_CARDS;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__ROOM_TYPE = ROOM__ROOM_TYPE;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__ROOM = ROOM__ROOM;

	/**
	 * The feature id for the '<em><b>Disability Approvals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__DISABILITY_APPROVALS = ROOM__DISABILITY_APPROVALS;

	/**
	 * The feature id for the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__NUMBER_OF_SEATS = ROOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__EQUIPMENT = ROOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM___REGISTER_KEY_CARD__KEYCARD = ROOM___REGISTER_KEY_CARD__KEYCARD;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM___UNREGISTER_KEY_CARD__KEYCARD = ROOM___UNREGISTER_KEY_CARD__KEYCARD;

	/**
	 * The operation id for the '<em>Unregister Key Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM___UNREGISTER_KEY_CARDS = ROOM___UNREGISTER_KEY_CARDS;

	/**
	 * The number of operations of the '<em>Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.OrganizationImpl
	 * @see Classes.impl.ClassesPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 22;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PHONE = LEGAL_ENTITY__PHONE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EMAIL = LEGAL_ENTITY__EMAIL;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CREDIT_CARD_INFORMATION = LEGAL_ENTITY__CREDIT_CARD_INFORMATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = LEGAL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ORGANIZATION_NUMBER = LEGAL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = LEGAL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Operation1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___OPERATION1 = LEGAL_ENTITY___OPERATION1;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = LEGAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.BillImpl
	 * @see Classes.impl.ClassesPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__DATE = 1;

	/**
	 * The feature id for the '<em><b>Is Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__IS_PUBLISHED = 2;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__CUSTOMER = 3;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__IS_PAID = 4;

	/**
	 * The feature id for the '<em><b>Purchase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__PURCHASE = 5;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__CREDIT_CARD_INFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Used Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__USED_DISCOUNTS = 7;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Apply Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___APPLY_DISCOUNT__DISCOUNT = 0;

	/**
	 * The operation id for the '<em>Add Sub Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___ADD_SUB_BILL__BILL = 1;

	/**
	 * The operation id for the '<em>Register Purchase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___REGISTER_PURCHASE__PURCHASE = 2;

	/**
	 * The operation id for the '<em>Publish Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___PUBLISH_BILL = 3;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Classes.impl.PurchaseImpl <em>Purchase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.PurchaseImpl
	 * @see Classes.impl.ClassesPackageImpl#getPurchase()
	 * @generated
	 */
	int PURCHASE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE__SERVICE = 3;

	/**
	 * The number of structural features of the '<em>Purchase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Purchase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.ServiceImpl
	 * @see Classes.impl.ClassesPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.impl.BookingBillImpl <em>Booking Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.BookingBillImpl
	 * @see Classes.impl.ClassesPackageImpl#getBookingBill()
	 * @generated
	 */
	int BOOKING_BILL = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__ID = BILL__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__DATE = BILL__DATE;

	/**
	 * The feature id for the '<em><b>Is Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__IS_PUBLISHED = BILL__IS_PUBLISHED;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__CUSTOMER = BILL__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__IS_PAID = BILL__IS_PAID;

	/**
	 * The feature id for the '<em><b>Purchase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__PURCHASE = BILL__PURCHASE;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__CREDIT_CARD_INFORMATION = BILL__CREDIT_CARD_INFORMATION;

	/**
	 * The feature id for the '<em><b>Used Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__USED_DISCOUNTS = BILL__USED_DISCOUNTS;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__BOOKING = BILL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_FEATURE_COUNT = BILL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___APPLY_DISCOUNT__DISCOUNT = BILL___APPLY_DISCOUNT__DISCOUNT;

	/**
	 * The operation id for the '<em>Add Sub Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___ADD_SUB_BILL__BILL = BILL___ADD_SUB_BILL__BILL;

	/**
	 * The operation id for the '<em>Register Purchase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___REGISTER_PURCHASE__PURCHASE = BILL___REGISTER_PURCHASE__PURCHASE;

	/**
	 * The operation id for the '<em>Publish Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___PUBLISH_BILL = BILL___PUBLISH_BILL;

	/**
	 * The number of operations of the '<em>Booking Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_OPERATION_COUNT = BILL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.impl.PercentageDiscountImpl <em>Percentage Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.PercentageDiscountImpl
	 * @see Classes.impl.ClassesPackageImpl#getPercentageDiscount()
	 * @generated
	 */
	int PERCENTAGE_DISCOUNT = 27;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__CODE = DISCOUNT__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__NAME = DISCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Discount Limit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__DISCOUNT_LIMIT = DISCOUNT__DISCOUNT_LIMIT;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__PERCENTAGE = DISCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Percentage Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_FEATURE_COUNT = DISCOUNT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Price With Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE = DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE;

	/**
	 * The number of operations of the '<em>Percentage Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_OPERATION_COUNT = DISCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.impl.SumDiscountImpl <em>Sum Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.SumDiscountImpl
	 * @see Classes.impl.ClassesPackageImpl#getSumDiscount()
	 * @generated
	 */
	int SUM_DISCOUNT = 28;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__CODE = DISCOUNT__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__NAME = DISCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Discount Limit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__DISCOUNT_LIMIT = DISCOUNT__DISCOUNT_LIMIT;

	/**
	 * The feature id for the '<em><b>Discount Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__DISCOUNT_SUM = DISCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sum Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_FEATURE_COUNT = DISCOUNT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Price With Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE = DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE;

	/**
	 * The number of operations of the '<em>Sum Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_OPERATION_COUNT = DISCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.RoomApproval <em>Room Approval</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.RoomApproval
	 * @see Classes.impl.ClassesPackageImpl#getRoomApproval()
	 * @generated
	 */
	int ROOM_APPROVAL = 29;

	/**
	 * The meta object id for the '{@link Classes.DisabilityApproval <em>Disability Approval</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.DisabilityApproval
	 * @see Classes.impl.ClassesPackageImpl#getDisabilityApproval()
	 * @generated
	 */
	int DISABILITY_APPROVAL = 30;


	/**
	 * Returns the meta object for class '{@link Classes.DataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Service</em>'.
	 * @see Classes.DataService
	 * @generated
	 */
	EClass getDataService();

	/**
	 * Returns the meta object for the '{@link Classes.DataService#get(java.lang.Object) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see Classes.DataService#get(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Get__Object();

	/**
	 * Returns the meta object for the '{@link Classes.DataService#getAll() <em>Get All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All</em>' operation.
	 * @see Classes.DataService#getAll()
	 * @generated
	 */
	EOperation getDataService__GetAll();

	/**
	 * Returns the meta object for the '{@link Classes.DataService#count() <em>Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count</em>' operation.
	 * @see Classes.DataService#count()
	 * @generated
	 */
	EOperation getDataService__Count();

	/**
	 * Returns the meta object for the '{@link Classes.DataService#set(java.lang.Object) <em>Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set</em>' operation.
	 * @see Classes.DataService#set(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Set__Object();

	/**
	 * Returns the meta object for the '{@link Classes.DataService#setAll(org.eclipse.emf.common.util.EList) <em>Set All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set All</em>' operation.
	 * @see Classes.DataService#setAll(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataService__SetAll__EList();

	/**
	 * Returns the meta object for the '{@link Classes.DataService#delete(java.lang.Object) <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see Classes.DataService#delete(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Delete__Object();

	/**
	 * Returns the meta object for the '{@link Classes.DataService#exist(java.lang.Object) <em>Exist</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exist</em>' operation.
	 * @see Classes.DataService#exist(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Exist__Object();

	/**
	 * Returns the meta object for class '{@link Classes.BookingDataService <em>Booking Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Data Service</em>'.
	 * @see Classes.BookingDataService
	 * @generated
	 */
	EClass getBookingDataService();

	/**
	 * Returns the meta object for class '{@link Classes.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see Classes.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Booking#getId()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see Classes.Booking#getStartDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see Classes.Booking#getEndDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getSpecialRequest <em>Special Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Request</em>'.
	 * @see Classes.Booking#getSpecialRequest()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_SpecialRequest();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Classes.Booking#getPrice()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Price();

	/**
	 * Returns the meta object for the reference '{@link Classes.Booking#getRoomStay <em>Room Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Stay</em>'.
	 * @see Classes.Booking#getRoomStay()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomStay();

	/**
	 * Returns the meta object for the reference '{@link Classes.Booking#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see Classes.Booking#getRoomType()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomType();

	/**
	 * Returns the meta object for the reference '{@link Classes.Booking#getTravelInformation <em>Travel Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Information</em>'.
	 * @see Classes.Booking#getTravelInformation()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_TravelInformation();

	/**
	 * Returns the meta object for the reference '{@link Classes.Booking#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see Classes.Booking#getResponsible()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Responsible();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#isCanceled <em>Is Canceled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Canceled</em>'.
	 * @see Classes.Booking#isCanceled()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_IsCanceled();

	/**
	 * Returns the meta object for the '{@link Classes.Booking#checkIn() <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see Classes.Booking#checkIn()
	 * @generated
	 */
	EOperation getBooking__CheckIn();

	/**
	 * Returns the meta object for the '{@link Classes.Booking#checkOut() <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see Classes.Booking#checkOut()
	 * @generated
	 */
	EOperation getBooking__CheckOut();

	/**
	 * Returns the meta object for the '{@link Classes.Booking#registerTravelInformation(Classes.TravelInformation) <em>Register Travel Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Travel Information</em>' operation.
	 * @see Classes.Booking#registerTravelInformation(Classes.TravelInformation)
	 * @generated
	 */
	EOperation getBooking__RegisterTravelInformation__TravelInformation();

	/**
	 * Returns the meta object for the '{@link Classes.Booking#unregisterTravelInformation(Classes.TravelInformation) <em>Unregister Travel Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Travel Information</em>' operation.
	 * @see Classes.Booking#unregisterTravelInformation(Classes.TravelInformation)
	 * @generated
	 */
	EOperation getBooking__UnregisterTravelInformation__TravelInformation();

	/**
	 * Returns the meta object for class '{@link Classes.RoomStay <em>Room Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Stay</em>'.
	 * @see Classes.RoomStay
	 * @generated
	 */
	EClass getRoomStay();

	/**
	 * Returns the meta object for the attribute '{@link Classes.RoomStay#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see Classes.RoomStay#isActive()
	 * @see #getRoomStay()
	 * @generated
	 */
	EAttribute getRoomStay_Active();

	/**
	 * Returns the meta object for the reference list '{@link Classes.RoomStay#getStayRequest <em>Stay Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stay Request</em>'.
	 * @see Classes.RoomStay#getStayRequest()
	 * @see #getRoomStay()
	 * @generated
	 */
	EReference getRoomStay_StayRequest();

	/**
	 * Returns the meta object for the reference '{@link Classes.RoomStay#getRegisteredPersons <em>Registered Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registered Persons</em>'.
	 * @see Classes.RoomStay#getRegisteredPersons()
	 * @see #getRoomStay()
	 * @generated
	 */
	EReference getRoomStay_RegisteredPersons();

	/**
	 * Returns the meta object for class '{@link Classes.StayRequest <em>Stay Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stay Request</em>'.
	 * @see Classes.StayRequest
	 * @generated
	 */
	EClass getStayRequest();

	/**
	 * Returns the meta object for the attribute '{@link Classes.StayRequest#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see Classes.StayRequest#getText()
	 * @see #getStayRequest()
	 * @generated
	 */
	EAttribute getStayRequest_Text();

	/**
	 * Returns the meta object for the attribute '{@link Classes.StayRequest#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see Classes.StayRequest#getTimeStamp()
	 * @see #getStayRequest()
	 * @generated
	 */
	EAttribute getStayRequest_TimeStamp();

	/**
	 * Returns the meta object for class '{@link Classes.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see Classes.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Person#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see Classes.Person#getFirstname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Person#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see Classes.Person#getLastname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Person#getSocialSecurityNumber <em>Social Security Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Security Number</em>'.
	 * @see Classes.Person#getSocialSecurityNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SocialSecurityNumber();

	/**
	 * Returns the meta object for class '{@link Classes.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity</em>'.
	 * @see Classes.LegalEntity
	 * @generated
	 */
	EClass getLegalEntity();

	/**
	 * Returns the meta object for the attribute '{@link Classes.LegalEntity#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see Classes.LegalEntity#getPhone()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EAttribute getLegalEntity_Phone();

	/**
	 * Returns the meta object for the attribute '{@link Classes.LegalEntity#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Classes.LegalEntity#getEmail()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EAttribute getLegalEntity_Email();

	/**
	 * Returns the meta object for the reference '{@link Classes.LegalEntity#getCreditCardInformation <em>Credit Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card Information</em>'.
	 * @see Classes.LegalEntity#getCreditCardInformation()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EReference getLegalEntity_CreditCardInformation();

	/**
	 * Returns the meta object for the '{@link Classes.LegalEntity#Operation1() <em>Operation1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operation1</em>' operation.
	 * @see Classes.LegalEntity#Operation1()
	 * @generated
	 */
	EOperation getLegalEntity__Operation1();

	/**
	 * Returns the meta object for class '{@link Classes.CreditCardInformation <em>Credit Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Card Information</em>'.
	 * @see Classes.CreditCardInformation
	 * @generated
	 */
	EClass getCreditCardInformation();

	/**
	 * Returns the meta object for the attribute '{@link Classes.CreditCardInformation#getCardNumber <em>Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number</em>'.
	 * @see Classes.CreditCardInformation#getCardNumber()
	 * @see #getCreditCardInformation()
	 * @generated
	 */
	EAttribute getCreditCardInformation_CardNumber();

	/**
	 * Returns the meta object for the attribute '{@link Classes.CreditCardInformation#getCardHolder <em>Card Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Holder</em>'.
	 * @see Classes.CreditCardInformation#getCardHolder()
	 * @see #getCreditCardInformation()
	 * @generated
	 */
	EAttribute getCreditCardInformation_CardHolder();

	/**
	 * Returns the meta object for the attribute '{@link Classes.CreditCardInformation#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see Classes.CreditCardInformation#getExpirationDate()
	 * @see #getCreditCardInformation()
	 * @generated
	 */
	EAttribute getCreditCardInformation_ExpirationDate();

	/**
	 * Returns the meta object for class '{@link Classes.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see Classes.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link Classes.RoomType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.RoomType#getId()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.RoomType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.RoomType#getName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Name();

	/**
	 * Returns the meta object for the attribute '{@link Classes.RoomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Classes.RoomType#getDescription()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Description();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.RoomType#getRoomApprovals <em>Room Approvals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Room Approvals</em>'.
	 * @see Classes.RoomType#getRoomApprovals()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_RoomApprovals();

	/**
	 * Returns the meta object for class '{@link Classes.TravelInformation <em>Travel Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Information</em>'.
	 * @see Classes.TravelInformation
	 * @generated
	 */
	EClass getTravelInformation();

	/**
	 * Returns the meta object for the attribute '{@link Classes.TravelInformation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.TravelInformation#getId()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EAttribute getTravelInformation_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.TravelInformation#getTrackingId <em>Tracking Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Id</em>'.
	 * @see Classes.TravelInformation#getTrackingId()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EAttribute getTravelInformation_TrackingId();

	/**
	 * Returns the meta object for the attribute '{@link Classes.TravelInformation#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Classes.TravelInformation#getComment()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EAttribute getTravelInformation_Comment();

	/**
	 * Returns the meta object for the reference '{@link Classes.TravelInformation#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see Classes.TravelInformation#getPredecessor()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EReference getTravelInformation_Predecessor();

	/**
	 * Returns the meta object for the '{@link Classes.TravelInformation#addPredecessor(Classes.TravelInformation) <em>Add Predecessor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Predecessor</em>' operation.
	 * @see Classes.TravelInformation#addPredecessor(Classes.TravelInformation)
	 * @generated
	 */
	EOperation getTravelInformation__AddPredecessor__TravelInformation();

	/**
	 * Returns the meta object for class '{@link Classes.BookingManagerImpl <em>Booking Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Manager Impl</em>'.
	 * @see Classes.BookingManagerImpl
	 * @generated
	 */
	EClass getBookingManagerImpl();

	/**
	 * Returns the meta object for the reference '{@link Classes.BookingManagerImpl#getBookingDataService <em>Booking Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking Data Service</em>'.
	 * @see Classes.BookingManagerImpl#getBookingDataService()
	 * @see #getBookingManagerImpl()
	 * @generated
	 */
	EReference getBookingManagerImpl_BookingDataService();

	/**
	 * Returns the meta object for class '{@link Classes.BookingManager <em>Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Manager</em>'.
	 * @see Classes.BookingManager
	 * @generated
	 */
	EClass getBookingManager();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#getBookings(java.util.Date, java.util.Date) <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see Classes.BookingManager#getBookings(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingManager__GetBookings__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#getBookings(java.util.Date, java.util.Date, Classes.LegalEntity) <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see Classes.BookingManager#getBookings(java.util.Date, java.util.Date, Classes.LegalEntity)
	 * @generated
	 */
	EOperation getBookingManager__GetBookings__Date_Date_LegalEntity();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#getBookings(Classes.LegalEntity) <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see Classes.BookingManager#getBookings(Classes.LegalEntity)
	 * @generated
	 */
	EOperation getBookingManager__GetBookings__LegalEntity();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#getAvailableRooms(java.util.Date, java.util.Date) <em>Get Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Rooms</em>' operation.
	 * @see Classes.BookingManager#getAvailableRooms(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRooms__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#getAvailableRooms(java.util.Date, java.util.Date, Classes.RoomType) <em>Get Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Rooms</em>' operation.
	 * @see Classes.BookingManager#getAvailableRooms(java.util.Date, java.util.Date, Classes.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRooms__Date_Date_RoomType();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#getAvailableRoomTypeAmount(java.util.Date, java.util.Date) <em>Get Available Room Type Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Room Type Amount</em>' operation.
	 * @see Classes.BookingManager#getAvailableRoomTypeAmount(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRoomTypeAmount__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#getAvailableRoomTypeAmount(java.util.Date, java.util.Date, Classes.RoomType) <em>Get Available Room Type Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Room Type Amount</em>' operation.
	 * @see Classes.BookingManager#getAvailableRoomTypeAmount(java.util.Date, java.util.Date, Classes.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRoomTypeAmount__Date_Date_RoomType();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#createBooking(java.util.Date, java.util.Date, Classes.LegalEntity, Classes.RoomType) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see Classes.BookingManager#createBooking(java.util.Date, java.util.Date, Classes.LegalEntity, Classes.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__CreateBooking__Date_Date_LegalEntity_RoomType();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#createBooking(java.util.Date, java.util.Date, Classes.LegalEntity, Classes.Room) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see Classes.BookingManager#createBooking(java.util.Date, java.util.Date, Classes.LegalEntity, Classes.Room)
	 * @generated
	 */
	EOperation getBookingManager__CreateBooking__Date_Date_LegalEntity_Room();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#isRoomAvailable(java.util.Date, java.util.Date, int) <em>Is Room Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Room Available</em>' operation.
	 * @see Classes.BookingManager#isRoomAvailable(java.util.Date, java.util.Date, int)
	 * @generated
	 */
	EOperation getBookingManager__IsRoomAvailable__Date_Date_int();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#registerRoom(Classes.Booking, Classes.Room) <em>Register Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Room</em>' operation.
	 * @see Classes.BookingManager#registerRoom(Classes.Booking, Classes.Room)
	 * @generated
	 */
	EOperation getBookingManager__RegisterRoom__Booking_Room();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#checkIn(Classes.Booking, org.eclipse.emf.common.util.EList) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see Classes.BookingManager#checkIn(Classes.Booking, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBookingManager__CheckIn__Booking_EList();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#isRoomTypeAvailable(java.util.Date, java.util.Date, Classes.RoomType) <em>Is Room Type Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Room Type Available</em>' operation.
	 * @see Classes.BookingManager#isRoomTypeAvailable(java.util.Date, java.util.Date, Classes.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__IsRoomTypeAvailable__Date_Date_RoomType();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#getRoomTypes() <em>Get Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types</em>' operation.
	 * @see Classes.BookingManager#getRoomTypes()
	 * @generated
	 */
	EOperation getBookingManager__GetRoomTypes();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#getActiveBooking(int) <em>Get Active Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Booking</em>' operation.
	 * @see Classes.BookingManager#getActiveBooking(int)
	 * @generated
	 */
	EOperation getBookingManager__GetActiveBooking__int();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#getRelatedLegalEntities(Classes.Booking) <em>Get Related Legal Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Related Legal Entities</em>' operation.
	 * @see Classes.BookingManager#getRelatedLegalEntities(Classes.Booking)
	 * @generated
	 */
	EOperation getBookingManager__GetRelatedLegalEntities__Booking();

	/**
	 * Returns the meta object for the '{@link Classes.BookingManager#checkOut(Classes.Booking) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see Classes.BookingManager#checkOut(Classes.Booking)
	 * @generated
	 */
	EOperation getBookingManager__CheckOut__Booking();

	/**
	 * Returns the meta object for class '{@link Classes.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see Classes.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Room#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floor</em>'.
	 * @see Classes.Room#getFloor()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Floor();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see Classes.Room#getRoomNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Room#isOperational <em>Is Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Operational</em>'.
	 * @see Classes.Room#isOperational()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsOperational();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Room#isCleaned <em>Is Cleaned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cleaned</em>'.
	 * @see Classes.Room#isCleaned()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsCleaned();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Room#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Classes.Room#getDescription()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Description();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Room#getPhotos <em>Photos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Photos</em>'.
	 * @see Classes.Room#getPhotos()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Photos();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Room#getAllowedKeyCards <em>Allowed Key Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Key Cards</em>'.
	 * @see Classes.Room#getAllowedKeyCards()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_AllowedKeyCards();

	/**
	 * Returns the meta object for the reference '{@link Classes.Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see Classes.Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_RoomType();

	/**
	 * Returns the meta object for the reference '{@link Classes.Room#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see Classes.Room#getRoom()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Room();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Room#getDisabilityApprovals <em>Disability Approvals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disability Approvals</em>'.
	 * @see Classes.Room#getDisabilityApprovals()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_DisabilityApprovals();

	/**
	 * Returns the meta object for the '{@link Classes.Room#registerKeyCard(Classes.KeyCard) <em>Register Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Key Card</em>' operation.
	 * @see Classes.Room#registerKeyCard(Classes.KeyCard)
	 * @generated
	 */
	EOperation getRoom__RegisterKeyCard__KeyCard();

	/**
	 * Returns the meta object for the '{@link Classes.Room#unregisterKeyCard(Classes.KeyCard) <em>Unregister Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Key Card</em>' operation.
	 * @see Classes.Room#unregisterKeyCard(Classes.KeyCard)
	 * @generated
	 */
	EOperation getRoom__UnregisterKeyCard__KeyCard();

	/**
	 * Returns the meta object for the '{@link Classes.Room#unregisterKeyCards() <em>Unregister Key Cards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Key Cards</em>' operation.
	 * @see Classes.Room#unregisterKeyCards()
	 * @generated
	 */
	EOperation getRoom__UnregisterKeyCards();

	/**
	 * Returns the meta object for class '{@link Classes.KeyCard <em>Key Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Card</em>'.
	 * @see Classes.KeyCard
	 * @generated
	 */
	EClass getKeyCard();

	/**
	 * Returns the meta object for the attribute '{@link Classes.KeyCard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.KeyCard#getId()
	 * @see #getKeyCard()
	 * @generated
	 */
	EAttribute getKeyCard_Id();

	/**
	 * Returns the meta object for class '{@link Classes.DiscountManager <em>Discount Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount Manager</em>'.
	 * @see Classes.DiscountManager
	 * @generated
	 */
	EClass getDiscountManager();

	/**
	 * Returns the meta object for the '{@link Classes.DiscountManager#getDiscount(int) <em>Get Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Discount</em>' operation.
	 * @see Classes.DiscountManager#getDiscount(int)
	 * @generated
	 */
	EOperation getDiscountManager__GetDiscount__int();

	/**
	 * Returns the meta object for class '{@link Classes.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount</em>'.
	 * @see Classes.Discount
	 * @generated
	 */
	EClass getDiscount();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Discount#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Classes.Discount#getCode()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Code();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Discount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.Discount#getName()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Name();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Discount#getDiscountLimit <em>Discount Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discount Limit</em>'.
	 * @see Classes.Discount#getDiscountLimit()
	 * @see #getDiscount()
	 * @generated
	 */
	EReference getDiscount_DiscountLimit();

	/**
	 * Returns the meta object for the '{@link Classes.Discount#getPriceWithDiscount(double) <em>Get Price With Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price With Discount</em>' operation.
	 * @see Classes.Discount#getPriceWithDiscount(double)
	 * @generated
	 */
	EOperation getDiscount__GetPriceWithDiscount__double();

	/**
	 * Returns the meta object for class '{@link Classes.DiscountLimit <em>Discount Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount Limit</em>'.
	 * @see Classes.DiscountLimit
	 * @generated
	 */
	EClass getDiscountLimit();

	/**
	 * Returns the meta object for the attribute '{@link Classes.DiscountLimit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.DiscountLimit#getId()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.DiscountLimit#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see Classes.DiscountLimit#getStartDate()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link Classes.DiscountLimit#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see Classes.DiscountLimit#getEndDate()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link Classes.DiscountLimit#getAllowedUsers <em>Allowed Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Users</em>'.
	 * @see Classes.DiscountLimit#getAllowedUsers()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EReference getDiscountLimit_AllowedUsers();

	/**
	 * Returns the meta object for class '{@link Classes.RoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Manager</em>'.
	 * @see Classes.RoomManager
	 * @generated
	 */
	EClass getRoomManager();

	/**
	 * Returns the meta object for the '{@link Classes.RoomManager#getRoomTypes() <em>Get Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types</em>' operation.
	 * @see Classes.RoomManager#getRoomTypes()
	 * @generated
	 */
	EOperation getRoomManager__GetRoomTypes();

	/**
	 * Returns the meta object for the '{@link Classes.RoomManager#registerKeyCard(Classes.KeyCard) <em>Register Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Key Card</em>' operation.
	 * @see Classes.RoomManager#registerKeyCard(Classes.KeyCard)
	 * @generated
	 */
	EOperation getRoomManager__RegisterKeyCard__KeyCard();

	/**
	 * Returns the meta object for the '{@link Classes.RoomManager#registerKeyCard(java.lang.String) <em>Register Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Key Card</em>' operation.
	 * @see Classes.RoomManager#registerKeyCard(java.lang.String)
	 * @generated
	 */
	EOperation getRoomManager__RegisterKeyCard__String();

	/**
	 * Returns the meta object for the '{@link Classes.RoomManager#getRooms() <em>Get Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rooms</em>' operation.
	 * @see Classes.RoomManager#getRooms()
	 * @generated
	 */
	EOperation getRoomManager__GetRooms();

	/**
	 * Returns the meta object for the '{@link Classes.RoomManager#unregisterKeyCard(Classes.KeyCard) <em>Unregister Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Key Card</em>' operation.
	 * @see Classes.RoomManager#unregisterKeyCard(Classes.KeyCard)
	 * @generated
	 */
	EOperation getRoomManager__UnregisterKeyCard__KeyCard();

	/**
	 * Returns the meta object for the '{@link Classes.RoomManager#unregisterKeyCard(java.lang.String) <em>Unregister Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Key Card</em>' operation.
	 * @see Classes.RoomManager#unregisterKeyCard(java.lang.String)
	 * @generated
	 */
	EOperation getRoomManager__UnregisterKeyCard__String();

	/**
	 * Returns the meta object for the '{@link Classes.RoomManager#unregisterAllKeyCards(Classes.Room) <em>Unregister All Key Cards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister All Key Cards</em>' operation.
	 * @see Classes.RoomManager#unregisterAllKeyCards(Classes.Room)
	 * @generated
	 */
	EOperation getRoomManager__UnregisterAllKeyCards__Room();

	/**
	 * Returns the meta object for class '{@link Classes.AdminDiscountManager <em>Admin Discount Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Discount Manager</em>'.
	 * @see Classes.AdminDiscountManager
	 * @generated
	 */
	EClass getAdminDiscountManager();

	/**
	 * Returns the meta object for the '{@link Classes.AdminDiscountManager#addSumDiscount(double) <em>Add Sum Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sum Discount</em>' operation.
	 * @see Classes.AdminDiscountManager#addSumDiscount(double)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddSumDiscount__double();

	/**
	 * Returns the meta object for the '{@link Classes.AdminDiscountManager#addPercentageDiscount(float) <em>Add Percentage Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Percentage Discount</em>' operation.
	 * @see Classes.AdminDiscountManager#addPercentageDiscount(float)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddPercentageDiscount__float();

	/**
	 * Returns the meta object for the '{@link Classes.AdminDiscountManager#setAmountLimit(Classes.Discount, int) <em>Set Amount Limit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Amount Limit</em>' operation.
	 * @see Classes.AdminDiscountManager#setAmountLimit(Classes.Discount, int)
	 * @generated
	 */
	EOperation getAdminDiscountManager__SetAmountLimit__Discount_int();

	/**
	 * Returns the meta object for the '{@link Classes.AdminDiscountManager#addAllowedUsers(Classes.Discount, org.eclipse.emf.common.util.EList) <em>Add Allowed Users</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Allowed Users</em>' operation.
	 * @see Classes.AdminDiscountManager#addAllowedUsers(Classes.Discount, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddAllowedUsers__Discount_EList();

	/**
	 * Returns the meta object for the '{@link Classes.AdminDiscountManager#setDateRangeLimit(Classes.Discount, java.util.Date, java.util.Date) <em>Set Date Range Limit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Date Range Limit</em>' operation.
	 * @see Classes.AdminDiscountManager#setDateRangeLimit(Classes.Discount, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getAdminDiscountManager__SetDateRangeLimit__Discount_Date_Date();

	/**
	 * Returns the meta object for class '{@link Classes.AdminRoomManager <em>Admin Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Room Manager</em>'.
	 * @see Classes.AdminRoomManager
	 * @generated
	 */
	EClass getAdminRoomManager();

	/**
	 * Returns the meta object for the '{@link Classes.AdminRoomManager#addRoom(int, int, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see Classes.AdminRoomManager#addRoom(int, int, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getAdminRoomManager__AddRoom__int_int_String_EList_EList();

	/**
	 * Returns the meta object for the '{@link Classes.AdminRoomManager#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see Classes.AdminRoomManager#removeRoom(int)
	 * @generated
	 */
	EOperation getAdminRoomManager__RemoveRoom__int();

	/**
	 * Returns the meta object for class '{@link Classes.GuestRoom <em>Guest Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Room</em>'.
	 * @see Classes.GuestRoom
	 * @generated
	 */
	EClass getGuestRoom();

	/**
	 * Returns the meta object for the attribute '{@link Classes.GuestRoom#getNumberOfBeds <em>Number Of Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Beds</em>'.
	 * @see Classes.GuestRoom#getNumberOfBeds()
	 * @see #getGuestRoom()
	 * @generated
	 */
	EAttribute getGuestRoom_NumberOfBeds();

	/**
	 * Returns the meta object for the attribute '{@link Classes.GuestRoom#getNumberOfExtrabeds <em>Number Of Extrabeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Extrabeds</em>'.
	 * @see Classes.GuestRoom#getNumberOfExtrabeds()
	 * @see #getGuestRoom()
	 * @generated
	 */
	EAttribute getGuestRoom_NumberOfExtrabeds();

	/**
	 * Returns the meta object for class '{@link Classes.ConferenceRoom <em>Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference Room</em>'.
	 * @see Classes.ConferenceRoom
	 * @generated
	 */
	EClass getConferenceRoom();

	/**
	 * Returns the meta object for the attribute '{@link Classes.ConferenceRoom#getNumberOfSeats <em>Number Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Seats</em>'.
	 * @see Classes.ConferenceRoom#getNumberOfSeats()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_NumberOfSeats();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.ConferenceRoom#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Equipment</em>'.
	 * @see Classes.ConferenceRoom#getEquipment()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_Equipment();

	/**
	 * Returns the meta object for class '{@link Classes.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see Classes.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Name();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Organization#getOrganizationNumber <em>Organization Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Number</em>'.
	 * @see Classes.Organization#getOrganizationNumber()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_OrganizationNumber();

	/**
	 * Returns the meta object for class '{@link Classes.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see Classes.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bill#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Bill#getId()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bill#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see Classes.Bill#getDate()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Date();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bill#isPublished <em>Is Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Published</em>'.
	 * @see Classes.Bill#isPublished()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_IsPublished();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bill#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see Classes.Bill#getCustomer()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Customer();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bill#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see Classes.Bill#isPaid()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_IsPaid();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Bill#getPurchase <em>Purchase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Purchase</em>'.
	 * @see Classes.Bill#getPurchase()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Purchase();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bill#getCreditCardInformation <em>Credit Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card Information</em>'.
	 * @see Classes.Bill#getCreditCardInformation()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_CreditCardInformation();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Bill#getUsedDiscounts <em>Used Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Discounts</em>'.
	 * @see Classes.Bill#getUsedDiscounts()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_UsedDiscounts();

	/**
	 * Returns the meta object for the '{@link Classes.Bill#applyDiscount(Classes.Discount) <em>Apply Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Discount</em>' operation.
	 * @see Classes.Bill#applyDiscount(Classes.Discount)
	 * @generated
	 */
	EOperation getBill__ApplyDiscount__Discount();

	/**
	 * Returns the meta object for the '{@link Classes.Bill#addSubBill(Classes.Bill) <em>Add Sub Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sub Bill</em>' operation.
	 * @see Classes.Bill#addSubBill(Classes.Bill)
	 * @generated
	 */
	EOperation getBill__AddSubBill__Bill();

	/**
	 * Returns the meta object for the '{@link Classes.Bill#registerPurchase(Classes.Purchase) <em>Register Purchase</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Purchase</em>' operation.
	 * @see Classes.Bill#registerPurchase(Classes.Purchase)
	 * @generated
	 */
	EOperation getBill__RegisterPurchase__Purchase();

	/**
	 * Returns the meta object for the '{@link Classes.Bill#publishBill() <em>Publish Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish Bill</em>' operation.
	 * @see Classes.Bill#publishBill()
	 * @generated
	 */
	EOperation getBill__PublishBill();

	/**
	 * Returns the meta object for class '{@link Classes.Purchase <em>Purchase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchase</em>'.
	 * @see Classes.Purchase
	 * @generated
	 */
	EClass getPurchase();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Purchase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Purchase#getId()
	 * @see #getPurchase()
	 * @generated
	 */
	EAttribute getPurchase_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Purchase#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see Classes.Purchase#getQuantity()
	 * @see #getPurchase()
	 * @generated
	 */
	EAttribute getPurchase_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Purchase#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Classes.Purchase#getPrice()
	 * @see #getPurchase()
	 * @generated
	 */
	EAttribute getPurchase_Price();

	/**
	 * Returns the meta object for the reference '{@link Classes.Purchase#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see Classes.Purchase#getService()
	 * @see #getPurchase()
	 * @generated
	 */
	EReference getPurchase_Service();

	/**
	 * Returns the meta object for class '{@link Classes.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see Classes.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Service#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Service#getId()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Service#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Classes.Service#getPrice()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Price();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for class '{@link Classes.BookingBill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Bill</em>'.
	 * @see Classes.BookingBill
	 * @generated
	 */
	EClass getBookingBill();

	/**
	 * Returns the meta object for the reference '{@link Classes.BookingBill#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking</em>'.
	 * @see Classes.BookingBill#getBooking()
	 * @see #getBookingBill()
	 * @generated
	 */
	EReference getBookingBill_Booking();

	/**
	 * Returns the meta object for class '{@link Classes.PercentageDiscount <em>Percentage Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Discount</em>'.
	 * @see Classes.PercentageDiscount
	 * @generated
	 */
	EClass getPercentageDiscount();

	/**
	 * Returns the meta object for the attribute '{@link Classes.PercentageDiscount#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see Classes.PercentageDiscount#getPercentage()
	 * @see #getPercentageDiscount()
	 * @generated
	 */
	EAttribute getPercentageDiscount_Percentage();

	/**
	 * Returns the meta object for class '{@link Classes.SumDiscount <em>Sum Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Discount</em>'.
	 * @see Classes.SumDiscount
	 * @generated
	 */
	EClass getSumDiscount();

	/**
	 * Returns the meta object for the attribute '{@link Classes.SumDiscount#getDiscountSum <em>Discount Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Sum</em>'.
	 * @see Classes.SumDiscount#getDiscountSum()
	 * @see #getSumDiscount()
	 * @generated
	 */
	EAttribute getSumDiscount_DiscountSum();

	/**
	 * Returns the meta object for enum '{@link Classes.RoomApproval <em>Room Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Approval</em>'.
	 * @see Classes.RoomApproval
	 * @generated
	 */
	EEnum getRoomApproval();

	/**
	 * Returns the meta object for enum '{@link Classes.DisabilityApproval <em>Disability Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Disability Approval</em>'.
	 * @see Classes.DisabilityApproval
	 * @generated
	 */
	EEnum getDisabilityApproval();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassesFactory getClassesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Classes.DataService <em>Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.DataService
		 * @see Classes.impl.ClassesPackageImpl#getDataService()
		 * @generated
		 */
		EClass DATA_SERVICE = eINSTANCE.getDataService();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___GET__OBJECT = eINSTANCE.getDataService__Get__Object();

		/**
		 * The meta object literal for the '<em><b>Get All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___GET_ALL = eINSTANCE.getDataService__GetAll();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___COUNT = eINSTANCE.getDataService__Count();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___SET__OBJECT = eINSTANCE.getDataService__Set__Object();

		/**
		 * The meta object literal for the '<em><b>Set All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___SET_ALL__ELIST = eINSTANCE.getDataService__SetAll__EList();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___DELETE__OBJECT = eINSTANCE.getDataService__Delete__Object();

		/**
		 * The meta object literal for the '<em><b>Exist</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___EXIST__OBJECT = eINSTANCE.getDataService__Exist__Object();

		/**
		 * The meta object literal for the '{@link Classes.impl.BookingDataServiceImpl <em>Booking Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.BookingDataServiceImpl
		 * @see Classes.impl.ClassesPackageImpl#getBookingDataService()
		 * @generated
		 */
		EClass BOOKING_DATA_SERVICE = eINSTANCE.getBookingDataService();

		/**
		 * The meta object literal for the '{@link Classes.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.BookingImpl
		 * @see Classes.impl.ClassesPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ID = eINSTANCE.getBooking_Id();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__START_DATE = eINSTANCE.getBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__END_DATE = eINSTANCE.getBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Special Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__SPECIAL_REQUEST = eINSTANCE.getBooking_SpecialRequest();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PRICE = eINSTANCE.getBooking_Price();

		/**
		 * The meta object literal for the '<em><b>Room Stay</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM_STAY = eINSTANCE.getBooking_RoomStay();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM_TYPE = eINSTANCE.getBooking_RoomType();

		/**
		 * The meta object literal for the '<em><b>Travel Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__TRAVEL_INFORMATION = eINSTANCE.getBooking_TravelInformation();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__RESPONSIBLE = eINSTANCE.getBooking_Responsible();

		/**
		 * The meta object literal for the '<em><b>Is Canceled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__IS_CANCELED = eINSTANCE.getBooking_IsCanceled();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CHECK_IN = eINSTANCE.getBooking__CheckIn();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CHECK_OUT = eINSTANCE.getBooking__CheckOut();

		/**
		 * The meta object literal for the '<em><b>Register Travel Information</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___REGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION = eINSTANCE.getBooking__RegisterTravelInformation__TravelInformation();

		/**
		 * The meta object literal for the '<em><b>Unregister Travel Information</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___UNREGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION = eINSTANCE.getBooking__UnregisterTravelInformation__TravelInformation();

		/**
		 * The meta object literal for the '{@link Classes.impl.RoomStayImpl <em>Room Stay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.RoomStayImpl
		 * @see Classes.impl.ClassesPackageImpl#getRoomStay()
		 * @generated
		 */
		EClass ROOM_STAY = eINSTANCE.getRoomStay();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_STAY__ACTIVE = eINSTANCE.getRoomStay_Active();

		/**
		 * The meta object literal for the '<em><b>Stay Request</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STAY__STAY_REQUEST = eINSTANCE.getRoomStay_StayRequest();

		/**
		 * The meta object literal for the '<em><b>Registered Persons</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STAY__REGISTERED_PERSONS = eINSTANCE.getRoomStay_RegisteredPersons();

		/**
		 * The meta object literal for the '{@link Classes.impl.StayRequestImpl <em>Stay Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.StayRequestImpl
		 * @see Classes.impl.ClassesPackageImpl#getStayRequest()
		 * @generated
		 */
		EClass STAY_REQUEST = eINSTANCE.getStayRequest();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY_REQUEST__TEXT = eINSTANCE.getStayRequest_Text();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY_REQUEST__TIME_STAMP = eINSTANCE.getStayRequest_TimeStamp();

		/**
		 * The meta object literal for the '{@link Classes.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.PersonImpl
		 * @see Classes.impl.ClassesPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRSTNAME = eINSTANCE.getPerson_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LASTNAME = eINSTANCE.getPerson_Lastname();

		/**
		 * The meta object literal for the '<em><b>Social Security Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SOCIAL_SECURITY_NUMBER = eINSTANCE.getPerson_SocialSecurityNumber();

		/**
		 * The meta object literal for the '{@link Classes.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.LegalEntityImpl
		 * @see Classes.impl.ClassesPackageImpl#getLegalEntity()
		 * @generated
		 */
		EClass LEGAL_ENTITY = eINSTANCE.getLegalEntity();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ENTITY__PHONE = eINSTANCE.getLegalEntity_Phone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ENTITY__EMAIL = eINSTANCE.getLegalEntity_Email();

		/**
		 * The meta object literal for the '<em><b>Credit Card Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ENTITY__CREDIT_CARD_INFORMATION = eINSTANCE.getLegalEntity_CreditCardInformation();

		/**
		 * The meta object literal for the '<em><b>Operation1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY___OPERATION1 = eINSTANCE.getLegalEntity__Operation1();

		/**
		 * The meta object literal for the '{@link Classes.impl.CreditCardInformationImpl <em>Credit Card Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.CreditCardInformationImpl
		 * @see Classes.impl.ClassesPackageImpl#getCreditCardInformation()
		 * @generated
		 */
		EClass CREDIT_CARD_INFORMATION = eINSTANCE.getCreditCardInformation();

		/**
		 * The meta object literal for the '<em><b>Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_INFORMATION__CARD_NUMBER = eINSTANCE.getCreditCardInformation_CardNumber();

		/**
		 * The meta object literal for the '<em><b>Card Holder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_INFORMATION__CARD_HOLDER = eINSTANCE.getCreditCardInformation_CardHolder();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_INFORMATION__EXPIRATION_DATE = eINSTANCE.getCreditCardInformation_ExpirationDate();

		/**
		 * The meta object literal for the '{@link Classes.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.RoomTypeImpl
		 * @see Classes.impl.ClassesPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__ID = eINSTANCE.getRoomType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NAME = eINSTANCE.getRoomType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__DESCRIPTION = eINSTANCE.getRoomType_Description();

		/**
		 * The meta object literal for the '<em><b>Room Approvals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__ROOM_APPROVALS = eINSTANCE.getRoomType_RoomApprovals();

		/**
		 * The meta object literal for the '{@link Classes.impl.TravelInformationImpl <em>Travel Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.TravelInformationImpl
		 * @see Classes.impl.ClassesPackageImpl#getTravelInformation()
		 * @generated
		 */
		EClass TRAVEL_INFORMATION = eINSTANCE.getTravelInformation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_INFORMATION__ID = eINSTANCE.getTravelInformation_Id();

		/**
		 * The meta object literal for the '<em><b>Tracking Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_INFORMATION__TRACKING_ID = eINSTANCE.getTravelInformation_TrackingId();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_INFORMATION__COMMENT = eINSTANCE.getTravelInformation_Comment();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_INFORMATION__PREDECESSOR = eINSTANCE.getTravelInformation_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Add Predecessor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVEL_INFORMATION___ADD_PREDECESSOR__TRAVELINFORMATION = eINSTANCE.getTravelInformation__AddPredecessor__TravelInformation();

		/**
		 * The meta object literal for the '{@link Classes.impl.BookingManagerImplImpl <em>Booking Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.BookingManagerImplImpl
		 * @see Classes.impl.ClassesPackageImpl#getBookingManagerImpl()
		 * @generated
		 */
		EClass BOOKING_MANAGER_IMPL = eINSTANCE.getBookingManagerImpl();

		/**
		 * The meta object literal for the '<em><b>Booking Data Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE = eINSTANCE.getBookingManagerImpl_BookingDataService();

		/**
		 * The meta object literal for the '{@link Classes.BookingManager <em>Booking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.BookingManager
		 * @see Classes.impl.ClassesPackageImpl#getBookingManager()
		 * @generated
		 */
		EClass BOOKING_MANAGER = eINSTANCE.getBookingManager();

		/**
		 * The meta object literal for the '<em><b>Get Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE = eINSTANCE.getBookingManager__GetBookings__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE_LEGALENTITY = eINSTANCE.getBookingManager__GetBookings__Date_Date_LegalEntity();

		/**
		 * The meta object literal for the '<em><b>Get Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_BOOKINGS__LEGALENTITY = eINSTANCE.getBookingManager__GetBookings__LegalEntity();

		/**
		 * The meta object literal for the '<em><b>Get Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE = eINSTANCE.getBookingManager__GetAvailableRooms__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE = eINSTANCE.getBookingManager__GetAvailableRooms__Date_Date_RoomType();

		/**
		 * The meta object literal for the '<em><b>Get Available Room Type Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE = eINSTANCE.getBookingManager__GetAvailableRoomTypeAmount__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Available Room Type Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE = eINSTANCE.getBookingManager__GetAvailableRoomTypeAmount__Date_Date_RoomType();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE = eINSTANCE.getBookingManager__CreateBooking__Date_Date_LegalEntity_RoomType();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM = eINSTANCE.getBookingManager__CreateBooking__Date_Date_LegalEntity_Room();

		/**
		 * The meta object literal for the '<em><b>Is Room Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___IS_ROOM_AVAILABLE__DATE_DATE_INT = eINSTANCE.getBookingManager__IsRoomAvailable__Date_Date_int();

		/**
		 * The meta object literal for the '<em><b>Register Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___REGISTER_ROOM__BOOKING_ROOM = eINSTANCE.getBookingManager__RegisterRoom__Booking_Room();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CHECK_IN__BOOKING_ELIST = eINSTANCE.getBookingManager__CheckIn__Booking_EList();

		/**
		 * The meta object literal for the '<em><b>Is Room Type Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE = eINSTANCE.getBookingManager__IsRoomTypeAvailable__Date_Date_RoomType();

		/**
		 * The meta object literal for the '<em><b>Get Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_ROOM_TYPES = eINSTANCE.getBookingManager__GetRoomTypes();

		/**
		 * The meta object literal for the '<em><b>Get Active Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_ACTIVE_BOOKING__INT = eINSTANCE.getBookingManager__GetActiveBooking__int();

		/**
		 * The meta object literal for the '<em><b>Get Related Legal Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_RELATED_LEGAL_ENTITIES__BOOKING = eINSTANCE.getBookingManager__GetRelatedLegalEntities__Booking();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CHECK_OUT__BOOKING = eINSTANCE.getBookingManager__CheckOut__Booking();

		/**
		 * The meta object literal for the '{@link Classes.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.RoomImpl
		 * @see Classes.impl.ClassesPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Floor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__FLOOR = eINSTANCE.getRoom_Floor();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_NUMBER = eINSTANCE.getRoom_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Is Operational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__IS_OPERATIONAL = eINSTANCE.getRoom_IsOperational();

		/**
		 * The meta object literal for the '<em><b>Is Cleaned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__IS_CLEANED = eINSTANCE.getRoom_IsCleaned();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__DESCRIPTION = eINSTANCE.getRoom_Description();

		/**
		 * The meta object literal for the '<em><b>Photos</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__PHOTOS = eINSTANCE.getRoom_Photos();

		/**
		 * The meta object literal for the '<em><b>Allowed Key Cards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ALLOWED_KEY_CARDS = eINSTANCE.getRoom_AllowedKeyCards();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOM_TYPE = eINSTANCE.getRoom_RoomType();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOM = eINSTANCE.getRoom_Room();

		/**
		 * The meta object literal for the '<em><b>Disability Approvals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__DISABILITY_APPROVALS = eINSTANCE.getRoom_DisabilityApprovals();

		/**
		 * The meta object literal for the '<em><b>Register Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___REGISTER_KEY_CARD__KEYCARD = eINSTANCE.getRoom__RegisterKeyCard__KeyCard();

		/**
		 * The meta object literal for the '<em><b>Unregister Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___UNREGISTER_KEY_CARD__KEYCARD = eINSTANCE.getRoom__UnregisterKeyCard__KeyCard();

		/**
		 * The meta object literal for the '<em><b>Unregister Key Cards</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___UNREGISTER_KEY_CARDS = eINSTANCE.getRoom__UnregisterKeyCards();

		/**
		 * The meta object literal for the '{@link Classes.impl.KeyCardImpl <em>Key Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.KeyCardImpl
		 * @see Classes.impl.ClassesPackageImpl#getKeyCard()
		 * @generated
		 */
		EClass KEY_CARD = eINSTANCE.getKeyCard();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_CARD__ID = eINSTANCE.getKeyCard_Id();

		/**
		 * The meta object literal for the '{@link Classes.DiscountManager <em>Discount Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.DiscountManager
		 * @see Classes.impl.ClassesPackageImpl#getDiscountManager()
		 * @generated
		 */
		EClass DISCOUNT_MANAGER = eINSTANCE.getDiscountManager();

		/**
		 * The meta object literal for the '<em><b>Get Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCOUNT_MANAGER___GET_DISCOUNT__INT = eINSTANCE.getDiscountManager__GetDiscount__int();

		/**
		 * The meta object literal for the '{@link Classes.impl.DiscountImpl <em>Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.DiscountImpl
		 * @see Classes.impl.ClassesPackageImpl#getDiscount()
		 * @generated
		 */
		EClass DISCOUNT = eINSTANCE.getDiscount();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__CODE = eINSTANCE.getDiscount_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__NAME = eINSTANCE.getDiscount_Name();

		/**
		 * The meta object literal for the '<em><b>Discount Limit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOUNT__DISCOUNT_LIMIT = eINSTANCE.getDiscount_DiscountLimit();

		/**
		 * The meta object literal for the '<em><b>Get Price With Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE = eINSTANCE.getDiscount__GetPriceWithDiscount__double();

		/**
		 * The meta object literal for the '{@link Classes.impl.DiscountLimitImpl <em>Discount Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.DiscountLimitImpl
		 * @see Classes.impl.ClassesPackageImpl#getDiscountLimit()
		 * @generated
		 */
		EClass DISCOUNT_LIMIT = eINSTANCE.getDiscountLimit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_LIMIT__ID = eINSTANCE.getDiscountLimit_Id();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_LIMIT__START_DATE = eINSTANCE.getDiscountLimit_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_LIMIT__END_DATE = eINSTANCE.getDiscountLimit_EndDate();

		/**
		 * The meta object literal for the '<em><b>Allowed Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOUNT_LIMIT__ALLOWED_USERS = eINSTANCE.getDiscountLimit_AllowedUsers();

		/**
		 * The meta object literal for the '{@link Classes.RoomManager <em>Room Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.RoomManager
		 * @see Classes.impl.ClassesPackageImpl#getRoomManager()
		 * @generated
		 */
		EClass ROOM_MANAGER = eINSTANCE.getRoomManager();

		/**
		 * The meta object literal for the '<em><b>Get Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___GET_ROOM_TYPES = eINSTANCE.getRoomManager__GetRoomTypes();

		/**
		 * The meta object literal for the '<em><b>Register Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___REGISTER_KEY_CARD__KEYCARD = eINSTANCE.getRoomManager__RegisterKeyCard__KeyCard();

		/**
		 * The meta object literal for the '<em><b>Register Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___REGISTER_KEY_CARD__STRING = eINSTANCE.getRoomManager__RegisterKeyCard__String();

		/**
		 * The meta object literal for the '<em><b>Get Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___GET_ROOMS = eINSTANCE.getRoomManager__GetRooms();

		/**
		 * The meta object literal for the '<em><b>Unregister Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___UNREGISTER_KEY_CARD__KEYCARD = eINSTANCE.getRoomManager__UnregisterKeyCard__KeyCard();

		/**
		 * The meta object literal for the '<em><b>Unregister Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___UNREGISTER_KEY_CARD__STRING = eINSTANCE.getRoomManager__UnregisterKeyCard__String();

		/**
		 * The meta object literal for the '<em><b>Unregister All Key Cards</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___UNREGISTER_ALL_KEY_CARDS__ROOM = eINSTANCE.getRoomManager__UnregisterAllKeyCards__Room();

		/**
		 * The meta object literal for the '{@link Classes.AdminDiscountManager <em>Admin Discount Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.AdminDiscountManager
		 * @see Classes.impl.ClassesPackageImpl#getAdminDiscountManager()
		 * @generated
		 */
		EClass ADMIN_DISCOUNT_MANAGER = eINSTANCE.getAdminDiscountManager();

		/**
		 * The meta object literal for the '<em><b>Add Sum Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___ADD_SUM_DISCOUNT__DOUBLE = eINSTANCE.getAdminDiscountManager__AddSumDiscount__double();

		/**
		 * The meta object literal for the '<em><b>Add Percentage Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___ADD_PERCENTAGE_DISCOUNT__FLOAT = eINSTANCE.getAdminDiscountManager__AddPercentageDiscount__float();

		/**
		 * The meta object literal for the '<em><b>Set Amount Limit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___SET_AMOUNT_LIMIT__DISCOUNT_INT = eINSTANCE.getAdminDiscountManager__SetAmountLimit__Discount_int();

		/**
		 * The meta object literal for the '<em><b>Add Allowed Users</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___ADD_ALLOWED_USERS__DISCOUNT_ELIST = eINSTANCE.getAdminDiscountManager__AddAllowedUsers__Discount_EList();

		/**
		 * The meta object literal for the '<em><b>Set Date Range Limit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___SET_DATE_RANGE_LIMIT__DISCOUNT_DATE_DATE = eINSTANCE.getAdminDiscountManager__SetDateRangeLimit__Discount_Date_Date();

		/**
		 * The meta object literal for the '{@link Classes.AdminRoomManager <em>Admin Room Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.AdminRoomManager
		 * @see Classes.impl.ClassesPackageImpl#getAdminRoomManager()
		 * @generated
		 */
		EClass ADMIN_ROOM_MANAGER = eINSTANCE.getAdminRoomManager();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_ROOM_MANAGER___ADD_ROOM__INT_INT_STRING_ELIST_ELIST = eINSTANCE.getAdminRoomManager__AddRoom__int_int_String_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_ROOM_MANAGER___REMOVE_ROOM__INT = eINSTANCE.getAdminRoomManager__RemoveRoom__int();

		/**
		 * The meta object literal for the '{@link Classes.impl.GuestRoomImpl <em>Guest Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.GuestRoomImpl
		 * @see Classes.impl.ClassesPackageImpl#getGuestRoom()
		 * @generated
		 */
		EClass GUEST_ROOM = eINSTANCE.getGuestRoom();

		/**
		 * The meta object literal for the '<em><b>Number Of Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST_ROOM__NUMBER_OF_BEDS = eINSTANCE.getGuestRoom_NumberOfBeds();

		/**
		 * The meta object literal for the '<em><b>Number Of Extrabeds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST_ROOM__NUMBER_OF_EXTRABEDS = eINSTANCE.getGuestRoom_NumberOfExtrabeds();

		/**
		 * The meta object literal for the '{@link Classes.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.ConferenceRoomImpl
		 * @see Classes.impl.ClassesPackageImpl#getConferenceRoom()
		 * @generated
		 */
		EClass CONFERENCE_ROOM = eINSTANCE.getConferenceRoom();

		/**
		 * The meta object literal for the '<em><b>Number Of Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM__NUMBER_OF_SEATS = eINSTANCE.getConferenceRoom_NumberOfSeats();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM__EQUIPMENT = eINSTANCE.getConferenceRoom_Equipment();

		/**
		 * The meta object literal for the '{@link Classes.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.OrganizationImpl
		 * @see Classes.impl.ClassesPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__NAME = eINSTANCE.getOrganization_Name();

		/**
		 * The meta object literal for the '<em><b>Organization Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__ORGANIZATION_NUMBER = eINSTANCE.getOrganization_OrganizationNumber();

		/**
		 * The meta object literal for the '{@link Classes.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.BillImpl
		 * @see Classes.impl.ClassesPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__ID = eINSTANCE.getBill_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__DATE = eINSTANCE.getBill_Date();

		/**
		 * The meta object literal for the '<em><b>Is Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__IS_PUBLISHED = eINSTANCE.getBill_IsPublished();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__CUSTOMER = eINSTANCE.getBill_Customer();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__IS_PAID = eINSTANCE.getBill_IsPaid();

		/**
		 * The meta object literal for the '<em><b>Purchase</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__PURCHASE = eINSTANCE.getBill_Purchase();

		/**
		 * The meta object literal for the '<em><b>Credit Card Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__CREDIT_CARD_INFORMATION = eINSTANCE.getBill_CreditCardInformation();

		/**
		 * The meta object literal for the '<em><b>Used Discounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__USED_DISCOUNTS = eINSTANCE.getBill_UsedDiscounts();

		/**
		 * The meta object literal for the '<em><b>Apply Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___APPLY_DISCOUNT__DISCOUNT = eINSTANCE.getBill__ApplyDiscount__Discount();

		/**
		 * The meta object literal for the '<em><b>Add Sub Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___ADD_SUB_BILL__BILL = eINSTANCE.getBill__AddSubBill__Bill();

		/**
		 * The meta object literal for the '<em><b>Register Purchase</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___REGISTER_PURCHASE__PURCHASE = eINSTANCE.getBill__RegisterPurchase__Purchase();

		/**
		 * The meta object literal for the '<em><b>Publish Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___PUBLISH_BILL = eINSTANCE.getBill__PublishBill();

		/**
		 * The meta object literal for the '{@link Classes.impl.PurchaseImpl <em>Purchase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.PurchaseImpl
		 * @see Classes.impl.ClassesPackageImpl#getPurchase()
		 * @generated
		 */
		EClass PURCHASE = eINSTANCE.getPurchase();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE__ID = eINSTANCE.getPurchase_Id();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE__QUANTITY = eINSTANCE.getPurchase_Quantity();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE__PRICE = eINSTANCE.getPurchase_Price();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURCHASE__SERVICE = eINSTANCE.getPurchase_Service();

		/**
		 * The meta object literal for the '{@link Classes.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.ServiceImpl
		 * @see Classes.impl.ClassesPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ID = eINSTANCE.getService_Id();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PRICE = eINSTANCE.getService_Price();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '{@link Classes.impl.BookingBillImpl <em>Booking Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.BookingBillImpl
		 * @see Classes.impl.ClassesPackageImpl#getBookingBill()
		 * @generated
		 */
		EClass BOOKING_BILL = eINSTANCE.getBookingBill();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_BILL__BOOKING = eINSTANCE.getBookingBill_Booking();

		/**
		 * The meta object literal for the '{@link Classes.impl.PercentageDiscountImpl <em>Percentage Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.PercentageDiscountImpl
		 * @see Classes.impl.ClassesPackageImpl#getPercentageDiscount()
		 * @generated
		 */
		EClass PERCENTAGE_DISCOUNT = eINSTANCE.getPercentageDiscount();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_DISCOUNT__PERCENTAGE = eINSTANCE.getPercentageDiscount_Percentage();

		/**
		 * The meta object literal for the '{@link Classes.impl.SumDiscountImpl <em>Sum Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.SumDiscountImpl
		 * @see Classes.impl.ClassesPackageImpl#getSumDiscount()
		 * @generated
		 */
		EClass SUM_DISCOUNT = eINSTANCE.getSumDiscount();

		/**
		 * The meta object literal for the '<em><b>Discount Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUM_DISCOUNT__DISCOUNT_SUM = eINSTANCE.getSumDiscount_DiscountSum();

		/**
		 * The meta object literal for the '{@link Classes.RoomApproval <em>Room Approval</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.RoomApproval
		 * @see Classes.impl.ClassesPackageImpl#getRoomApproval()
		 * @generated
		 */
		EEnum ROOM_APPROVAL = eINSTANCE.getRoomApproval();

		/**
		 * The meta object literal for the '{@link Classes.DisabilityApproval <em>Disability Approval</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.DisabilityApproval
		 * @see Classes.impl.ClassesPackageImpl#getDisabilityApproval()
		 * @generated
		 */
		EEnum DISABILITY_APPROVAL = eINSTANCE.getDisabilityApproval();

	}

} //ClassesPackage

/**
 */
package tda593.hotel.california.booking;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tda593.hotel.california.CaliforniaPackage;

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
 * @see tda593.hotel.california.booking.BookingFactory
 * @model kind="package"
 * @generated
 */
public interface BookingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "booking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tda593/hotel/california/booking.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tda593.hotel.california.booking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookingPackage eINSTANCE = tda593.hotel.california.booking.impl.BookingPackageImpl.init();

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.impl.LegalEntityImpl
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getLegalEntity()
	 * @generated
	 */
	int LEGAL_ENTITY = 12;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__ID = 2;

	/**
	 * The number of structural features of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY___GET_NAME = 0;

	/**
	 * The number of operations of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.impl.OrganizationImpl
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 0;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = LEGAL_ENTITY__ID;

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
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_NAME = LEGAL_ENTITY___GET_NAME;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = LEGAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.impl.PersonImpl
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = LEGAL_ENTITY__ID;

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
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_NAME = LEGAL_ENTITY___GET_NAME;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = LEGAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.impl.BookingImpl
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getBooking()
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
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Travel Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__TRAVEL_INFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__RESPONSIBLE = 7;

	/**
	 * The feature id for the '<em><b>Room Stay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_STAY = 8;

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
	 * The operation id for the '<em>Register Travel Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___REGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION = 0;

	/**
	 * The operation id for the '<em>Unregister Travel Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___UNREGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION = 1;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.impl.RoomStayImpl <em>Room Stay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.impl.RoomStayImpl
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getRoomStay()
	 * @generated
	 */
	int ROOM_STAY = 4;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.impl.StayRequestImpl <em>Stay Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.impl.StayRequestImpl
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getStayRequest()
	 * @generated
	 */
	int STAY_REQUEST = 5;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.impl.TravelInformationImpl <em>Travel Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.impl.TravelInformationImpl
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getTravelInformation()
	 * @generated
	 */
	int TRAVEL_INFORMATION = 3;

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
	 * The number of operations of the '<em>Travel Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Registered Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY__REGISTERED_PERSONS = 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY__ROOM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY__ID = 4;

	/**
	 * The number of structural features of the '<em>Room Stay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Room Stay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST__ID = 2;

	/**
	 * The number of structural features of the '<em>Stay Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Stay Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.BookingManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.BookingManager
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getBookingManager()
	 * @generated
	 */
	int BOOKING_MANAGER = 6;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
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
	 * The operation id for the '<em>Get Available Room Type Amounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNTS__DATE_DATE = 5;

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
	int BOOKING_MANAGER___IS_ROOM_AVAILABLE__DATE_DATE_STRING = 9;

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
	 * The operation id for the '<em>Get Active Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_ACTIVE_BOOKING__STRING = 13;

	/**
	 * The operation id for the '<em>Get Related Legal Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_RELATED_LEGAL_ENTITIES__BOOKING = 14;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CHECK_OUT__BOOKING = 15;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKING__INT = 16;

	/**
	 * The operation id for the '<em>Change Booking Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CHANGE_BOOKING_DATES__BOOKING_DATE_DATE = 17;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_OPERATION_COUNT = 18;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.impl.BookingManagerImplImpl <em>Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.impl.BookingManagerImplImpl
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getBookingManagerImpl()
	 * @generated
	 */
	int BOOKING_MANAGER_IMPL = 7;

	/**
	 * The feature id for the '<em><b>Booking Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE = BOOKING_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Room Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL__ROOM_MANAGER = BOOKING_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL_FEATURE_COUNT = BOOKING_MANAGER_FEATURE_COUNT + 2;

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
	 * The operation id for the '<em>Get Available Room Type Amounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOM_TYPE_AMOUNTS__DATE_DATE = BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNTS__DATE_DATE;

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
	int BOOKING_MANAGER_IMPL___IS_ROOM_AVAILABLE__DATE_DATE_STRING = BOOKING_MANAGER___IS_ROOM_AVAILABLE__DATE_DATE_STRING;

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
	 * The operation id for the '<em>Get Active Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_ACTIVE_BOOKING__STRING = BOOKING_MANAGER___GET_ACTIVE_BOOKING__STRING;

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
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_BOOKING__INT = BOOKING_MANAGER___GET_BOOKING__INT;

	/**
	 * The operation id for the '<em>Change Booking Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___CHANGE_BOOKING_DATES__BOOKING_DATE_DATE = BOOKING_MANAGER___CHANGE_BOOKING_DATES__BOOKING_DATE_DATE;

	/**
	 * The number of operations of the '<em>Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL_OPERATION_COUNT = BOOKING_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.impl.BookingDataServiceImpl <em>Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.impl.BookingDataServiceImpl
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getBookingDataService()
	 * @generated
	 */
	int BOOKING_DATA_SERVICE = 8;

	/**
	 * The number of structural features of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE_FEATURE_COUNT = CaliforniaPackage.DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___GET__OBJECT = CaliforniaPackage.DATA_SERVICE___GET__OBJECT;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___GET_ALL = CaliforniaPackage.DATA_SERVICE___GET_ALL;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___COUNT = CaliforniaPackage.DATA_SERVICE___COUNT;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___SET__OBJECT = CaliforniaPackage.DATA_SERVICE___SET__OBJECT;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___SET_ALL__ELIST = CaliforniaPackage.DATA_SERVICE___SET_ALL__ELIST;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___DELETE__OBJECT = CaliforniaPackage.DATA_SERVICE___DELETE__OBJECT;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___EXIST__OBJECT = CaliforniaPackage.DATA_SERVICE___EXIST__OBJECT;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___GET_ALL__LEGALENTITY = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___GET_ALL__DATE_DATE = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___GET_ALL__DATE_DATE_LEGALENTITY = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Begin Transaction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___BEGIN_TRANSACTION = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Commit Transaction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___COMMIT_TRANSACTION = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Rollback Transaction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___ROLLBACK_TRANSACTION = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE_OPERATION_COUNT = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.LegalEntityManager <em>Legal Entity Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.LegalEntityManager
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getLegalEntityManager()
	 * @generated
	 */
	int LEGAL_ENTITY_MANAGER = 9;

	/**
	 * The number of structural features of the '<em>Legal Entity Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Find Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___FIND_PERSON__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Find Organization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___FIND_ORGANIZATION__STRING = 1;

	/**
	 * The operation id for the '<em>Get Organization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___GET_ORGANIZATION__STRING = 2;

	/**
	 * The operation id for the '<em>Get Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___GET_PERSON__STRING = 3;

	/**
	 * The operation id for the '<em>Create Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___CREATE_PERSON__STRING_STRING_STRING_STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Create Organization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___CREATE_ORGANIZATION__STRING_STRING_STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Get Legal Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___GET_LEGAL_ENTITY__INT = 6;

	/**
	 * The number of operations of the '<em>Legal Entity Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.impl.LegalEntityManagerImplImpl <em>Legal Entity Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.impl.LegalEntityManagerImplImpl
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getLegalEntityManagerImpl()
	 * @generated
	 */
	int LEGAL_ENTITY_MANAGER_IMPL = 10;

	/**
	 * The feature id for the '<em><b>Legal Entity Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_IMPL__LEGAL_ENTITY_DATA_SERVICE = LEGAL_ENTITY_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Legal Entity Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_IMPL_FEATURE_COUNT = LEGAL_ENTITY_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Find Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_IMPL___FIND_PERSON__STRING_STRING = LEGAL_ENTITY_MANAGER___FIND_PERSON__STRING_STRING;

	/**
	 * The operation id for the '<em>Find Organization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_IMPL___FIND_ORGANIZATION__STRING = LEGAL_ENTITY_MANAGER___FIND_ORGANIZATION__STRING;

	/**
	 * The operation id for the '<em>Get Organization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_IMPL___GET_ORGANIZATION__STRING = LEGAL_ENTITY_MANAGER___GET_ORGANIZATION__STRING;

	/**
	 * The operation id for the '<em>Get Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_IMPL___GET_PERSON__STRING = LEGAL_ENTITY_MANAGER___GET_PERSON__STRING;

	/**
	 * The operation id for the '<em>Create Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_IMPL___CREATE_PERSON__STRING_STRING_STRING_STRING_STRING = LEGAL_ENTITY_MANAGER___CREATE_PERSON__STRING_STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Create Organization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_IMPL___CREATE_ORGANIZATION__STRING_STRING_STRING_STRING = LEGAL_ENTITY_MANAGER___CREATE_ORGANIZATION__STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Get Legal Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_IMPL___GET_LEGAL_ENTITY__INT = LEGAL_ENTITY_MANAGER___GET_LEGAL_ENTITY__INT;

	/**
	 * The number of operations of the '<em>Legal Entity Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_IMPL_OPERATION_COUNT = LEGAL_ENTITY_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl <em>Legal Entity Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl
	 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getLegalEntityDataService()
	 * @generated
	 */
	int LEGAL_ENTITY_DATA_SERVICE = 11;

	/**
	 * The number of structural features of the '<em>Legal Entity Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE_FEATURE_COUNT = CaliforniaPackage.DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE___GET__OBJECT = CaliforniaPackage.DATA_SERVICE___GET__OBJECT;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE___GET_ALL = CaliforniaPackage.DATA_SERVICE___GET_ALL;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE___COUNT = CaliforniaPackage.DATA_SERVICE___COUNT;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE___SET__OBJECT = CaliforniaPackage.DATA_SERVICE___SET__OBJECT;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE___SET_ALL__ELIST = CaliforniaPackage.DATA_SERVICE___SET_ALL__ELIST;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE___DELETE__OBJECT = CaliforniaPackage.DATA_SERVICE___DELETE__OBJECT;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE___EXIST__OBJECT = CaliforniaPackage.DATA_SERVICE___EXIST__OBJECT;

	/**
	 * The operation id for the '<em>Find Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE___FIND_PERSON__STRING_STRING = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Organization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE___FIND_ORGANIZATION__STRING = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Organization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE___GET_ORGANIZATION__STRING = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE___GET_PERSON__STRING = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Legal Entity Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_DATA_SERVICE_OPERATION_COUNT = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see tda593.hotel.california.booking.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.booking.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Name();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.Organization#getOrganizationNumber <em>Organization Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Number</em>'.
	 * @see tda593.hotel.california.booking.Organization#getOrganizationNumber()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_OrganizationNumber();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see tda593.hotel.california.booking.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.Person#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see tda593.hotel.california.booking.Person#getFirstname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.Person#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see tda593.hotel.california.booking.Person#getLastname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.Person#getSocialSecurityNumber <em>Social Security Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Security Number</em>'.
	 * @see tda593.hotel.california.booking.Person#getSocialSecurityNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SocialSecurityNumber();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see tda593.hotel.california.booking.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.Booking#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.booking.Booking#getId()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see tda593.hotel.california.booking.Booking#getStartDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see tda593.hotel.california.booking.Booking#getEndDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.Booking#getSpecialRequest <em>Special Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Request</em>'.
	 * @see tda593.hotel.california.booking.Booking#getSpecialRequest()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_SpecialRequest();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.Booking#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see tda593.hotel.california.booking.Booking#getPrice()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Price();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.Booking#getRoomStay <em>Room Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Stay</em>'.
	 * @see tda593.hotel.california.booking.Booking#getRoomStay()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomStay();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.Booking#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see tda593.hotel.california.booking.Booking#getRoomType()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomType();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.Booking#getTravelInformation <em>Travel Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Information</em>'.
	 * @see tda593.hotel.california.booking.Booking#getTravelInformation()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_TravelInformation();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.Booking#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see tda593.hotel.california.booking.Booking#getResponsible()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Responsible();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.Booking#isCanceled <em>Is Canceled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Canceled</em>'.
	 * @see tda593.hotel.california.booking.Booking#isCanceled()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_IsCanceled();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.Booking#registerTravelInformation(tda593.hotel.california.booking.TravelInformation) <em>Register Travel Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Travel Information</em>' operation.
	 * @see tda593.hotel.california.booking.Booking#registerTravelInformation(tda593.hotel.california.booking.TravelInformation)
	 * @generated
	 */
	EOperation getBooking__RegisterTravelInformation__TravelInformation();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.Booking#unregisterTravelInformation(tda593.hotel.california.booking.TravelInformation) <em>Unregister Travel Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Travel Information</em>' operation.
	 * @see tda593.hotel.california.booking.Booking#unregisterTravelInformation(tda593.hotel.california.booking.TravelInformation)
	 * @generated
	 */
	EOperation getBooking__UnregisterTravelInformation__TravelInformation();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.RoomStay <em>Room Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Stay</em>'.
	 * @see tda593.hotel.california.booking.RoomStay
	 * @generated
	 */
	EClass getRoomStay();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.RoomStay#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see tda593.hotel.california.booking.RoomStay#isActive()
	 * @see #getRoomStay()
	 * @generated
	 */
	EAttribute getRoomStay_Active();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.booking.RoomStay#getStayRequest <em>Stay Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stay Request</em>'.
	 * @see tda593.hotel.california.booking.RoomStay#getStayRequest()
	 * @see #getRoomStay()
	 * @generated
	 */
	EReference getRoomStay_StayRequest();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.booking.RoomStay#getRegisteredPersons <em>Registered Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registered Persons</em>'.
	 * @see tda593.hotel.california.booking.RoomStay#getRegisteredPersons()
	 * @see #getRoomStay()
	 * @generated
	 */
	EReference getRoomStay_RegisteredPersons();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.RoomStay#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see tda593.hotel.california.booking.RoomStay#getRoom()
	 * @see #getRoomStay()
	 * @generated
	 */
	EReference getRoomStay_Room();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.RoomStay#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.booking.RoomStay#getId()
	 * @see #getRoomStay()
	 * @generated
	 */
	EAttribute getRoomStay_Id();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.StayRequest <em>Stay Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stay Request</em>'.
	 * @see tda593.hotel.california.booking.StayRequest
	 * @generated
	 */
	EClass getStayRequest();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.StayRequest#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see tda593.hotel.california.booking.StayRequest#getText()
	 * @see #getStayRequest()
	 * @generated
	 */
	EAttribute getStayRequest_Text();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.StayRequest#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see tda593.hotel.california.booking.StayRequest#getTimeStamp()
	 * @see #getStayRequest()
	 * @generated
	 */
	EAttribute getStayRequest_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.StayRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.booking.StayRequest#getId()
	 * @see #getStayRequest()
	 * @generated
	 */
	EAttribute getStayRequest_Id();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.TravelInformation <em>Travel Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Information</em>'.
	 * @see tda593.hotel.california.booking.TravelInformation
	 * @generated
	 */
	EClass getTravelInformation();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.TravelInformation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.booking.TravelInformation#getId()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EAttribute getTravelInformation_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.TravelInformation#getTrackingId <em>Tracking Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Id</em>'.
	 * @see tda593.hotel.california.booking.TravelInformation#getTrackingId()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EAttribute getTravelInformation_TrackingId();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.TravelInformation#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see tda593.hotel.california.booking.TravelInformation#getComment()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EAttribute getTravelInformation_Comment();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.TravelInformation#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see tda593.hotel.california.booking.TravelInformation#getPredecessor()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EReference getTravelInformation_Predecessor();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.BookingManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see tda593.hotel.california.booking.BookingManager
	 * @generated
	 */
	EClass getBookingManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#getBookings(java.util.Date, java.util.Date) <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#getBookings(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingManager__GetBookings__Date_Date();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#getBookings(java.util.Date, java.util.Date, tda593.hotel.california.booking.LegalEntity) <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#getBookings(java.util.Date, java.util.Date, tda593.hotel.california.booking.LegalEntity)
	 * @generated
	 */
	EOperation getBookingManager__GetBookings__Date_Date_LegalEntity();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#getBookings(tda593.hotel.california.booking.LegalEntity) <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#getBookings(tda593.hotel.california.booking.LegalEntity)
	 * @generated
	 */
	EOperation getBookingManager__GetBookings__LegalEntity();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#getAvailableRooms(java.util.Date, java.util.Date) <em>Get Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Rooms</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#getAvailableRooms(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRooms__Date_Date();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#getAvailableRooms(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType) <em>Get Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Rooms</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#getAvailableRooms(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRooms__Date_Date_RoomType();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#getAvailableRoomTypeAmounts(java.util.Date, java.util.Date) <em>Get Available Room Type Amounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Room Type Amounts</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#getAvailableRoomTypeAmounts(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRoomTypeAmounts__Date_Date();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#getAvailableRoomTypeAmount(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType) <em>Get Available Room Type Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Room Type Amount</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#getAvailableRoomTypeAmount(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRoomTypeAmount__Date_Date_RoomType();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#createBooking(java.util.Date, java.util.Date, tda593.hotel.california.booking.LegalEntity, tda593.hotel.california.facilities.RoomType) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#createBooking(java.util.Date, java.util.Date, tda593.hotel.california.booking.LegalEntity, tda593.hotel.california.facilities.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__CreateBooking__Date_Date_LegalEntity_RoomType();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#createBooking(java.util.Date, java.util.Date, tda593.hotel.california.booking.LegalEntity, tda593.hotel.california.facilities.Room) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#createBooking(java.util.Date, java.util.Date, tda593.hotel.california.booking.LegalEntity, tda593.hotel.california.facilities.Room)
	 * @generated
	 */
	EOperation getBookingManager__CreateBooking__Date_Date_LegalEntity_Room();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#isRoomAvailable(java.util.Date, java.util.Date, java.lang.String) <em>Is Room Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Room Available</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#isRoomAvailable(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getBookingManager__IsRoomAvailable__Date_Date_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#registerRoom(tda593.hotel.california.booking.Booking, tda593.hotel.california.facilities.Room) <em>Register Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Room</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#registerRoom(tda593.hotel.california.booking.Booking, tda593.hotel.california.facilities.Room)
	 * @generated
	 */
	EOperation getBookingManager__RegisterRoom__Booking_Room();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#checkIn(tda593.hotel.california.booking.Booking, org.eclipse.emf.common.util.EList) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#checkIn(tda593.hotel.california.booking.Booking, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBookingManager__CheckIn__Booking_EList();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#isRoomTypeAvailable(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType) <em>Is Room Type Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Room Type Available</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#isRoomTypeAvailable(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__IsRoomTypeAvailable__Date_Date_RoomType();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#getActiveBooking(java.lang.String) <em>Get Active Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Booking</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#getActiveBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingManager__GetActiveBooking__String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#getRelatedLegalEntities(tda593.hotel.california.booking.Booking) <em>Get Related Legal Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Related Legal Entities</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#getRelatedLegalEntities(tda593.hotel.california.booking.Booking)
	 * @generated
	 */
	EOperation getBookingManager__GetRelatedLegalEntities__Booking();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#checkOut(tda593.hotel.california.booking.Booking) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#checkOut(tda593.hotel.california.booking.Booking)
	 * @generated
	 */
	EOperation getBookingManager__CheckOut__Booking();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#getBooking(int) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#getBooking(int)
	 * @generated
	 */
	EOperation getBookingManager__GetBooking__int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingManager#changeBookingDates(tda593.hotel.california.booking.Booking, java.util.Date, java.util.Date) <em>Change Booking Dates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Booking Dates</em>' operation.
	 * @see tda593.hotel.california.booking.BookingManager#changeBookingDates(tda593.hotel.california.booking.Booking, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingManager__ChangeBookingDates__Booking_Date_Date();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.BookingManagerImpl <em>Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager Impl</em>'.
	 * @see tda593.hotel.california.booking.BookingManagerImpl
	 * @generated
	 */
	EClass getBookingManagerImpl();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.BookingManagerImpl#getBookingDataService <em>Booking Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking Data Service</em>'.
	 * @see tda593.hotel.california.booking.BookingManagerImpl#getBookingDataService()
	 * @see #getBookingManagerImpl()
	 * @generated
	 */
	EReference getBookingManagerImpl_BookingDataService();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.BookingManagerImpl#getRoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Manager</em>'.
	 * @see tda593.hotel.california.booking.BookingManagerImpl#getRoomManager()
	 * @see #getBookingManagerImpl()
	 * @generated
	 */
	EReference getBookingManagerImpl_RoomManager();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.BookingDataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Service</em>'.
	 * @see tda593.hotel.california.booking.BookingDataService
	 * @generated
	 */
	EClass getBookingDataService();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingDataService#getAll(tda593.hotel.california.booking.LegalEntity) <em>Get All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All</em>' operation.
	 * @see tda593.hotel.california.booking.BookingDataService#getAll(tda593.hotel.california.booking.LegalEntity)
	 * @generated
	 */
	EOperation getBookingDataService__GetAll__LegalEntity();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingDataService#getAll(java.util.Date, java.util.Date) <em>Get All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All</em>' operation.
	 * @see tda593.hotel.california.booking.BookingDataService#getAll(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingDataService__GetAll__Date_Date();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingDataService#getAll(java.util.Date, java.util.Date, tda593.hotel.california.booking.LegalEntity) <em>Get All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All</em>' operation.
	 * @see tda593.hotel.california.booking.BookingDataService#getAll(java.util.Date, java.util.Date, tda593.hotel.california.booking.LegalEntity)
	 * @generated
	 */
	EOperation getBookingDataService__GetAll__Date_Date_LegalEntity();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingDataService#beginTransaction() <em>Begin Transaction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Begin Transaction</em>' operation.
	 * @see tda593.hotel.california.booking.BookingDataService#beginTransaction()
	 * @generated
	 */
	EOperation getBookingDataService__BeginTransaction();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingDataService#commitTransaction() <em>Commit Transaction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Commit Transaction</em>' operation.
	 * @see tda593.hotel.california.booking.BookingDataService#commitTransaction()
	 * @generated
	 */
	EOperation getBookingDataService__CommitTransaction();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.BookingDataService#rollbackTransaction() <em>Rollback Transaction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rollback Transaction</em>' operation.
	 * @see tda593.hotel.california.booking.BookingDataService#rollbackTransaction()
	 * @generated
	 */
	EOperation getBookingDataService__RollbackTransaction();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.LegalEntityManager <em>Legal Entity Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity Manager</em>'.
	 * @see tda593.hotel.california.booking.LegalEntityManager
	 * @generated
	 */
	EClass getLegalEntityManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntityManager#findPerson(java.lang.String, java.lang.String) <em>Find Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Person</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntityManager#findPerson(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__FindPerson__String_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntityManager#findOrganization(java.lang.String) <em>Find Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Organization</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntityManager#findOrganization(java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__FindOrganization__String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntityManager#getOrganization(java.lang.String) <em>Get Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organization</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntityManager#getOrganization(java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__GetOrganization__String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntityManager#getPerson(java.lang.String) <em>Get Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Person</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntityManager#getPerson(java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__GetPerson__String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntityManager#createPerson(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Person</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntityManager#createPerson(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__CreatePerson__String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntityManager#createOrganization(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Organization</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntityManager#createOrganization(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__CreateOrganization__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntityManager#getLegalEntity(int) <em>Get Legal Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Legal Entity</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntityManager#getLegalEntity(int)
	 * @generated
	 */
	EOperation getLegalEntityManager__GetLegalEntity__int();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.LegalEntityManagerImpl <em>Legal Entity Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity Manager Impl</em>'.
	 * @see tda593.hotel.california.booking.LegalEntityManagerImpl
	 * @generated
	 */
	EClass getLegalEntityManagerImpl();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.LegalEntityManagerImpl#getLegalEntityDataService <em>Legal Entity Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Legal Entity Data Service</em>'.
	 * @see tda593.hotel.california.booking.LegalEntityManagerImpl#getLegalEntityDataService()
	 * @see #getLegalEntityManagerImpl()
	 * @generated
	 */
	EReference getLegalEntityManagerImpl_LegalEntityDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.LegalEntityDataService <em>Legal Entity Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity Data Service</em>'.
	 * @see tda593.hotel.california.booking.LegalEntityDataService
	 * @generated
	 */
	EClass getLegalEntityDataService();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntityDataService#findPerson(java.lang.String, java.lang.String) <em>Find Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Person</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntityDataService#findPerson(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityDataService__FindPerson__String_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntityDataService#findOrganization(java.lang.String) <em>Find Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Organization</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntityDataService#findOrganization(java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityDataService__FindOrganization__String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntityDataService#getOrganization(java.lang.String) <em>Get Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organization</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntityDataService#getOrganization(java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityDataService__GetOrganization__String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntityDataService#getPerson(java.lang.String) <em>Get Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Person</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntityDataService#getPerson(java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityDataService__GetPerson__String();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity</em>'.
	 * @see tda593.hotel.california.booking.LegalEntity
	 * @generated
	 */
	EClass getLegalEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.LegalEntity#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see tda593.hotel.california.booking.LegalEntity#getPhone()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EAttribute getLegalEntity_Phone();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.LegalEntity#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see tda593.hotel.california.booking.LegalEntity#getEmail()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EAttribute getLegalEntity_Email();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.LegalEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.booking.LegalEntity#getId()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EAttribute getLegalEntity_Id();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.booking.LegalEntity#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see tda593.hotel.california.booking.LegalEntity#getName()
	 * @generated
	 */
	EOperation getLegalEntity__GetName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BookingFactory getBookingFactory();

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
		 * The meta object literal for the '{@link tda593.hotel.california.booking.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.impl.OrganizationImpl
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getOrganization()
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
		 * The meta object literal for the '{@link tda593.hotel.california.booking.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.impl.PersonImpl
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getPerson()
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
		 * The meta object literal for the '{@link tda593.hotel.california.booking.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.impl.BookingImpl
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getBooking()
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
		 * The meta object literal for the '{@link tda593.hotel.california.booking.impl.RoomStayImpl <em>Room Stay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.impl.RoomStayImpl
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getRoomStay()
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
		 * The meta object literal for the '<em><b>Registered Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STAY__REGISTERED_PERSONS = eINSTANCE.getRoomStay_RegisteredPersons();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STAY__ROOM = eINSTANCE.getRoomStay_Room();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_STAY__ID = eINSTANCE.getRoomStay_Id();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.impl.StayRequestImpl <em>Stay Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.impl.StayRequestImpl
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getStayRequest()
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY_REQUEST__ID = eINSTANCE.getStayRequest_Id();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.impl.TravelInformationImpl <em>Travel Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.impl.TravelInformationImpl
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getTravelInformation()
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
		 * The meta object literal for the '{@link tda593.hotel.california.booking.BookingManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.BookingManager
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getBookingManager()
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
		 * The meta object literal for the '<em><b>Get Available Room Type Amounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNTS__DATE_DATE = eINSTANCE.getBookingManager__GetAvailableRoomTypeAmounts__Date_Date();

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
		EOperation BOOKING_MANAGER___IS_ROOM_AVAILABLE__DATE_DATE_STRING = eINSTANCE.getBookingManager__IsRoomAvailable__Date_Date_String();

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
		 * The meta object literal for the '<em><b>Get Active Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_ACTIVE_BOOKING__STRING = eINSTANCE.getBookingManager__GetActiveBooking__String();

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
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_BOOKING__INT = eINSTANCE.getBookingManager__GetBooking__int();

		/**
		 * The meta object literal for the '<em><b>Change Booking Dates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CHANGE_BOOKING_DATES__BOOKING_DATE_DATE = eINSTANCE.getBookingManager__ChangeBookingDates__Booking_Date_Date();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.impl.BookingManagerImplImpl <em>Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.impl.BookingManagerImplImpl
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getBookingManagerImpl()
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
		 * The meta object literal for the '<em><b>Room Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_MANAGER_IMPL__ROOM_MANAGER = eINSTANCE.getBookingManagerImpl_RoomManager();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.impl.BookingDataServiceImpl <em>Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.impl.BookingDataServiceImpl
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getBookingDataService()
		 * @generated
		 */
		EClass BOOKING_DATA_SERVICE = eINSTANCE.getBookingDataService();

		/**
		 * The meta object literal for the '<em><b>Get All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_DATA_SERVICE___GET_ALL__LEGALENTITY = eINSTANCE.getBookingDataService__GetAll__LegalEntity();

		/**
		 * The meta object literal for the '<em><b>Get All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_DATA_SERVICE___GET_ALL__DATE_DATE = eINSTANCE.getBookingDataService__GetAll__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_DATA_SERVICE___GET_ALL__DATE_DATE_LEGALENTITY = eINSTANCE.getBookingDataService__GetAll__Date_Date_LegalEntity();

		/**
		 * The meta object literal for the '<em><b>Begin Transaction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_DATA_SERVICE___BEGIN_TRANSACTION = eINSTANCE.getBookingDataService__BeginTransaction();

		/**
		 * The meta object literal for the '<em><b>Commit Transaction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_DATA_SERVICE___COMMIT_TRANSACTION = eINSTANCE.getBookingDataService__CommitTransaction();

		/**
		 * The meta object literal for the '<em><b>Rollback Transaction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_DATA_SERVICE___ROLLBACK_TRANSACTION = eINSTANCE.getBookingDataService__RollbackTransaction();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.LegalEntityManager <em>Legal Entity Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.LegalEntityManager
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getLegalEntityManager()
		 * @generated
		 */
		EClass LEGAL_ENTITY_MANAGER = eINSTANCE.getLegalEntityManager();

		/**
		 * The meta object literal for the '<em><b>Find Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___FIND_PERSON__STRING_STRING = eINSTANCE.getLegalEntityManager__FindPerson__String_String();

		/**
		 * The meta object literal for the '<em><b>Find Organization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___FIND_ORGANIZATION__STRING = eINSTANCE.getLegalEntityManager__FindOrganization__String();

		/**
		 * The meta object literal for the '<em><b>Get Organization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___GET_ORGANIZATION__STRING = eINSTANCE.getLegalEntityManager__GetOrganization__String();

		/**
		 * The meta object literal for the '<em><b>Get Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___GET_PERSON__STRING = eINSTANCE.getLegalEntityManager__GetPerson__String();

		/**
		 * The meta object literal for the '<em><b>Create Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___CREATE_PERSON__STRING_STRING_STRING_STRING_STRING = eINSTANCE.getLegalEntityManager__CreatePerson__String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Create Organization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___CREATE_ORGANIZATION__STRING_STRING_STRING_STRING = eINSTANCE.getLegalEntityManager__CreateOrganization__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Legal Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___GET_LEGAL_ENTITY__INT = eINSTANCE.getLegalEntityManager__GetLegalEntity__int();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.impl.LegalEntityManagerImplImpl <em>Legal Entity Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.impl.LegalEntityManagerImplImpl
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getLegalEntityManagerImpl()
		 * @generated
		 */
		EClass LEGAL_ENTITY_MANAGER_IMPL = eINSTANCE.getLegalEntityManagerImpl();

		/**
		 * The meta object literal for the '<em><b>Legal Entity Data Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ENTITY_MANAGER_IMPL__LEGAL_ENTITY_DATA_SERVICE = eINSTANCE.getLegalEntityManagerImpl_LegalEntityDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl <em>Legal Entity Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getLegalEntityDataService()
		 * @generated
		 */
		EClass LEGAL_ENTITY_DATA_SERVICE = eINSTANCE.getLegalEntityDataService();

		/**
		 * The meta object literal for the '<em><b>Find Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_DATA_SERVICE___FIND_PERSON__STRING_STRING = eINSTANCE.getLegalEntityDataService__FindPerson__String_String();

		/**
		 * The meta object literal for the '<em><b>Find Organization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_DATA_SERVICE___FIND_ORGANIZATION__STRING = eINSTANCE.getLegalEntityDataService__FindOrganization__String();

		/**
		 * The meta object literal for the '<em><b>Get Organization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_DATA_SERVICE___GET_ORGANIZATION__STRING = eINSTANCE.getLegalEntityDataService__GetOrganization__String();

		/**
		 * The meta object literal for the '<em><b>Get Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_DATA_SERVICE___GET_PERSON__STRING = eINSTANCE.getLegalEntityDataService__GetPerson__String();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.impl.LegalEntityImpl
		 * @see tda593.hotel.california.booking.impl.BookingPackageImpl#getLegalEntity()
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ENTITY__ID = eINSTANCE.getLegalEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY___GET_NAME = eINSTANCE.getLegalEntity__GetName();

	}

} //BookingPackage

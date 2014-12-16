/**
 */
package tda593.hotel.california.booking.persistence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see tda593.hotel.california.booking.persistence.PersistenceFactory
 * @model kind="package"
 * @generated
 */
public interface PersistencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persistence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tda593/hotel/california/booking/persistence.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tda593.hotel.california.booking.persistence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistencePackage eINSTANCE = tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl.init();

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl <em>Room Stay Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl
	 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getRoomStayEntity()
	 * @generated
	 */
	int ROOM_STAY_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_ENTITY__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Room Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_ENTITY__ROOM_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Person Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_ENTITY__PERSON_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Stay Request Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_ENTITY__STAY_REQUEST_ENTITY = 3;

	/**
	 * The number of structural features of the '<em>Room Stay Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room Stay Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl <em>Legal Entity Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl
	 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getLegalEntityEntity()
	 * @generated
	 */
	int LEGAL_ENTITY_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_ENTITY__PHONE = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_ENTITY__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Credit Card Information Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_ENTITY__CREDIT_CARD_INFORMATION_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_ENTITY__ID = 3;

	/**
	 * The number of structural features of the '<em>Legal Entity Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Legal Entity Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.persistence.impl.PersonEntityImpl <em>Person Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.persistence.impl.PersonEntityImpl
	 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getPersonEntity()
	 * @generated
	 */
	int PERSON_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ENTITY__PHONE = LEGAL_ENTITY_ENTITY__PHONE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ENTITY__EMAIL = LEGAL_ENTITY_ENTITY__EMAIL;

	/**
	 * The feature id for the '<em><b>Credit Card Information Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ENTITY__CREDIT_CARD_INFORMATION_ENTITY = LEGAL_ENTITY_ENTITY__CREDIT_CARD_INFORMATION_ENTITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ENTITY__ID = LEGAL_ENTITY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ENTITY__FIRSTNAME = LEGAL_ENTITY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ENTITY__LASTNAME = LEGAL_ENTITY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ENTITY__SOCIAL_SECURITY_NUMBER = LEGAL_ENTITY_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ENTITY_FEATURE_COUNT = LEGAL_ENTITY_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Person Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ENTITY_OPERATION_COUNT = LEGAL_ENTITY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl <em>Credit Card Information Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl
	 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getCreditCardInformationEntity()
	 * @generated
	 */
	int CREDIT_CARD_INFORMATION_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION_ENTITY__CARD_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Card Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION_ENTITY__CARD_HOLDER = 1;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION_ENTITY__EXPIRATION_DATE = 2;

	/**
	 * The number of structural features of the '<em>Credit Card Information Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Credit Card Information Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.persistence.impl.StayRequestEntityImpl <em>Stay Request Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.persistence.impl.StayRequestEntityImpl
	 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getStayRequestEntity()
	 * @generated
	 */
	int STAY_REQUEST_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST_ENTITY__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST_ENTITY__TIME_STAMP = 1;

	/**
	 * The number of structural features of the '<em>Stay Request Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stay Request Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.persistence.impl.OrganizationEntityImpl <em>Organization Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.persistence.impl.OrganizationEntityImpl
	 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getOrganizationEntity()
	 * @generated
	 */
	int ORGANIZATION_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENTITY__PHONE = LEGAL_ENTITY_ENTITY__PHONE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENTITY__EMAIL = LEGAL_ENTITY_ENTITY__EMAIL;

	/**
	 * The feature id for the '<em><b>Credit Card Information Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENTITY__CREDIT_CARD_INFORMATION_ENTITY = LEGAL_ENTITY_ENTITY__CREDIT_CARD_INFORMATION_ENTITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENTITY__ID = LEGAL_ENTITY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENTITY__NAME = LEGAL_ENTITY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENTITY__ORGANIZATION_NUMBER = LEGAL_ENTITY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Organization Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENTITY_FEATURE_COUNT = LEGAL_ENTITY_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Organization Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENTITY_OPERATION_COUNT = LEGAL_ENTITY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl <em>Booking Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.persistence.impl.BookingEntityImpl
	 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getBookingEntity()
	 * @generated
	 */
	int BOOKING_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Special Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY__SPECIAL_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Is Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY__IS_CANCELED = 5;

	/**
	 * The feature id for the '<em><b>Room Stay Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY__ROOM_STAY_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Legal Entity Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY__LEGAL_ENTITY_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Room Type Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY__ROOM_TYPE_ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Travel Information Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY__TRAVEL_INFORMATION_ENTITY = 9;

	/**
	 * The number of structural features of the '<em>Booking Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Booking Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl <em>Travel Information Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl
	 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getTravelInformationEntity()
	 * @generated
	 */
	int TRAVEL_INFORMATION_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Tracking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION_ENTITY__TRACKING_ID = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION_ENTITY__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Travel Information Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION_ENTITY__TRAVEL_INFORMATION_ENTITY = 3;

	/**
	 * The number of structural features of the '<em>Travel Information Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Travel Information Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION_ENTITY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.persistence.RoomStayEntity <em>Room Stay Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Stay Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.RoomStayEntity
	 * @generated
	 */
	EClass getRoomStayEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.RoomStayEntity#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see tda593.hotel.california.booking.persistence.RoomStayEntity#isActive()
	 * @see #getRoomStayEntity()
	 * @generated
	 */
	EAttribute getRoomStayEntity_Active();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.persistence.RoomStayEntity#getRoomEntity <em>Room Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.RoomStayEntity#getRoomEntity()
	 * @see #getRoomStayEntity()
	 * @generated
	 */
	EReference getRoomStayEntity_RoomEntity();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.booking.persistence.RoomStayEntity#getPersonEntity <em>Person Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.RoomStayEntity#getPersonEntity()
	 * @see #getRoomStayEntity()
	 * @generated
	 */
	EReference getRoomStayEntity_PersonEntity();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.booking.persistence.RoomStayEntity#getStayRequestEntity <em>Stay Request Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stay Request Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.RoomStayEntity#getStayRequestEntity()
	 * @see #getRoomStayEntity()
	 * @generated
	 */
	EReference getRoomStayEntity_StayRequestEntity();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.persistence.PersonEntity <em>Person Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.PersonEntity
	 * @generated
	 */
	EClass getPersonEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.PersonEntity#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see tda593.hotel.california.booking.persistence.PersonEntity#getFirstname()
	 * @see #getPersonEntity()
	 * @generated
	 */
	EAttribute getPersonEntity_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.PersonEntity#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see tda593.hotel.california.booking.persistence.PersonEntity#getLastname()
	 * @see #getPersonEntity()
	 * @generated
	 */
	EAttribute getPersonEntity_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.PersonEntity#getSocialSecurityNumber <em>Social Security Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Security Number</em>'.
	 * @see tda593.hotel.california.booking.persistence.PersonEntity#getSocialSecurityNumber()
	 * @see #getPersonEntity()
	 * @generated
	 */
	EAttribute getPersonEntity_SocialSecurityNumber();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.persistence.LegalEntityEntity <em>Legal Entity Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.LegalEntityEntity
	 * @generated
	 */
	EClass getLegalEntityEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see tda593.hotel.california.booking.persistence.LegalEntityEntity#getPhone()
	 * @see #getLegalEntityEntity()
	 * @generated
	 */
	EAttribute getLegalEntityEntity_Phone();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see tda593.hotel.california.booking.persistence.LegalEntityEntity#getEmail()
	 * @see #getLegalEntityEntity()
	 * @generated
	 */
	EAttribute getLegalEntityEntity_Email();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getCreditCardInformationEntity <em>Credit Card Information Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card Information Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.LegalEntityEntity#getCreditCardInformationEntity()
	 * @see #getLegalEntityEntity()
	 * @generated
	 */
	EReference getLegalEntityEntity_CreditCardInformationEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.booking.persistence.LegalEntityEntity#getId()
	 * @see #getLegalEntityEntity()
	 * @generated
	 */
	EAttribute getLegalEntityEntity_Id();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.persistence.CreditCardInformationEntity <em>Credit Card Information Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Card Information Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.CreditCardInformationEntity
	 * @generated
	 */
	EClass getCreditCardInformationEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.CreditCardInformationEntity#getCardNumber <em>Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number</em>'.
	 * @see tda593.hotel.california.booking.persistence.CreditCardInformationEntity#getCardNumber()
	 * @see #getCreditCardInformationEntity()
	 * @generated
	 */
	EAttribute getCreditCardInformationEntity_CardNumber();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.CreditCardInformationEntity#getCardHolder <em>Card Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Holder</em>'.
	 * @see tda593.hotel.california.booking.persistence.CreditCardInformationEntity#getCardHolder()
	 * @see #getCreditCardInformationEntity()
	 * @generated
	 */
	EAttribute getCreditCardInformationEntity_CardHolder();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.CreditCardInformationEntity#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see tda593.hotel.california.booking.persistence.CreditCardInformationEntity#getExpirationDate()
	 * @see #getCreditCardInformationEntity()
	 * @generated
	 */
	EAttribute getCreditCardInformationEntity_ExpirationDate();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.persistence.StayRequestEntity <em>Stay Request Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stay Request Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.StayRequestEntity
	 * @generated
	 */
	EClass getStayRequestEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.StayRequestEntity#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see tda593.hotel.california.booking.persistence.StayRequestEntity#getText()
	 * @see #getStayRequestEntity()
	 * @generated
	 */
	EAttribute getStayRequestEntity_Text();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.StayRequestEntity#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see tda593.hotel.california.booking.persistence.StayRequestEntity#getTimeStamp()
	 * @see #getStayRequestEntity()
	 * @generated
	 */
	EAttribute getStayRequestEntity_TimeStamp();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.persistence.OrganizationEntity <em>Organization Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.OrganizationEntity
	 * @generated
	 */
	EClass getOrganizationEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.OrganizationEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.booking.persistence.OrganizationEntity#getName()
	 * @see #getOrganizationEntity()
	 * @generated
	 */
	EAttribute getOrganizationEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.OrganizationEntity#getOrganizationNumber <em>Organization Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Number</em>'.
	 * @see tda593.hotel.california.booking.persistence.OrganizationEntity#getOrganizationNumber()
	 * @see #getOrganizationEntity()
	 * @generated
	 */
	EAttribute getOrganizationEntity_OrganizationNumber();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.persistence.BookingEntity <em>Booking Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.BookingEntity
	 * @generated
	 */
	EClass getBookingEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.BookingEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.booking.persistence.BookingEntity#getId()
	 * @see #getBookingEntity()
	 * @generated
	 */
	EAttribute getBookingEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.BookingEntity#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see tda593.hotel.california.booking.persistence.BookingEntity#getStartDate()
	 * @see #getBookingEntity()
	 * @generated
	 */
	EAttribute getBookingEntity_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.BookingEntity#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see tda593.hotel.california.booking.persistence.BookingEntity#getEndDate()
	 * @see #getBookingEntity()
	 * @generated
	 */
	EAttribute getBookingEntity_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.BookingEntity#getSpecialRequest <em>Special Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Request</em>'.
	 * @see tda593.hotel.california.booking.persistence.BookingEntity#getSpecialRequest()
	 * @see #getBookingEntity()
	 * @generated
	 */
	EAttribute getBookingEntity_SpecialRequest();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.BookingEntity#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see tda593.hotel.california.booking.persistence.BookingEntity#getPrice()
	 * @see #getBookingEntity()
	 * @generated
	 */
	EAttribute getBookingEntity_Price();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.BookingEntity#isCanceled <em>Is Canceled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Canceled</em>'.
	 * @see tda593.hotel.california.booking.persistence.BookingEntity#isCanceled()
	 * @see #getBookingEntity()
	 * @generated
	 */
	EAttribute getBookingEntity_IsCanceled();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.persistence.BookingEntity#getRoomStayEntity <em>Room Stay Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Stay Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.BookingEntity#getRoomStayEntity()
	 * @see #getBookingEntity()
	 * @generated
	 */
	EReference getBookingEntity_RoomStayEntity();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.persistence.BookingEntity#getLegalEntityEntity <em>Legal Entity Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Legal Entity Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.BookingEntity#getLegalEntityEntity()
	 * @see #getBookingEntity()
	 * @generated
	 */
	EReference getBookingEntity_LegalEntityEntity();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.persistence.BookingEntity#getRoomTypeEntity <em>Room Type Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.BookingEntity#getRoomTypeEntity()
	 * @see #getBookingEntity()
	 * @generated
	 */
	EReference getBookingEntity_RoomTypeEntity();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.persistence.BookingEntity#getTravelInformationEntity <em>Travel Information Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Information Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.BookingEntity#getTravelInformationEntity()
	 * @see #getBookingEntity()
	 * @generated
	 */
	EReference getBookingEntity_TravelInformationEntity();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.booking.persistence.TravelInformationEntity <em>Travel Information Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Information Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.TravelInformationEntity
	 * @generated
	 */
	EClass getTravelInformationEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.TravelInformationEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.booking.persistence.TravelInformationEntity#getId()
	 * @see #getTravelInformationEntity()
	 * @generated
	 */
	EAttribute getTravelInformationEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.TravelInformationEntity#getTrackingId <em>Tracking Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Id</em>'.
	 * @see tda593.hotel.california.booking.persistence.TravelInformationEntity#getTrackingId()
	 * @see #getTravelInformationEntity()
	 * @generated
	 */
	EAttribute getTravelInformationEntity_TrackingId();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.booking.persistence.TravelInformationEntity#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see tda593.hotel.california.booking.persistence.TravelInformationEntity#getComment()
	 * @see #getTravelInformationEntity()
	 * @generated
	 */
	EAttribute getTravelInformationEntity_Comment();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.booking.persistence.TravelInformationEntity#getTravelInformationEntity <em>Travel Information Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Information Entity</em>'.
	 * @see tda593.hotel.california.booking.persistence.TravelInformationEntity#getTravelInformationEntity()
	 * @see #getTravelInformationEntity()
	 * @generated
	 */
	EReference getTravelInformationEntity_TravelInformationEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersistenceFactory getPersistenceFactory();

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
		 * The meta object literal for the '{@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl <em>Room Stay Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl
		 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getRoomStayEntity()
		 * @generated
		 */
		EClass ROOM_STAY_ENTITY = eINSTANCE.getRoomStayEntity();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_STAY_ENTITY__ACTIVE = eINSTANCE.getRoomStayEntity_Active();

		/**
		 * The meta object literal for the '<em><b>Room Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STAY_ENTITY__ROOM_ENTITY = eINSTANCE.getRoomStayEntity_RoomEntity();

		/**
		 * The meta object literal for the '<em><b>Person Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STAY_ENTITY__PERSON_ENTITY = eINSTANCE.getRoomStayEntity_PersonEntity();

		/**
		 * The meta object literal for the '<em><b>Stay Request Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STAY_ENTITY__STAY_REQUEST_ENTITY = eINSTANCE.getRoomStayEntity_StayRequestEntity();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.persistence.impl.PersonEntityImpl <em>Person Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.persistence.impl.PersonEntityImpl
		 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getPersonEntity()
		 * @generated
		 */
		EClass PERSON_ENTITY = eINSTANCE.getPersonEntity();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_ENTITY__FIRSTNAME = eINSTANCE.getPersonEntity_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_ENTITY__LASTNAME = eINSTANCE.getPersonEntity_Lastname();

		/**
		 * The meta object literal for the '<em><b>Social Security Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_ENTITY__SOCIAL_SECURITY_NUMBER = eINSTANCE.getPersonEntity_SocialSecurityNumber();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl <em>Legal Entity Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl
		 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getLegalEntityEntity()
		 * @generated
		 */
		EClass LEGAL_ENTITY_ENTITY = eINSTANCE.getLegalEntityEntity();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ENTITY_ENTITY__PHONE = eINSTANCE.getLegalEntityEntity_Phone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ENTITY_ENTITY__EMAIL = eINSTANCE.getLegalEntityEntity_Email();

		/**
		 * The meta object literal for the '<em><b>Credit Card Information Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ENTITY_ENTITY__CREDIT_CARD_INFORMATION_ENTITY = eINSTANCE.getLegalEntityEntity_CreditCardInformationEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ENTITY_ENTITY__ID = eINSTANCE.getLegalEntityEntity_Id();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl <em>Credit Card Information Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl
		 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getCreditCardInformationEntity()
		 * @generated
		 */
		EClass CREDIT_CARD_INFORMATION_ENTITY = eINSTANCE.getCreditCardInformationEntity();

		/**
		 * The meta object literal for the '<em><b>Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_INFORMATION_ENTITY__CARD_NUMBER = eINSTANCE.getCreditCardInformationEntity_CardNumber();

		/**
		 * The meta object literal for the '<em><b>Card Holder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_INFORMATION_ENTITY__CARD_HOLDER = eINSTANCE.getCreditCardInformationEntity_CardHolder();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_INFORMATION_ENTITY__EXPIRATION_DATE = eINSTANCE.getCreditCardInformationEntity_ExpirationDate();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.persistence.impl.StayRequestEntityImpl <em>Stay Request Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.persistence.impl.StayRequestEntityImpl
		 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getStayRequestEntity()
		 * @generated
		 */
		EClass STAY_REQUEST_ENTITY = eINSTANCE.getStayRequestEntity();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY_REQUEST_ENTITY__TEXT = eINSTANCE.getStayRequestEntity_Text();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY_REQUEST_ENTITY__TIME_STAMP = eINSTANCE.getStayRequestEntity_TimeStamp();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.persistence.impl.OrganizationEntityImpl <em>Organization Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.persistence.impl.OrganizationEntityImpl
		 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getOrganizationEntity()
		 * @generated
		 */
		EClass ORGANIZATION_ENTITY = eINSTANCE.getOrganizationEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_ENTITY__NAME = eINSTANCE.getOrganizationEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Organization Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_ENTITY__ORGANIZATION_NUMBER = eINSTANCE.getOrganizationEntity_OrganizationNumber();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl <em>Booking Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.persistence.impl.BookingEntityImpl
		 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getBookingEntity()
		 * @generated
		 */
		EClass BOOKING_ENTITY = eINSTANCE.getBookingEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_ENTITY__ID = eINSTANCE.getBookingEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_ENTITY__START_DATE = eINSTANCE.getBookingEntity_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_ENTITY__END_DATE = eINSTANCE.getBookingEntity_EndDate();

		/**
		 * The meta object literal for the '<em><b>Special Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_ENTITY__SPECIAL_REQUEST = eINSTANCE.getBookingEntity_SpecialRequest();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_ENTITY__PRICE = eINSTANCE.getBookingEntity_Price();

		/**
		 * The meta object literal for the '<em><b>Is Canceled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_ENTITY__IS_CANCELED = eINSTANCE.getBookingEntity_IsCanceled();

		/**
		 * The meta object literal for the '<em><b>Room Stay Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_ENTITY__ROOM_STAY_ENTITY = eINSTANCE.getBookingEntity_RoomStayEntity();

		/**
		 * The meta object literal for the '<em><b>Legal Entity Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_ENTITY__LEGAL_ENTITY_ENTITY = eINSTANCE.getBookingEntity_LegalEntityEntity();

		/**
		 * The meta object literal for the '<em><b>Room Type Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_ENTITY__ROOM_TYPE_ENTITY = eINSTANCE.getBookingEntity_RoomTypeEntity();

		/**
		 * The meta object literal for the '<em><b>Travel Information Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_ENTITY__TRAVEL_INFORMATION_ENTITY = eINSTANCE.getBookingEntity_TravelInformationEntity();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl <em>Travel Information Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl
		 * @see tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl#getTravelInformationEntity()
		 * @generated
		 */
		EClass TRAVEL_INFORMATION_ENTITY = eINSTANCE.getTravelInformationEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_INFORMATION_ENTITY__ID = eINSTANCE.getTravelInformationEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Tracking Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_INFORMATION_ENTITY__TRACKING_ID = eINSTANCE.getTravelInformationEntity_TrackingId();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_INFORMATION_ENTITY__COMMENT = eINSTANCE.getTravelInformationEntity_Comment();

		/**
		 * The meta object literal for the '<em><b>Travel Information Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_INFORMATION_ENTITY__TRAVEL_INFORMATION_ENTITY = eINSTANCE.getTravelInformationEntity_TravelInformationEntity();

	}

} //PersistencePackage

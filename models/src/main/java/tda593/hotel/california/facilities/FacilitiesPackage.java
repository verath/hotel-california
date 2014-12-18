/**
 */
package tda593.hotel.california.facilities;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see tda593.hotel.california.facilities.FacilitiesFactory
 * @model kind="package"
 * @generated
 */
public interface FacilitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "facilities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tda593/hotel/california/facilities.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tda593.hotel.california.facilities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacilitiesPackage eINSTANCE = tda593.hotel.california.facilities.impl.FacilitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.KeyCardManager <em>Key Card Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.KeyCardManager
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getKeyCardManager()
	 * @generated
	 */
	int KEY_CARD_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Key Card Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_MANAGER___GET_KEY_CARD__STRING = 0;

	/**
	 * The number of operations of the '<em>Key Card Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_MANAGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.AdminKeyCardManager <em>Admin Key Card Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.AdminKeyCardManager
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getAdminKeyCardManager()
	 * @generated
	 */
	int ADMIN_KEY_CARD_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Admin Key Card Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_KEY_CARD_MANAGER_FEATURE_COUNT = KEY_CARD_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_KEY_CARD_MANAGER___GET_KEY_CARD__STRING = KEY_CARD_MANAGER___GET_KEY_CARD__STRING;

	/**
	 * The operation id for the '<em>Add Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_KEY_CARD_MANAGER___ADD_KEY_CARD__INT = KEY_CARD_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_KEY_CARD_MANAGER___REMOVE_KEY_CARD__INT = KEY_CARD_MANAGER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Admin Key Card Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_KEY_CARD_MANAGER_OPERATION_COUNT = KEY_CARD_MANAGER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.impl.KeyCardImpl <em>Key Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.impl.KeyCardImpl
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getKeyCard()
	 * @generated
	 */
	int KEY_CARD = 2;

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
	 * The meta object id for the '{@link tda593.hotel.california.facilities.RoomManager <em>Room Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.RoomManager
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomManager()
	 * @generated
	 */
	int ROOM_MANAGER = 4;

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
	int ROOM_MANAGER___REGISTER_KEY_CARD__KEYCARD_STRING = 1;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___REGISTER_KEY_CARD__STRING_STRING = 2;

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
	int ROOM_MANAGER___UNREGISTER_KEY_CARD__KEYCARD_STRING = 4;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___UNREGISTER_KEY_CARD__STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Unregister All Key Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___UNREGISTER_ALL_KEY_CARDS__STRING = 6;

	/**
	 * The operation id for the '<em>Get Room Type Amounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOM_TYPE_AMOUNTS = 7;

	/**
	 * The operation id for the '<em>Get Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOM_TYPE_AMOUNT__ROOMTYPE = 8;

	/**
	 * The number of operations of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.AdminRoomManager <em>Admin Room Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.AdminRoomManager
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getAdminRoomManager()
	 * @generated
	 */
	int ADMIN_ROOM_MANAGER = 3;

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
	int ADMIN_ROOM_MANAGER___REGISTER_KEY_CARD__KEYCARD_STRING = ROOM_MANAGER___REGISTER_KEY_CARD__KEYCARD_STRING;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___REGISTER_KEY_CARD__STRING_STRING = ROOM_MANAGER___REGISTER_KEY_CARD__STRING_STRING;

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
	int ADMIN_ROOM_MANAGER___UNREGISTER_KEY_CARD__KEYCARD_STRING = ROOM_MANAGER___UNREGISTER_KEY_CARD__KEYCARD_STRING;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___UNREGISTER_KEY_CARD__STRING_STRING = ROOM_MANAGER___UNREGISTER_KEY_CARD__STRING_STRING;

	/**
	 * The operation id for the '<em>Unregister All Key Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___UNREGISTER_ALL_KEY_CARDS__STRING = ROOM_MANAGER___UNREGISTER_ALL_KEY_CARDS__STRING;

	/**
	 * The operation id for the '<em>Get Room Type Amounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___GET_ROOM_TYPE_AMOUNTS = ROOM_MANAGER___GET_ROOM_TYPE_AMOUNTS;

	/**
	 * The operation id for the '<em>Get Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___GET_ROOM_TYPE_AMOUNT__ROOMTYPE = ROOM_MANAGER___GET_ROOM_TYPE_AMOUNT__ROOMTYPE;

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
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___ADD_ROOM_TYPE__STRING_STRING_ROOMAPPROVAL = ROOM_MANAGER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER___REMOVE_ROOM_TYPE__INT = ROOM_MANAGER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Admin Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_OPERATION_COUNT = ROOM_MANAGER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.impl.RoomTypeImpl
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 5;

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
	 * The meta object id for the '{@link tda593.hotel.california.facilities.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.impl.RoomImpl
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 6;

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
	 * The feature id for the '<em><b>Disability Approvals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DISABILITY_APPROVALS = 8;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 9;

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
	 * The meta object id for the '{@link tda593.hotel.california.facilities.impl.RoomManagerImplImpl <em>Room Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.impl.RoomManagerImplImpl
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomManagerImpl()
	 * @generated
	 */
	int ROOM_MANAGER_IMPL = 7;

	/**
	 * The feature id for the '<em><b>Room Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL__ROOM_DATA_SERVICE = ROOM_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Room Type Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL__ROOM_TYPE_DATA_SERVICE = ROOM_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key Card Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL__KEY_CARD_MANAGER = ROOM_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Room Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL_FEATURE_COUNT = ROOM_MANAGER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL___GET_ROOM_TYPES = ROOM_MANAGER___GET_ROOM_TYPES;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL___REGISTER_KEY_CARD__KEYCARD_STRING = ROOM_MANAGER___REGISTER_KEY_CARD__KEYCARD_STRING;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL___REGISTER_KEY_CARD__STRING_STRING = ROOM_MANAGER___REGISTER_KEY_CARD__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL___GET_ROOMS = ROOM_MANAGER___GET_ROOMS;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL___UNREGISTER_KEY_CARD__KEYCARD_STRING = ROOM_MANAGER___UNREGISTER_KEY_CARD__KEYCARD_STRING;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL___UNREGISTER_KEY_CARD__STRING_STRING = ROOM_MANAGER___UNREGISTER_KEY_CARD__STRING_STRING;

	/**
	 * The operation id for the '<em>Unregister All Key Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL___UNREGISTER_ALL_KEY_CARDS__STRING = ROOM_MANAGER___UNREGISTER_ALL_KEY_CARDS__STRING;

	/**
	 * The operation id for the '<em>Get Room Type Amounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL___GET_ROOM_TYPE_AMOUNTS = ROOM_MANAGER___GET_ROOM_TYPE_AMOUNTS;

	/**
	 * The operation id for the '<em>Get Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL___GET_ROOM_TYPE_AMOUNT__ROOMTYPE = ROOM_MANAGER___GET_ROOM_TYPE_AMOUNT__ROOMTYPE;

	/**
	 * The number of operations of the '<em>Room Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_IMPL_OPERATION_COUNT = ROOM_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.impl.RoomDataServiceImpl <em>Room Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.impl.RoomDataServiceImpl
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomDataService()
	 * @generated
	 */
	int ROOM_DATA_SERVICE = 8;

	/**
	 * The number of structural features of the '<em>Room Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_DATA_SERVICE_FEATURE_COUNT = CaliforniaPackage.DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_DATA_SERVICE___GET__OBJECT = CaliforniaPackage.DATA_SERVICE___GET__OBJECT;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_DATA_SERVICE___GET_ALL = CaliforniaPackage.DATA_SERVICE___GET_ALL;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_DATA_SERVICE___COUNT = CaliforniaPackage.DATA_SERVICE___COUNT;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_DATA_SERVICE___SET__OBJECT = CaliforniaPackage.DATA_SERVICE___SET__OBJECT;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_DATA_SERVICE___SET_ALL__ELIST = CaliforniaPackage.DATA_SERVICE___SET_ALL__ELIST;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_DATA_SERVICE___DELETE__OBJECT = CaliforniaPackage.DATA_SERVICE___DELETE__OBJECT;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_DATA_SERVICE___EXIST__OBJECT = CaliforniaPackage.DATA_SERVICE___EXIST__OBJECT;

	/**
	 * The number of operations of the '<em>Room Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_DATA_SERVICE_OPERATION_COUNT = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.impl.RoomTypeDataServiceImpl <em>Room Type Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.impl.RoomTypeDataServiceImpl
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomTypeDataService()
	 * @generated
	 */
	int ROOM_TYPE_DATA_SERVICE = 9;

	/**
	 * The number of structural features of the '<em>Room Type Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_DATA_SERVICE_FEATURE_COUNT = CaliforniaPackage.DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_DATA_SERVICE___GET__OBJECT = CaliforniaPackage.DATA_SERVICE___GET__OBJECT;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_DATA_SERVICE___GET_ALL = CaliforniaPackage.DATA_SERVICE___GET_ALL;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_DATA_SERVICE___COUNT = CaliforniaPackage.DATA_SERVICE___COUNT;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_DATA_SERVICE___SET__OBJECT = CaliforniaPackage.DATA_SERVICE___SET__OBJECT;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_DATA_SERVICE___SET_ALL__ELIST = CaliforniaPackage.DATA_SERVICE___SET_ALL__ELIST;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_DATA_SERVICE___DELETE__OBJECT = CaliforniaPackage.DATA_SERVICE___DELETE__OBJECT;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_DATA_SERVICE___EXIST__OBJECT = CaliforniaPackage.DATA_SERVICE___EXIST__OBJECT;

	/**
	 * The number of operations of the '<em>Room Type Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_DATA_SERVICE_OPERATION_COUNT = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.impl.ConferenceRoomImpl
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getConferenceRoom()
	 * @generated
	 */
	int CONFERENCE_ROOM = 10;

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
	 * The feature id for the '<em><b>Disability Approvals</b></em>' attribute list.
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
	 * The meta object id for the '{@link tda593.hotel.california.facilities.impl.GuestRoomImpl <em>Guest Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.impl.GuestRoomImpl
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getGuestRoom()
	 * @generated
	 */
	int GUEST_ROOM = 11;

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
	 * The feature id for the '<em><b>Disability Approvals</b></em>' attribute list.
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
	 * The meta object id for the '{@link tda593.hotel.california.facilities.impl.KeyCardManagerImplImpl <em>Key Card Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.impl.KeyCardManagerImplImpl
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getKeyCardManagerImpl()
	 * @generated
	 */
	int KEY_CARD_MANAGER_IMPL = 12;

	/**
	 * The feature id for the '<em><b>Key Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_MANAGER_IMPL__KEY_CARDS = KEY_CARD_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Card Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_MANAGER_IMPL__KEY_CARD_DATA_SERVICE = KEY_CARD_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key Card Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_MANAGER_IMPL_FEATURE_COUNT = KEY_CARD_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_MANAGER_IMPL___GET_KEY_CARD__STRING = KEY_CARD_MANAGER___GET_KEY_CARD__STRING;

	/**
	 * The number of operations of the '<em>Key Card Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_MANAGER_IMPL_OPERATION_COUNT = KEY_CARD_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.impl.KeyCardDataServiceImpl <em>Key Card Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.impl.KeyCardDataServiceImpl
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getKeyCardDataService()
	 * @generated
	 */
	int KEY_CARD_DATA_SERVICE = 13;

	/**
	 * The number of structural features of the '<em>Key Card Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_DATA_SERVICE_FEATURE_COUNT = CaliforniaPackage.DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_DATA_SERVICE___GET__OBJECT = CaliforniaPackage.DATA_SERVICE___GET__OBJECT;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_DATA_SERVICE___GET_ALL = CaliforniaPackage.DATA_SERVICE___GET_ALL;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_DATA_SERVICE___COUNT = CaliforniaPackage.DATA_SERVICE___COUNT;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_DATA_SERVICE___SET__OBJECT = CaliforniaPackage.DATA_SERVICE___SET__OBJECT;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_DATA_SERVICE___SET_ALL__ELIST = CaliforniaPackage.DATA_SERVICE___SET_ALL__ELIST;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_DATA_SERVICE___DELETE__OBJECT = CaliforniaPackage.DATA_SERVICE___DELETE__OBJECT;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_DATA_SERVICE___EXIST__OBJECT = CaliforniaPackage.DATA_SERVICE___EXIST__OBJECT;

	/**
	 * The number of operations of the '<em>Key Card Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_DATA_SERVICE_OPERATION_COUNT = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.impl.AdminRoomManagerImplImpl <em>Admin Room Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.impl.AdminRoomManagerImplImpl
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getAdminRoomManagerImpl()
	 * @generated
	 */
	int ADMIN_ROOM_MANAGER_IMPL = 14;

	/**
	 * The feature id for the '<em><b>Room Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL__ROOM_DATA_SERVICE = ROOM_MANAGER_IMPL__ROOM_DATA_SERVICE;

	/**
	 * The feature id for the '<em><b>Room Type Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL__ROOM_TYPE_DATA_SERVICE = ROOM_MANAGER_IMPL__ROOM_TYPE_DATA_SERVICE;

	/**
	 * The feature id for the '<em><b>Key Card Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL__KEY_CARD_MANAGER = ROOM_MANAGER_IMPL__KEY_CARD_MANAGER;

	/**
	 * The number of structural features of the '<em>Admin Room Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL_FEATURE_COUNT = ROOM_MANAGER_IMPL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___GET_ROOM_TYPES = ROOM_MANAGER_IMPL___GET_ROOM_TYPES;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___REGISTER_KEY_CARD__KEYCARD_STRING = ROOM_MANAGER_IMPL___REGISTER_KEY_CARD__KEYCARD_STRING;

	/**
	 * The operation id for the '<em>Register Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___REGISTER_KEY_CARD__STRING_STRING = ROOM_MANAGER_IMPL___REGISTER_KEY_CARD__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___GET_ROOMS = ROOM_MANAGER_IMPL___GET_ROOMS;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___UNREGISTER_KEY_CARD__KEYCARD_STRING = ROOM_MANAGER_IMPL___UNREGISTER_KEY_CARD__KEYCARD_STRING;

	/**
	 * The operation id for the '<em>Unregister Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___UNREGISTER_KEY_CARD__STRING_STRING = ROOM_MANAGER_IMPL___UNREGISTER_KEY_CARD__STRING_STRING;

	/**
	 * The operation id for the '<em>Unregister All Key Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___UNREGISTER_ALL_KEY_CARDS__STRING = ROOM_MANAGER_IMPL___UNREGISTER_ALL_KEY_CARDS__STRING;

	/**
	 * The operation id for the '<em>Get Room Type Amounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___GET_ROOM_TYPE_AMOUNTS = ROOM_MANAGER_IMPL___GET_ROOM_TYPE_AMOUNTS;

	/**
	 * The operation id for the '<em>Get Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___GET_ROOM_TYPE_AMOUNT__ROOMTYPE = ROOM_MANAGER_IMPL___GET_ROOM_TYPE_AMOUNT__ROOMTYPE;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM__INT_INT_STRING_ELIST_ELIST = ROOM_MANAGER_IMPL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM__INT = ROOM_MANAGER_IMPL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM_TYPE__STRING_STRING_ROOMAPPROVAL = ROOM_MANAGER_IMPL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM_TYPE__INT = ROOM_MANAGER_IMPL_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Admin Room Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_ROOM_MANAGER_IMPL_OPERATION_COUNT = ROOM_MANAGER_IMPL_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.RoomApproval <em>Room Approval</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.RoomApproval
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomApproval()
	 * @generated
	 */
	int ROOM_APPROVAL = 15;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.DisabilityApproval <em>Disability Approval</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.DisabilityApproval
	 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getDisabilityApproval()
	 * @generated
	 */
	int DISABILITY_APPROVAL = 16;


	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.AdminKeyCardManager <em>Admin Key Card Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Key Card Manager</em>'.
	 * @see tda593.hotel.california.facilities.AdminKeyCardManager
	 * @generated
	 */
	EClass getAdminKeyCardManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.AdminKeyCardManager#addKeyCard(int) <em>Add Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Key Card</em>' operation.
	 * @see tda593.hotel.california.facilities.AdminKeyCardManager#addKeyCard(int)
	 * @generated
	 */
	EOperation getAdminKeyCardManager__AddKeyCard__int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.AdminKeyCardManager#removeKeyCard(int) <em>Remove Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Key Card</em>' operation.
	 * @see tda593.hotel.california.facilities.AdminKeyCardManager#removeKeyCard(int)
	 * @generated
	 */
	EOperation getAdminKeyCardManager__RemoveKeyCard__int();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.KeyCardManager <em>Key Card Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Card Manager</em>'.
	 * @see tda593.hotel.california.facilities.KeyCardManager
	 * @generated
	 */
	EClass getKeyCardManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.KeyCardManager#getKeyCard(java.lang.String) <em>Get Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Key Card</em>' operation.
	 * @see tda593.hotel.california.facilities.KeyCardManager#getKeyCard(java.lang.String)
	 * @generated
	 */
	EOperation getKeyCardManager__GetKeyCard__String();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.KeyCard <em>Key Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Card</em>'.
	 * @see tda593.hotel.california.facilities.KeyCard
	 * @generated
	 */
	EClass getKeyCard();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.KeyCard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.facilities.KeyCard#getId()
	 * @see #getKeyCard()
	 * @generated
	 */
	EAttribute getKeyCard_Id();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.AdminRoomManager <em>Admin Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Room Manager</em>'.
	 * @see tda593.hotel.california.facilities.AdminRoomManager
	 * @generated
	 */
	EClass getAdminRoomManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.AdminRoomManager#addRoom(int, int, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see tda593.hotel.california.facilities.AdminRoomManager#addRoom(int, int, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getAdminRoomManager__AddRoom__int_int_String_EList_EList();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.AdminRoomManager#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see tda593.hotel.california.facilities.AdminRoomManager#removeRoom(int)
	 * @generated
	 */
	EOperation getAdminRoomManager__RemoveRoom__int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.AdminRoomManager#addRoomType(java.lang.String, java.lang.String, tda593.hotel.california.facilities.RoomApproval) <em>Add Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type</em>' operation.
	 * @see tda593.hotel.california.facilities.AdminRoomManager#addRoomType(java.lang.String, java.lang.String, tda593.hotel.california.facilities.RoomApproval)
	 * @generated
	 */
	EOperation getAdminRoomManager__AddRoomType__String_String_RoomApproval();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.AdminRoomManager#removeRoomType(int) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see tda593.hotel.california.facilities.AdminRoomManager#removeRoomType(int)
	 * @generated
	 */
	EOperation getAdminRoomManager__RemoveRoomType__int();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.RoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Manager</em>'.
	 * @see tda593.hotel.california.facilities.RoomManager
	 * @generated
	 */
	EClass getRoomManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.RoomManager#getRoomTypes() <em>Get Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types</em>' operation.
	 * @see tda593.hotel.california.facilities.RoomManager#getRoomTypes()
	 * @generated
	 */
	EOperation getRoomManager__GetRoomTypes();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.RoomManager#registerKeyCard(tda593.hotel.california.facilities.KeyCard, java.lang.String) <em>Register Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Key Card</em>' operation.
	 * @see tda593.hotel.california.facilities.RoomManager#registerKeyCard(tda593.hotel.california.facilities.KeyCard, java.lang.String)
	 * @generated
	 */
	EOperation getRoomManager__RegisterKeyCard__KeyCard_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.RoomManager#registerKeyCard(java.lang.String, java.lang.String) <em>Register Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Key Card</em>' operation.
	 * @see tda593.hotel.california.facilities.RoomManager#registerKeyCard(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRoomManager__RegisterKeyCard__String_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.RoomManager#getRooms() <em>Get Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rooms</em>' operation.
	 * @see tda593.hotel.california.facilities.RoomManager#getRooms()
	 * @generated
	 */
	EOperation getRoomManager__GetRooms();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.RoomManager#unregisterKeyCard(tda593.hotel.california.facilities.KeyCard, java.lang.String) <em>Unregister Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Key Card</em>' operation.
	 * @see tda593.hotel.california.facilities.RoomManager#unregisterKeyCard(tda593.hotel.california.facilities.KeyCard, java.lang.String)
	 * @generated
	 */
	EOperation getRoomManager__UnregisterKeyCard__KeyCard_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.RoomManager#unregisterKeyCard(java.lang.String, java.lang.String) <em>Unregister Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Key Card</em>' operation.
	 * @see tda593.hotel.california.facilities.RoomManager#unregisterKeyCard(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRoomManager__UnregisterKeyCard__String_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.RoomManager#unregisterAllKeyCards(java.lang.String) <em>Unregister All Key Cards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister All Key Cards</em>' operation.
	 * @see tda593.hotel.california.facilities.RoomManager#unregisterAllKeyCards(java.lang.String)
	 * @generated
	 */
	EOperation getRoomManager__UnregisterAllKeyCards__String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.RoomManager#getRoomTypeAmounts() <em>Get Room Type Amounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type Amounts</em>' operation.
	 * @see tda593.hotel.california.facilities.RoomManager#getRoomTypeAmounts()
	 * @generated
	 */
	EOperation getRoomManager__GetRoomTypeAmounts();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.RoomManager#getRoomTypeAmount(tda593.hotel.california.facilities.RoomType) <em>Get Room Type Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type Amount</em>' operation.
	 * @see tda593.hotel.california.facilities.RoomManager#getRoomTypeAmount(tda593.hotel.california.facilities.RoomType)
	 * @generated
	 */
	EOperation getRoomManager__GetRoomTypeAmount__RoomType();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see tda593.hotel.california.facilities.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.RoomType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.facilities.RoomType#getId()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.RoomType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.facilities.RoomType#getName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Name();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.RoomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tda593.hotel.california.facilities.RoomType#getDescription()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Description();

	/**
	 * Returns the meta object for the attribute list '{@link tda593.hotel.california.facilities.RoomType#getRoomApprovals <em>Room Approvals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Room Approvals</em>'.
	 * @see tda593.hotel.california.facilities.RoomType#getRoomApprovals()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_RoomApprovals();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see tda593.hotel.california.facilities.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.Room#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floor</em>'.
	 * @see tda593.hotel.california.facilities.Room#getFloor()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Floor();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see tda593.hotel.california.facilities.Room#getRoomNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.Room#isOperational <em>Is Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Operational</em>'.
	 * @see tda593.hotel.california.facilities.Room#isOperational()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsOperational();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.Room#isCleaned <em>Is Cleaned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cleaned</em>'.
	 * @see tda593.hotel.california.facilities.Room#isCleaned()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsCleaned();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.Room#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tda593.hotel.california.facilities.Room#getDescription()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Description();

	/**
	 * Returns the meta object for the attribute list '{@link tda593.hotel.california.facilities.Room#getPhotos <em>Photos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Photos</em>'.
	 * @see tda593.hotel.california.facilities.Room#getPhotos()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Photos();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.facilities.Room#getAllowedKeyCards <em>Allowed Key Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Key Cards</em>'.
	 * @see tda593.hotel.california.facilities.Room#getAllowedKeyCards()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_AllowedKeyCards();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.facilities.Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see tda593.hotel.california.facilities.Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_RoomType();

	/**
	 * Returns the meta object for the attribute list '{@link tda593.hotel.california.facilities.Room#getDisabilityApprovals <em>Disability Approvals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Disability Approvals</em>'.
	 * @see tda593.hotel.california.facilities.Room#getDisabilityApprovals()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_DisabilityApprovals();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.Room#registerKeyCard(tda593.hotel.california.facilities.KeyCard) <em>Register Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Key Card</em>' operation.
	 * @see tda593.hotel.california.facilities.Room#registerKeyCard(tda593.hotel.california.facilities.KeyCard)
	 * @generated
	 */
	EOperation getRoom__RegisterKeyCard__KeyCard();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.Room#unregisterKeyCard(tda593.hotel.california.facilities.KeyCard) <em>Unregister Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Key Card</em>' operation.
	 * @see tda593.hotel.california.facilities.Room#unregisterKeyCard(tda593.hotel.california.facilities.KeyCard)
	 * @generated
	 */
	EOperation getRoom__UnregisterKeyCard__KeyCard();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.facilities.Room#unregisterKeyCards() <em>Unregister Key Cards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Key Cards</em>' operation.
	 * @see tda593.hotel.california.facilities.Room#unregisterKeyCards()
	 * @generated
	 */
	EOperation getRoom__UnregisterKeyCards();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.RoomManagerImpl <em>Room Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Manager Impl</em>'.
	 * @see tda593.hotel.california.facilities.RoomManagerImpl
	 * @generated
	 */
	EClass getRoomManagerImpl();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.facilities.RoomManagerImpl#getRoomDataService <em>Room Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Data Service</em>'.
	 * @see tda593.hotel.california.facilities.RoomManagerImpl#getRoomDataService()
	 * @see #getRoomManagerImpl()
	 * @generated
	 */
	EReference getRoomManagerImpl_RoomDataService();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.facilities.RoomManagerImpl#getRoomTypeDataService <em>Room Type Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type Data Service</em>'.
	 * @see tda593.hotel.california.facilities.RoomManagerImpl#getRoomTypeDataService()
	 * @see #getRoomManagerImpl()
	 * @generated
	 */
	EReference getRoomManagerImpl_RoomTypeDataService();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.facilities.RoomManagerImpl#getKeyCardManager <em>Key Card Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Card Manager</em>'.
	 * @see tda593.hotel.california.facilities.RoomManagerImpl#getKeyCardManager()
	 * @see #getRoomManagerImpl()
	 * @generated
	 */
	EReference getRoomManagerImpl_KeyCardManager();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.RoomDataService <em>Room Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Data Service</em>'.
	 * @see tda593.hotel.california.facilities.RoomDataService
	 * @generated
	 */
	EClass getRoomDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.RoomTypeDataService <em>Room Type Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type Data Service</em>'.
	 * @see tda593.hotel.california.facilities.RoomTypeDataService
	 * @generated
	 */
	EClass getRoomTypeDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.ConferenceRoom <em>Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference Room</em>'.
	 * @see tda593.hotel.california.facilities.ConferenceRoom
	 * @generated
	 */
	EClass getConferenceRoom();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.ConferenceRoom#getNumberOfSeats <em>Number Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Seats</em>'.
	 * @see tda593.hotel.california.facilities.ConferenceRoom#getNumberOfSeats()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_NumberOfSeats();

	/**
	 * Returns the meta object for the attribute list '{@link tda593.hotel.california.facilities.ConferenceRoom#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Equipment</em>'.
	 * @see tda593.hotel.california.facilities.ConferenceRoom#getEquipment()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_Equipment();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.GuestRoom <em>Guest Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Room</em>'.
	 * @see tda593.hotel.california.facilities.GuestRoom
	 * @generated
	 */
	EClass getGuestRoom();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.GuestRoom#getNumberOfBeds <em>Number Of Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Beds</em>'.
	 * @see tda593.hotel.california.facilities.GuestRoom#getNumberOfBeds()
	 * @see #getGuestRoom()
	 * @generated
	 */
	EAttribute getGuestRoom_NumberOfBeds();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.GuestRoom#getNumberOfExtrabeds <em>Number Of Extrabeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Extrabeds</em>'.
	 * @see tda593.hotel.california.facilities.GuestRoom#getNumberOfExtrabeds()
	 * @see #getGuestRoom()
	 * @generated
	 */
	EAttribute getGuestRoom_NumberOfExtrabeds();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.KeyCardManagerImpl <em>Key Card Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Card Manager Impl</em>'.
	 * @see tda593.hotel.california.facilities.KeyCardManagerImpl
	 * @generated
	 */
	EClass getKeyCardManagerImpl();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.facilities.KeyCardManagerImpl#getKeyCards <em>Key Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key Cards</em>'.
	 * @see tda593.hotel.california.facilities.KeyCardManagerImpl#getKeyCards()
	 * @see #getKeyCardManagerImpl()
	 * @generated
	 */
	EReference getKeyCardManagerImpl_KeyCards();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.facilities.KeyCardManagerImpl#getKeyCardDataService <em>Key Card Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Card Data Service</em>'.
	 * @see tda593.hotel.california.facilities.KeyCardManagerImpl#getKeyCardDataService()
	 * @see #getKeyCardManagerImpl()
	 * @generated
	 */
	EReference getKeyCardManagerImpl_KeyCardDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.KeyCardDataService <em>Key Card Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Card Data Service</em>'.
	 * @see tda593.hotel.california.facilities.KeyCardDataService
	 * @generated
	 */
	EClass getKeyCardDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.AdminRoomManagerImpl <em>Admin Room Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Room Manager Impl</em>'.
	 * @see tda593.hotel.california.facilities.AdminRoomManagerImpl
	 * @generated
	 */
	EClass getAdminRoomManagerImpl();

	/**
	 * Returns the meta object for enum '{@link tda593.hotel.california.facilities.RoomApproval <em>Room Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Approval</em>'.
	 * @see tda593.hotel.california.facilities.RoomApproval
	 * @generated
	 */
	EEnum getRoomApproval();

	/**
	 * Returns the meta object for enum '{@link tda593.hotel.california.facilities.DisabilityApproval <em>Disability Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Disability Approval</em>'.
	 * @see tda593.hotel.california.facilities.DisabilityApproval
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
	FacilitiesFactory getFacilitiesFactory();

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
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.AdminKeyCardManager <em>Admin Key Card Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.AdminKeyCardManager
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getAdminKeyCardManager()
		 * @generated
		 */
		EClass ADMIN_KEY_CARD_MANAGER = eINSTANCE.getAdminKeyCardManager();

		/**
		 * The meta object literal for the '<em><b>Add Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_KEY_CARD_MANAGER___ADD_KEY_CARD__INT = eINSTANCE.getAdminKeyCardManager__AddKeyCard__int();

		/**
		 * The meta object literal for the '<em><b>Remove Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_KEY_CARD_MANAGER___REMOVE_KEY_CARD__INT = eINSTANCE.getAdminKeyCardManager__RemoveKeyCard__int();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.KeyCardManager <em>Key Card Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.KeyCardManager
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getKeyCardManager()
		 * @generated
		 */
		EClass KEY_CARD_MANAGER = eINSTANCE.getKeyCardManager();

		/**
		 * The meta object literal for the '<em><b>Get Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY_CARD_MANAGER___GET_KEY_CARD__STRING = eINSTANCE.getKeyCardManager__GetKeyCard__String();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.impl.KeyCardImpl <em>Key Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.impl.KeyCardImpl
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getKeyCard()
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
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.AdminRoomManager <em>Admin Room Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.AdminRoomManager
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getAdminRoomManager()
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
		 * The meta object literal for the '<em><b>Add Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_ROOM_MANAGER___ADD_ROOM_TYPE__STRING_STRING_ROOMAPPROVAL = eINSTANCE.getAdminRoomManager__AddRoomType__String_String_RoomApproval();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_ROOM_MANAGER___REMOVE_ROOM_TYPE__INT = eINSTANCE.getAdminRoomManager__RemoveRoomType__int();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.RoomManager <em>Room Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.RoomManager
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomManager()
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
		EOperation ROOM_MANAGER___REGISTER_KEY_CARD__KEYCARD_STRING = eINSTANCE.getRoomManager__RegisterKeyCard__KeyCard_String();

		/**
		 * The meta object literal for the '<em><b>Register Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___REGISTER_KEY_CARD__STRING_STRING = eINSTANCE.getRoomManager__RegisterKeyCard__String_String();

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
		EOperation ROOM_MANAGER___UNREGISTER_KEY_CARD__KEYCARD_STRING = eINSTANCE.getRoomManager__UnregisterKeyCard__KeyCard_String();

		/**
		 * The meta object literal for the '<em><b>Unregister Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___UNREGISTER_KEY_CARD__STRING_STRING = eINSTANCE.getRoomManager__UnregisterKeyCard__String_String();

		/**
		 * The meta object literal for the '<em><b>Unregister All Key Cards</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___UNREGISTER_ALL_KEY_CARDS__STRING = eINSTANCE.getRoomManager__UnregisterAllKeyCards__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Type Amounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___GET_ROOM_TYPE_AMOUNTS = eINSTANCE.getRoomManager__GetRoomTypeAmounts();

		/**
		 * The meta object literal for the '<em><b>Get Room Type Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___GET_ROOM_TYPE_AMOUNT__ROOMTYPE = eINSTANCE.getRoomManager__GetRoomTypeAmount__RoomType();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.impl.RoomTypeImpl
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomType()
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
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.impl.RoomImpl
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoom()
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
		 * The meta object literal for the '<em><b>Disability Approvals</b></em>' attribute list feature.
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
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.impl.RoomManagerImplImpl <em>Room Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.impl.RoomManagerImplImpl
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomManagerImpl()
		 * @generated
		 */
		EClass ROOM_MANAGER_IMPL = eINSTANCE.getRoomManagerImpl();

		/**
		 * The meta object literal for the '<em><b>Room Data Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGER_IMPL__ROOM_DATA_SERVICE = eINSTANCE.getRoomManagerImpl_RoomDataService();

		/**
		 * The meta object literal for the '<em><b>Room Type Data Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGER_IMPL__ROOM_TYPE_DATA_SERVICE = eINSTANCE.getRoomManagerImpl_RoomTypeDataService();

		/**
		 * The meta object literal for the '<em><b>Key Card Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGER_IMPL__KEY_CARD_MANAGER = eINSTANCE.getRoomManagerImpl_KeyCardManager();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.impl.RoomDataServiceImpl <em>Room Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.impl.RoomDataServiceImpl
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomDataService()
		 * @generated
		 */
		EClass ROOM_DATA_SERVICE = eINSTANCE.getRoomDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.impl.RoomTypeDataServiceImpl <em>Room Type Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.impl.RoomTypeDataServiceImpl
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomTypeDataService()
		 * @generated
		 */
		EClass ROOM_TYPE_DATA_SERVICE = eINSTANCE.getRoomTypeDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.impl.ConferenceRoomImpl
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getConferenceRoom()
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
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.impl.GuestRoomImpl <em>Guest Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.impl.GuestRoomImpl
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getGuestRoom()
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
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.impl.KeyCardManagerImplImpl <em>Key Card Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.impl.KeyCardManagerImplImpl
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getKeyCardManagerImpl()
		 * @generated
		 */
		EClass KEY_CARD_MANAGER_IMPL = eINSTANCE.getKeyCardManagerImpl();

		/**
		 * The meta object literal for the '<em><b>Key Cards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_CARD_MANAGER_IMPL__KEY_CARDS = eINSTANCE.getKeyCardManagerImpl_KeyCards();

		/**
		 * The meta object literal for the '<em><b>Key Card Data Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_CARD_MANAGER_IMPL__KEY_CARD_DATA_SERVICE = eINSTANCE.getKeyCardManagerImpl_KeyCardDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.impl.KeyCardDataServiceImpl <em>Key Card Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.impl.KeyCardDataServiceImpl
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getKeyCardDataService()
		 * @generated
		 */
		EClass KEY_CARD_DATA_SERVICE = eINSTANCE.getKeyCardDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.impl.AdminRoomManagerImplImpl <em>Admin Room Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.impl.AdminRoomManagerImplImpl
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getAdminRoomManagerImpl()
		 * @generated
		 */
		EClass ADMIN_ROOM_MANAGER_IMPL = eINSTANCE.getAdminRoomManagerImpl();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.RoomApproval <em>Room Approval</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.RoomApproval
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getRoomApproval()
		 * @generated
		 */
		EEnum ROOM_APPROVAL = eINSTANCE.getRoomApproval();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.DisabilityApproval <em>Disability Approval</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.DisabilityApproval
		 * @see tda593.hotel.california.facilities.impl.FacilitiesPackageImpl#getDisabilityApproval()
		 * @generated
		 */
		EEnum DISABILITY_APPROVAL = eINSTANCE.getDisabilityApproval();

	}

} //FacilitiesPackage

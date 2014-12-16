/**
 */
package tda593.hotel.california.facilities.persistence;

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
 * @see tda593.hotel.california.facilities.persistence.PersistenceFactory
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
	String eNS_URI = "http:///tda593/hotel/california/facilities/persistence.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tda593.hotel.california.facilities.persistence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistencePackage eINSTANCE = tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl.init();

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.persistence.impl.KeyCardEntityImpl <em>Key Card Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.persistence.impl.KeyCardEntityImpl
	 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getKeyCardEntity()
	 * @generated
	 */
	int KEY_CARD_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_ENTITY__ID = 0;

	/**
	 * The number of structural features of the '<em>Key Card Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Key Card Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl <em>Room Type Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl
	 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getRoomTypeEntity()
	 * @generated
	 */
	int ROOM_TYPE_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_ENTITY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_ENTITY__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_ENTITY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Room Approvals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_ENTITY__ROOM_APPROVALS = 3;

	/**
	 * The number of structural features of the '<em>Room Type Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room Type Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.persistence.impl.RoomApprovalEntityImpl <em>Room Approval Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.persistence.impl.RoomApprovalEntityImpl
	 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getRoomApprovalEntity()
	 * @generated
	 */
	int ROOM_APPROVAL_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_APPROVAL_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_APPROVAL_ENTITY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Room Approval Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_APPROVAL_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room Approval Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_APPROVAL_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.persistence.impl.DisabilityApprovalEntityImpl <em>Disability Approval Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.persistence.impl.DisabilityApprovalEntityImpl
	 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getDisabilityApprovalEntity()
	 * @generated
	 */
	int DISABILITY_APPROVAL_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABILITY_APPROVAL_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABILITY_APPROVAL_ENTITY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Disability Approval Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABILITY_APPROVAL_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Disability Approval Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABILITY_APPROVAL_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl <em>Room Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl
	 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getRoomEntity()
	 * @generated
	 */
	int ROOM_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ENTITY__FLOOR = 0;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ENTITY__ROOM_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ENTITY__IS_OPERATIONAL = 2;

	/**
	 * The feature id for the '<em><b>Is Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ENTITY__IS_CLEANED = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ENTITY__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ENTITY__PHOTOS = 5;

	/**
	 * The feature id for the '<em><b>Room Type Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ENTITY__ROOM_TYPE_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Allowed Key Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ENTITY__ALLOWED_KEY_CARDS = 7;

	/**
	 * The feature id for the '<em><b>Disability Approvals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ENTITY__DISABILITY_APPROVALS = 8;

	/**
	 * The number of structural features of the '<em>Room Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ENTITY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Room Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.persistence.impl.ConferenceRoomEntityImpl <em>Conference Room Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.persistence.impl.ConferenceRoomEntityImpl
	 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getConferenceRoomEntity()
	 * @generated
	 */
	int CONFERENCE_ROOM_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY__FLOOR = ROOM_ENTITY__FLOOR;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY__ROOM_NUMBER = ROOM_ENTITY__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY__IS_OPERATIONAL = ROOM_ENTITY__IS_OPERATIONAL;

	/**
	 * The feature id for the '<em><b>Is Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY__IS_CLEANED = ROOM_ENTITY__IS_CLEANED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY__DESCRIPTION = ROOM_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY__PHOTOS = ROOM_ENTITY__PHOTOS;

	/**
	 * The feature id for the '<em><b>Room Type Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY__ROOM_TYPE_ENTITY = ROOM_ENTITY__ROOM_TYPE_ENTITY;

	/**
	 * The feature id for the '<em><b>Allowed Key Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY__ALLOWED_KEY_CARDS = ROOM_ENTITY__ALLOWED_KEY_CARDS;

	/**
	 * The feature id for the '<em><b>Disability Approvals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY__DISABILITY_APPROVALS = ROOM_ENTITY__DISABILITY_APPROVALS;

	/**
	 * The feature id for the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY__NUMBER_OF_SEATS = ROOM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY__EQUIPMENT = ROOM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conference Room Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY_FEATURE_COUNT = ROOM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conference Room Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_ENTITY_OPERATION_COUNT = ROOM_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.facilities.persistence.impl.GuestRoomEntityImpl <em>Guest Room Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.facilities.persistence.impl.GuestRoomEntityImpl
	 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getGuestRoomEntity()
	 * @generated
	 */
	int GUEST_ROOM_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY__FLOOR = ROOM_ENTITY__FLOOR;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY__ROOM_NUMBER = ROOM_ENTITY__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY__IS_OPERATIONAL = ROOM_ENTITY__IS_OPERATIONAL;

	/**
	 * The feature id for the '<em><b>Is Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY__IS_CLEANED = ROOM_ENTITY__IS_CLEANED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY__DESCRIPTION = ROOM_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY__PHOTOS = ROOM_ENTITY__PHOTOS;

	/**
	 * The feature id for the '<em><b>Room Type Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY__ROOM_TYPE_ENTITY = ROOM_ENTITY__ROOM_TYPE_ENTITY;

	/**
	 * The feature id for the '<em><b>Allowed Key Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY__ALLOWED_KEY_CARDS = ROOM_ENTITY__ALLOWED_KEY_CARDS;

	/**
	 * The feature id for the '<em><b>Disability Approvals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY__DISABILITY_APPROVALS = ROOM_ENTITY__DISABILITY_APPROVALS;

	/**
	 * The feature id for the '<em><b>Number Of Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY__NUMBER_OF_BEDS = ROOM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Extrabeds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY__NUMBER_OF_EXTRABEDS = ROOM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Guest Room Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY_FEATURE_COUNT = ROOM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Guest Room Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ROOM_ENTITY_OPERATION_COUNT = ROOM_ENTITY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.persistence.KeyCardEntity <em>Key Card Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Card Entity</em>'.
	 * @see tda593.hotel.california.facilities.persistence.KeyCardEntity
	 * @generated
	 */
	EClass getKeyCardEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.KeyCardEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.facilities.persistence.KeyCardEntity#getId()
	 * @see #getKeyCardEntity()
	 * @generated
	 */
	EAttribute getKeyCardEntity_Id();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity <em>Room Type Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type Entity</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomTypeEntity
	 * @generated
	 */
	EClass getRoomTypeEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomTypeEntity#getDescription()
	 * @see #getRoomTypeEntity()
	 * @generated
	 */
	EAttribute getRoomTypeEntity_Description();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomTypeEntity#getId()
	 * @see #getRoomTypeEntity()
	 * @generated
	 */
	EAttribute getRoomTypeEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomTypeEntity#getName()
	 * @see #getRoomTypeEntity()
	 * @generated
	 */
	EAttribute getRoomTypeEntity_Name();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getRoomApprovals <em>Room Approvals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Approvals</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomTypeEntity#getRoomApprovals()
	 * @see #getRoomTypeEntity()
	 * @generated
	 */
	EReference getRoomTypeEntity_RoomApprovals();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.persistence.RoomApprovalEntity <em>Room Approval Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Approval Entity</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomApprovalEntity
	 * @generated
	 */
	EClass getRoomApprovalEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.RoomApprovalEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomApprovalEntity#getId()
	 * @see #getRoomApprovalEntity()
	 * @generated
	 */
	EAttribute getRoomApprovalEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.RoomApprovalEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomApprovalEntity#getName()
	 * @see #getRoomApprovalEntity()
	 * @generated
	 */
	EAttribute getRoomApprovalEntity_Name();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.persistence.DisabilityApprovalEntity <em>Disability Approval Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disability Approval Entity</em>'.
	 * @see tda593.hotel.california.facilities.persistence.DisabilityApprovalEntity
	 * @generated
	 */
	EClass getDisabilityApprovalEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.DisabilityApprovalEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.facilities.persistence.DisabilityApprovalEntity#getId()
	 * @see #getDisabilityApprovalEntity()
	 * @generated
	 */
	EAttribute getDisabilityApprovalEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.DisabilityApprovalEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.facilities.persistence.DisabilityApprovalEntity#getName()
	 * @see #getDisabilityApprovalEntity()
	 * @generated
	 */
	EAttribute getDisabilityApprovalEntity_Name();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.persistence.ConferenceRoomEntity <em>Conference Room Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference Room Entity</em>'.
	 * @see tda593.hotel.california.facilities.persistence.ConferenceRoomEntity
	 * @generated
	 */
	EClass getConferenceRoomEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.ConferenceRoomEntity#getNumberOfSeats <em>Number Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Seats</em>'.
	 * @see tda593.hotel.california.facilities.persistence.ConferenceRoomEntity#getNumberOfSeats()
	 * @see #getConferenceRoomEntity()
	 * @generated
	 */
	EAttribute getConferenceRoomEntity_NumberOfSeats();

	/**
	 * Returns the meta object for the attribute list '{@link tda593.hotel.california.facilities.persistence.ConferenceRoomEntity#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Equipment</em>'.
	 * @see tda593.hotel.california.facilities.persistence.ConferenceRoomEntity#getEquipment()
	 * @see #getConferenceRoomEntity()
	 * @generated
	 */
	EAttribute getConferenceRoomEntity_Equipment();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.persistence.RoomEntity <em>Room Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Entity</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomEntity
	 * @generated
	 */
	EClass getRoomEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.RoomEntity#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floor</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomEntity#getFloor()
	 * @see #getRoomEntity()
	 * @generated
	 */
	EAttribute getRoomEntity_Floor();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.RoomEntity#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomEntity#getRoomNumber()
	 * @see #getRoomEntity()
	 * @generated
	 */
	EAttribute getRoomEntity_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.RoomEntity#isOperational <em>Is Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Operational</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomEntity#isOperational()
	 * @see #getRoomEntity()
	 * @generated
	 */
	EAttribute getRoomEntity_IsOperational();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.RoomEntity#isCleaned <em>Is Cleaned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cleaned</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomEntity#isCleaned()
	 * @see #getRoomEntity()
	 * @generated
	 */
	EAttribute getRoomEntity_IsCleaned();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.RoomEntity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomEntity#getDescription()
	 * @see #getRoomEntity()
	 * @generated
	 */
	EAttribute getRoomEntity_Description();

	/**
	 * Returns the meta object for the attribute list '{@link tda593.hotel.california.facilities.persistence.RoomEntity#getPhotos <em>Photos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Photos</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomEntity#getPhotos()
	 * @see #getRoomEntity()
	 * @generated
	 */
	EAttribute getRoomEntity_Photos();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.facilities.persistence.RoomEntity#getRoomTypeEntity <em>Room Type Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type Entity</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomEntity#getRoomTypeEntity()
	 * @see #getRoomEntity()
	 * @generated
	 */
	EReference getRoomEntity_RoomTypeEntity();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.facilities.persistence.RoomEntity#getAllowedKeyCards <em>Allowed Key Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Key Cards</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomEntity#getAllowedKeyCards()
	 * @see #getRoomEntity()
	 * @generated
	 */
	EReference getRoomEntity_AllowedKeyCards();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.facilities.persistence.RoomEntity#getDisabilityApprovals <em>Disability Approvals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disability Approvals</em>'.
	 * @see tda593.hotel.california.facilities.persistence.RoomEntity#getDisabilityApprovals()
	 * @see #getRoomEntity()
	 * @generated
	 */
	EReference getRoomEntity_DisabilityApprovals();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.facilities.persistence.GuestRoomEntity <em>Guest Room Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Room Entity</em>'.
	 * @see tda593.hotel.california.facilities.persistence.GuestRoomEntity
	 * @generated
	 */
	EClass getGuestRoomEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.GuestRoomEntity#getNumberOfBeds <em>Number Of Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Beds</em>'.
	 * @see tda593.hotel.california.facilities.persistence.GuestRoomEntity#getNumberOfBeds()
	 * @see #getGuestRoomEntity()
	 * @generated
	 */
	EAttribute getGuestRoomEntity_NumberOfBeds();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.facilities.persistence.GuestRoomEntity#getNumberOfExtrabeds <em>Number Of Extrabeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Extrabeds</em>'.
	 * @see tda593.hotel.california.facilities.persistence.GuestRoomEntity#getNumberOfExtrabeds()
	 * @see #getGuestRoomEntity()
	 * @generated
	 */
	EAttribute getGuestRoomEntity_NumberOfExtrabeds();

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
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.persistence.impl.KeyCardEntityImpl <em>Key Card Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.persistence.impl.KeyCardEntityImpl
		 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getKeyCardEntity()
		 * @generated
		 */
		EClass KEY_CARD_ENTITY = eINSTANCE.getKeyCardEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_CARD_ENTITY__ID = eINSTANCE.getKeyCardEntity_Id();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl <em>Room Type Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl
		 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getRoomTypeEntity()
		 * @generated
		 */
		EClass ROOM_TYPE_ENTITY = eINSTANCE.getRoomTypeEntity();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE_ENTITY__DESCRIPTION = eINSTANCE.getRoomTypeEntity_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE_ENTITY__ID = eINSTANCE.getRoomTypeEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE_ENTITY__NAME = eINSTANCE.getRoomTypeEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Room Approvals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE_ENTITY__ROOM_APPROVALS = eINSTANCE.getRoomTypeEntity_RoomApprovals();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.persistence.impl.RoomApprovalEntityImpl <em>Room Approval Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.persistence.impl.RoomApprovalEntityImpl
		 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getRoomApprovalEntity()
		 * @generated
		 */
		EClass ROOM_APPROVAL_ENTITY = eINSTANCE.getRoomApprovalEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_APPROVAL_ENTITY__ID = eINSTANCE.getRoomApprovalEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_APPROVAL_ENTITY__NAME = eINSTANCE.getRoomApprovalEntity_Name();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.persistence.impl.DisabilityApprovalEntityImpl <em>Disability Approval Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.persistence.impl.DisabilityApprovalEntityImpl
		 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getDisabilityApprovalEntity()
		 * @generated
		 */
		EClass DISABILITY_APPROVAL_ENTITY = eINSTANCE.getDisabilityApprovalEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISABILITY_APPROVAL_ENTITY__ID = eINSTANCE.getDisabilityApprovalEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISABILITY_APPROVAL_ENTITY__NAME = eINSTANCE.getDisabilityApprovalEntity_Name();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.persistence.impl.ConferenceRoomEntityImpl <em>Conference Room Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.persistence.impl.ConferenceRoomEntityImpl
		 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getConferenceRoomEntity()
		 * @generated
		 */
		EClass CONFERENCE_ROOM_ENTITY = eINSTANCE.getConferenceRoomEntity();

		/**
		 * The meta object literal for the '<em><b>Number Of Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM_ENTITY__NUMBER_OF_SEATS = eINSTANCE.getConferenceRoomEntity_NumberOfSeats();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM_ENTITY__EQUIPMENT = eINSTANCE.getConferenceRoomEntity_Equipment();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl <em>Room Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl
		 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getRoomEntity()
		 * @generated
		 */
		EClass ROOM_ENTITY = eINSTANCE.getRoomEntity();

		/**
		 * The meta object literal for the '<em><b>Floor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ENTITY__FLOOR = eINSTANCE.getRoomEntity_Floor();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ENTITY__ROOM_NUMBER = eINSTANCE.getRoomEntity_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Is Operational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ENTITY__IS_OPERATIONAL = eINSTANCE.getRoomEntity_IsOperational();

		/**
		 * The meta object literal for the '<em><b>Is Cleaned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ENTITY__IS_CLEANED = eINSTANCE.getRoomEntity_IsCleaned();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ENTITY__DESCRIPTION = eINSTANCE.getRoomEntity_Description();

		/**
		 * The meta object literal for the '<em><b>Photos</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ENTITY__PHOTOS = eINSTANCE.getRoomEntity_Photos();

		/**
		 * The meta object literal for the '<em><b>Room Type Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ENTITY__ROOM_TYPE_ENTITY = eINSTANCE.getRoomEntity_RoomTypeEntity();

		/**
		 * The meta object literal for the '<em><b>Allowed Key Cards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ENTITY__ALLOWED_KEY_CARDS = eINSTANCE.getRoomEntity_AllowedKeyCards();

		/**
		 * The meta object literal for the '<em><b>Disability Approvals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ENTITY__DISABILITY_APPROVALS = eINSTANCE.getRoomEntity_DisabilityApprovals();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.facilities.persistence.impl.GuestRoomEntityImpl <em>Guest Room Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.facilities.persistence.impl.GuestRoomEntityImpl
		 * @see tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl#getGuestRoomEntity()
		 * @generated
		 */
		EClass GUEST_ROOM_ENTITY = eINSTANCE.getGuestRoomEntity();

		/**
		 * The meta object literal for the '<em><b>Number Of Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST_ROOM_ENTITY__NUMBER_OF_BEDS = eINSTANCE.getGuestRoomEntity_NumberOfBeds();

		/**
		 * The meta object literal for the '<em><b>Number Of Extrabeds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST_ROOM_ENTITY__NUMBER_OF_EXTRABEDS = eINSTANCE.getGuestRoomEntity_NumberOfExtrabeds();

	}

} //PersistencePackage

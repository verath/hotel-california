/**
 */
package tda593.hotel.california.facilities.persistence.impl;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tda593.hotel.california.facilities.persistence.DisabilityApprovalEntity;
import tda593.hotel.california.facilities.persistence.KeyCardEntity;
import tda593.hotel.california.facilities.persistence.PersistencePackage;
import tda593.hotel.california.facilities.persistence.RoomEntity;
import tda593.hotel.california.facilities.persistence.RoomTypeEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#isOperational <em>Is Operational</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#isCleaned <em>Is Cleaned</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getPhotos <em>Photos</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getRoomTypeEntity <em>Room Type Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getAllowedKeyCards <em>Allowed Key Cards</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getDisabilityApprovals <em>Disability Approvals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
@Table(name = "Rooms")
@Inheritance(strategy = InheritanceType.JOINED)
public class RoomEntityImpl extends MinimalEObjectImpl.Container implements RoomEntity {
	/**
	 * The default value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected static final int FLOOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected int floor = FLOOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	@Id
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isOperational() <em>Is Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperational()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPERATIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperational() <em>Is Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperational()
	 * @generated
	 * @ordered
	 */
	protected boolean isOperational = IS_OPERATIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isCleaned() <em>Is Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleaned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLEANED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCleaned() <em>Is Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleaned()
	 * @generated
	 * @ordered
	 */
	protected boolean isCleaned = IS_CLEANED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhotos() <em>Photos</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotos()
	 * @generated
	 * @ordered
	 */
	protected EList<String> photos;

	/**
	 * The cached value of the '{@link #getRoomTypeEntity() <em>Room Type Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeEntity()
	 * @generated
	 * @ordered
	 */
	@OneToOne(targetEntity = RoomTypeEntityImpl.class)
	protected RoomTypeEntity roomTypeEntity;

	/**
	 * The cached value of the '{@link #getAllowedKeyCards() <em>Allowed Key Cards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedKeyCards()
	 * @generated
	 * @ordered
	 */
	@OneToMany(targetEntity = KeyCardEntityImpl.class)
	protected EList<KeyCardEntity> allowedKeyCards;

	/**
	 * The cached value of the '{@link #getDisabilityApprovals() <em>Disability Approvals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabilityApprovals()
	 * @generated
	 * @ordered
	 */
	@OneToMany(targetEntity = DisabilityApprovalEntityImpl.class)
	protected EList<DisabilityApprovalEntity> disabilityApprovals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ROOM_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor(int newFloor) {
		int oldFloor = floor;
		floor = newFloor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_ENTITY__FLOOR, oldFloor, floor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(int newRoomNumber) {
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_ENTITY__ROOM_NUMBER, oldRoomNumber, roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOperational() {
		return isOperational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOperational(boolean newIsOperational) {
		boolean oldIsOperational = isOperational;
		isOperational = newIsOperational;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_ENTITY__IS_OPERATIONAL, oldIsOperational, isOperational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCleaned() {
		return isCleaned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCleaned(boolean newIsCleaned) {
		boolean oldIsCleaned = isCleaned;
		isCleaned = newIsCleaned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_ENTITY__IS_CLEANED, oldIsCleaned, isCleaned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_ENTITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPhotos() {
		if (photos == null) {
			photos = new EDataTypeUniqueEList<String>(String.class, this, PersistencePackage.ROOM_ENTITY__PHOTOS);
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeEntity getRoomTypeEntity() {
		if (roomTypeEntity != null && roomTypeEntity.eIsProxy()) {
			InternalEObject oldRoomTypeEntity = (InternalEObject)roomTypeEntity;
			roomTypeEntity = (RoomTypeEntity)eResolveProxy(oldRoomTypeEntity);
			if (roomTypeEntity != oldRoomTypeEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.ROOM_ENTITY__ROOM_TYPE_ENTITY, oldRoomTypeEntity, roomTypeEntity));
			}
		}
		return roomTypeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeEntity basicGetRoomTypeEntity() {
		return roomTypeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeEntity(RoomTypeEntity newRoomTypeEntity) {
		RoomTypeEntity oldRoomTypeEntity = roomTypeEntity;
		roomTypeEntity = newRoomTypeEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_ENTITY__ROOM_TYPE_ENTITY, oldRoomTypeEntity, roomTypeEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyCardEntity> getAllowedKeyCards() {
		if (allowedKeyCards == null) {
			allowedKeyCards = new EObjectResolvingEList<KeyCardEntity>(KeyCardEntity.class, this, PersistencePackage.ROOM_ENTITY__ALLOWED_KEY_CARDS);
		}
		return allowedKeyCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisabilityApprovalEntity> getDisabilityApprovals() {
		if (disabilityApprovals == null) {
			disabilityApprovals = new EObjectResolvingEList<DisabilityApprovalEntity>(DisabilityApprovalEntity.class, this, PersistencePackage.ROOM_ENTITY__DISABILITY_APPROVALS);
		}
		return disabilityApprovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.ROOM_ENTITY__FLOOR:
				return getFloor();
			case PersistencePackage.ROOM_ENTITY__ROOM_NUMBER:
				return getRoomNumber();
			case PersistencePackage.ROOM_ENTITY__IS_OPERATIONAL:
				return isOperational();
			case PersistencePackage.ROOM_ENTITY__IS_CLEANED:
				return isCleaned();
			case PersistencePackage.ROOM_ENTITY__DESCRIPTION:
				return getDescription();
			case PersistencePackage.ROOM_ENTITY__PHOTOS:
				return getPhotos();
			case PersistencePackage.ROOM_ENTITY__ROOM_TYPE_ENTITY:
				if (resolve) return getRoomTypeEntity();
				return basicGetRoomTypeEntity();
			case PersistencePackage.ROOM_ENTITY__ALLOWED_KEY_CARDS:
				return getAllowedKeyCards();
			case PersistencePackage.ROOM_ENTITY__DISABILITY_APPROVALS:
				return getDisabilityApprovals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersistencePackage.ROOM_ENTITY__FLOOR:
				setFloor((Integer)newValue);
				return;
			case PersistencePackage.ROOM_ENTITY__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case PersistencePackage.ROOM_ENTITY__IS_OPERATIONAL:
				setIsOperational((Boolean)newValue);
				return;
			case PersistencePackage.ROOM_ENTITY__IS_CLEANED:
				setIsCleaned((Boolean)newValue);
				return;
			case PersistencePackage.ROOM_ENTITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PersistencePackage.ROOM_ENTITY__PHOTOS:
				getPhotos().clear();
				getPhotos().addAll((Collection<? extends String>)newValue);
				return;
			case PersistencePackage.ROOM_ENTITY__ROOM_TYPE_ENTITY:
				setRoomTypeEntity((RoomTypeEntity)newValue);
				return;
			case PersistencePackage.ROOM_ENTITY__ALLOWED_KEY_CARDS:
				getAllowedKeyCards().clear();
				getAllowedKeyCards().addAll((Collection<? extends KeyCardEntity>)newValue);
				return;
			case PersistencePackage.ROOM_ENTITY__DISABILITY_APPROVALS:
				getDisabilityApprovals().clear();
				getDisabilityApprovals().addAll((Collection<? extends DisabilityApprovalEntity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PersistencePackage.ROOM_ENTITY__FLOOR:
				setFloor(FLOOR_EDEFAULT);
				return;
			case PersistencePackage.ROOM_ENTITY__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case PersistencePackage.ROOM_ENTITY__IS_OPERATIONAL:
				setIsOperational(IS_OPERATIONAL_EDEFAULT);
				return;
			case PersistencePackage.ROOM_ENTITY__IS_CLEANED:
				setIsCleaned(IS_CLEANED_EDEFAULT);
				return;
			case PersistencePackage.ROOM_ENTITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PersistencePackage.ROOM_ENTITY__PHOTOS:
				getPhotos().clear();
				return;
			case PersistencePackage.ROOM_ENTITY__ROOM_TYPE_ENTITY:
				setRoomTypeEntity((RoomTypeEntity)null);
				return;
			case PersistencePackage.ROOM_ENTITY__ALLOWED_KEY_CARDS:
				getAllowedKeyCards().clear();
				return;
			case PersistencePackage.ROOM_ENTITY__DISABILITY_APPROVALS:
				getDisabilityApprovals().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PersistencePackage.ROOM_ENTITY__FLOOR:
				return floor != FLOOR_EDEFAULT;
			case PersistencePackage.ROOM_ENTITY__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case PersistencePackage.ROOM_ENTITY__IS_OPERATIONAL:
				return isOperational != IS_OPERATIONAL_EDEFAULT;
			case PersistencePackage.ROOM_ENTITY__IS_CLEANED:
				return isCleaned != IS_CLEANED_EDEFAULT;
			case PersistencePackage.ROOM_ENTITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PersistencePackage.ROOM_ENTITY__PHOTOS:
				return photos != null && !photos.isEmpty();
			case PersistencePackage.ROOM_ENTITY__ROOM_TYPE_ENTITY:
				return roomTypeEntity != null;
			case PersistencePackage.ROOM_ENTITY__ALLOWED_KEY_CARDS:
				return allowedKeyCards != null && !allowedKeyCards.isEmpty();
			case PersistencePackage.ROOM_ENTITY__DISABILITY_APPROVALS:
				return disabilityApprovals != null && !disabilityApprovals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (floor: ");
		result.append(floor);
		result.append(", roomNumber: ");
		result.append(roomNumber);
		result.append(", isOperational: ");
		result.append(isOperational);
		result.append(", isCleaned: ");
		result.append(isCleaned);
		result.append(", description: ");
		result.append(description);
		result.append(", photos: ");
		result.append(photos);
		result.append(')');
		return result.toString();
	}

} //RoomEntityImpl

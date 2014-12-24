/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tda593.hotel.california.facilities.DisabilityApproval;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomImpl#isOperational <em>Is Operational</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomImpl#isCleaned <em>Is Cleaned</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomImpl#getPhotos <em>Photos</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomImpl#getAllowedKeyCards <em>Allowed Key Cards</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomImpl#getDisabilityApprovals <em>Disability Approvals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
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
	protected static final String ROOM_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected String roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isOperational() <em>Is Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperational()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPERATIONAL_EDEFAULT = true;

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
	 * The cached value of the '{@link #getAllowedKeyCards() <em>Allowed Key Cards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedKeyCards()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyCard> allowedKeyCards;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType;

	/**
	 * The cached value of the '{@link #getDisabilityApprovals() <em>Disability Approvals</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabilityApprovals()
	 * @generated
	 * @ordered
	 */
	protected EList<DisabilityApproval> disabilityApprovals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}
	
	//Constructor for creating Room directly without using setters.
	public RoomImpl(String number, int floor, String description,
	RoomType roomType ) {
		this.roomNumber = number;
		this.floor = floor;
		this.description = description;
		this.roomType = roomType;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackage.Literals.ROOM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilitiesPackage.ROOM__FLOOR, oldFloor, floor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(String newRoomNumber) {
		String oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilitiesPackage.ROOM__ROOM_NUMBER, oldRoomNumber, roomNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilitiesPackage.ROOM__IS_OPERATIONAL, oldIsOperational, isOperational));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilitiesPackage.ROOM__IS_CLEANED, oldIsCleaned, isCleaned));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilitiesPackage.ROOM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPhotos() {
		if (photos == null) {
			photos = new EDataTypeUniqueEList<String>(String.class, this, FacilitiesPackage.ROOM__PHOTOS);
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyCard> getAllowedKeyCards() {
		if (allowedKeyCards == null) {
			allowedKeyCards = new EObjectResolvingEList<KeyCard>(KeyCard.class, this, FacilitiesPackage.ROOM__ALLOWED_KEY_CARDS);
		}
		return allowedKeyCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType() {
		if (roomType != null && roomType.eIsProxy()) {
			InternalEObject oldRoomType = (InternalEObject)roomType;
			roomType = (RoomType)eResolveProxy(oldRoomType);
			if (roomType != oldRoomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilitiesPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
			}
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(RoomType newRoomType) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilitiesPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisabilityApproval> getDisabilityApprovals() {
		if (disabilityApprovals == null) {
			disabilityApprovals = new EDataTypeUniqueEList<DisabilityApproval>(DisabilityApproval.class, this, FacilitiesPackage.ROOM__DISABILITY_APPROVALS);
		}
		return disabilityApprovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void registerKeyCard(KeyCard keyCard) {
		if(!allowedKeyCards.contains(keyCard)) {
			allowedKeyCards.add(keyCard);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unregisterKeyCard(KeyCard keyCard) {
		allowedKeyCards.remove(keyCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unregisterKeyCards() {
		allowedKeyCards.clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilitiesPackage.ROOM__FLOOR:
				return getFloor();
			case FacilitiesPackage.ROOM__ROOM_NUMBER:
				return getRoomNumber();
			case FacilitiesPackage.ROOM__IS_OPERATIONAL:
				return isOperational();
			case FacilitiesPackage.ROOM__IS_CLEANED:
				return isCleaned();
			case FacilitiesPackage.ROOM__DESCRIPTION:
				return getDescription();
			case FacilitiesPackage.ROOM__PHOTOS:
				return getPhotos();
			case FacilitiesPackage.ROOM__ALLOWED_KEY_CARDS:
				return getAllowedKeyCards();
			case FacilitiesPackage.ROOM__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
			case FacilitiesPackage.ROOM__DISABILITY_APPROVALS:
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
			case FacilitiesPackage.ROOM__FLOOR:
				setFloor((Integer)newValue);
				return;
			case FacilitiesPackage.ROOM__ROOM_NUMBER:
				setRoomNumber((String)newValue);
				return;
			case FacilitiesPackage.ROOM__IS_OPERATIONAL:
				setIsOperational((Boolean)newValue);
				return;
			case FacilitiesPackage.ROOM__IS_CLEANED:
				setIsCleaned((Boolean)newValue);
				return;
			case FacilitiesPackage.ROOM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FacilitiesPackage.ROOM__PHOTOS:
				getPhotos().clear();
				getPhotos().addAll((Collection<? extends String>)newValue);
				return;
			case FacilitiesPackage.ROOM__ALLOWED_KEY_CARDS:
				getAllowedKeyCards().clear();
				getAllowedKeyCards().addAll((Collection<? extends KeyCard>)newValue);
				return;
			case FacilitiesPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)newValue);
				return;
			case FacilitiesPackage.ROOM__DISABILITY_APPROVALS:
				getDisabilityApprovals().clear();
				getDisabilityApprovals().addAll((Collection<? extends DisabilityApproval>)newValue);
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
			case FacilitiesPackage.ROOM__FLOOR:
				setFloor(FLOOR_EDEFAULT);
				return;
			case FacilitiesPackage.ROOM__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case FacilitiesPackage.ROOM__IS_OPERATIONAL:
				setIsOperational(IS_OPERATIONAL_EDEFAULT);
				return;
			case FacilitiesPackage.ROOM__IS_CLEANED:
				setIsCleaned(IS_CLEANED_EDEFAULT);
				return;
			case FacilitiesPackage.ROOM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FacilitiesPackage.ROOM__PHOTOS:
				getPhotos().clear();
				return;
			case FacilitiesPackage.ROOM__ALLOWED_KEY_CARDS:
				getAllowedKeyCards().clear();
				return;
			case FacilitiesPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)null);
				return;
			case FacilitiesPackage.ROOM__DISABILITY_APPROVALS:
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
			case FacilitiesPackage.ROOM__FLOOR:
				return floor != FLOOR_EDEFAULT;
			case FacilitiesPackage.ROOM__ROOM_NUMBER:
				return ROOM_NUMBER_EDEFAULT == null ? roomNumber != null : !ROOM_NUMBER_EDEFAULT.equals(roomNumber);
			case FacilitiesPackage.ROOM__IS_OPERATIONAL:
				return isOperational != IS_OPERATIONAL_EDEFAULT;
			case FacilitiesPackage.ROOM__IS_CLEANED:
				return isCleaned != IS_CLEANED_EDEFAULT;
			case FacilitiesPackage.ROOM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FacilitiesPackage.ROOM__PHOTOS:
				return photos != null && !photos.isEmpty();
			case FacilitiesPackage.ROOM__ALLOWED_KEY_CARDS:
				return allowedKeyCards != null && !allowedKeyCards.isEmpty();
			case FacilitiesPackage.ROOM__ROOM_TYPE:
				return roomType != null;
			case FacilitiesPackage.ROOM__DISABILITY_APPROVALS:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FacilitiesPackage.ROOM___REGISTER_KEY_CARD__KEYCARD:
				registerKeyCard((KeyCard)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM___UNREGISTER_KEY_CARD__KEYCARD:
				unregisterKeyCard((KeyCard)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM___UNREGISTER_KEY_CARDS:
				unregisterKeyCards();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", disabilityApprovals: ");
		result.append(disabilityApprovals);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == null || other.getClass() != getClass()) {
			return false;
		}
		
		return ((RoomImpl) other).roomNumber == roomNumber;
	}

} //RoomImpl

/**
 */
package tda593.hotel.california.booking.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.RoomStay;
import tda593.hotel.california.booking.StayRequest;

import tda593.hotel.california.facilities.Room;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Stay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.impl.RoomStayImpl#isActive <em>Active</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.RoomStayImpl#getStayRequest <em>Stay Request</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.RoomStayImpl#getRegisteredPersons <em>Registered Persons</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.RoomStayImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.RoomStayImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomStayImpl extends MinimalEObjectImpl.Container implements RoomStay {
	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStayRequest() <em>Stay Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStayRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<StayRequest> stayRequest;

	/**
	 * The cached value of the '{@link #getRegisteredPersons() <em>Registered Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> registeredPersons;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomStayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingPackage.Literals.ROOM_STAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.ROOM_STAY__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StayRequest> getStayRequest() {
		if (stayRequest == null) {
			stayRequest = new EObjectResolvingEList<StayRequest>(StayRequest.class, this, BookingPackage.ROOM_STAY__STAY_REQUEST);
		}
		return stayRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getRegisteredPersons() {
		if (registeredPersons == null) {
			registeredPersons = new EObjectResolvingEList<Person>(Person.class, this, BookingPackage.ROOM_STAY__REGISTERED_PERSONS);
		}
		return registeredPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.ROOM_STAY__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.ROOM_STAY__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.ROOM_STAY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingPackage.ROOM_STAY__ACTIVE:
				return isActive();
			case BookingPackage.ROOM_STAY__STAY_REQUEST:
				return getStayRequest();
			case BookingPackage.ROOM_STAY__REGISTERED_PERSONS:
				return getRegisteredPersons();
			case BookingPackage.ROOM_STAY__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case BookingPackage.ROOM_STAY__ID:
				return getId();
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
			case BookingPackage.ROOM_STAY__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case BookingPackage.ROOM_STAY__STAY_REQUEST:
				getStayRequest().clear();
				getStayRequest().addAll((Collection<? extends StayRequest>)newValue);
				return;
			case BookingPackage.ROOM_STAY__REGISTERED_PERSONS:
				getRegisteredPersons().clear();
				getRegisteredPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case BookingPackage.ROOM_STAY__ROOM:
				setRoom((Room)newValue);
				return;
			case BookingPackage.ROOM_STAY__ID:
				setId((Integer)newValue);
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
			case BookingPackage.ROOM_STAY__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case BookingPackage.ROOM_STAY__STAY_REQUEST:
				getStayRequest().clear();
				return;
			case BookingPackage.ROOM_STAY__REGISTERED_PERSONS:
				getRegisteredPersons().clear();
				return;
			case BookingPackage.ROOM_STAY__ROOM:
				setRoom((Room)null);
				return;
			case BookingPackage.ROOM_STAY__ID:
				setId(ID_EDEFAULT);
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
			case BookingPackage.ROOM_STAY__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case BookingPackage.ROOM_STAY__STAY_REQUEST:
				return stayRequest != null && !stayRequest.isEmpty();
			case BookingPackage.ROOM_STAY__REGISTERED_PERSONS:
				return registeredPersons != null && !registeredPersons.isEmpty();
			case BookingPackage.ROOM_STAY__ROOM:
				return room != null;
			case BookingPackage.ROOM_STAY__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (active: ");
		result.append(active);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RoomStayImpl

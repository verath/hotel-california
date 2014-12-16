/**
 */
package tda593.hotel.california.booking.persistence.impl;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tda593.hotel.california.booking.persistence.PersistencePackage;
import tda593.hotel.california.booking.persistence.PersonEntity;
import tda593.hotel.california.booking.persistence.RoomStayEntity;
import tda593.hotel.california.booking.persistence.StayRequestEntity;
import tda593.hotel.california.facilities.persistence.RoomEntity;
import tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Stay Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl#isActive <em>Active</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl#getRoomEntity <em>Room Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl#getPersonEntity <em>Person Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl#getStayRequestEntity <em>Stay Request Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class RoomStayEntityImpl extends MinimalEObjectImpl.Container implements RoomStayEntity {
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
	 * The cached value of the '{@link #getRoomEntity() <em>Room Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomEntity()
	 * @generated
	 * @ordered
	 */
	@OneToOne (targetEntity = RoomEntityImpl.class)
	protected RoomEntity roomEntity;

	/**
	 * The cached value of the '{@link #getPersonEntity() <em>Person Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonEntity()
	 * @generated
	 * @ordered
	 */
	@OneToMany(targetEntity = PersonEntityImpl.class)
	protected EList<PersonEntity> personEntity;

	/**
	 * The cached value of the '{@link #getStayRequestEntity() <em>Stay Request Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStayRequestEntity()
	 * @generated
	 * @ordered
	 */
	@OneToMany(targetEntity = StayRequestEntityImpl.class)
	protected EList<StayRequestEntity> stayRequestEntity;

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
	@Id
	@GeneratedValue
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomStayEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ROOM_STAY_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_STAY_ENTITY__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomEntity getRoomEntity() {
		if (roomEntity != null && roomEntity.eIsProxy()) {
			InternalEObject oldRoomEntity = (InternalEObject)roomEntity;
			roomEntity = (RoomEntity)eResolveProxy(oldRoomEntity);
			if (roomEntity != oldRoomEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.ROOM_STAY_ENTITY__ROOM_ENTITY, oldRoomEntity, roomEntity));
			}
		}
		return roomEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomEntity basicGetRoomEntity() {
		return roomEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomEntity(RoomEntity newRoomEntity) {
		RoomEntity oldRoomEntity = roomEntity;
		roomEntity = newRoomEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_STAY_ENTITY__ROOM_ENTITY, oldRoomEntity, roomEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonEntity> getPersonEntity() {
		if (personEntity == null) {
			personEntity = new EObjectResolvingEList<PersonEntity>(PersonEntity.class, this, PersistencePackage.ROOM_STAY_ENTITY__PERSON_ENTITY);
		}
		return personEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StayRequestEntity> getStayRequestEntity() {
		if (stayRequestEntity == null) {
			stayRequestEntity = new EObjectResolvingEList<StayRequestEntity>(StayRequestEntity.class, this, PersistencePackage.ROOM_STAY_ENTITY__STAY_REQUEST_ENTITY);
		}
		return stayRequestEntity;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_STAY_ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.ROOM_STAY_ENTITY__ACTIVE:
				return isActive();
			case PersistencePackage.ROOM_STAY_ENTITY__ROOM_ENTITY:
				if (resolve) return getRoomEntity();
				return basicGetRoomEntity();
			case PersistencePackage.ROOM_STAY_ENTITY__PERSON_ENTITY:
				return getPersonEntity();
			case PersistencePackage.ROOM_STAY_ENTITY__STAY_REQUEST_ENTITY:
				return getStayRequestEntity();
			case PersistencePackage.ROOM_STAY_ENTITY__ID:
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
			case PersistencePackage.ROOM_STAY_ENTITY__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case PersistencePackage.ROOM_STAY_ENTITY__ROOM_ENTITY:
				setRoomEntity((RoomEntity)newValue);
				return;
			case PersistencePackage.ROOM_STAY_ENTITY__PERSON_ENTITY:
				getPersonEntity().clear();
				getPersonEntity().addAll((Collection<? extends PersonEntity>)newValue);
				return;
			case PersistencePackage.ROOM_STAY_ENTITY__STAY_REQUEST_ENTITY:
				getStayRequestEntity().clear();
				getStayRequestEntity().addAll((Collection<? extends StayRequestEntity>)newValue);
				return;
			case PersistencePackage.ROOM_STAY_ENTITY__ID:
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
			case PersistencePackage.ROOM_STAY_ENTITY__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case PersistencePackage.ROOM_STAY_ENTITY__ROOM_ENTITY:
				setRoomEntity((RoomEntity)null);
				return;
			case PersistencePackage.ROOM_STAY_ENTITY__PERSON_ENTITY:
				getPersonEntity().clear();
				return;
			case PersistencePackage.ROOM_STAY_ENTITY__STAY_REQUEST_ENTITY:
				getStayRequestEntity().clear();
				return;
			case PersistencePackage.ROOM_STAY_ENTITY__ID:
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
			case PersistencePackage.ROOM_STAY_ENTITY__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case PersistencePackage.ROOM_STAY_ENTITY__ROOM_ENTITY:
				return roomEntity != null;
			case PersistencePackage.ROOM_STAY_ENTITY__PERSON_ENTITY:
				return personEntity != null && !personEntity.isEmpty();
			case PersistencePackage.ROOM_STAY_ENTITY__STAY_REQUEST_ENTITY:
				return stayRequestEntity != null && !stayRequestEntity.isEmpty();
			case PersistencePackage.ROOM_STAY_ENTITY__ID:
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

} //RoomStayEntityImpl

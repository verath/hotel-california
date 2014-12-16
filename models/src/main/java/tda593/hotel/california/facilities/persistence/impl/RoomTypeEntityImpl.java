/**
 */
package tda593.hotel.california.facilities.persistence.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.facilities.persistence.PersistencePackage;
import tda593.hotel.california.facilities.persistence.RoomApprovalEntity;
import tda593.hotel.california.facilities.persistence.RoomTypeEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl#getRoomApprovals <em>Room Approvals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomTypeEntityImpl extends MinimalEObjectImpl.Container implements RoomTypeEntity {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomApprovals() <em>Room Approvals</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomApprovals()
	 * @generated
	 * @ordered
	 */
	protected RoomApprovalEntity roomApprovals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypeEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ROOM_TYPE_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_TYPE_ENTITY__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_TYPE_ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_TYPE_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomApprovalEntity getRoomApprovals() {
		if (roomApprovals != null && roomApprovals.eIsProxy()) {
			InternalEObject oldRoomApprovals = (InternalEObject)roomApprovals;
			roomApprovals = (RoomApprovalEntity)eResolveProxy(oldRoomApprovals);
			if (roomApprovals != oldRoomApprovals) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.ROOM_TYPE_ENTITY__ROOM_APPROVALS, oldRoomApprovals, roomApprovals));
			}
		}
		return roomApprovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomApprovalEntity basicGetRoomApprovals() {
		return roomApprovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomApprovals(RoomApprovalEntity newRoomApprovals) {
		RoomApprovalEntity oldRoomApprovals = roomApprovals;
		roomApprovals = newRoomApprovals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ROOM_TYPE_ENTITY__ROOM_APPROVALS, oldRoomApprovals, roomApprovals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.ROOM_TYPE_ENTITY__DESCRIPTION:
				return getDescription();
			case PersistencePackage.ROOM_TYPE_ENTITY__ID:
				return getId();
			case PersistencePackage.ROOM_TYPE_ENTITY__NAME:
				return getName();
			case PersistencePackage.ROOM_TYPE_ENTITY__ROOM_APPROVALS:
				if (resolve) return getRoomApprovals();
				return basicGetRoomApprovals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersistencePackage.ROOM_TYPE_ENTITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PersistencePackage.ROOM_TYPE_ENTITY__ID:
				setId((Integer)newValue);
				return;
			case PersistencePackage.ROOM_TYPE_ENTITY__NAME:
				setName((String)newValue);
				return;
			case PersistencePackage.ROOM_TYPE_ENTITY__ROOM_APPROVALS:
				setRoomApprovals((RoomApprovalEntity)newValue);
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
			case PersistencePackage.ROOM_TYPE_ENTITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PersistencePackage.ROOM_TYPE_ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case PersistencePackage.ROOM_TYPE_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PersistencePackage.ROOM_TYPE_ENTITY__ROOM_APPROVALS:
				setRoomApprovals((RoomApprovalEntity)null);
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
			case PersistencePackage.ROOM_TYPE_ENTITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PersistencePackage.ROOM_TYPE_ENTITY__ID:
				return id != ID_EDEFAULT;
			case PersistencePackage.ROOM_TYPE_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PersistencePackage.ROOM_TYPE_ENTITY__ROOM_APPROVALS:
				return roomApprovals != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoomTypeEntityImpl

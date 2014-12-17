/**
 */
package tda593.hotel.california.facilities.persistence.impl;

import javax.persistence.Entity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tda593.hotel.california.facilities.persistence.GuestRoomEntity;
import tda593.hotel.california.facilities.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest Room Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.GuestRoomEntityImpl#getNumberOfBeds <em>Number Of Beds</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.GuestRoomEntityImpl#getNumberOfExtrabeds <em>Number Of Extrabeds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class GuestRoomEntityImpl extends RoomEntityImpl implements GuestRoomEntity {
	/**
	 * The default value of the '{@link #getNumberOfBeds() <em>Number Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBeds()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_BEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfBeds() <em>Number Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBeds()
	 * @generated
	 * @ordered
	 */
	protected int numberOfBeds = NUMBER_OF_BEDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfExtrabeds() <em>Number Of Extrabeds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfExtrabeds()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_EXTRABEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfExtrabeds() <em>Number Of Extrabeds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfExtrabeds()
	 * @generated
	 * @ordered
	 */
	protected int numberOfExtrabeds = NUMBER_OF_EXTRABEDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestRoomEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.GUEST_ROOM_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfBeds(int newNumberOfBeds) {
		int oldNumberOfBeds = numberOfBeds;
		numberOfBeds = newNumberOfBeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.GUEST_ROOM_ENTITY__NUMBER_OF_BEDS, oldNumberOfBeds, numberOfBeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfExtrabeds() {
		return numberOfExtrabeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfExtrabeds(int newNumberOfExtrabeds) {
		int oldNumberOfExtrabeds = numberOfExtrabeds;
		numberOfExtrabeds = newNumberOfExtrabeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.GUEST_ROOM_ENTITY__NUMBER_OF_EXTRABEDS, oldNumberOfExtrabeds, numberOfExtrabeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.GUEST_ROOM_ENTITY__NUMBER_OF_BEDS:
				return getNumberOfBeds();
			case PersistencePackage.GUEST_ROOM_ENTITY__NUMBER_OF_EXTRABEDS:
				return getNumberOfExtrabeds();
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
			case PersistencePackage.GUEST_ROOM_ENTITY__NUMBER_OF_BEDS:
				setNumberOfBeds((Integer)newValue);
				return;
			case PersistencePackage.GUEST_ROOM_ENTITY__NUMBER_OF_EXTRABEDS:
				setNumberOfExtrabeds((Integer)newValue);
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
			case PersistencePackage.GUEST_ROOM_ENTITY__NUMBER_OF_BEDS:
				setNumberOfBeds(NUMBER_OF_BEDS_EDEFAULT);
				return;
			case PersistencePackage.GUEST_ROOM_ENTITY__NUMBER_OF_EXTRABEDS:
				setNumberOfExtrabeds(NUMBER_OF_EXTRABEDS_EDEFAULT);
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
			case PersistencePackage.GUEST_ROOM_ENTITY__NUMBER_OF_BEDS:
				return numberOfBeds != NUMBER_OF_BEDS_EDEFAULT;
			case PersistencePackage.GUEST_ROOM_ENTITY__NUMBER_OF_EXTRABEDS:
				return numberOfExtrabeds != NUMBER_OF_EXTRABEDS_EDEFAULT;
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
		result.append(" (numberOfBeds: ");
		result.append(numberOfBeds);
		result.append(", numberOfExtrabeds: ");
		result.append(numberOfExtrabeds);
		result.append(')');
		return result.toString();
	}

} //GuestRoomEntityImpl
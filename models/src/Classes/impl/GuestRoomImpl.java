/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.GuestRoom;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.GuestRoomImpl#getNumberOfBeds <em>Number Of Beds</em>}</li>
 *   <li>{@link Classes.impl.GuestRoomImpl#getNumberOfExtrabeds <em>Number Of Extrabeds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuestRoomImpl extends RoomImpl implements GuestRoom {
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
	protected GuestRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.GUEST_ROOM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.GUEST_ROOM__NUMBER_OF_BEDS, oldNumberOfBeds, numberOfBeds));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.GUEST_ROOM__NUMBER_OF_EXTRABEDS, oldNumberOfExtrabeds, numberOfExtrabeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.GUEST_ROOM__NUMBER_OF_BEDS:
				return getNumberOfBeds();
			case ClassesPackage.GUEST_ROOM__NUMBER_OF_EXTRABEDS:
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
			case ClassesPackage.GUEST_ROOM__NUMBER_OF_BEDS:
				setNumberOfBeds((Integer)newValue);
				return;
			case ClassesPackage.GUEST_ROOM__NUMBER_OF_EXTRABEDS:
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
			case ClassesPackage.GUEST_ROOM__NUMBER_OF_BEDS:
				setNumberOfBeds(NUMBER_OF_BEDS_EDEFAULT);
				return;
			case ClassesPackage.GUEST_ROOM__NUMBER_OF_EXTRABEDS:
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
			case ClassesPackage.GUEST_ROOM__NUMBER_OF_BEDS:
				return numberOfBeds != NUMBER_OF_BEDS_EDEFAULT;
			case ClassesPackage.GUEST_ROOM__NUMBER_OF_EXTRABEDS:
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

} //GuestRoomImpl

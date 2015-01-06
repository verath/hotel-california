/**
 */
package tda593.hotel.california.facilities.persistence.impl;

import javax.persistence.Entity;

import tda593.hotel.california.facilities.persistence.GuestRoomEntity;

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
	
	private int numberOfBeds = 0;

	private int numberOfExtrabeds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestRoomEntityImpl() {
		super();
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
		numberOfBeds = newNumberOfBeds;
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
		numberOfExtrabeds = newNumberOfExtrabeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfBeds: ");
		result.append(numberOfBeds);
		result.append(", numberOfExtrabeds: ");
		result.append(numberOfExtrabeds);
		result.append(')');
		return result.toString();
	}

} //GuestRoomEntityImpl

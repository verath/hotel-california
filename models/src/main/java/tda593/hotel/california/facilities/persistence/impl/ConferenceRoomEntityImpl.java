/**
 */
package tda593.hotel.california.facilities.persistence.impl;

import java.util.List;

import javax.persistence.Entity;

import tda593.hotel.california.facilities.persistence.ConferenceRoomEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference Room Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.ConferenceRoomEntityImpl#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.ConferenceRoomEntityImpl#getEquipment <em>Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class ConferenceRoomEntityImpl extends RoomEntityImpl implements ConferenceRoomEntity {
	
	private int numberOfSeats;
	private List<String> equipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoomEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSeats(int newNumberOfSeats) {
		numberOfSeats = newNumberOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getEquipment() {
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfSeats: ");
		result.append(numberOfSeats);
		result.append(", equipment: ");
		result.append(equipment);
		result.append(')');
		return result.toString();
	}

} //ConferenceRoomEntityImpl

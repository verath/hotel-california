/**
 */
package tda593.hotel.california.facilities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import tda593.hotel.california.facilities.ConferenceRoom;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.RoomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.impl.ConferenceRoomImpl#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.impl.ConferenceRoomImpl#getEquipment <em>Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConferenceRoomImpl extends RoomImpl implements ConferenceRoom {
	/**
	 * The default value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSeats = NUMBER_OF_SEATS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<String> equipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceRoomImpl() {
		super();
	}
	
	public ConferenceRoomImpl(String number, int floor, String description,
			RoomType roomType, int numberOfSeats, EList<String> equipment) {
		super(number, floor, description, roomType);
		this.numberOfSeats = numberOfSeats;
		this.equipment = equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackage.Literals.CONFERENCE_ROOM;
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
		int oldNumberOfSeats = numberOfSeats;
		numberOfSeats = newNumberOfSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilitiesPackage.CONFERENCE_ROOM__NUMBER_OF_SEATS, oldNumberOfSeats, numberOfSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEquipment() {
		if (equipment == null) {
			equipment = new EDataTypeUniqueEList<String>(String.class, this, FacilitiesPackage.CONFERENCE_ROOM__EQUIPMENT);
		}
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilitiesPackage.CONFERENCE_ROOM__NUMBER_OF_SEATS:
				return getNumberOfSeats();
			case FacilitiesPackage.CONFERENCE_ROOM__EQUIPMENT:
				return getEquipment();
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
			case FacilitiesPackage.CONFERENCE_ROOM__NUMBER_OF_SEATS:
				setNumberOfSeats((Integer)newValue);
				return;
			case FacilitiesPackage.CONFERENCE_ROOM__EQUIPMENT:
				getEquipment().clear();
				getEquipment().addAll((Collection<? extends String>)newValue);
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
			case FacilitiesPackage.CONFERENCE_ROOM__NUMBER_OF_SEATS:
				setNumberOfSeats(NUMBER_OF_SEATS_EDEFAULT);
				return;
			case FacilitiesPackage.CONFERENCE_ROOM__EQUIPMENT:
				getEquipment().clear();
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
			case FacilitiesPackage.CONFERENCE_ROOM__NUMBER_OF_SEATS:
				return numberOfSeats != NUMBER_OF_SEATS_EDEFAULT;
			case FacilitiesPackage.CONFERENCE_ROOM__EQUIPMENT:
				return equipment != null && !equipment.isEmpty();
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
		result.append(" (numberOfSeats: ");
		result.append(numberOfSeats);
		result.append(", equipment: ");
		result.append(equipment);
		result.append(')');
		return result.toString();
	}

} //ConferenceRoomImpl

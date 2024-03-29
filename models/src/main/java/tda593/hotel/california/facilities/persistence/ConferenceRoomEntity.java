/**
 */
package tda593.hotel.california.facilities.persistence;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference Room Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.persistence.ConferenceRoomEntity#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.ConferenceRoomEntity#getEquipment <em>Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getConferenceRoomEntity()
 * @model
 * @generated
 */
public interface ConferenceRoomEntity extends RoomEntity {
	/**
	 * Returns the value of the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Seats</em>' attribute.
	 * @see #setNumberOfSeats(int)
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getConferenceRoomEntity_NumberOfSeats()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfSeats();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.ConferenceRoomEntity#getNumberOfSeats <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Seats</em>' attribute.
	 * @see #getNumberOfSeats()
	 * @generated
	 */
	void setNumberOfSeats(int value);

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' attribute list.
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getConferenceRoomEntity_Equipment()
	 * @model ordered="false"
	 * @generated
	 */
	List<String> getEquipment();

} // ConferenceRoomEntity

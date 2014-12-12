/**
 */
package tda593.hotel.california.booking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tda593.hotel.california.facilities.Room;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Stay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.RoomStay#isActive <em>Active</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.RoomStay#getStayRequest <em>Stay Request</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.RoomStay#getRegisteredPersons <em>Registered Persons</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.RoomStay#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.booking.BookingPackage#getRoomStay()
 * @model
 * @generated
 */
public interface RoomStay extends EObject {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see tda593.hotel.california.booking.BookingPackage#getRoomStay_Active()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.booking.RoomStay#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Stay Request</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.booking.StayRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stay Request</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stay Request</em>' reference list.
	 * @see tda593.hotel.california.booking.BookingPackage#getRoomStay_StayRequest()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StayRequest> getStayRequest();

	/**
	 * Returns the value of the '<em><b>Registered Persons</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.booking.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Persons</em>' reference list.
	 * @see tda593.hotel.california.booking.BookingPackage#getRoomStay_RegisteredPersons()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Person> getRegisteredPersons();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see tda593.hotel.california.booking.BookingPackage#getRoomStay_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.booking.RoomStay#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // RoomStay

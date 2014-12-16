/**
 */
package tda593.hotel.california.booking.persistence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tda593.hotel.california.facilities.persistence.RoomEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Stay Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.persistence.RoomStayEntity#isActive <em>Active</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.RoomStayEntity#getRoomEntity <em>Room Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.RoomStayEntity#getPersonEntity <em>Person Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.RoomStayEntity#getStayRequestEntity <em>Stay Request Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.RoomStayEntity#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getRoomStayEntity()
 * @model
 * @generated
 */
public interface RoomStayEntity extends EObject {
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
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getRoomStayEntity_Active()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.booking.persistence.RoomStayEntity#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Room Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Entity</em>' reference.
	 * @see #setRoomEntity(RoomEntity)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getRoomStayEntity_RoomEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomEntity getRoomEntity();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.booking.persistence.RoomStayEntity#getRoomEntity <em>Room Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Entity</em>' reference.
	 * @see #getRoomEntity()
	 * @generated
	 */
	void setRoomEntity(RoomEntity value);

	/**
	 * Returns the value of the '<em><b>Person Entity</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.booking.persistence.PersonEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Entity</em>' reference list.
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getRoomStayEntity_PersonEntity()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PersonEntity> getPersonEntity();

	/**
	 * Returns the value of the '<em><b>Stay Request Entity</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.booking.persistence.StayRequestEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stay Request Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stay Request Entity</em>' reference list.
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getRoomStayEntity_StayRequestEntity()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StayRequestEntity> getStayRequestEntity();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getRoomStayEntity_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.booking.persistence.RoomStayEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // RoomStayEntity

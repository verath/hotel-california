/**
 */
package tda593.hotel.california.facilities.persistence;

import javax.persistence.Entity;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomEntity#getFloor <em>Floor</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomEntity#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomEntity#isOperational <em>Is Operational</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomEntity#isCleaned <em>Is Cleaned</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomEntity#getDescription <em>Description</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomEntity#getPhotos <em>Photos</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomEntity#getRoomTypeEntity <em>Room Type Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomEntity#getAllowedKeyCards <em>Allowed Key Cards</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomEntity#getDisabilityApprovals <em>Disability Approvals</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomEntity()
 * @model
 * @generated
 */
@Entity
public interface RoomEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor</em>' attribute.
	 * @see #setFloor(int)
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomEntity_Floor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getFloor();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.RoomEntity#getFloor <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' attribute.
	 * @see #getFloor()
	 * @generated
	 */
	void setFloor(int value);

	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(String)
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomEntity_RoomNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getRoomNumber();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.RoomEntity#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(String value);

	/**
	 * Returns the value of the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Operational</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Operational</em>' attribute.
	 * @see #setIsOperational(boolean)
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomEntity_IsOperational()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOperational();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.RoomEntity#isOperational <em>Is Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Operational</em>' attribute.
	 * @see #isOperational()
	 * @generated
	 */
	void setIsOperational(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cleaned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cleaned</em>' attribute.
	 * @see #setIsCleaned(boolean)
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomEntity_IsCleaned()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCleaned();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.RoomEntity#isCleaned <em>Is Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cleaned</em>' attribute.
	 * @see #isCleaned()
	 * @generated
	 */
	void setIsCleaned(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomEntity_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.RoomEntity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Photos</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photos</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photos</em>' attribute list.
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomEntity_Photos()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getPhotos();

	/**
	 * Returns the value of the '<em><b>Room Type Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type Entity</em>' reference.
	 * @see #setRoomTypeEntity(RoomTypeEntity)
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomEntity_RoomTypeEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomTypeEntity getRoomTypeEntity();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.RoomEntity#getRoomTypeEntity <em>Room Type Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type Entity</em>' reference.
	 * @see #getRoomTypeEntity()
	 * @generated
	 */
	void setRoomTypeEntity(RoomTypeEntity value);

	/**
	 * Returns the value of the '<em><b>Allowed Key Cards</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.facilities.persistence.KeyCardEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Key Cards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Key Cards</em>' reference list.
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomEntity_AllowedKeyCards()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KeyCardEntity> getAllowedKeyCards();

	/**
	 * Returns the value of the '<em><b>Disability Approvals</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.facilities.persistence.DisabilityApprovalEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disability Approvals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disability Approvals</em>' reference list.
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomEntity_DisabilityApprovals()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DisabilityApprovalEntity> getDisabilityApprovals();

} // RoomEntity

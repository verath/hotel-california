/**
 */
package tda593.hotel.california.facilities.persistence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getDescription <em>Description</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getName <em>Name</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getRoomApprovals <em>Room Approvals</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomTypeEntity()
 * @model
 * @generated
 */
public interface RoomTypeEntity extends EObject {
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
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomTypeEntity_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomTypeEntity_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomTypeEntity_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Room Approvals</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Approvals</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Approvals</em>' reference.
	 * @see #setRoomApprovals(RoomApprovalEntity)
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomTypeEntity_RoomApprovals()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomApprovalEntity getRoomApprovals();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.RoomTypeEntity#getRoomApprovals <em>Room Approvals</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Approvals</em>' reference.
	 * @see #getRoomApprovals()
	 * @generated
	 */
	void setRoomApprovals(RoomApprovalEntity value);

} // RoomTypeEntity

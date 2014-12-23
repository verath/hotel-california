/**
 */
package tda593.hotel.california.facilities.persistence;

import java.util.List;

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
public interface RoomTypeEntity {
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
	 * Returns the value of the '<em><b>Room Approvals</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.facilities.persistence.RoomApprovalEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Approvals</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Approvals</em>' reference list.
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getRoomTypeEntity_RoomApprovals()
	 * @model lower="2" upper="2" ordered="false"
	 * @generated
	 */
	List<RoomApprovalEntity> getRoomApprovals();
	
	double getPrice();
	
	void setPrice(double price);

} // RoomTypeEntity

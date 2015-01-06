/**
 */
package tda593.hotel.california.facilities.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Card Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.persistence.KeyCardEntity#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getKeyCardEntity()
 * @model
 * @generated
 */
public interface KeyCardEntity {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#getKeyCardEntity_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.persistence.KeyCardEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // KeyCardEntity

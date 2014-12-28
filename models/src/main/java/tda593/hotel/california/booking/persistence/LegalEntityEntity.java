/**
 */
package tda593.hotel.california.booking.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Entity Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getPhone <em>Phone</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getEmail <em>Email</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getCreditCardInformationEntity <em>Credit Card Information Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getLegalEntityEntity()
 * @model
 * @generated
 */
public interface LegalEntityEntity {
	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getLegalEntityEntity_Phone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getLegalEntityEntity_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

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
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getLegalEntityEntity_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // LegalEntityEntity

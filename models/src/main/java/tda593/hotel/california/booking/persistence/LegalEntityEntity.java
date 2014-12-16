/**
 */
package tda593.hotel.california.booking.persistence;

import org.eclipse.emf.ecore.EObject;

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
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getLegalEntityEntity()
 * @model
 * @generated
 */
public interface LegalEntityEntity extends EObject {
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
	 * Returns the value of the '<em><b>Credit Card Information Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card Information Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Information Entity</em>' reference.
	 * @see #setCreditCardInformationEntity(CreditCardInformationEntity)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getLegalEntityEntity_CreditCardInformationEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CreditCardInformationEntity getCreditCardInformationEntity();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.booking.persistence.LegalEntityEntity#getCreditCardInformationEntity <em>Credit Card Information Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Information Entity</em>' reference.
	 * @see #getCreditCardInformationEntity()
	 * @generated
	 */
	void setCreditCardInformationEntity(CreditCardInformationEntity value);

} // LegalEntityEntity

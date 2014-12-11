/**
 */
package tda593.hotel.california;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.LegalEntity#getPhone <em>Phone</em>}</li>
 *   <li>{@link tda593.hotel.california.LegalEntity#getEmail <em>Email</em>}</li>
 *   <li>{@link tda593.hotel.california.LegalEntity#getCreditCardInformation <em>Credit Card Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.CaliforniaPackage#getLegalEntity()
 * @model
 * @generated
 */
public interface LegalEntity extends EObject {
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
	 * @see tda593.hotel.california.CaliforniaPackage#getLegalEntity_Phone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.LegalEntity#getPhone <em>Phone</em>}' attribute.
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
	 * @see tda593.hotel.california.CaliforniaPackage#getLegalEntity_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.LegalEntity#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Information</em>' reference.
	 * @see #setCreditCardInformation(CreditCardInformation)
	 * @see tda593.hotel.california.CaliforniaPackage#getLegalEntity_CreditCardInformation()
	 * @model ordered="false"
	 * @generated
	 */
	CreditCardInformation getCreditCardInformation();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.LegalEntity#getCreditCardInformation <em>Credit Card Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Information</em>' reference.
	 * @see #getCreditCardInformation()
	 * @generated
	 */
	void setCreditCardInformation(CreditCardInformation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Operation1();

} // LegalEntity

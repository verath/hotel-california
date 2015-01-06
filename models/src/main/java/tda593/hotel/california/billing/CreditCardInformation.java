/**
 */
package tda593.hotel.california.billing;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

import tda593.hotel.california.booking.LegalEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Card Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.CreditCardInformation#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.CreditCardInformation#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.CreditCardInformation#getCcv <em>Ccv</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.CreditCardInformation#getFirstName <em>First Name</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.CreditCardInformation#getLastName <em>Last Name</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.CreditCardInformation#getLegalEntity <em>Legal Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.billing.BillingPackage#getCreditCardInformation()
 * @model
 * @generated
 */
public interface CreditCardInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Number</em>' attribute.
	 * @see #setCardNumber(String)
	 * @see tda593.hotel.california.billing.BillingPackage#getCreditCardInformation_CardNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCardNumber();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.CreditCardInformation#getCardNumber <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
	 */
	void setCardNumber(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(Date)
	 * @see tda593.hotel.california.billing.BillingPackage#getCreditCardInformation_ExpirationDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.CreditCardInformation#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ccv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ccv</em>' attribute.
	 * @see #setCcv(String)
	 * @see tda593.hotel.california.billing.BillingPackage#getCreditCardInformation_Ccv()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCcv();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.CreditCardInformation#getCcv <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ccv</em>' attribute.
	 * @see #getCcv()
	 * @generated
	 */
	void setCcv(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see tda593.hotel.california.billing.BillingPackage#getCreditCardInformation_FirstName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.CreditCardInformation#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see tda593.hotel.california.billing.BillingPackage#getCreditCardInformation_LastName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.CreditCardInformation#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Legal Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legal Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal Entity</em>' reference.
	 * @see #setLegalEntity(LegalEntity)
	 * @see tda593.hotel.california.billing.BillingPackage#getCreditCardInformation_LegalEntity()
	 * @model ordered="false"
	 * @generated
	 */
	LegalEntity getLegalEntity();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.CreditCardInformation#getLegalEntity <em>Legal Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Entity</em>' reference.
	 * @see #getLegalEntity()
	 * @generated
	 */
	void setLegalEntity(LegalEntity value);

} // CreditCardInformation

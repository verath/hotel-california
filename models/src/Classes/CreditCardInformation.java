/**
 */
package Classes;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Card Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.CreditCardInformation#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link Classes.CreditCardInformation#getCardHolder <em>Card Holder</em>}</li>
 *   <li>{@link Classes.CreditCardInformation#getExpirationDate <em>Expiration Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getCreditCardInformation()
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
	 * @see Classes.ClassesPackage#getCreditCardInformation_CardNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCardNumber();

	/**
	 * Sets the value of the '{@link Classes.CreditCardInformation#getCardNumber <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
	 */
	void setCardNumber(String value);

	/**
	 * Returns the value of the '<em><b>Card Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Holder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Holder</em>' attribute.
	 * @see #setCardHolder(String)
	 * @see Classes.ClassesPackage#getCreditCardInformation_CardHolder()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCardHolder();

	/**
	 * Sets the value of the '{@link Classes.CreditCardInformation#getCardHolder <em>Card Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Holder</em>' attribute.
	 * @see #getCardHolder()
	 * @generated
	 */
	void setCardHolder(String value);

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
	 * @see Classes.ClassesPackage#getCreditCardInformation_ExpirationDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link Classes.CreditCardInformation#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);

} // CreditCardInformation

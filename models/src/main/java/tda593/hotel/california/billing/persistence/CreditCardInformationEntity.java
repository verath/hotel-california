/**
 */
package tda593.hotel.california.billing.persistence;

import java.util.Date;

import tda593.hotel.california.booking.persistence.LegalEntityEntity;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Credit Card Information Entity</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link tda593.hotel.california.billing.persistence.CreditCardInformationEntity#getCardNumber
 * <em>Card Number</em>}</li>
 * <li>
 * {@link tda593.hotel.california.billing.persistence.CreditCardInformationEntity#getCardHolder
 * <em>Card Holder</em>}</li>
 * <li>
 * {@link tda593.hotel.california.billing.persistence.CreditCardInformationEntity#getExpirationDate
 * <em>Expiration Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getCreditCardInformationEntity()
 * @model
 * @generated
 */
public interface CreditCardInformationEntity {
	/**
	 * Returns the value of the '<em><b>Card Number</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Number</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Card Number</em>' attribute.
	 * @see #setCardNumber(String)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getCreditCardInformationEntity_CardNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCardNumber();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.billing.persistence.CreditCardInformationEntity#getCardNumber
	 * <em>Card Number</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
	 */
	void setCardNumber(String value);

	String getCcv();

	void setCcv(String value);

	/**
	 * Returns the value of the '<em><b>Card Holder</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Holder</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Card Holder</em>' attribute.
	 * @see #setFirstName(String)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getCreditCardInformationEntity_CardHolder()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.billing.persistence.CreditCardInformationEntity#getCardHolder
	 * <em>Card Holder</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Card Holder</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	String getLastName();

	void setLastName(String value);
	
	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(Date)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getCreditCardInformationEntity_ExpirationDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.billing.persistence.CreditCardInformationEntity#getExpirationDate
	 * <em>Expiration Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);
	
	LegalEntityEntity getOwner();
	
	void setOwner(LegalEntityEntity owner);

} // CreditCardInformationEntity

/**
 */
package tda593.hotel.california.billing;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

import tda593.hotel.california.booking.LegalEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Card Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.billing.BillingPackage#getCreditCardManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CreditCardManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" legalEntityRequired="true" legalEntityOrdered="false" firstnameRequired="true" firstnameOrdered="false" lastnameRequired="true" lastnameOrdered="false" cardNumberRequired="true" cardNumberOrdered="false" ccvRequired="true" ccvOrdered="false" expirationDateRequired="true" expirationDateOrdered="false" validatorRequired="true" validatorOrdered="false"
	 * @generated
	 */
	boolean setCreditCardInformation(LegalEntity legalEntity, String firstname, String lastname, String cardNumber, String ccv, Date expirationDate, BankingManager validator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" legalEntityRequired="true" legalEntityOrdered="false"
	 * @generated
	 */
	CreditCardInformation getCreditCardInformation(LegalEntity legalEntity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" legalEntityIdRequired="true" legalEntityIdOrdered="false"
	 * @generated
	 */
	CreditCardInformation getCreditCardInformation(int legalEntityId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" legalEntityRequired="true" legalEntityOrdered="false" bankingManagerRequired="true" bankingManagerOrdered="false"
	 * @generated
	 */
	boolean revalidateCreditCardInformation(LegalEntity legalEntity, BankingManager bankingManager);

} // CreditCardManager

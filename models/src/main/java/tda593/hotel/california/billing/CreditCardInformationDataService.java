/**
 */
package tda593.hotel.california.billing;

import tda593.hotel.california.DataService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Card Information Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.billing.BillingPackage#getCreditCardInformationDataService()
 * @model superTypes="tda593.hotel.california.DataService<tda593.hotel.california.billing.CreditCardInformation, org.eclipse.emf.ecore.EString>"
 * @generated
 */
public interface CreditCardInformationDataService extends DataService<CreditCardInformation, String> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" legalEntityIdRequired="true" legalEntityIdOrdered="false"
	 * @generated
	 */
	CreditCardInformation getByLegalEntity(int legalEntityId);

} // CreditCardInformationDataService

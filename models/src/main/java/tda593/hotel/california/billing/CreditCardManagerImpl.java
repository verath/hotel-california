/**
 */
package tda593.hotel.california.billing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Card Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.CreditCardManagerImpl#getCreditCardInformationDataService <em>Credit Card Information Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.billing.BillingPackage#getCreditCardManagerImpl()
 * @model
 * @generated
 */
public interface CreditCardManagerImpl extends CreditCardManager {
	/**
	 * Returns the value of the '<em><b>Credit Card Information Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card Information Data Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Information Data Service</em>' reference.
	 * @see #setCreditCardInformationDataService(CreditCardInformationDataService)
	 * @see tda593.hotel.california.billing.BillingPackage#getCreditCardManagerImpl_CreditCardInformationDataService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CreditCardInformationDataService getCreditCardInformationDataService();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.CreditCardManagerImpl#getCreditCardInformationDataService <em>Credit Card Information Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Information Data Service</em>' reference.
	 * @see #getCreditCardInformationDataService()
	 * @generated
	 */
	void setCreditCardInformationDataService(CreditCardInformationDataService value);

} // CreditCardManagerImpl

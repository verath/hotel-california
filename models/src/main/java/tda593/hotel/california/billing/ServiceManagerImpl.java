/**
 */
package tda593.hotel.california.billing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.ServiceManagerImpl#getServiceDataService <em>Service Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.billing.BillingPackage#getServiceManagerImpl()
 * @model
 * @generated
 */
public interface ServiceManagerImpl extends ServiceManager {
	/**
	 * Returns the value of the '<em><b>Service Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Data Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Data Service</em>' reference.
	 * @see #setServiceDataService(ServiceDataService)
	 * @see tda593.hotel.california.billing.BillingPackage#getServiceManagerImpl_ServiceDataService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceDataService getServiceDataService();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.ServiceManagerImpl#getServiceDataService <em>Service Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Data Service</em>' reference.
	 * @see #getServiceDataService()
	 * @generated
	 */
	void setServiceDataService(ServiceDataService value);

} // ServiceManagerImpl

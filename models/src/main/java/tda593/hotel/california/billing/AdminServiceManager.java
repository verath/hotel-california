/**
 */
package tda593.hotel.california.billing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Service Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.billing.BillingPackage#getAdminServiceManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdminServiceManager extends ServiceManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	Service createService(String name, double price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceRequired="true" serviceOrdered="false"
	 * @generated
	 */
	void removeService(Service service);

} // AdminServiceManager

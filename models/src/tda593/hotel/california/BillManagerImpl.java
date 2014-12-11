/**
 */
package tda593.hotel.california;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.BillManagerImpl#getBillDataService <em>Bill Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.CaliforniaPackage#getBillManagerImpl()
 * @model
 * @generated
 */
public interface BillManagerImpl extends BillManager {
	/**
	 * Returns the value of the '<em><b>Bill Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Data Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Data Service</em>' reference.
	 * @see #setBillDataService(BillDataService)
	 * @see tda593.hotel.california.CaliforniaPackage#getBillManagerImpl_BillDataService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BillDataService getBillDataService();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.BillManagerImpl#getBillDataService <em>Bill Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Data Service</em>' reference.
	 * @see #getBillDataService()
	 * @generated
	 */
	void setBillDataService(BillDataService value);

} // BillManagerImpl

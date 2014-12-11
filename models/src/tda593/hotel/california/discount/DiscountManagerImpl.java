/**
 */
package tda593.hotel.california.discount;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.discount.DiscountManagerImpl#getDiscountDataService <em>Discount Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.discount.DiscountPackage#getDiscountManagerImpl()
 * @model
 * @generated
 */
public interface DiscountManagerImpl extends DiscountManager {
	/**
	 * Returns the value of the '<em><b>Discount Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount Data Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Data Service</em>' reference.
	 * @see #setDiscountDataService(DiscountDataService)
	 * @see tda593.hotel.california.discount.DiscountPackage#getDiscountManagerImpl_DiscountDataService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DiscountDataService getDiscountDataService();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.discount.DiscountManagerImpl#getDiscountDataService <em>Discount Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount Data Service</em>' reference.
	 * @see #getDiscountDataService()
	 * @generated
	 */
	void setDiscountDataService(DiscountDataService value);

} // DiscountManagerImpl

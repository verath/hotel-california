/**
 */
package tda593.hotel.california.billing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Percentage Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.PercentageDiscount#getPercentage <em>Percentage</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.billing.BillingPackage#getPercentageDiscount()
 * @model
 * @generated
 */
public interface PercentageDiscount extends Discount {
	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(float)
	 * @see tda593.hotel.california.billing.BillingPackage#getPercentageDiscount_Percentage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	float getPercentage();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.PercentageDiscount#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(float value);

} // PercentageDiscount

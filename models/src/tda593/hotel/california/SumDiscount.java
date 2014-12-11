/**
 */
package tda593.hotel.california;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.SumDiscount#getDiscountSum <em>Discount Sum</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.CaliforniaPackage#getSumDiscount()
 * @model
 * @generated
 */
public interface SumDiscount extends Discount {
	/**
	 * Returns the value of the '<em><b>Discount Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount Sum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Sum</em>' attribute.
	 * @see #setDiscountSum(double)
	 * @see tda593.hotel.california.CaliforniaPackage#getSumDiscount_DiscountSum()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getDiscountSum();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.SumDiscount#getDiscountSum <em>Discount Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount Sum</em>' attribute.
	 * @see #getDiscountSum()
	 * @generated
	 */
	void setDiscountSum(double value);

} // SumDiscount

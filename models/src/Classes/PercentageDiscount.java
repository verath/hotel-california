/**
 */
package Classes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Percentage Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.PercentageDiscount#getPercentage <em>Percentage</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getPercentageDiscount()
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
	 * @see Classes.ClassesPackage#getPercentageDiscount_Percentage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	float getPercentage();

	/**
	 * Sets the value of the '{@link Classes.PercentageDiscount#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(float value);

} // PercentageDiscount

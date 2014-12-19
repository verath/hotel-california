/**
 */
package tda593.hotel.california.billing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.Discount#getCode <em>Code</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.Discount#getName <em>Name</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.Discount#getDiscountLimit <em>Discount Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.billing.BillingPackage#getDiscount()
 * @model abstract="true"
 * @generated
 */
public interface Discount extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see tda593.hotel.california.billing.BillingPackage#getDiscount_Code()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.Discount#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tda593.hotel.california.billing.BillingPackage#getDiscount_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.Discount#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Discount Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount Limit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Limit</em>' reference.
	 * @see #setDiscountLimit(DiscountLimit)
	 * @see tda593.hotel.california.billing.BillingPackage#getDiscount_DiscountLimit()
	 * @model ordered="false"
	 * @generated
	 */
	DiscountLimit getDiscountLimit();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.Discount#getDiscountLimit <em>Discount Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount Limit</em>' reference.
	 * @see #getDiscountLimit()
	 * @generated
	 */
	void setDiscountLimit(DiscountLimit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	double getPriceWithDiscount(double price);

} // Discount

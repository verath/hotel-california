/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Discount#getCode <em>Code</em>}</li>
 *   <li>{@link Classes.Discount#getName <em>Name</em>}</li>
 *   <li>{@link Classes.Discount#getDiscountLimit <em>Discount Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getDiscount()
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
	 * @see Classes.ClassesPackage#getDiscount_Code()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link Classes.Discount#getCode <em>Code</em>}' attribute.
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
	 * @see Classes.ClassesPackage#getDiscount_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Classes.Discount#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Discount Limit</b></em>' reference list.
	 * The list contents are of type {@link Classes.DiscountLimit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount Limit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Limit</em>' reference list.
	 * @see Classes.ClassesPackage#getDiscount_DiscountLimit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiscountLimit> getDiscountLimit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void getPriceWithDiscount(double price);

} // Discount

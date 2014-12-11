/**
 */
package tda593.hotel.california;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discount Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.CaliforniaPackage#getDiscountManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DiscountManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" codeRequired="true" codeOrdered="false"
	 * @generated
	 */
	Discount getDiscount(int code);

} // DiscountManager

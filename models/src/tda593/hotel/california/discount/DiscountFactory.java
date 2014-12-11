/**
 */
package tda593.hotel.california.discount;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.discount.DiscountPackage
 * @generated
 */
public interface DiscountFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiscountFactory eINSTANCE = tda593.hotel.california.discount.impl.DiscountFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sum Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sum Discount</em>'.
	 * @generated
	 */
	SumDiscount createSumDiscount();

	/**
	 * Returns a new object of class '<em>Percentage Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Percentage Discount</em>'.
	 * @generated
	 */
	PercentageDiscount createPercentageDiscount();

	/**
	 * Returns a new object of class '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limit</em>'.
	 * @generated
	 */
	DiscountLimit createDiscountLimit();

	/**
	 * Returns a new object of class '<em>Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Service</em>'.
	 * @generated
	 */
	DiscountDataService createDiscountDataService();

	/**
	 * Returns a new object of class '<em>Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager Impl</em>'.
	 * @generated
	 */
	DiscountManagerImpl createDiscountManagerImpl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiscountPackage getDiscountPackage();

} //DiscountFactory

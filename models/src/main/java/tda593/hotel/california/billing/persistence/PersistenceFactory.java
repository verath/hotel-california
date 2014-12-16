/**
 */
package tda593.hotel.california.billing.persistence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.billing.persistence.PersistencePackage
 * @generated
 */
public interface PersistenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistenceFactory eINSTANCE = tda593.hotel.california.billing.persistence.impl.PersistenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Discount Limit Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discount Limit Entity</em>'.
	 * @generated
	 */
	DiscountLimitEntity createDiscountLimitEntity();

	/**
	 * Returns a new object of class '<em>Percentage Discount Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Percentage Discount Entity</em>'.
	 * @generated
	 */
	PercentageDiscountEntity createPercentageDiscountEntity();

	/**
	 * Returns a new object of class '<em>Sum Discount Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sum Discount Entity</em>'.
	 * @generated
	 */
	SumDiscountEntity createSumDiscountEntity();

	/**
	 * Returns a new object of class '<em>Purchase Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purchase Entity</em>'.
	 * @generated
	 */
	PurchaseEntity createPurchaseEntity();

	/**
	 * Returns a new object of class '<em>Service Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Entity</em>'.
	 * @generated
	 */
	ServiceEntity createServiceEntity();

	/**
	 * Returns a new object of class '<em>Bill Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bill Entity</em>'.
	 * @generated
	 */
	BillEntity createBillEntity();

	/**
	 * Returns a new object of class '<em>Booking Bill Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Bill Entity</em>'.
	 * @generated
	 */
	BookingBillEntity createBookingBillEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersistencePackage getPersistencePackage();

} //PersistenceFactory

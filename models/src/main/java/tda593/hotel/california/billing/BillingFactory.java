/**
 */
package tda593.hotel.california.billing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.billing.BillingPackage
 * @generated
 */
public interface BillingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BillingFactory eINSTANCE = tda593.hotel.california.billing.impl.BillingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Discount Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discount Limit</em>'.
	 * @generated
	 */
	DiscountLimit createDiscountLimit();

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
	 * Returns a new object of class '<em>Discount Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discount Data Service</em>'.
	 * @generated
	 */
	DiscountDataService createDiscountDataService();

	/**
	 * Returns a new object of class '<em>Discount Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discount Manager Impl</em>'.
	 * @generated
	 */
	DiscountManagerImpl createDiscountManagerImpl();

	/**
	 * Returns a new object of class '<em>Bill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bill</em>'.
	 * @generated
	 */
	Bill createBill();

	/**
	 * Returns a new object of class '<em>Purchase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purchase</em>'.
	 * @generated
	 */
	Purchase createPurchase();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Booking Bill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Bill</em>'.
	 * @generated
	 */
	BookingBill createBookingBill();

	/**
	 * Returns a new object of class '<em>Bill Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bill Manager Impl</em>'.
	 * @generated
	 */
	BillManagerImpl createBillManagerImpl();

	/**
	 * Returns a new object of class '<em>Bill Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bill Data Service</em>'.
	 * @generated
	 */
	BillDataService createBillDataService();

	/**
	 * Returns a new object of class '<em>Banking Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Banking Manager Impl</em>'.
	 * @generated
	 */
	BankingManagerImpl createBankingManagerImpl();

	/**
	 * Returns a new object of class '<em>Credit Card Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credit Card Information</em>'.
	 * @generated
	 */
	CreditCardInformation createCreditCardInformation();

	/**
	 * Returns a new object of class '<em>Credit Card Information Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credit Card Information Data Service</em>'.
	 * @generated
	 */
	CreditCardInformationDataService createCreditCardInformationDataService();

	/**
	 * Returns a new object of class '<em>Credit Card Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credit Card Manager Impl</em>'.
	 * @generated
	 */
	CreditCardManagerImpl createCreditCardManagerImpl();

	/**
	 * Returns a new object of class '<em>Service Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Manager Impl</em>'.
	 * @generated
	 */
	ServiceManagerImpl createServiceManagerImpl();

	/**
	 * Returns a new object of class '<em>Service Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Data Service</em>'.
	 * @generated
	 */
	ServiceDataService createServiceDataService();

	/**
	 * Returns a new object of class '<em>Admin Service Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin Service Manager Impl</em>'.
	 * @generated
	 */
	AdminServiceManagerImpl createAdminServiceManagerImpl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BillingPackage getBillingPackage();

} //BillingFactory

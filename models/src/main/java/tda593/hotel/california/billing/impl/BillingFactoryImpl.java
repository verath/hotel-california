/**
 */
package tda593.hotel.california.billing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillManagerImpl;
import tda593.hotel.california.billing.BillingFactory;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.BookingBill;
import tda593.hotel.california.billing.DiscountDataService;
import tda593.hotel.california.billing.DiscountLimit;
import tda593.hotel.california.billing.DiscountManagerImpl;
import tda593.hotel.california.billing.PercentageDiscount;
import tda593.hotel.california.billing.Purchase;
import tda593.hotel.california.billing.Service;
import tda593.hotel.california.billing.SumDiscount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BillingFactoryImpl extends EFactoryImpl implements BillingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BillingFactory init() {
		try {
			BillingFactory theBillingFactory = (BillingFactory)EPackage.Registry.INSTANCE.getEFactory(BillingPackage.eNS_URI);
			if (theBillingFactory != null) {
				return theBillingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BillingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BillingPackage.DISCOUNT_LIMIT: return createDiscountLimit();
			case BillingPackage.SUM_DISCOUNT: return createSumDiscount();
			case BillingPackage.PERCENTAGE_DISCOUNT: return createPercentageDiscount();
			case BillingPackage.DISCOUNT_DATA_SERVICE: return createDiscountDataService();
			case BillingPackage.DISCOUNT_MANAGER_IMPL: return createDiscountManagerImpl();
			case BillingPackage.BILL: return createBill();
			case BillingPackage.PURCHASE: return createPurchase();
			case BillingPackage.SERVICE: return createService();
			case BillingPackage.BOOKING_BILL: return createBookingBill();
			case BillingPackage.BILL_MANAGER_IMPL: return createBillManagerImpl();
			case BillingPackage.BILL_DATA_SERVICE: return createBillDataService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountLimit createDiscountLimit() {
		DiscountLimitImpl discountLimit = new DiscountLimitImpl();
		return discountLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SumDiscount createSumDiscount() {
		SumDiscountImpl sumDiscount = new SumDiscountImpl();
		return sumDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageDiscount createPercentageDiscount() {
		PercentageDiscountImpl percentageDiscount = new PercentageDiscountImpl();
		return percentageDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountDataService createDiscountDataService() {
		DiscountDataServiceImpl discountDataService = new DiscountDataServiceImpl();
		return discountDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountManagerImpl createDiscountManagerImpl() {
		DiscountManagerImplImpl discountManagerImpl = new DiscountManagerImplImpl();
		return discountManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purchase createPurchase() {
		PurchaseImpl purchase = new PurchaseImpl();
		return purchase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingBill createBookingBill() {
		BookingBillImpl bookingBill = new BookingBillImpl();
		return bookingBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillManagerImpl createBillManagerImpl() {
		BillManagerImplImpl billManagerImpl = new BillManagerImplImpl();
		return billManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillDataService createBillDataService() {
		BillDataServiceImpl billDataService = new BillDataServiceImpl();
		return billDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingPackage getBillingPackage() {
		return (BillingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BillingPackage getPackage() {
		return BillingPackage.eINSTANCE;
	}

} //BillingFactoryImpl

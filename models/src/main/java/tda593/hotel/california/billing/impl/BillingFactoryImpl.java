/**
 */
package tda593.hotel.california.billing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tda593.hotel.california.billing.AdminServiceManagerImpl;
import tda593.hotel.california.billing.BankingManagerImpl;
import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillManagerImpl;
import tda593.hotel.california.billing.BillingFactory;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.BookingBill;
import tda593.hotel.california.billing.CreditCardInformation;
import tda593.hotel.california.billing.CreditCardInformationDataService;
import tda593.hotel.california.billing.CreditCardManagerImpl;
import tda593.hotel.california.billing.DiscountDataService;
import tda593.hotel.california.billing.DiscountLimit;
import tda593.hotel.california.billing.DiscountManagerImpl;
import tda593.hotel.california.billing.PercentageDiscount;
import tda593.hotel.california.billing.Purchase;
import tda593.hotel.california.billing.Service;
import tda593.hotel.california.billing.ServiceDataService;
import tda593.hotel.california.billing.ServiceManagerImpl;
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
			case BillingPackage.CREDIT_CARD_INFORMATION: return createCreditCardInformation();
			case BillingPackage.BILL_MANAGER_IMPL: return createBillManagerImpl();
			case BillingPackage.BILL_DATA_SERVICE: return createBillDataService();
			case BillingPackage.BANKING_MANAGER_IMPL: return createBankingManagerImpl();
			case BillingPackage.CREDIT_CARD_INFORMATION_DATA_SERVICE: return createCreditCardInformationDataService();
			case BillingPackage.CREDIT_CARD_MANAGER_IMPL: return createCreditCardManagerImpl();
			case BillingPackage.SERVICE_MANAGER_IMPL: return createServiceManagerImpl();
			case BillingPackage.SERVICE_DATA_SERVICE: return createServiceDataService();
			case BillingPackage.ADMIN_SERVICE_MANAGER_IMPL: return createAdminServiceManagerImpl();
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
	public BankingManagerImpl createBankingManagerImpl() {
		BankingManagerImplImpl bankingManagerImpl = new BankingManagerImplImpl();
		return bankingManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformation createCreditCardInformation() {
		CreditCardInformationImpl creditCardInformation = new CreditCardInformationImpl();
		return creditCardInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformationDataService createCreditCardInformationDataService() {
		CreditCardInformationDataServiceImpl creditCardInformationDataService = new CreditCardInformationDataServiceImpl();
		return creditCardInformationDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardManagerImpl createCreditCardManagerImpl() {
		CreditCardManagerImplImpl creditCardManagerImpl = new CreditCardManagerImplImpl();
		return creditCardManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceManagerImpl createServiceManagerImpl() {
		ServiceManagerImplImpl serviceManagerImpl = new ServiceManagerImplImpl();
		return serviceManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDataService createServiceDataService() {
		ServiceDataServiceImpl serviceDataService = new ServiceDataServiceImpl();
		return serviceDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminServiceManagerImpl createAdminServiceManagerImpl() {
		AdminServiceManagerImplImpl adminServiceManagerImpl = new AdminServiceManagerImplImpl();
		return adminServiceManagerImpl;
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

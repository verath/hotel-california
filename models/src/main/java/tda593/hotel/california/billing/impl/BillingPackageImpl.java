/**
 */
package tda593.hotel.california.billing.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import tda593.hotel.california.CaliforniaPackage;
import tda593.hotel.california.billing.AdminServiceManager;
import tda593.hotel.california.billing.AdminServiceManagerImpl;
import tda593.hotel.california.billing.BankingManager;
import tda593.hotel.california.billing.BankingManagerImpl;
import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.BillManagerImpl;
import tda593.hotel.california.billing.BillingFactory;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.BookingBill;
import tda593.hotel.california.billing.CreditCardInformation;
import tda593.hotel.california.billing.CreditCardInformationDataService;
import tda593.hotel.california.billing.CreditCardManager;
import tda593.hotel.california.billing.CreditCardManagerImpl;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.DiscountDataService;
import tda593.hotel.california.billing.DiscountLimit;
import tda593.hotel.california.billing.DiscountManager;
import tda593.hotel.california.billing.DiscountManagerImpl;
import tda593.hotel.california.billing.PercentageDiscount;
import tda593.hotel.california.billing.Purchase;
import tda593.hotel.california.billing.Service;
import tda593.hotel.california.billing.ServiceDataService;
import tda593.hotel.california.billing.ServiceManager;
import tda593.hotel.california.billing.ServiceManagerImpl;
import tda593.hotel.california.billing.SumDiscount;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.impl.BookingPackageImpl;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.impl.FacilitiesPackageImpl;
import tda593.hotel.california.impl.CaliforniaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BillingPackageImpl extends EPackageImpl implements BillingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discountManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discountLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sumDiscountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentageDiscountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discountDataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discountManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purchaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingBillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billDataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankingManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankingManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditCardInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditCardInformationDataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditCardManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditCardManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminServiceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminServiceManagerImplEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tda593.hotel.california.billing.BillingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BillingPackageImpl() {
		super(eNS_URI, BillingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BillingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BillingPackage init() {
		if (isInited) return (BillingPackage)EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI);

		// Obtain or create and register package
		BillingPackageImpl theBillingPackage = (BillingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BillingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BillingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CaliforniaPackageImpl theCaliforniaPackage = (CaliforniaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI) instanceof CaliforniaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI) : CaliforniaPackage.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) : FacilitiesPackage.eINSTANCE);
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);

		// Create package meta-data objects
		theBillingPackage.createPackageContents();
		theCaliforniaPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theBookingPackage.createPackageContents();

		// Initialize created meta-data
		theBillingPackage.initializePackageContents();
		theCaliforniaPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theBookingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBillingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BillingPackage.eNS_URI, theBillingPackage);
		return theBillingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscountManager() {
		return discountManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiscountManager__GetDiscount__String() {
		return discountManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscount() {
		return discountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscount_Code() {
		return (EAttribute)discountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscount_Name() {
		return (EAttribute)discountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscount_DiscountLimit() {
		return (EReference)discountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiscount__GetPriceWithDiscount__double() {
		return discountEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscountLimit() {
		return discountLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscountLimit_Id() {
		return (EAttribute)discountLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscountLimit_StartDate() {
		return (EAttribute)discountLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscountLimit_EndDate() {
		return (EAttribute)discountLimitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscountLimit_AllowedUsers() {
		return (EReference)discountLimitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscountLimit_TimesLeftToUse() {
		return (EAttribute)discountLimitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSumDiscount() {
		return sumDiscountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSumDiscount_DiscountSum() {
		return (EAttribute)sumDiscountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPercentageDiscount() {
		return percentageDiscountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageDiscount_Percentage() {
		return (EAttribute)percentageDiscountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscountDataService() {
		return discountDataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscountManagerImpl() {
		return discountManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscountManagerImpl_DiscountDataService() {
		return (EReference)discountManagerImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBill() {
		return billEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_Id() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_Date() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_IsPublished() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_Customer() {
		return (EReference)billEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_SubBills() {
		return (EReference)billEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_IsPaid() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_Purchase() {
		return (EReference)billEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_UsedDiscounts() {
		return (EReference)billEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__ApplyDiscount__Discount() {
		return billEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__AddSubBill__Bill() {
		return billEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__RegisterPurchase__Purchase() {
		return billEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__PublishBill() {
		return billEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__UnregisterPurchase__Purchase() {
		return billEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__RemoveSubBill__Bill() {
		return billEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__UnPublishBill() {
		return billEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__GetPrice() {
		return billEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__RemoveDiscount__Discount() {
		return billEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurchase() {
		return purchaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchase_Id() {
		return (EAttribute)purchaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchase_Quantity() {
		return (EAttribute)purchaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchase_Price() {
		return (EAttribute)purchaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPurchase_Service() {
		return (EReference)purchaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Id() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Price() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingBill() {
		return bookingBillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingBill_Booking() {
		return (EReference)bookingBillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillManager() {
		return billManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__GetBill__int() {
		return billManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__GetBookingBill__Booking() {
		return billManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__BillItem__Bill_int_int() {
		return billManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__AddSubBill__Bill_Bill() {
		return billManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__ApplyDiscount__Discount_Bill() {
		return billManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__PublishBill__Bill() {
		return billManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__MarkBillAsPaid__Bill_boolean_BankingManager_CreditCardManager() {
		return billManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__CreateBill__LegalEntity() {
		return billManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__CreateBookingBill__LegalEntity_Booking() {
		return billManagerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillManagerImpl() {
		return billManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillManagerImpl_BillDataService() {
		return (EReference)billManagerImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillManagerImpl_BookingManager() {
		return (EReference)billManagerImplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillDataService() {
		return billDataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillDataService__GetAllServices() {
		return billDataServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillDataService__GetBookingBill__Booking() {
		return billDataServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillDataService__GetService__int() {
		return billDataServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBankingManager() {
		return bankingManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBankingManager__MakePayment__String_String_int_int_String_String_double() {
		return bankingManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBankingManager__IsCreditCardValid__String_String_int_int_String_String() {
		return bankingManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBankingManagerImpl() {
		return bankingManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreditCardInformation() {
		return creditCardInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCardInformation_CardNumber() {
		return (EAttribute)creditCardInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCardInformation_ExpirationDate() {
		return (EAttribute)creditCardInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCardInformation_Ccv() {
		return (EAttribute)creditCardInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCardInformation_FirstName() {
		return (EAttribute)creditCardInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCardInformation_LastName() {
		return (EAttribute)creditCardInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreditCardInformation_LegalEntity() {
		return (EReference)creditCardInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreditCardInformationDataService() {
		return creditCardInformationDataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreditCardInformationDataService__GetByLegalEntity__int() {
		return creditCardInformationDataServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreditCardManager() {
		return creditCardManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreditCardManager__SetCreditCardInformation__LegalEntity_String_String_String_String_Date_BankingManager() {
		return creditCardManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreditCardManager__GetCreditCardInformation__LegalEntity() {
		return creditCardManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreditCardManager__GetCreditCardInformation__int() {
		return creditCardManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreditCardManager__RevalidateCreditCardInformation__LegalEntity_BankingManager() {
		return creditCardManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreditCardManagerImpl() {
		return creditCardManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreditCardManagerImpl_CreditCardInformationDataService() {
		return (EReference)creditCardManagerImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceManagerImpl() {
		return serviceManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceManagerImpl_ServiceDataService() {
		return (EReference)serviceManagerImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceManager() {
		return serviceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceManager__GetAllServices() {
		return serviceManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceManager__GetService__int() {
		return serviceManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDataService() {
		return serviceDataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminServiceManager() {
		return adminServiceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminServiceManager__CreateService__String_double() {
		return adminServiceManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminServiceManager__RemoveService__Service() {
		return adminServiceManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminServiceManagerImpl() {
		return adminServiceManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingFactory getBillingFactory() {
		return (BillingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		discountManagerEClass = createEClass(DISCOUNT_MANAGER);
		createEOperation(discountManagerEClass, DISCOUNT_MANAGER___GET_DISCOUNT__STRING);

		discountEClass = createEClass(DISCOUNT);
		createEAttribute(discountEClass, DISCOUNT__CODE);
		createEAttribute(discountEClass, DISCOUNT__NAME);
		createEReference(discountEClass, DISCOUNT__DISCOUNT_LIMIT);
		createEOperation(discountEClass, DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE);

		discountLimitEClass = createEClass(DISCOUNT_LIMIT);
		createEAttribute(discountLimitEClass, DISCOUNT_LIMIT__ID);
		createEAttribute(discountLimitEClass, DISCOUNT_LIMIT__START_DATE);
		createEAttribute(discountLimitEClass, DISCOUNT_LIMIT__END_DATE);
		createEReference(discountLimitEClass, DISCOUNT_LIMIT__ALLOWED_USERS);
		createEAttribute(discountLimitEClass, DISCOUNT_LIMIT__TIMES_LEFT_TO_USE);

		sumDiscountEClass = createEClass(SUM_DISCOUNT);
		createEAttribute(sumDiscountEClass, SUM_DISCOUNT__DISCOUNT_SUM);

		percentageDiscountEClass = createEClass(PERCENTAGE_DISCOUNT);
		createEAttribute(percentageDiscountEClass, PERCENTAGE_DISCOUNT__PERCENTAGE);

		discountDataServiceEClass = createEClass(DISCOUNT_DATA_SERVICE);

		discountManagerImplEClass = createEClass(DISCOUNT_MANAGER_IMPL);
		createEReference(discountManagerImplEClass, DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE);

		billEClass = createEClass(BILL);
		createEAttribute(billEClass, BILL__ID);
		createEAttribute(billEClass, BILL__DATE);
		createEAttribute(billEClass, BILL__IS_PUBLISHED);
		createEAttribute(billEClass, BILL__IS_PAID);
		createEReference(billEClass, BILL__PURCHASE);
		createEReference(billEClass, BILL__USED_DISCOUNTS);
		createEReference(billEClass, BILL__CUSTOMER);
		createEReference(billEClass, BILL__SUB_BILLS);
		createEOperation(billEClass, BILL___APPLY_DISCOUNT__DISCOUNT);
		createEOperation(billEClass, BILL___ADD_SUB_BILL__BILL);
		createEOperation(billEClass, BILL___REGISTER_PURCHASE__PURCHASE);
		createEOperation(billEClass, BILL___PUBLISH_BILL);
		createEOperation(billEClass, BILL___UNREGISTER_PURCHASE__PURCHASE);
		createEOperation(billEClass, BILL___REMOVE_SUB_BILL__BILL);
		createEOperation(billEClass, BILL___UN_PUBLISH_BILL);
		createEOperation(billEClass, BILL___GET_PRICE);
		createEOperation(billEClass, BILL___REMOVE_DISCOUNT__DISCOUNT);

		purchaseEClass = createEClass(PURCHASE);
		createEAttribute(purchaseEClass, PURCHASE__ID);
		createEAttribute(purchaseEClass, PURCHASE__QUANTITY);
		createEAttribute(purchaseEClass, PURCHASE__PRICE);
		createEReference(purchaseEClass, PURCHASE__SERVICE);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__ID);
		createEAttribute(serviceEClass, SERVICE__PRICE);
		createEAttribute(serviceEClass, SERVICE__NAME);

		bookingBillEClass = createEClass(BOOKING_BILL);
		createEReference(bookingBillEClass, BOOKING_BILL__BOOKING);

		billManagerEClass = createEClass(BILL_MANAGER);
		createEOperation(billManagerEClass, BILL_MANAGER___GET_BILL__INT);
		createEOperation(billManagerEClass, BILL_MANAGER___GET_BOOKING_BILL__BOOKING);
		createEOperation(billManagerEClass, BILL_MANAGER___BILL_ITEM__BILL_INT_INT);
		createEOperation(billManagerEClass, BILL_MANAGER___ADD_SUB_BILL__BILL_BILL);
		createEOperation(billManagerEClass, BILL_MANAGER___APPLY_DISCOUNT__DISCOUNT_BILL);
		createEOperation(billManagerEClass, BILL_MANAGER___PUBLISH_BILL__BILL);
		createEOperation(billManagerEClass, BILL_MANAGER___MARK_BILL_AS_PAID__BILL_BOOLEAN_BANKINGMANAGER_CREDITCARDMANAGER);
		createEOperation(billManagerEClass, BILL_MANAGER___CREATE_BILL__LEGALENTITY);
		createEOperation(billManagerEClass, BILL_MANAGER___CREATE_BOOKING_BILL__LEGALENTITY_BOOKING);

		bankingManagerEClass = createEClass(BANKING_MANAGER);
		createEOperation(bankingManagerEClass, BANKING_MANAGER___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE);
		createEOperation(bankingManagerEClass, BANKING_MANAGER___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING);

		creditCardManagerEClass = createEClass(CREDIT_CARD_MANAGER);
		createEOperation(creditCardManagerEClass, CREDIT_CARD_MANAGER___SET_CREDIT_CARD_INFORMATION__LEGALENTITY_STRING_STRING_STRING_STRING_DATE_BANKINGMANAGER);
		createEOperation(creditCardManagerEClass, CREDIT_CARD_MANAGER___GET_CREDIT_CARD_INFORMATION__LEGALENTITY);
		createEOperation(creditCardManagerEClass, CREDIT_CARD_MANAGER___GET_CREDIT_CARD_INFORMATION__INT);
		createEOperation(creditCardManagerEClass, CREDIT_CARD_MANAGER___REVALIDATE_CREDIT_CARD_INFORMATION__LEGALENTITY_BANKINGMANAGER);

		creditCardInformationEClass = createEClass(CREDIT_CARD_INFORMATION);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__CARD_NUMBER);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__EXPIRATION_DATE);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__CCV);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__FIRST_NAME);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__LAST_NAME);
		createEReference(creditCardInformationEClass, CREDIT_CARD_INFORMATION__LEGAL_ENTITY);

		billManagerImplEClass = createEClass(BILL_MANAGER_IMPL);
		createEReference(billManagerImplEClass, BILL_MANAGER_IMPL__BILL_DATA_SERVICE);
		createEReference(billManagerImplEClass, BILL_MANAGER_IMPL__BOOKING_MANAGER);

		billDataServiceEClass = createEClass(BILL_DATA_SERVICE);
		createEOperation(billDataServiceEClass, BILL_DATA_SERVICE___GET_ALL_SERVICES);
		createEOperation(billDataServiceEClass, BILL_DATA_SERVICE___GET_BOOKING_BILL__BOOKING);
		createEOperation(billDataServiceEClass, BILL_DATA_SERVICE___GET_SERVICE__INT);

		bankingManagerImplEClass = createEClass(BANKING_MANAGER_IMPL);

		creditCardInformationDataServiceEClass = createEClass(CREDIT_CARD_INFORMATION_DATA_SERVICE);
		createEOperation(creditCardInformationDataServiceEClass, CREDIT_CARD_INFORMATION_DATA_SERVICE___GET_BY_LEGAL_ENTITY__INT);

		creditCardManagerImplEClass = createEClass(CREDIT_CARD_MANAGER_IMPL);
		createEReference(creditCardManagerImplEClass, CREDIT_CARD_MANAGER_IMPL__CREDIT_CARD_INFORMATION_DATA_SERVICE);

		serviceManagerImplEClass = createEClass(SERVICE_MANAGER_IMPL);
		createEReference(serviceManagerImplEClass, SERVICE_MANAGER_IMPL__SERVICE_DATA_SERVICE);

		serviceManagerEClass = createEClass(SERVICE_MANAGER);
		createEOperation(serviceManagerEClass, SERVICE_MANAGER___GET_ALL_SERVICES);
		createEOperation(serviceManagerEClass, SERVICE_MANAGER___GET_SERVICE__INT);

		serviceDataServiceEClass = createEClass(SERVICE_DATA_SERVICE);

		adminServiceManagerEClass = createEClass(ADMIN_SERVICE_MANAGER);
		createEOperation(adminServiceManagerEClass, ADMIN_SERVICE_MANAGER___CREATE_SERVICE__STRING_DOUBLE);
		createEOperation(adminServiceManagerEClass, ADMIN_SERVICE_MANAGER___REMOVE_SERVICE__SERVICE);

		adminServiceManagerImplEClass = createEClass(ADMIN_SERVICE_MANAGER_IMPL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BookingPackage theBookingPackage = (BookingPackage)EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI);
		CaliforniaPackage theCaliforniaPackage = (CaliforniaPackage)EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sumDiscountEClass.getESuperTypes().add(this.getDiscount());
		percentageDiscountEClass.getESuperTypes().add(this.getDiscount());
		EGenericType g1 = createEGenericType(theCaliforniaPackage.getDataService());
		EGenericType g2 = createEGenericType(this.getDiscount());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		discountDataServiceEClass.getEGenericSuperTypes().add(g1);
		discountManagerImplEClass.getESuperTypes().add(this.getDiscountManager());
		bookingBillEClass.getESuperTypes().add(this.getBill());
		billManagerImplEClass.getESuperTypes().add(this.getBillManager());
		g1 = createEGenericType(theCaliforniaPackage.getDataService());
		g2 = createEGenericType(this.getBill());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		billDataServiceEClass.getEGenericSuperTypes().add(g1);
		bankingManagerImplEClass.getESuperTypes().add(this.getBankingManager());
		g1 = createEGenericType(theCaliforniaPackage.getDataService());
		g2 = createEGenericType(this.getCreditCardInformation());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		creditCardInformationDataServiceEClass.getEGenericSuperTypes().add(g1);
		creditCardManagerImplEClass.getESuperTypes().add(this.getCreditCardManager());
		serviceManagerImplEClass.getESuperTypes().add(this.getServiceManager());
		g1 = createEGenericType(theCaliforniaPackage.getDataService());
		g2 = createEGenericType(this.getService());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		serviceDataServiceEClass.getEGenericSuperTypes().add(g1);
		adminServiceManagerEClass.getESuperTypes().add(this.getServiceManager());
		adminServiceManagerImplEClass.getESuperTypes().add(this.getServiceManagerImpl());
		adminServiceManagerImplEClass.getESuperTypes().add(this.getAdminServiceManager());

		// Initialize classes, features, and operations; add parameters
		initEClass(discountManagerEClass, DiscountManager.class, "DiscountManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDiscountManager__GetDiscount__String(), this.getDiscount(), "getDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "code", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(discountEClass, Discount.class, "Discount", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscount_Code(), ecorePackage.getEString(), "code", null, 1, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscount_Name(), ecorePackage.getEString(), "name", null, 1, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiscount_DiscountLimit(), this.getDiscountLimit(), null, "discountLimit", null, 0, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDiscount__GetPriceWithDiscount__double(), ecorePackage.getEDouble(), "getPriceWithDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(discountLimitEClass, DiscountLimit.class, "DiscountLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscountLimit_Id(), ecorePackage.getEInt(), "id", null, 1, 1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscountLimit_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscountLimit_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiscountLimit_AllowedUsers(), theBookingPackage.getLegalEntity(), null, "allowedUsers", null, 0, -1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscountLimit_TimesLeftToUse(), ecorePackage.getEInt(), "timesLeftToUse", null, 1, 1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sumDiscountEClass, SumDiscount.class, "SumDiscount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSumDiscount_DiscountSum(), ecorePackage.getEDouble(), "discountSum", null, 1, 1, SumDiscount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(percentageDiscountEClass, PercentageDiscount.class, "PercentageDiscount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPercentageDiscount_Percentage(), ecorePackage.getEFloat(), "percentage", null, 1, 1, PercentageDiscount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(discountDataServiceEClass, DiscountDataService.class, "DiscountDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discountManagerImplEClass, DiscountManagerImpl.class, "DiscountManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscountManagerImpl_DiscountDataService(), this.getDiscountDataService(), null, "discountDataService", null, 1, 1, DiscountManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBill_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_IsPublished(), ecorePackage.getEBoolean(), "isPublished", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_IsPaid(), ecorePackage.getEBoolean(), "isPaid", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_Purchase(), this.getPurchase(), null, "purchase", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_UsedDiscounts(), this.getDiscount(), null, "usedDiscounts", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_Customer(), theBookingPackage.getLegalEntity(), null, "customer", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_SubBills(), this.getBill(), null, "subBills", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBill__ApplyDiscount__Discount(), null, "applyDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBill__AddSubBill__Bill(), null, "addSubBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "subBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBill__RegisterPurchase__Purchase(), null, "registerPurchase", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPurchase(), "purchase", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBill__PublishBill(), null, "publishBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBill__UnregisterPurchase__Purchase(), null, "unregisterPurchase", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPurchase(), "purchase", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBill__RemoveSubBill__Bill(), null, "removeSubBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "subBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBill__UnPublishBill(), null, "unPublishBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBill__GetPrice(), ecorePackage.getEDouble(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBill__RemoveDiscount__Discount(), null, "removeDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(purchaseEClass, Purchase.class, "Purchase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPurchase_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Purchase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPurchase_Quantity(), ecorePackage.getEInt(), "quantity", null, 1, 1, Purchase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPurchase_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Purchase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPurchase_Service(), this.getService(), null, "service", null, 1, 1, Purchase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingBillEClass, BookingBill.class, "BookingBill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingBill_Booking(), theBookingPackage.getBooking(), null, "booking", null, 1, 1, BookingBill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billManagerEClass, BillManager.class, "BillManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBillManager__GetBill__int(), this.getBill(), "getBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__GetBookingBill__Booking(), this.getBookingBill(), "getBookingBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBookingPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__BillItem__Bill_int_int(), null, "billItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "serviceId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "quantity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__AddSubBill__Bill_Bill(), null, "addSubBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "subBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "toBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__ApplyDiscount__Discount_Bill(), null, "applyDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__PublishBill__Bill(), null, "publishBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__MarkBillAsPaid__Bill_boolean_BankingManager_CreditCardManager(), ecorePackage.getEBoolean(), "markBillAsPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBankingManager(), "bankingManager", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCreditCardManager(), "creditCardManager", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__CreateBill__LegalEntity(), this.getBill(), "createBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBookingPackage.getLegalEntity(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__CreateBookingBill__LegalEntity_Booking(), this.getBookingBill(), "createBookingBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBookingPackage.getLegalEntity(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBookingPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bankingManagerEClass, BankingManager.class, "BankingManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBankingManager__MakePayment__String_String_int_int_String_String_double(), ecorePackage.getEBoolean(), "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "sum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBankingManager__IsCreditCardValid__String_String_int_int_String_String(), ecorePackage.getEBoolean(), "isCreditCardValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(creditCardManagerEClass, CreditCardManager.class, "CreditCardManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCreditCardManager__SetCreditCardInformation__LegalEntity_String_String_String_String_Date_BankingManager(), ecorePackage.getEBoolean(), "setCreditCardInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBookingPackage.getLegalEntity(), "legalEntity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cardNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "expirationDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBankingManager(), "validator", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCreditCardManager__GetCreditCardInformation__LegalEntity(), this.getCreditCardInformation(), "getCreditCardInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBookingPackage.getLegalEntity(), "legalEntity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCreditCardManager__GetCreditCardInformation__int(), this.getCreditCardInformation(), "getCreditCardInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "legalEntityId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCreditCardManager__RevalidateCreditCardInformation__LegalEntity_BankingManager(), ecorePackage.getEBoolean(), "revalidateCreditCardInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBookingPackage.getLegalEntity(), "legalEntity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBankingManager(), "bankingManager", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(creditCardInformationEClass, CreditCardInformation.class, "CreditCardInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreditCardInformation_CardNumber(), ecorePackage.getEString(), "cardNumber", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformation_ExpirationDate(), ecorePackage.getEDate(), "expirationDate", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformation_Ccv(), ecorePackage.getEString(), "ccv", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformation_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformation_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCreditCardInformation_LegalEntity(), theBookingPackage.getLegalEntity(), null, "legalEntity", null, 0, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billManagerImplEClass, BillManagerImpl.class, "BillManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBillManagerImpl_BillDataService(), this.getBillDataService(), null, "billDataService", null, 1, 1, BillManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBillManagerImpl_BookingManager(), theBookingPackage.getBookingManager(), null, "bookingManager", null, 1, 1, BillManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billDataServiceEClass, BillDataService.class, "BillDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getBillDataService__GetAllServices(), this.getService(), "getAllServices", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillDataService__GetBookingBill__Booking(), this.getBookingBill(), "getBookingBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBookingPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillDataService__GetService__int(), this.getService(), "getService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "serviceId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bankingManagerImplEClass, BankingManagerImpl.class, "BankingManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(creditCardInformationDataServiceEClass, CreditCardInformationDataService.class, "CreditCardInformationDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCreditCardInformationDataService__GetByLegalEntity__int(), this.getCreditCardInformation(), "getByLegalEntity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "legalEntityId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(creditCardManagerImplEClass, CreditCardManagerImpl.class, "CreditCardManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreditCardManagerImpl_CreditCardInformationDataService(), this.getCreditCardInformationDataService(), null, "creditCardInformationDataService", null, 1, 1, CreditCardManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceManagerImplEClass, ServiceManagerImpl.class, "ServiceManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceManagerImpl_ServiceDataService(), this.getServiceDataService(), null, "serviceDataService", null, 1, 1, ServiceManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceManagerEClass, ServiceManager.class, "ServiceManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getServiceManager__GetAllServices(), this.getService(), "getAllServices", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceManager__GetService__int(), this.getService(), "getService", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(serviceDataServiceEClass, ServiceDataService.class, "ServiceDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adminServiceManagerEClass, AdminServiceManager.class, "AdminServiceManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAdminServiceManager__CreateService__String_double(), this.getService(), "createService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminServiceManager__RemoveService__Service(), null, "removeService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(adminServiceManagerImplEClass, AdminServiceManagerImpl.class, "AdminServiceManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //BillingPackageImpl

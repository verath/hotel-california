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

import tda593.hotel.california.billing.AdminDiscountManager;
import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.BillManagerImpl;
import tda593.hotel.california.billing.BillingFactory;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.BookingBill;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.DiscountDataService;
import tda593.hotel.california.billing.DiscountLimit;
import tda593.hotel.california.billing.DiscountManager;
import tda593.hotel.california.billing.DiscountManagerImpl;
import tda593.hotel.california.billing.PercentageDiscount;
import tda593.hotel.california.billing.Purchase;
import tda593.hotel.california.billing.Service;
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
	private EClass adminDiscountManagerEClass = null;

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
	public EOperation getDiscountManager__GetDiscount__int() {
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
	public EClass getAdminDiscountManager() {
		return adminDiscountManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminDiscountManager__AddSumDiscount__double() {
		return adminDiscountManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminDiscountManager__AddPercentageDiscount__float() {
		return adminDiscountManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminDiscountManager__SetAmountLimit__Discount_int() {
		return adminDiscountManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminDiscountManager__AddAllowedUsers__Discount_EList() {
		return adminDiscountManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminDiscountManager__SetDateRangeLimit__Discount_Date_Date() {
		return adminDiscountManagerEClass.getEOperations().get(4);
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
		return (EReference)billEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_IsPaid() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_Purchase() {
		return (EReference)billEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_CreditCardInformation() {
		return (EReference)billEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_UsedDiscounts() {
		return (EReference)billEClass.getEStructuralFeatures().get(7);
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
	public EOperation getBillManager__GetAllServices() {
		return billManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__AddSubBill__Bill_Bill() {
		return billManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__ApplyDiscount__Discount_Bill() {
		return billManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__PublishBill__Bill() {
		return billManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__MarkBillAsPaid__Bill_boolean() {
		return billManagerEClass.getEOperations().get(7);
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
	public EClass getBillDataService() {
		return billDataServiceEClass;
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
		createEOperation(discountManagerEClass, DISCOUNT_MANAGER___GET_DISCOUNT__INT);

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

		adminDiscountManagerEClass = createEClass(ADMIN_DISCOUNT_MANAGER);
		createEOperation(adminDiscountManagerEClass, ADMIN_DISCOUNT_MANAGER___ADD_SUM_DISCOUNT__DOUBLE);
		createEOperation(adminDiscountManagerEClass, ADMIN_DISCOUNT_MANAGER___ADD_PERCENTAGE_DISCOUNT__FLOAT);
		createEOperation(adminDiscountManagerEClass, ADMIN_DISCOUNT_MANAGER___SET_AMOUNT_LIMIT__DISCOUNT_INT);
		createEOperation(adminDiscountManagerEClass, ADMIN_DISCOUNT_MANAGER___ADD_ALLOWED_USERS__DISCOUNT_ELIST);
		createEOperation(adminDiscountManagerEClass, ADMIN_DISCOUNT_MANAGER___SET_DATE_RANGE_LIMIT__DISCOUNT_DATE_DATE);

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
		createEReference(billEClass, BILL__CUSTOMER);
		createEAttribute(billEClass, BILL__IS_PAID);
		createEReference(billEClass, BILL__PURCHASE);
		createEReference(billEClass, BILL__CREDIT_CARD_INFORMATION);
		createEReference(billEClass, BILL__USED_DISCOUNTS);
		createEOperation(billEClass, BILL___APPLY_DISCOUNT__DISCOUNT);
		createEOperation(billEClass, BILL___ADD_SUB_BILL__BILL);
		createEOperation(billEClass, BILL___REGISTER_PURCHASE__PURCHASE);
		createEOperation(billEClass, BILL___PUBLISH_BILL);

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
		createEOperation(billManagerEClass, BILL_MANAGER___GET_ALL_SERVICES);
		createEOperation(billManagerEClass, BILL_MANAGER___ADD_SUB_BILL__BILL_BILL);
		createEOperation(billManagerEClass, BILL_MANAGER___APPLY_DISCOUNT__DISCOUNT_BILL);
		createEOperation(billManagerEClass, BILL_MANAGER___PUBLISH_BILL__BILL);
		createEOperation(billManagerEClass, BILL_MANAGER___MARK_BILL_AS_PAID__BILL_BOOLEAN);

		billManagerImplEClass = createEClass(BILL_MANAGER_IMPL);
		createEReference(billManagerImplEClass, BILL_MANAGER_IMPL__BILL_DATA_SERVICE);

		billDataServiceEClass = createEClass(BILL_DATA_SERVICE);
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
		adminDiscountManagerEClass.getESuperTypes().add(this.getDiscountManager());
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

		// Initialize classes, features, and operations; add parameters
		initEClass(discountManagerEClass, DiscountManager.class, "DiscountManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDiscountManager__GetDiscount__int(), this.getDiscount(), "getDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "code", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(discountEClass, Discount.class, "Discount", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscount_Code(), ecorePackage.getEInt(), "code", null, 1, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscount_Name(), ecorePackage.getEString(), "name", null, 1, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiscount_DiscountLimit(), this.getDiscountLimit(), null, "discountLimit", null, 0, -1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDiscount__GetPriceWithDiscount__double(), null, "getPriceWithDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(discountLimitEClass, DiscountLimit.class, "DiscountLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscountLimit_Id(), ecorePackage.getEInt(), "id", null, 1, 1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscountLimit_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscountLimit_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiscountLimit_AllowedUsers(), theBookingPackage.getLegalEntity(), null, "allowedUsers", null, 0, -1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(adminDiscountManagerEClass, AdminDiscountManager.class, "AdminDiscountManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAdminDiscountManager__AddSumDiscount__double(), this.getDiscount(), "addSumDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "sum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminDiscountManager__AddPercentageDiscount__float(), this.getDiscount(), "addPercentageDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminDiscountManager__SetAmountLimit__Discount_int(), null, "setAmountLimit", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminDiscountManager__AddAllowedUsers__Discount_EList(), null, "addAllowedUsers", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBookingPackage.getLegalEntity(), "allowedUsers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminDiscountManager__SetDateRangeLimit__Discount_Date_Date(), null, "setDateRangeLimit", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "validFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "validTo", 1, 1, IS_UNIQUE, !IS_ORDERED);

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
		initEReference(getBill_Customer(), theBookingPackage.getLegalEntity(), null, "customer", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_IsPaid(), ecorePackage.getEBoolean(), "isPaid", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_Purchase(), this.getPurchase(), null, "purchase", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_CreditCardInformation(), theBookingPackage.getCreditCardInformation(), null, "creditCardInformation", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_UsedDiscounts(), this.getDiscount(), null, "usedDiscounts", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBill__ApplyDiscount__Discount(), null, "applyDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBill__AddSubBill__Bill(), null, "addSubBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBill__RegisterPurchase__Purchase(), null, "registerPurchase", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPurchase(), "purchase", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBill__PublishBill(), null, "publishBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

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

		op = initEOperation(getBillManager__GetBookingBill__Booking(), null, "getBookingBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBookingPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__BillItem__Bill_int_int(), null, "billItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "serviceId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "quantity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBillManager__GetAllServices(), null, "getAllServices", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__AddSubBill__Bill_Bill(), null, "addSubBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "subBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "toBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__ApplyDiscount__Discount_Bill(), null, "applyDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__PublishBill__Bill(), null, "publishBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__MarkBillAsPaid__Bill_boolean(), null, "markBillAsPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(billManagerImplEClass, BillManagerImpl.class, "BillManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBillManagerImpl_BillDataService(), this.getBillDataService(), null, "billDataService", null, 1, 1, BillManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billDataServiceEClass, BillDataService.class, "BillDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //BillingPackageImpl
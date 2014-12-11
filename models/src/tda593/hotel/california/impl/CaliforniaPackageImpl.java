/**
 */
package tda593.hotel.california.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tda593.hotel.california.Bill;
import tda593.hotel.california.BillDataService;
import tda593.hotel.california.BillManager;
import tda593.hotel.california.BillManagerImpl;
import tda593.hotel.california.BookingBill;
import tda593.hotel.california.CaliforniaFactory;
import tda593.hotel.california.CaliforniaPackage;
import tda593.hotel.california.DataService;
import tda593.hotel.california.Purchase;
import tda593.hotel.california.Service;

import tda593.hotel.california.booking.BookingPackage;

import tda593.hotel.california.booking.impl.BookingPackageImpl;

import tda593.hotel.california.discount.DiscountPackage;

import tda593.hotel.california.discount.impl.DiscountPackageImpl;

import tda593.hotel.california.facilities.FacilitiesPackage;

import tda593.hotel.california.facilities.impl.FacilitiesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CaliforniaPackageImpl extends EPackageImpl implements CaliforniaPackage {
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
	private EClass dataServiceEClass = null;

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
	private EClass billManagerImplEClass = null;

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
	private EClass bookingBillEClass = null;

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
	 * @see tda593.hotel.california.CaliforniaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CaliforniaPackageImpl() {
		super(eNS_URI, CaliforniaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CaliforniaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CaliforniaPackage init() {
		if (isInited) return (CaliforniaPackage)EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI);

		// Obtain or create and register package
		CaliforniaPackageImpl theCaliforniaPackage = (CaliforniaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CaliforniaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CaliforniaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) : FacilitiesPackage.eINSTANCE);
		DiscountPackageImpl theDiscountPackage = (DiscountPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DiscountPackage.eNS_URI) instanceof DiscountPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DiscountPackage.eNS_URI) : DiscountPackage.eINSTANCE);

		// Create package meta-data objects
		theCaliforniaPackage.createPackageContents();
		theBookingPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theDiscountPackage.createPackageContents();

		// Initialize created meta-data
		theCaliforniaPackage.initializePackageContents();
		theBookingPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theDiscountPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCaliforniaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CaliforniaPackage.eNS_URI, theCaliforniaPackage);
		return theCaliforniaPackage;
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
	public EClass getDataService() {
		return dataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataService__Get__Object() {
		return dataServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataService__GetAll() {
		return dataServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataService__Count() {
		return dataServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataService__Set__Object() {
		return dataServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataService__SetAll__EList() {
		return dataServiceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataService__Delete__Object() {
		return dataServiceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataService__Exist__Object() {
		return dataServiceEClass.getEOperations().get(6);
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
	public CaliforniaFactory getCaliforniaFactory() {
		return (CaliforniaFactory)getEFactoryInstance();
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
		billDataServiceEClass = createEClass(BILL_DATA_SERVICE);

		dataServiceEClass = createEClass(DATA_SERVICE);
		createEOperation(dataServiceEClass, DATA_SERVICE___GET__OBJECT);
		createEOperation(dataServiceEClass, DATA_SERVICE___GET_ALL);
		createEOperation(dataServiceEClass, DATA_SERVICE___COUNT);
		createEOperation(dataServiceEClass, DATA_SERVICE___SET__OBJECT);
		createEOperation(dataServiceEClass, DATA_SERVICE___SET_ALL__ELIST);
		createEOperation(dataServiceEClass, DATA_SERVICE___DELETE__OBJECT);
		createEOperation(dataServiceEClass, DATA_SERVICE___EXIST__OBJECT);

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

		billManagerImplEClass = createEClass(BILL_MANAGER_IMPL);
		createEReference(billManagerImplEClass, BILL_MANAGER_IMPL__BILL_DATA_SERVICE);

		billManagerEClass = createEClass(BILL_MANAGER);
		createEOperation(billManagerEClass, BILL_MANAGER___GET_BILL__INT);
		createEOperation(billManagerEClass, BILL_MANAGER___GET_BOOKING_BILL__BOOKING);
		createEOperation(billManagerEClass, BILL_MANAGER___BILL_ITEM__BILL_INT_INT);
		createEOperation(billManagerEClass, BILL_MANAGER___GET_ALL_SERVICES);
		createEOperation(billManagerEClass, BILL_MANAGER___ADD_SUB_BILL__BILL_BILL);
		createEOperation(billManagerEClass, BILL_MANAGER___APPLY_DISCOUNT__DISCOUNT_BILL);
		createEOperation(billManagerEClass, BILL_MANAGER___PUBLISH_BILL__BILL);
		createEOperation(billManagerEClass, BILL_MANAGER___MARK_BILL_AS_PAID__BILL_BOOLEAN);

		bookingBillEClass = createEClass(BOOKING_BILL);
		createEReference(bookingBillEClass, BOOKING_BILL__BOOKING);
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
		FacilitiesPackage theFacilitiesPackage = (FacilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI);
		DiscountPackage theDiscountPackage = (DiscountPackage)EPackage.Registry.INSTANCE.getEPackage(DiscountPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theBookingPackage);
		getESubpackages().add(theFacilitiesPackage);
		getESubpackages().add(theDiscountPackage);

		// Create type parameters
		ETypeParameter dataServiceEClass_E = addETypeParameter(dataServiceEClass, "E");
		ETypeParameter dataServiceEClass_ID = addETypeParameter(dataServiceEClass, "ID");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getDataService());
		EGenericType g2 = createEGenericType(this.getBill());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		billDataServiceEClass.getEGenericSuperTypes().add(g1);
		billManagerImplEClass.getESuperTypes().add(this.getBillManager());
		bookingBillEClass.getESuperTypes().add(this.getBill());

		// Initialize classes, features, and operations; add parameters
		initEClass(billDataServiceEClass, BillDataService.class, "BillDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataServiceEClass, DataService.class, "DataService", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDataService__Get__Object(), null, "get", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(dataServiceEClass_ID);
		addEParameter(op, g1, "id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(dataServiceEClass_E);
		initEOperation(op, g1);

		op = initEOperation(getDataService__GetAll(), null, "getAll", 0, -1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(dataServiceEClass_E);
		initEOperation(op, g1);

		initEOperation(getDataService__Count(), ecorePackage.getEInt(), "count", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDataService__Set__Object(), null, "set", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(dataServiceEClass_E);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDataService__SetAll__EList(), null, "setAll", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(dataServiceEClass_E);
		addEParameter(op, g1, "objects", 1, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDataService__Delete__Object(), null, "delete", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(dataServiceEClass_E);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDataService__Exist__Object(), null, "exist", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(dataServiceEClass_ID);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBill_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_IsPublished(), ecorePackage.getEBoolean(), "isPublished", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_Customer(), theBookingPackage.getLegalEntity(), null, "customer", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_IsPaid(), ecorePackage.getEBoolean(), "isPaid", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_Purchase(), this.getPurchase(), null, "purchase", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_CreditCardInformation(), theBookingPackage.getCreditCardInformation(), null, "creditCardInformation", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_UsedDiscounts(), theDiscountPackage.getDiscount(), null, "usedDiscounts", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBill__ApplyDiscount__Discount(), null, "applyDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDiscountPackage.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);

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

		initEClass(billManagerImplEClass, BillManagerImpl.class, "BillManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBillManagerImpl_BillDataService(), this.getBillDataService(), null, "billDataService", null, 1, 1, BillManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
		addEParameter(op, theDiscountPackage.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__PublishBill__Bill(), null, "publishBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__MarkBillAsPaid__Bill_boolean(), null, "markBillAsPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingBillEClass, BookingBill.class, "BookingBill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingBill_Booking(), theBookingPackage.getBooking(), null, "booking", null, 1, 1, BookingBill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CaliforniaPackageImpl

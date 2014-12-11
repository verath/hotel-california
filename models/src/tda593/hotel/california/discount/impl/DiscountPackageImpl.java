/**
 */
package tda593.hotel.california.discount.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tda593.hotel.california.CaliforniaPackage;

import tda593.hotel.california.discount.AdminDiscountManager;
import tda593.hotel.california.discount.Discount;
import tda593.hotel.california.discount.DiscountDataService;
import tda593.hotel.california.discount.DiscountFactory;
import tda593.hotel.california.discount.DiscountLimit;
import tda593.hotel.california.discount.DiscountManager;
import tda593.hotel.california.discount.DiscountManagerImpl;
import tda593.hotel.california.discount.DiscountPackage;
import tda593.hotel.california.discount.PercentageDiscount;
import tda593.hotel.california.discount.SumDiscount;

import tda593.hotel.california.facilities.FacilitiesPackage;

import tda593.hotel.california.facilities.impl.FacilitiesPackageImpl;

import tda593.hotel.california.impl.CaliforniaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscountPackageImpl extends EPackageImpl implements DiscountPackage {
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
	private EClass discountLimitEClass = null;

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
	private EClass discountEClass = null;

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
	 * @see tda593.hotel.california.discount.DiscountPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiscountPackageImpl() {
		super(eNS_URI, DiscountFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DiscountPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiscountPackage init() {
		if (isInited) return (DiscountPackage)EPackage.Registry.INSTANCE.getEPackage(DiscountPackage.eNS_URI);

		// Obtain or create and register package
		DiscountPackageImpl theDiscountPackage = (DiscountPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiscountPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiscountPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CaliforniaPackageImpl theCaliforniaPackage = (CaliforniaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI) instanceof CaliforniaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI) : CaliforniaPackage.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) : FacilitiesPackage.eINSTANCE);

		// Create package meta-data objects
		theDiscountPackage.createPackageContents();
		theCaliforniaPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();

		// Initialize created meta-data
		theDiscountPackage.initializePackageContents();
		theCaliforniaPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiscountPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiscountPackage.eNS_URI, theDiscountPackage);
		return theDiscountPackage;
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
	public DiscountFactory getDiscountFactory() {
		return (DiscountFactory)getEFactoryInstance();
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

		discountLimitEClass = createEClass(DISCOUNT_LIMIT);
		createEAttribute(discountLimitEClass, DISCOUNT_LIMIT__ID);
		createEAttribute(discountLimitEClass, DISCOUNT_LIMIT__START_DATE);
		createEAttribute(discountLimitEClass, DISCOUNT_LIMIT__END_DATE);
		createEReference(discountLimitEClass, DISCOUNT_LIMIT__ALLOWED_USERS);

		discountDataServiceEClass = createEClass(DISCOUNT_DATA_SERVICE);

		discountManagerImplEClass = createEClass(DISCOUNT_MANAGER_IMPL);
		createEReference(discountManagerImplEClass, DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE);

		discountEClass = createEClass(DISCOUNT);
		createEAttribute(discountEClass, DISCOUNT__CODE);
		createEAttribute(discountEClass, DISCOUNT__NAME);
		createEReference(discountEClass, DISCOUNT__DISCOUNT_LIMIT);
		createEOperation(discountEClass, DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(discountManagerEClass, DiscountManager.class, "DiscountManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDiscountManager__GetDiscount__int(), this.getDiscount(), "getDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "code", 1, 1, IS_UNIQUE, !IS_ORDERED);

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
		addEParameter(op, theCaliforniaPackage.getLegalEntity(), "allowedUsers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminDiscountManager__SetDateRangeLimit__Discount_Date_Date(), null, "setDateRangeLimit", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "validFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "validTo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sumDiscountEClass, SumDiscount.class, "SumDiscount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSumDiscount_DiscountSum(), ecorePackage.getEDouble(), "discountSum", null, 1, 1, SumDiscount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(percentageDiscountEClass, PercentageDiscount.class, "PercentageDiscount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPercentageDiscount_Percentage(), ecorePackage.getEFloat(), "percentage", null, 1, 1, PercentageDiscount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(discountLimitEClass, DiscountLimit.class, "DiscountLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscountLimit_Id(), ecorePackage.getEInt(), "id", null, 1, 1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscountLimit_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscountLimit_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiscountLimit_AllowedUsers(), theCaliforniaPackage.getLegalEntity(), null, "allowedUsers", null, 0, -1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(discountDataServiceEClass, DiscountDataService.class, "DiscountDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discountManagerImplEClass, DiscountManagerImpl.class, "DiscountManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscountManagerImpl_DiscountDataService(), this.getDiscountDataService(), null, "discountDataService", null, 1, 1, DiscountManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(discountEClass, Discount.class, "Discount", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscount_Code(), ecorePackage.getEInt(), "code", null, 1, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscount_Name(), ecorePackage.getEString(), "name", null, 1, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiscount_DiscountLimit(), this.getDiscountLimit(), null, "discountLimit", null, 0, -1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDiscount__GetPriceWithDiscount__double(), null, "getPriceWithDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
	}

} //DiscountPackageImpl

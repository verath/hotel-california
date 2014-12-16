/**
 */
package tda593.hotel.california.billing.persistence.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import tda593.hotel.california.CaliforniaPackage;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.impl.BillingPackageImpl;
import tda593.hotel.california.billing.persistence.BillEntity;
import tda593.hotel.california.billing.persistence.BookingBillEntity;
import tda593.hotel.california.billing.persistence.DiscountEntity;
import tda593.hotel.california.billing.persistence.DiscountLimitEntity;
import tda593.hotel.california.billing.persistence.PercentageDiscountEntity;
import tda593.hotel.california.billing.persistence.PersistenceFactory;
import tda593.hotel.california.billing.persistence.PersistencePackage;
import tda593.hotel.california.billing.persistence.PurchaseEntity;
import tda593.hotel.california.billing.persistence.ServiceEntity;
import tda593.hotel.california.billing.persistence.SumDiscountEntity;
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
public class PersistencePackageImpl extends EPackageImpl implements PersistencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discountLimitEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentageDiscountEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discountEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sumDiscountEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purchaseEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingBillEntityEClass = null;

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
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PersistencePackageImpl() {
		super(eNS_URI, PersistenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PersistencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PersistencePackage init() {
		if (isInited) return (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);

		// Obtain or create and register package
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PersistencePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CaliforniaPackageImpl theCaliforniaPackage = (CaliforniaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI) instanceof CaliforniaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI) : CaliforniaPackage.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) : FacilitiesPackage.eINSTANCE);
		tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl thePersistencePackage_1 = (tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.facilities.persistence.PersistencePackage.eNS_URI) instanceof tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.facilities.persistence.PersistencePackage.eNS_URI) : tda593.hotel.california.facilities.persistence.PersistencePackage.eINSTANCE);
		BillingPackageImpl theBillingPackage = (BillingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI) instanceof BillingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI) : BillingPackage.eINSTANCE);
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);
		tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl thePersistencePackage_2 = (tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.booking.persistence.PersistencePackage.eNS_URI) instanceof tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.booking.persistence.PersistencePackage.eNS_URI) : tda593.hotel.california.booking.persistence.PersistencePackage.eINSTANCE);

		// Create package meta-data objects
		thePersistencePackage.createPackageContents();
		theCaliforniaPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		thePersistencePackage_1.createPackageContents();
		theBillingPackage.createPackageContents();
		theBookingPackage.createPackageContents();
		thePersistencePackage_2.createPackageContents();

		// Initialize created meta-data
		thePersistencePackage.initializePackageContents();
		theCaliforniaPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		thePersistencePackage_1.initializePackageContents();
		theBillingPackage.initializePackageContents();
		theBookingPackage.initializePackageContents();
		thePersistencePackage_2.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePersistencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PersistencePackage.eNS_URI, thePersistencePackage);
		return thePersistencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscountLimitEntity() {
		return discountLimitEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscountLimitEntity_Id() {
		return (EAttribute)discountLimitEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscountLimitEntity_StartDate() {
		return (EAttribute)discountLimitEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscountLimitEntity_EndDate() {
		return (EAttribute)discountLimitEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscountLimitEntity_AllowedUsers() {
		return (EReference)discountLimitEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPercentageDiscountEntity() {
		return percentageDiscountEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageDiscountEntity_Percentage() {
		return (EAttribute)percentageDiscountEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscountEntity() {
		return discountEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscountEntity_Code() {
		return (EAttribute)discountEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscountEntity_Name() {
		return (EAttribute)discountEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscountEntity_DiscountLimitEntity() {
		return (EReference)discountEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSumDiscountEntity() {
		return sumDiscountEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSumDiscountEntity_DiscountSum() {
		return (EAttribute)sumDiscountEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurchaseEntity() {
		return purchaseEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchaseEntity_Id() {
		return (EAttribute)purchaseEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchaseEntity_Quantity() {
		return (EAttribute)purchaseEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchaseEntity_Price() {
		return (EAttribute)purchaseEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPurchaseEntity_Service() {
		return (EReference)purchaseEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceEntity() {
		return serviceEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceEntity_Id() {
		return (EAttribute)serviceEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceEntity_Price() {
		return (EAttribute)serviceEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceEntity_Name() {
		return (EAttribute)serviceEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillEntity() {
		return billEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillEntity_Id() {
		return (EAttribute)billEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillEntity_Date() {
		return (EAttribute)billEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillEntity_IsPublished() {
		return (EAttribute)billEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillEntity_IsPaid() {
		return (EAttribute)billEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillEntity_UsedDiscounts() {
		return (EReference)billEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillEntity_LegalEntityEntity() {
		return (EReference)billEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillEntity_PurchaseEntity() {
		return (EReference)billEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillEntity_CreditCardInformationEntity() {
		return (EReference)billEntityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingBillEntity() {
		return bookingBillEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingBillEntity_BookingEntity() {
		return (EReference)bookingBillEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactory getPersistenceFactory() {
		return (PersistenceFactory)getEFactoryInstance();
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
		discountLimitEntityEClass = createEClass(DISCOUNT_LIMIT_ENTITY);
		createEAttribute(discountLimitEntityEClass, DISCOUNT_LIMIT_ENTITY__ID);
		createEAttribute(discountLimitEntityEClass, DISCOUNT_LIMIT_ENTITY__START_DATE);
		createEAttribute(discountLimitEntityEClass, DISCOUNT_LIMIT_ENTITY__END_DATE);
		createEReference(discountLimitEntityEClass, DISCOUNT_LIMIT_ENTITY__ALLOWED_USERS);

		percentageDiscountEntityEClass = createEClass(PERCENTAGE_DISCOUNT_ENTITY);
		createEAttribute(percentageDiscountEntityEClass, PERCENTAGE_DISCOUNT_ENTITY__PERCENTAGE);

		discountEntityEClass = createEClass(DISCOUNT_ENTITY);
		createEAttribute(discountEntityEClass, DISCOUNT_ENTITY__CODE);
		createEAttribute(discountEntityEClass, DISCOUNT_ENTITY__NAME);
		createEReference(discountEntityEClass, DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY);

		sumDiscountEntityEClass = createEClass(SUM_DISCOUNT_ENTITY);
		createEAttribute(sumDiscountEntityEClass, SUM_DISCOUNT_ENTITY__DISCOUNT_SUM);

		purchaseEntityEClass = createEClass(PURCHASE_ENTITY);
		createEAttribute(purchaseEntityEClass, PURCHASE_ENTITY__ID);
		createEAttribute(purchaseEntityEClass, PURCHASE_ENTITY__QUANTITY);
		createEAttribute(purchaseEntityEClass, PURCHASE_ENTITY__PRICE);
		createEReference(purchaseEntityEClass, PURCHASE_ENTITY__SERVICE);

		serviceEntityEClass = createEClass(SERVICE_ENTITY);
		createEAttribute(serviceEntityEClass, SERVICE_ENTITY__ID);
		createEAttribute(serviceEntityEClass, SERVICE_ENTITY__PRICE);
		createEAttribute(serviceEntityEClass, SERVICE_ENTITY__NAME);

		billEntityEClass = createEClass(BILL_ENTITY);
		createEAttribute(billEntityEClass, BILL_ENTITY__ID);
		createEAttribute(billEntityEClass, BILL_ENTITY__DATE);
		createEAttribute(billEntityEClass, BILL_ENTITY__IS_PUBLISHED);
		createEAttribute(billEntityEClass, BILL_ENTITY__IS_PAID);
		createEReference(billEntityEClass, BILL_ENTITY__USED_DISCOUNTS);
		createEReference(billEntityEClass, BILL_ENTITY__LEGAL_ENTITY_ENTITY);
		createEReference(billEntityEClass, BILL_ENTITY__PURCHASE_ENTITY);
		createEReference(billEntityEClass, BILL_ENTITY__CREDIT_CARD_INFORMATION_ENTITY);

		bookingBillEntityEClass = createEClass(BOOKING_BILL_ENTITY);
		createEReference(bookingBillEntityEClass, BOOKING_BILL_ENTITY__BOOKING_ENTITY);
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
		tda593.hotel.california.booking.persistence.PersistencePackage thePersistencePackage_2 = (tda593.hotel.california.booking.persistence.PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.booking.persistence.PersistencePackage.eNS_URI);
		BillingPackage theBillingPackage = (BillingPackage)EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		percentageDiscountEntityEClass.getESuperTypes().add(this.getDiscountEntity());
		sumDiscountEntityEClass.getESuperTypes().add(this.getDiscountEntity());
		bookingBillEntityEClass.getESuperTypes().add(theBillingPackage.getBill());

		// Initialize classes, features, and operations; add parameters
		initEClass(discountLimitEntityEClass, DiscountLimitEntity.class, "DiscountLimitEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscountLimitEntity_Id(), ecorePackage.getEInt(), "id", null, 1, 1, DiscountLimitEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscountLimitEntity_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, DiscountLimitEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscountLimitEntity_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, DiscountLimitEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiscountLimitEntity_AllowedUsers(), thePersistencePackage_2.getLegalEntityEntity(), null, "allowedUsers", null, 0, -1, DiscountLimitEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(percentageDiscountEntityEClass, PercentageDiscountEntity.class, "PercentageDiscountEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPercentageDiscountEntity_Percentage(), ecorePackage.getEFloat(), "percentage", null, 1, 1, PercentageDiscountEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(discountEntityEClass, DiscountEntity.class, "DiscountEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscountEntity_Code(), ecorePackage.getEInt(), "code", null, 1, 1, DiscountEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscountEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, DiscountEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiscountEntity_DiscountLimitEntity(), this.getDiscountLimitEntity(), null, "discountLimitEntity", null, 1, 1, DiscountEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sumDiscountEntityEClass, SumDiscountEntity.class, "SumDiscountEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSumDiscountEntity_DiscountSum(), ecorePackage.getEDouble(), "discountSum", null, 1, 1, SumDiscountEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(purchaseEntityEClass, PurchaseEntity.class, "PurchaseEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPurchaseEntity_Id(), ecorePackage.getEInt(), "id", null, 1, 1, PurchaseEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPurchaseEntity_Quantity(), ecorePackage.getEInt(), "quantity", null, 1, 1, PurchaseEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPurchaseEntity_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, PurchaseEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPurchaseEntity_Service(), this.getServiceEntity(), null, "service", null, 1, 1, PurchaseEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceEntityEClass, ServiceEntity.class, "ServiceEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceEntity_Id(), ecorePackage.getEInt(), "id", null, 1, 1, ServiceEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceEntity_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, ServiceEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billEntityEClass, BillEntity.class, "BillEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBillEntity_Id(), ecorePackage.getEInt(), "id", null, 1, 1, BillEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBillEntity_Date(), ecorePackage.getEDate(), "date", null, 1, 1, BillEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBillEntity_IsPublished(), ecorePackage.getEBoolean(), "isPublished", null, 1, 1, BillEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBillEntity_IsPaid(), ecorePackage.getEBoolean(), "isPaid", null, 1, 1, BillEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBillEntity_UsedDiscounts(), this.getDiscountEntity(), null, "usedDiscounts", null, 0, -1, BillEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBillEntity_LegalEntityEntity(), thePersistencePackage_2.getLegalEntityEntity(), null, "legalEntityEntity", null, 1, 1, BillEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBillEntity_PurchaseEntity(), this.getPurchaseEntity(), null, "purchaseEntity", null, 0, -1, BillEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBillEntity_CreditCardInformationEntity(), thePersistencePackage_2.getCreditCardInformationEntity(), null, "creditCardInformationEntity", null, 1, 1, BillEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingBillEntityEClass, BookingBillEntity.class, "BookingBillEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingBillEntity_BookingEntity(), thePersistencePackage_2.getBookingEntity(), null, "bookingEntity", null, 1, 1, BookingBillEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //PersistencePackageImpl

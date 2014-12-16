/**
 */
package tda593.hotel.california.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tda593.hotel.california.CaliforniaFactory;
import tda593.hotel.california.CaliforniaPackage;
import tda593.hotel.california.DataService;

import tda593.hotel.california.billing.BillingPackage;

import tda593.hotel.california.billing.impl.BillingPackageImpl;

import tda593.hotel.california.booking.BookingPackage;

import tda593.hotel.california.booking.impl.BookingPackageImpl;

import tda593.hotel.california.facilities.FacilitiesPackage;

import tda593.hotel.california.facilities.impl.FacilitiesPackageImpl;
import tda593.hotel.california.facilities.persistence.PersistencePackage;
import tda593.hotel.california.facilities.persistence.impl.PersistencePackageImpl;

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
	private EClass dataServiceEClass = null;

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
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) : FacilitiesPackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) : PersistencePackage.eINSTANCE);
		BillingPackageImpl theBillingPackage = (BillingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI) instanceof BillingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI) : BillingPackage.eINSTANCE);
		tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl thePersistencePackage_1 = (tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.billing.persistence.PersistencePackage.eNS_URI) instanceof tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.billing.persistence.PersistencePackage.eNS_URI) : tda593.hotel.california.billing.persistence.PersistencePackage.eINSTANCE);
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);
		tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl thePersistencePackage_2 = (tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.booking.persistence.PersistencePackage.eNS_URI) instanceof tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.booking.persistence.PersistencePackage.eNS_URI) : tda593.hotel.california.booking.persistence.PersistencePackage.eINSTANCE);

		// Create package meta-data objects
		theCaliforniaPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theBillingPackage.createPackageContents();
		thePersistencePackage_1.createPackageContents();
		theBookingPackage.createPackageContents();
		thePersistencePackage_2.createPackageContents();

		// Initialize created meta-data
		theCaliforniaPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theBillingPackage.initializePackageContents();
		thePersistencePackage_1.initializePackageContents();
		theBookingPackage.initializePackageContents();
		thePersistencePackage_2.initializePackageContents();

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
		dataServiceEClass = createEClass(DATA_SERVICE);
		createEOperation(dataServiceEClass, DATA_SERVICE___GET__OBJECT);
		createEOperation(dataServiceEClass, DATA_SERVICE___GET_ALL);
		createEOperation(dataServiceEClass, DATA_SERVICE___COUNT);
		createEOperation(dataServiceEClass, DATA_SERVICE___SET__OBJECT);
		createEOperation(dataServiceEClass, DATA_SERVICE___SET_ALL__ELIST);
		createEOperation(dataServiceEClass, DATA_SERVICE___DELETE__OBJECT);
		createEOperation(dataServiceEClass, DATA_SERVICE___EXIST__OBJECT);
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
		FacilitiesPackage theFacilitiesPackage = (FacilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI);
		BillingPackage theBillingPackage = (BillingPackage)EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI);
		BookingPackage theBookingPackage = (BookingPackage)EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFacilitiesPackage);
		getESubpackages().add(theBillingPackage);
		getESubpackages().add(theBookingPackage);

		// Create type parameters
		ETypeParameter dataServiceEClass_E = addETypeParameter(dataServiceEClass, "E");
		ETypeParameter dataServiceEClass_ID = addETypeParameter(dataServiceEClass, "ID");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dataServiceEClass, DataService.class, "DataService", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDataService__Get__Object(), null, "get", 1, 1, IS_UNIQUE, !IS_ORDERED);
		EGenericType g1 = createEGenericType(dataServiceEClass_ID);
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

		// Create resource
		createResource(eNS_URI);
	}

} //CaliforniaPackageImpl

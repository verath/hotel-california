/**
 */
package tda593.hotel.california.booking.persistence.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tda593.hotel.california.CaliforniaPackage;

import tda593.hotel.california.billing.BillingPackage;

import tda593.hotel.california.billing.impl.BillingPackageImpl;

import tda593.hotel.california.booking.BookingPackage;

import tda593.hotel.california.booking.impl.BookingPackageImpl;

import tda593.hotel.california.booking.persistence.BookingEntity;
import tda593.hotel.california.booking.persistence.CreditCardInformationEntity;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;
import tda593.hotel.california.booking.persistence.OrganizationEntity;
import tda593.hotel.california.booking.persistence.PersistenceFactory;
import tda593.hotel.california.booking.persistence.PersistencePackage;
import tda593.hotel.california.booking.persistence.PersonEntity;
import tda593.hotel.california.booking.persistence.RoomStayEntity;
import tda593.hotel.california.booking.persistence.StayRequestEntity;
import tda593.hotel.california.booking.persistence.TravelInformationEntity;

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
	private EClass roomStayEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalEntityEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditCardInformationEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stayRequestEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travelInformationEntityEClass = null;

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
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#eNS_URI
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
		tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl thePersistencePackage_2 = (tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.billing.persistence.PersistencePackage.eNS_URI) instanceof tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.billing.persistence.PersistencePackage.eNS_URI) : tda593.hotel.california.billing.persistence.PersistencePackage.eINSTANCE);
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);

		// Create package meta-data objects
		thePersistencePackage.createPackageContents();
		theCaliforniaPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		thePersistencePackage_1.createPackageContents();
		theBillingPackage.createPackageContents();
		thePersistencePackage_2.createPackageContents();
		theBookingPackage.createPackageContents();

		// Initialize created meta-data
		thePersistencePackage.initializePackageContents();
		theCaliforniaPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		thePersistencePackage_1.initializePackageContents();
		theBillingPackage.initializePackageContents();
		thePersistencePackage_2.initializePackageContents();
		theBookingPackage.initializePackageContents();

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
	public EClass getRoomStayEntity() {
		return roomStayEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomStayEntity_Active() {
		return (EAttribute)roomStayEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomStayEntity_RoomEntity() {
		return (EReference)roomStayEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomStayEntity_PersonEntity() {
		return (EReference)roomStayEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomStayEntity_StayRequestEntity() {
		return (EReference)roomStayEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonEntity() {
		return personEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonEntity_Firstname() {
		return (EAttribute)personEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonEntity_Lastname() {
		return (EAttribute)personEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonEntity_SocialSecurityNumber() {
		return (EAttribute)personEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegalEntityEntity() {
		return legalEntityEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegalEntityEntity_Phone() {
		return (EAttribute)legalEntityEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegalEntityEntity_Email() {
		return (EAttribute)legalEntityEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalEntityEntity_CreditCardInformationEntity() {
		return (EReference)legalEntityEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreditCardInformationEntity() {
		return creditCardInformationEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCardInformationEntity_CardNumber() {
		return (EAttribute)creditCardInformationEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCardInformationEntity_CardHolder() {
		return (EAttribute)creditCardInformationEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCardInformationEntity_ExpirationDate() {
		return (EAttribute)creditCardInformationEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStayRequestEntity() {
		return stayRequestEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStayRequestEntity_Text() {
		return (EAttribute)stayRequestEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStayRequestEntity_TimeStamp() {
		return (EAttribute)stayRequestEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationEntity() {
		return organizationEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationEntity_Name() {
		return (EAttribute)organizationEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationEntity_OrganizationNumber() {
		return (EAttribute)organizationEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingEntity() {
		return bookingEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingEntity_Id() {
		return (EAttribute)bookingEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingEntity_StartDate() {
		return (EAttribute)bookingEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingEntity_EndDate() {
		return (EAttribute)bookingEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingEntity_SpecialRequest() {
		return (EAttribute)bookingEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingEntity_Price() {
		return (EAttribute)bookingEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingEntity_IsCanceled() {
		return (EAttribute)bookingEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingEntity_RoomStayEntity() {
		return (EReference)bookingEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingEntity_LegalEntityEntity() {
		return (EReference)bookingEntityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingEntity_RoomTypeEntity() {
		return (EReference)bookingEntityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingEntity_TravelInformationEntity() {
		return (EReference)bookingEntityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravelInformationEntity() {
		return travelInformationEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelInformationEntity_Id() {
		return (EAttribute)travelInformationEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelInformationEntity_TrackingId() {
		return (EAttribute)travelInformationEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelInformationEntity_Comment() {
		return (EAttribute)travelInformationEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelInformationEntity_TravelInformationEntity() {
		return (EReference)travelInformationEntityEClass.getEStructuralFeatures().get(3);
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
		roomStayEntityEClass = createEClass(ROOM_STAY_ENTITY);
		createEAttribute(roomStayEntityEClass, ROOM_STAY_ENTITY__ACTIVE);
		createEReference(roomStayEntityEClass, ROOM_STAY_ENTITY__ROOM_ENTITY);
		createEReference(roomStayEntityEClass, ROOM_STAY_ENTITY__PERSON_ENTITY);
		createEReference(roomStayEntityEClass, ROOM_STAY_ENTITY__STAY_REQUEST_ENTITY);

		personEntityEClass = createEClass(PERSON_ENTITY);
		createEAttribute(personEntityEClass, PERSON_ENTITY__FIRSTNAME);
		createEAttribute(personEntityEClass, PERSON_ENTITY__LASTNAME);
		createEAttribute(personEntityEClass, PERSON_ENTITY__SOCIAL_SECURITY_NUMBER);

		legalEntityEntityEClass = createEClass(LEGAL_ENTITY_ENTITY);
		createEAttribute(legalEntityEntityEClass, LEGAL_ENTITY_ENTITY__PHONE);
		createEAttribute(legalEntityEntityEClass, LEGAL_ENTITY_ENTITY__EMAIL);
		createEReference(legalEntityEntityEClass, LEGAL_ENTITY_ENTITY__CREDIT_CARD_INFORMATION_ENTITY);

		creditCardInformationEntityEClass = createEClass(CREDIT_CARD_INFORMATION_ENTITY);
		createEAttribute(creditCardInformationEntityEClass, CREDIT_CARD_INFORMATION_ENTITY__CARD_NUMBER);
		createEAttribute(creditCardInformationEntityEClass, CREDIT_CARD_INFORMATION_ENTITY__CARD_HOLDER);
		createEAttribute(creditCardInformationEntityEClass, CREDIT_CARD_INFORMATION_ENTITY__EXPIRATION_DATE);

		stayRequestEntityEClass = createEClass(STAY_REQUEST_ENTITY);
		createEAttribute(stayRequestEntityEClass, STAY_REQUEST_ENTITY__TEXT);
		createEAttribute(stayRequestEntityEClass, STAY_REQUEST_ENTITY__TIME_STAMP);

		organizationEntityEClass = createEClass(ORGANIZATION_ENTITY);
		createEAttribute(organizationEntityEClass, ORGANIZATION_ENTITY__NAME);
		createEAttribute(organizationEntityEClass, ORGANIZATION_ENTITY__ORGANIZATION_NUMBER);

		bookingEntityEClass = createEClass(BOOKING_ENTITY);
		createEAttribute(bookingEntityEClass, BOOKING_ENTITY__ID);
		createEAttribute(bookingEntityEClass, BOOKING_ENTITY__START_DATE);
		createEAttribute(bookingEntityEClass, BOOKING_ENTITY__END_DATE);
		createEAttribute(bookingEntityEClass, BOOKING_ENTITY__SPECIAL_REQUEST);
		createEAttribute(bookingEntityEClass, BOOKING_ENTITY__PRICE);
		createEAttribute(bookingEntityEClass, BOOKING_ENTITY__IS_CANCELED);
		createEReference(bookingEntityEClass, BOOKING_ENTITY__ROOM_STAY_ENTITY);
		createEReference(bookingEntityEClass, BOOKING_ENTITY__LEGAL_ENTITY_ENTITY);
		createEReference(bookingEntityEClass, BOOKING_ENTITY__ROOM_TYPE_ENTITY);
		createEReference(bookingEntityEClass, BOOKING_ENTITY__TRAVEL_INFORMATION_ENTITY);

		travelInformationEntityEClass = createEClass(TRAVEL_INFORMATION_ENTITY);
		createEAttribute(travelInformationEntityEClass, TRAVEL_INFORMATION_ENTITY__ID);
		createEAttribute(travelInformationEntityEClass, TRAVEL_INFORMATION_ENTITY__TRACKING_ID);
		createEAttribute(travelInformationEntityEClass, TRAVEL_INFORMATION_ENTITY__COMMENT);
		createEReference(travelInformationEntityEClass, TRAVEL_INFORMATION_ENTITY__TRAVEL_INFORMATION_ENTITY);
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
		tda593.hotel.california.facilities.persistence.PersistencePackage thePersistencePackage_1 = (tda593.hotel.california.facilities.persistence.PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.facilities.persistence.PersistencePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		personEntityEClass.getESuperTypes().add(this.getLegalEntityEntity());
		organizationEntityEClass.getESuperTypes().add(this.getLegalEntityEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(roomStayEntityEClass, RoomStayEntity.class, "RoomStayEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomStayEntity_Active(), ecorePackage.getEBoolean(), "active", null, 1, 1, RoomStayEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomStayEntity_RoomEntity(), thePersistencePackage_1.getRoomEntity(), null, "roomEntity", null, 1, 1, RoomStayEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomStayEntity_PersonEntity(), this.getPersonEntity(), null, "personEntity", null, 0, -1, RoomStayEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomStayEntity_StayRequestEntity(), this.getStayRequestEntity(), null, "stayRequestEntity", null, 0, -1, RoomStayEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personEntityEClass, PersonEntity.class, "PersonEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonEntity_Firstname(), ecorePackage.getEString(), "firstname", null, 1, 1, PersonEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersonEntity_Lastname(), ecorePackage.getEString(), "lastname", null, 1, 1, PersonEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersonEntity_SocialSecurityNumber(), ecorePackage.getEString(), "socialSecurityNumber", null, 1, 1, PersonEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(legalEntityEntityEClass, LegalEntityEntity.class, "LegalEntityEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegalEntityEntity_Phone(), ecorePackage.getEString(), "phone", null, 1, 1, LegalEntityEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLegalEntityEntity_Email(), ecorePackage.getEString(), "email", null, 1, 1, LegalEntityEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLegalEntityEntity_CreditCardInformationEntity(), this.getCreditCardInformationEntity(), null, "creditCardInformationEntity", null, 1, 1, LegalEntityEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(creditCardInformationEntityEClass, CreditCardInformationEntity.class, "CreditCardInformationEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreditCardInformationEntity_CardNumber(), ecorePackage.getEString(), "cardNumber", null, 1, 1, CreditCardInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformationEntity_CardHolder(), ecorePackage.getEString(), "cardHolder", null, 1, 1, CreditCardInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformationEntity_ExpirationDate(), ecorePackage.getEDate(), "expirationDate", null, 1, 1, CreditCardInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stayRequestEntityEClass, StayRequestEntity.class, "StayRequestEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStayRequestEntity_Text(), ecorePackage.getEString(), "text", null, 1, 1, StayRequestEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStayRequestEntity_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 1, 1, StayRequestEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(organizationEntityEClass, OrganizationEntity.class, "OrganizationEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganizationEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, OrganizationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOrganizationEntity_OrganizationNumber(), ecorePackage.getEString(), "organizationNumber", null, 1, 1, OrganizationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingEntityEClass, BookingEntity.class, "BookingEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookingEntity_Id(), ecorePackage.getEInt(), "id", null, 1, 1, BookingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingEntity_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, BookingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingEntity_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, BookingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingEntity_SpecialRequest(), ecorePackage.getEString(), "specialRequest", null, 1, 1, BookingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingEntity_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, BookingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingEntity_IsCanceled(), ecorePackage.getEBoolean(), "isCanceled", null, 1, 1, BookingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingEntity_RoomStayEntity(), this.getRoomStayEntity(), null, "roomStayEntity", null, 1, 1, BookingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingEntity_LegalEntityEntity(), this.getLegalEntityEntity(), null, "legalEntityEntity", null, 1, 1, BookingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingEntity_RoomTypeEntity(), thePersistencePackage_1.getRoomTypeEntity(), null, "roomTypeEntity", null, 1, 1, BookingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingEntity_TravelInformationEntity(), this.getTravelInformationEntity(), null, "travelInformationEntity", null, 1, 1, BookingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(travelInformationEntityEClass, TravelInformationEntity.class, "TravelInformationEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTravelInformationEntity_Id(), ecorePackage.getEInt(), "id", null, 1, 1, TravelInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTravelInformationEntity_TrackingId(), ecorePackage.getEString(), "trackingId", null, 1, 1, TravelInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTravelInformationEntity_Comment(), ecorePackage.getEString(), "comment", null, 1, 1, TravelInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTravelInformationEntity_TravelInformationEntity(), this.getTravelInformationEntity(), null, "travelInformationEntity", null, 1, 1, TravelInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //PersistencePackageImpl

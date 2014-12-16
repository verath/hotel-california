/**
 */
package tda593.hotel.california.facilities.persistence.impl;

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
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.impl.FacilitiesPackageImpl;
import tda593.hotel.california.facilities.persistence.ConferenceRoomEntity;
import tda593.hotel.california.facilities.persistence.DisabilityApprovalEntity;
import tda593.hotel.california.facilities.persistence.GuestRoomEntity;
import tda593.hotel.california.facilities.persistence.KeyCardEntity;
import tda593.hotel.california.facilities.persistence.PersistenceFactory;
import tda593.hotel.california.facilities.persistence.PersistencePackage;
import tda593.hotel.california.facilities.persistence.RoomApprovalEntity;
import tda593.hotel.california.facilities.persistence.RoomEntity;
import tda593.hotel.california.facilities.persistence.RoomTypeEntity;
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
	private EClass keyCardEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomApprovalEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disabilityApprovalEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conferenceRoomEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestRoomEntityEClass = null;

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
	 * @see tda593.hotel.california.facilities.persistence.PersistencePackage#eNS_URI
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
		BillingPackageImpl theBillingPackage = (BillingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI) instanceof BillingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI) : BillingPackage.eINSTANCE);
		tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl thePersistencePackage_1 = (tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.billing.persistence.PersistencePackage.eNS_URI) instanceof tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.billing.persistence.PersistencePackage.eNS_URI) : tda593.hotel.california.billing.persistence.PersistencePackage.eINSTANCE);
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);
		tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl thePersistencePackage_2 = (tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.booking.persistence.PersistencePackage.eNS_URI) instanceof tda593.hotel.california.booking.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(tda593.hotel.california.booking.persistence.PersistencePackage.eNS_URI) : tda593.hotel.california.booking.persistence.PersistencePackage.eINSTANCE);

		// Create package meta-data objects
		thePersistencePackage.createPackageContents();
		theCaliforniaPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theBillingPackage.createPackageContents();
		thePersistencePackage_1.createPackageContents();
		theBookingPackage.createPackageContents();
		thePersistencePackage_2.createPackageContents();

		// Initialize created meta-data
		thePersistencePackage.initializePackageContents();
		theCaliforniaPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theBillingPackage.initializePackageContents();
		thePersistencePackage_1.initializePackageContents();
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
	public EClass getKeyCardEntity() {
		return keyCardEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyCardEntity_Id() {
		return (EAttribute)keyCardEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomTypeEntity() {
		return roomTypeEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomTypeEntity_Description() {
		return (EAttribute)roomTypeEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomTypeEntity_Id() {
		return (EAttribute)roomTypeEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomTypeEntity_Name() {
		return (EAttribute)roomTypeEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomTypeEntity_RoomApprovals() {
		return (EReference)roomTypeEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomApprovalEntity() {
		return roomApprovalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomApprovalEntity_Id() {
		return (EAttribute)roomApprovalEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomApprovalEntity_Name() {
		return (EAttribute)roomApprovalEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisabilityApprovalEntity() {
		return disabilityApprovalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisabilityApprovalEntity_Id() {
		return (EAttribute)disabilityApprovalEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisabilityApprovalEntity_Name() {
		return (EAttribute)disabilityApprovalEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConferenceRoomEntity() {
		return conferenceRoomEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConferenceRoomEntity_NumberOfSeats() {
		return (EAttribute)conferenceRoomEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConferenceRoomEntity_Equipment() {
		return (EAttribute)conferenceRoomEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomEntity() {
		return roomEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEntity_Floor() {
		return (EAttribute)roomEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEntity_RoomNumber() {
		return (EAttribute)roomEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEntity_IsOperational() {
		return (EAttribute)roomEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEntity_IsCleaned() {
		return (EAttribute)roomEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEntity_Description() {
		return (EAttribute)roomEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEntity_Photos() {
		return (EAttribute)roomEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEntity_RoomTypeEntity() {
		return (EReference)roomEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEntity_AllowedKeyCards() {
		return (EReference)roomEntityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEntity_DisabilityApprovals() {
		return (EReference)roomEntityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuestRoomEntity() {
		return guestRoomEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuestRoomEntity_NumberOfBeds() {
		return (EAttribute)guestRoomEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuestRoomEntity_NumberOfExtrabeds() {
		return (EAttribute)guestRoomEntityEClass.getEStructuralFeatures().get(1);
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
		keyCardEntityEClass = createEClass(KEY_CARD_ENTITY);
		createEAttribute(keyCardEntityEClass, KEY_CARD_ENTITY__ID);

		roomTypeEntityEClass = createEClass(ROOM_TYPE_ENTITY);
		createEAttribute(roomTypeEntityEClass, ROOM_TYPE_ENTITY__DESCRIPTION);
		createEAttribute(roomTypeEntityEClass, ROOM_TYPE_ENTITY__ID);
		createEAttribute(roomTypeEntityEClass, ROOM_TYPE_ENTITY__NAME);
		createEReference(roomTypeEntityEClass, ROOM_TYPE_ENTITY__ROOM_APPROVALS);

		roomApprovalEntityEClass = createEClass(ROOM_APPROVAL_ENTITY);
		createEAttribute(roomApprovalEntityEClass, ROOM_APPROVAL_ENTITY__ID);
		createEAttribute(roomApprovalEntityEClass, ROOM_APPROVAL_ENTITY__NAME);

		disabilityApprovalEntityEClass = createEClass(DISABILITY_APPROVAL_ENTITY);
		createEAttribute(disabilityApprovalEntityEClass, DISABILITY_APPROVAL_ENTITY__ID);
		createEAttribute(disabilityApprovalEntityEClass, DISABILITY_APPROVAL_ENTITY__NAME);

		conferenceRoomEntityEClass = createEClass(CONFERENCE_ROOM_ENTITY);
		createEAttribute(conferenceRoomEntityEClass, CONFERENCE_ROOM_ENTITY__NUMBER_OF_SEATS);
		createEAttribute(conferenceRoomEntityEClass, CONFERENCE_ROOM_ENTITY__EQUIPMENT);

		roomEntityEClass = createEClass(ROOM_ENTITY);
		createEAttribute(roomEntityEClass, ROOM_ENTITY__FLOOR);
		createEAttribute(roomEntityEClass, ROOM_ENTITY__ROOM_NUMBER);
		createEAttribute(roomEntityEClass, ROOM_ENTITY__IS_OPERATIONAL);
		createEAttribute(roomEntityEClass, ROOM_ENTITY__IS_CLEANED);
		createEAttribute(roomEntityEClass, ROOM_ENTITY__DESCRIPTION);
		createEAttribute(roomEntityEClass, ROOM_ENTITY__PHOTOS);
		createEReference(roomEntityEClass, ROOM_ENTITY__ROOM_TYPE_ENTITY);
		createEReference(roomEntityEClass, ROOM_ENTITY__ALLOWED_KEY_CARDS);
		createEReference(roomEntityEClass, ROOM_ENTITY__DISABILITY_APPROVALS);

		guestRoomEntityEClass = createEClass(GUEST_ROOM_ENTITY);
		createEAttribute(guestRoomEntityEClass, GUEST_ROOM_ENTITY__NUMBER_OF_BEDS);
		createEAttribute(guestRoomEntityEClass, GUEST_ROOM_ENTITY__NUMBER_OF_EXTRABEDS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		conferenceRoomEntityEClass.getESuperTypes().add(this.getRoomEntity());
		guestRoomEntityEClass.getESuperTypes().add(this.getRoomEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(keyCardEntityEClass, KeyCardEntity.class, "KeyCardEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyCardEntity_Id(), ecorePackage.getEString(), "id", null, 1, 1, KeyCardEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomTypeEntityEClass, RoomTypeEntity.class, "RoomTypeEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomTypeEntity_Description(), ecorePackage.getEString(), "description", null, 1, 1, RoomTypeEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomTypeEntity_Id(), ecorePackage.getEInt(), "id", null, 1, 1, RoomTypeEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomTypeEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoomTypeEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomTypeEntity_RoomApprovals(), this.getRoomApprovalEntity(), null, "roomApprovals", null, 2, 2, RoomTypeEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomApprovalEntityEClass, RoomApprovalEntity.class, "RoomApprovalEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomApprovalEntity_Id(), ecorePackage.getEInt(), "id", null, 1, 1, RoomApprovalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomApprovalEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoomApprovalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(disabilityApprovalEntityEClass, DisabilityApprovalEntity.class, "DisabilityApprovalEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisabilityApprovalEntity_Id(), ecorePackage.getEInt(), "id", null, 1, 1, DisabilityApprovalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDisabilityApprovalEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, DisabilityApprovalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conferenceRoomEntityEClass, ConferenceRoomEntity.class, "ConferenceRoomEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConferenceRoomEntity_NumberOfSeats(), ecorePackage.getEInt(), "numberOfSeats", null, 1, 1, ConferenceRoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConferenceRoomEntity_Equipment(), ecorePackage.getEString(), "equipment", null, 0, -1, ConferenceRoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEntityEClass, RoomEntity.class, "RoomEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomEntity_Floor(), ecorePackage.getEInt(), "floor", null, 1, 1, RoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomEntity_RoomNumber(), ecorePackage.getEInt(), "roomNumber", null, 1, 1, RoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomEntity_IsOperational(), ecorePackage.getEBoolean(), "isOperational", null, 1, 1, RoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomEntity_IsCleaned(), ecorePackage.getEBoolean(), "isCleaned", null, 1, 1, RoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomEntity_Description(), ecorePackage.getEString(), "description", null, 1, 1, RoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomEntity_Photos(), ecorePackage.getEString(), "photos", null, 0, -1, RoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomEntity_RoomTypeEntity(), this.getRoomTypeEntity(), null, "roomTypeEntity", null, 1, 1, RoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomEntity_AllowedKeyCards(), this.getKeyCardEntity(), null, "allowedKeyCards", null, 0, -1, RoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomEntity_DisabilityApprovals(), this.getDisabilityApprovalEntity(), null, "disabilityApprovals", null, 0, -1, RoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guestRoomEntityEClass, GuestRoomEntity.class, "GuestRoomEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuestRoomEntity_NumberOfBeds(), ecorePackage.getEInt(), "numberOfBeds", null, 1, 1, GuestRoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuestRoomEntity_NumberOfExtrabeds(), ecorePackage.getEInt(), "numberOfExtrabeds", null, 1, 1, GuestRoomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //PersistencePackageImpl

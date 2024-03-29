/**
 */
package tda593.hotel.california.facilities.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import tda593.hotel.california.CaliforniaPackage;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.impl.BillingPackageImpl;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.impl.BookingPackageImpl;
import tda593.hotel.california.facilities.AdminKeyCardManager;
import tda593.hotel.california.facilities.AdminKeyCardManagerImpl;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.AdminRoomManagerImpl;
import tda593.hotel.california.facilities.ConferenceRoom;
import tda593.hotel.california.facilities.DisabilityApproval;
import tda593.hotel.california.facilities.FacilitiesFactory;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.GuestRoom;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.KeyCardDataService;
import tda593.hotel.california.facilities.KeyCardManager;
import tda593.hotel.california.facilities.KeyCardManagerImpl;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomApproval;
import tda593.hotel.california.facilities.RoomDataService;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomManagerImpl;
import tda593.hotel.california.facilities.RoomType;
import tda593.hotel.california.facilities.RoomTypeDataService;
import tda593.hotel.california.impl.CaliforniaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FacilitiesPackageImpl extends EPackageImpl implements FacilitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminKeyCardManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyCardManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminRoomManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomDataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeDataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conferenceRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyCardManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyCardDataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminRoomManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminKeyCardManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roomApprovalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum disabilityApprovalEEnum = null;

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
	 * @see tda593.hotel.california.facilities.FacilitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FacilitiesPackageImpl() {
		super(eNS_URI, FacilitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FacilitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FacilitiesPackage init() {
		if (isInited) return (FacilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI);

		// Obtain or create and register package
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FacilitiesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CaliforniaPackageImpl theCaliforniaPackage = (CaliforniaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI) instanceof CaliforniaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI) : CaliforniaPackage.eINSTANCE);
		BillingPackageImpl theBillingPackage = (BillingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI) instanceof BillingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI) : BillingPackage.eINSTANCE);
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);

		// Create package meta-data objects
		theFacilitiesPackage.createPackageContents();
		theCaliforniaPackage.createPackageContents();
		theBillingPackage.createPackageContents();
		theBookingPackage.createPackageContents();

		// Initialize created meta-data
		theFacilitiesPackage.initializePackageContents();
		theCaliforniaPackage.initializePackageContents();
		theBillingPackage.initializePackageContents();
		theBookingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFacilitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FacilitiesPackage.eNS_URI, theFacilitiesPackage);
		return theFacilitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminKeyCardManager() {
		return adminKeyCardManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminKeyCardManager__AddKeyCard__String() {
		return adminKeyCardManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminKeyCardManager__RemoveKeyCard__String() {
		return adminKeyCardManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyCardManager() {
		return keyCardManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyCardManager__GetKeyCard__String() {
		return keyCardManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyCard() {
		return keyCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyCard_Id() {
		return (EAttribute)keyCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminRoomManager() {
		return adminRoomManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminRoomManager__RemoveRoom__String() {
		return adminRoomManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminRoomManager__AddRoomType__String_String_EList_double() {
		return adminRoomManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminRoomManager__RemoveRoomType__RoomType() {
		return adminRoomManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminRoomManager__AddGuestRoom__String_int_String_EList_EList_RoomType_int_int() {
		return adminRoomManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminRoomManager__AddConferenceRoom__String_int_String_EList_EList_RoomType_int_EList() {
		return adminRoomManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomManager() {
		return roomManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__GetRoomTypes() {
		return roomManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__RegisterKeyCard__KeyCard_String() {
		return roomManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__RegisterKeyCard__String_String() {
		return roomManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__GetRooms() {
		return roomManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__UnregisterKeyCard__KeyCard_String() {
		return roomManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__UnregisterKeyCard__String_String() {
		return roomManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__UnregisterAllKeyCards__String() {
		return roomManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__GetRoomTypeAmounts() {
		return roomManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__GetRoomTypeAmount__RoomType() {
		return roomManagerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__GetRoom__String() {
		return roomManagerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__GetRoomType__String() {
		return roomManagerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__GetGuestRooms() {
		return roomManagerEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__GetConferenceRooms() {
		return roomManagerEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__SetIsBeingCleaned__Room_boolean() {
		return roomManagerEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType() {
		return roomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Name() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Description() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_RoomApprovals() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Price() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Floor() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomNumber() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_IsOperational() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_IsBeingCleaned() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Description() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Photos() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_AllowedKeyCards() {
		return (EReference)roomEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_RoomType() {
		return (EReference)roomEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_DisabilityApprovals() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoom__RegisterKeyCard__KeyCard() {
		return roomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoom__UnregisterKeyCard__KeyCard() {
		return roomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoom__UnregisterKeyCards() {
		return roomEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomManagerImpl() {
		return roomManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomManagerImpl_RoomDataService() {
		return (EReference)roomManagerImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomManagerImpl_RoomTypeDataService() {
		return (EReference)roomManagerImplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomManagerImpl_KeyCardManager() {
		return (EReference)roomManagerImplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomDataService() {
		return roomDataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomDataService__GetAllGuestRooms() {
		return roomDataServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomDataService__GetAllConferenceRooms() {
		return roomDataServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomDataService__GetGuestRoom__String() {
		return roomDataServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomDataService__GetConferenceRoom__String() {
		return roomDataServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomTypeDataService() {
		return roomTypeDataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConferenceRoom() {
		return conferenceRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConferenceRoom_NumberOfSeats() {
		return (EAttribute)conferenceRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConferenceRoom_Equipment() {
		return (EAttribute)conferenceRoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuestRoom() {
		return guestRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuestRoom_NumberOfBeds() {
		return (EAttribute)guestRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuestRoom_NumberOfExtrabeds() {
		return (EAttribute)guestRoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyCardManagerImpl() {
		return keyCardManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyCardManagerImpl_KeyCardDataService() {
		return (EReference)keyCardManagerImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyCardDataService() {
		return keyCardDataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminRoomManagerImpl() {
		return adminRoomManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminKeyCardManagerImpl() {
		return adminKeyCardManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoomApproval() {
		return roomApprovalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisabilityApproval() {
		return disabilityApprovalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitiesFactory getFacilitiesFactory() {
		return (FacilitiesFactory)getEFactoryInstance();
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
		adminKeyCardManagerEClass = createEClass(ADMIN_KEY_CARD_MANAGER);
		createEOperation(adminKeyCardManagerEClass, ADMIN_KEY_CARD_MANAGER___ADD_KEY_CARD__STRING);
		createEOperation(adminKeyCardManagerEClass, ADMIN_KEY_CARD_MANAGER___REMOVE_KEY_CARD__STRING);

		keyCardManagerEClass = createEClass(KEY_CARD_MANAGER);
		createEOperation(keyCardManagerEClass, KEY_CARD_MANAGER___GET_KEY_CARD__STRING);

		keyCardEClass = createEClass(KEY_CARD);
		createEAttribute(keyCardEClass, KEY_CARD__ID);

		adminRoomManagerEClass = createEClass(ADMIN_ROOM_MANAGER);
		createEOperation(adminRoomManagerEClass, ADMIN_ROOM_MANAGER___REMOVE_ROOM__STRING);
		createEOperation(adminRoomManagerEClass, ADMIN_ROOM_MANAGER___ADD_ROOM_TYPE__STRING_STRING_ELIST_DOUBLE);
		createEOperation(adminRoomManagerEClass, ADMIN_ROOM_MANAGER___REMOVE_ROOM_TYPE__ROOMTYPE);
		createEOperation(adminRoomManagerEClass, ADMIN_ROOM_MANAGER___ADD_GUEST_ROOM__STRING_INT_STRING_ELIST_ELIST_ROOMTYPE_INT_INT);
		createEOperation(adminRoomManagerEClass, ADMIN_ROOM_MANAGER___ADD_CONFERENCE_ROOM__STRING_INT_STRING_ELIST_ELIST_ROOMTYPE_INT_ELIST);

		roomManagerEClass = createEClass(ROOM_MANAGER);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_ROOM_TYPES);
		createEOperation(roomManagerEClass, ROOM_MANAGER___REGISTER_KEY_CARD__KEYCARD_STRING);
		createEOperation(roomManagerEClass, ROOM_MANAGER___REGISTER_KEY_CARD__STRING_STRING);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_ROOMS);
		createEOperation(roomManagerEClass, ROOM_MANAGER___UNREGISTER_KEY_CARD__KEYCARD_STRING);
		createEOperation(roomManagerEClass, ROOM_MANAGER___UNREGISTER_KEY_CARD__STRING_STRING);
		createEOperation(roomManagerEClass, ROOM_MANAGER___UNREGISTER_ALL_KEY_CARDS__STRING);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_ROOM_TYPE_AMOUNTS);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_ROOM_TYPE_AMOUNT__ROOMTYPE);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_ROOM__STRING);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_ROOM_TYPE__STRING);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_GUEST_ROOMS);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_CONFERENCE_ROOMS);
		createEOperation(roomManagerEClass, ROOM_MANAGER___SET_IS_BEING_CLEANED__ROOM_BOOLEAN);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NAME);
		createEAttribute(roomTypeEClass, ROOM_TYPE__DESCRIPTION);
		createEAttribute(roomTypeEClass, ROOM_TYPE__ROOM_APPROVALS);
		createEAttribute(roomTypeEClass, ROOM_TYPE__PRICE);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__FLOOR);
		createEAttribute(roomEClass, ROOM__ROOM_NUMBER);
		createEAttribute(roomEClass, ROOM__IS_OPERATIONAL);
		createEAttribute(roomEClass, ROOM__IS_BEING_CLEANED);
		createEAttribute(roomEClass, ROOM__DESCRIPTION);
		createEAttribute(roomEClass, ROOM__PHOTOS);
		createEReference(roomEClass, ROOM__ALLOWED_KEY_CARDS);
		createEReference(roomEClass, ROOM__ROOM_TYPE);
		createEAttribute(roomEClass, ROOM__DISABILITY_APPROVALS);
		createEOperation(roomEClass, ROOM___REGISTER_KEY_CARD__KEYCARD);
		createEOperation(roomEClass, ROOM___UNREGISTER_KEY_CARD__KEYCARD);
		createEOperation(roomEClass, ROOM___UNREGISTER_KEY_CARDS);

		guestRoomEClass = createEClass(GUEST_ROOM);
		createEAttribute(guestRoomEClass, GUEST_ROOM__NUMBER_OF_BEDS);
		createEAttribute(guestRoomEClass, GUEST_ROOM__NUMBER_OF_EXTRABEDS);

		conferenceRoomEClass = createEClass(CONFERENCE_ROOM);
		createEAttribute(conferenceRoomEClass, CONFERENCE_ROOM__NUMBER_OF_SEATS);
		createEAttribute(conferenceRoomEClass, CONFERENCE_ROOM__EQUIPMENT);

		roomManagerImplEClass = createEClass(ROOM_MANAGER_IMPL);
		createEReference(roomManagerImplEClass, ROOM_MANAGER_IMPL__ROOM_DATA_SERVICE);
		createEReference(roomManagerImplEClass, ROOM_MANAGER_IMPL__ROOM_TYPE_DATA_SERVICE);
		createEReference(roomManagerImplEClass, ROOM_MANAGER_IMPL__KEY_CARD_MANAGER);

		roomDataServiceEClass = createEClass(ROOM_DATA_SERVICE);
		createEOperation(roomDataServiceEClass, ROOM_DATA_SERVICE___GET_ALL_GUEST_ROOMS);
		createEOperation(roomDataServiceEClass, ROOM_DATA_SERVICE___GET_ALL_CONFERENCE_ROOMS);
		createEOperation(roomDataServiceEClass, ROOM_DATA_SERVICE___GET_GUEST_ROOM__STRING);
		createEOperation(roomDataServiceEClass, ROOM_DATA_SERVICE___GET_CONFERENCE_ROOM__STRING);

		roomTypeDataServiceEClass = createEClass(ROOM_TYPE_DATA_SERVICE);

		keyCardManagerImplEClass = createEClass(KEY_CARD_MANAGER_IMPL);
		createEReference(keyCardManagerImplEClass, KEY_CARD_MANAGER_IMPL__KEY_CARD_DATA_SERVICE);

		keyCardDataServiceEClass = createEClass(KEY_CARD_DATA_SERVICE);

		adminRoomManagerImplEClass = createEClass(ADMIN_ROOM_MANAGER_IMPL);

		adminKeyCardManagerImplEClass = createEClass(ADMIN_KEY_CARD_MANAGER_IMPL);

		// Create enums
		roomApprovalEEnum = createEEnum(ROOM_APPROVAL);
		disabilityApprovalEEnum = createEEnum(DISABILITY_APPROVAL);
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
		adminKeyCardManagerEClass.getESuperTypes().add(this.getKeyCardManager());
		adminRoomManagerEClass.getESuperTypes().add(this.getRoomManager());
		guestRoomEClass.getESuperTypes().add(this.getRoom());
		conferenceRoomEClass.getESuperTypes().add(this.getRoom());
		roomManagerImplEClass.getESuperTypes().add(this.getRoomManager());
		EGenericType g1 = createEGenericType(theCaliforniaPackage.getDataService());
		EGenericType g2 = createEGenericType(this.getRoom());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		roomDataServiceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theCaliforniaPackage.getDataService());
		g2 = createEGenericType(this.getRoomType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		roomTypeDataServiceEClass.getEGenericSuperTypes().add(g1);
		keyCardManagerImplEClass.getESuperTypes().add(this.getKeyCardManager());
		g1 = createEGenericType(theCaliforniaPackage.getDataService());
		g2 = createEGenericType(this.getKeyCard());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		keyCardDataServiceEClass.getEGenericSuperTypes().add(g1);
		adminRoomManagerImplEClass.getESuperTypes().add(this.getRoomManagerImpl());
		adminRoomManagerImplEClass.getESuperTypes().add(this.getAdminRoomManager());
		adminKeyCardManagerImplEClass.getESuperTypes().add(this.getKeyCardManagerImpl());
		adminKeyCardManagerImplEClass.getESuperTypes().add(this.getAdminKeyCardManager());

		// Initialize classes, features, and operations; add parameters
		initEClass(adminKeyCardManagerEClass, AdminKeyCardManager.class, "AdminKeyCardManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAdminKeyCardManager__AddKeyCard__String(), null, "addKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cardNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminKeyCardManager__RemoveKeyCard__String(), null, "removeKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cardNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(keyCardManagerEClass, KeyCardManager.class, "KeyCardManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getKeyCardManager__GetKeyCard__String(), this.getKeyCard(), "getKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "keyCardNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(keyCardEClass, KeyCard.class, "KeyCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyCard_Id(), ecorePackage.getEString(), "id", null, 1, 1, KeyCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(adminRoomManagerEClass, AdminRoomManager.class, "AdminRoomManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAdminRoomManager__RemoveRoom__String(), ecorePackage.getEBoolean(), "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminRoomManager__AddRoomType__String_String_EList_double(), this.getRoomType(), "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomApproval(), "roomApprovals", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminRoomManager__RemoveRoomType__RoomType(), ecorePackage.getEBoolean(), "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminRoomManager__AddGuestRoom__String_int_String_EList_EList_RoomType_int_int(), this.getGuestRoom(), "addGuestRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "floor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDisabilityApproval(), "disabilityApprovals", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "photos", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfExtraBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminRoomManager__AddConferenceRoom__String_int_String_EList_EList_RoomType_int_EList(), this.getConferenceRoom(), "addConferenceRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "floor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDisabilityApproval(), "disabilityApprovals", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "photos", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfSeats", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "equipment", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomManagerEClass, RoomManager.class, "RoomManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRoomManager__GetRoomTypes(), this.getRoomType(), "getRoomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__RegisterKeyCard__KeyCard_String(), null, "registerKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKeyCard(), "keyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__RegisterKeyCard__String_String(), null, "registerKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "keyCardNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomManager__GetRooms(), this.getRoom(), "getRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__UnregisterKeyCard__KeyCard_String(), null, "unregisterKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKeyCard(), "keyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__UnregisterKeyCard__String_String(), null, "unregisterKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "keyCardNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__UnregisterAllKeyCards__String(), null, "unregisterAllKeyCards", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__GetRoomTypeAmounts(), null, "getRoomTypeAmounts", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(this.getRoomType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getRoomManager__GetRoomTypeAmount__RoomType(), ecorePackage.getEInt(), "getRoomTypeAmount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__GetRoom__String(), this.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__GetRoomType__String(), this.getRoomType(), "getRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomManager__GetGuestRooms(), this.getGuestRoom(), "getGuestRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomManager__GetConferenceRooms(), this.getConferenceRoom(), "getConferenceRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__SetIsBeingCleaned__Room_boolean(), null, "setIsBeingCleaned", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Description(), ecorePackage.getEString(), "description", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_RoomApprovals(), this.getRoomApproval(), "roomApprovals", null, 0, -1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Floor(), ecorePackage.getEInt(), "floor", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomNumber(), ecorePackage.getEString(), "roomNumber", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_IsOperational(), ecorePackage.getEBoolean(), "isOperational", "true", 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_IsBeingCleaned(), ecorePackage.getEBoolean(), "isBeingCleaned", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Description(), ecorePackage.getEString(), "description", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Photos(), ecorePackage.getEString(), "photos", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_AllowedKeyCards(), this.getKeyCard(), null, "allowedKeyCards", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomType(), this.getRoomType(), null, "roomType", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_DisabilityApprovals(), this.getDisabilityApproval(), "disabilityApprovals", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoom__RegisterKeyCard__KeyCard(), null, "registerKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKeyCard(), "keyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoom__UnregisterKeyCard__KeyCard(), null, "unregisterKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKeyCard(), "keyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoom__UnregisterKeyCards(), null, "unregisterKeyCards", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(guestRoomEClass, GuestRoom.class, "GuestRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuestRoom_NumberOfBeds(), ecorePackage.getEInt(), "numberOfBeds", null, 1, 1, GuestRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuestRoom_NumberOfExtrabeds(), ecorePackage.getEInt(), "numberOfExtrabeds", null, 1, 1, GuestRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conferenceRoomEClass, ConferenceRoom.class, "ConferenceRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConferenceRoom_NumberOfSeats(), ecorePackage.getEInt(), "numberOfSeats", null, 1, 1, ConferenceRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConferenceRoom_Equipment(), ecorePackage.getEString(), "equipment", null, 0, -1, ConferenceRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomManagerImplEClass, RoomManagerImpl.class, "RoomManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomManagerImpl_RoomDataService(), this.getRoomDataService(), null, "roomDataService", null, 1, 1, RoomManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomManagerImpl_RoomTypeDataService(), this.getRoomTypeDataService(), null, "roomTypeDataService", null, 1, 1, RoomManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomManagerImpl_KeyCardManager(), this.getKeyCardManager(), null, "keyCardManager", null, 1, 1, RoomManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomDataServiceEClass, RoomDataService.class, "RoomDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRoomDataService__GetAllGuestRooms(), this.getGuestRoom(), "getAllGuestRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomDataService__GetAllConferenceRooms(), this.getConferenceRoom(), "getAllConferenceRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomDataService__GetGuestRoom__String(), this.getGuestRoom(), "getGuestRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomDataService__GetConferenceRoom__String(), this.getConferenceRoom(), "getConferenceRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypeDataServiceEClass, RoomTypeDataService.class, "RoomTypeDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyCardManagerImplEClass, KeyCardManagerImpl.class, "KeyCardManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeyCardManagerImpl_KeyCardDataService(), this.getKeyCardDataService(), null, "keyCardDataService", null, 1, 1, KeyCardManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(keyCardDataServiceEClass, KeyCardDataService.class, "KeyCardDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adminRoomManagerImplEClass, AdminRoomManagerImpl.class, "AdminRoomManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adminKeyCardManagerImplEClass, AdminKeyCardManagerImpl.class, "AdminKeyCardManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(roomApprovalEEnum, RoomApproval.class, "RoomApproval");

		initEEnum(disabilityApprovalEEnum, DisabilityApproval.class, "DisabilityApproval");
	}

} //FacilitiesPackageImpl

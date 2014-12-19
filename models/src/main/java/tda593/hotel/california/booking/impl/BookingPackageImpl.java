/**
 */
package tda593.hotel.california.booking.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import tda593.hotel.california.CaliforniaPackage;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.impl.BillingPackageImpl;
import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingDataService;
import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.BookingManagerImpl;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.CreditCardInformation;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityDataService;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.LegalEntityManagerImpl;
import tda593.hotel.california.booking.Organization;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.RoomStay;
import tda593.hotel.california.booking.StayRequest;
import tda593.hotel.california.booking.TravelInformation;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.impl.FacilitiesPackageImpl;
import tda593.hotel.california.impl.CaliforniaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingPackageImpl extends EPackageImpl implements BookingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomStayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stayRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travelInformationEClass = null;

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
	private EClass bookingManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingDataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalEntityManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalEntityManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalEntityDataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalEntityEClass = null;

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
	 * @see tda593.hotel.california.booking.BookingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BookingPackageImpl() {
		super(eNS_URI, BookingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BookingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BookingPackage init() {
		if (isInited) return (BookingPackage)EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI);

		// Obtain or create and register package
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BookingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CaliforniaPackageImpl theCaliforniaPackage = (CaliforniaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI) instanceof CaliforniaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI) : CaliforniaPackage.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackage.eNS_URI) : FacilitiesPackage.eINSTANCE);
		BillingPackageImpl theBillingPackage = (BillingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI) instanceof BillingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BillingPackage.eNS_URI) : BillingPackage.eINSTANCE);

		// Create package meta-data objects
		theBookingPackage.createPackageContents();
		theCaliforniaPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theBillingPackage.createPackageContents();

		// Initialize created meta-data
		theBookingPackage.initializePackageContents();
		theCaliforniaPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theBillingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBookingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BookingPackage.eNS_URI, theBookingPackage);
		return theBookingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_Name() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_OrganizationNumber() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Firstname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Lastname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_SocialSecurityNumber() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Id() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_StartDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_EndDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_SpecialRequest() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Price() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_RoomStay() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_RoomType() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_TravelInformation() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Responsible() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_IsCanceled() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__RegisterTravelInformation__TravelInformation() {
		return bookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__UnregisterTravelInformation__TravelInformation() {
		return bookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomStay() {
		return roomStayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomStay_Active() {
		return (EAttribute)roomStayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomStay_StayRequest() {
		return (EReference)roomStayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomStay_RegisteredPersons() {
		return (EReference)roomStayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomStay_Room() {
		return (EReference)roomStayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomStay_Id() {
		return (EAttribute)roomStayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStayRequest() {
		return stayRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStayRequest_Text() {
		return (EAttribute)stayRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStayRequest_TimeStamp() {
		return (EAttribute)stayRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStayRequest_Id() {
		return (EAttribute)stayRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravelInformation() {
		return travelInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelInformation_Id() {
		return (EAttribute)travelInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelInformation_TrackingId() {
		return (EAttribute)travelInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelInformation_Comment() {
		return (EAttribute)travelInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelInformation_Predecessor() {
		return (EReference)travelInformationEClass.getEStructuralFeatures().get(3);
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
	public EClass getBookingManager() {
		return bookingManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetBookings__Date_Date() {
		return bookingManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetBookings__Date_Date_LegalEntity() {
		return bookingManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetBookings__LegalEntity() {
		return bookingManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetAvailableRooms__Date_Date() {
		return bookingManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetAvailableRooms__Date_Date_RoomType() {
		return bookingManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetAvailableRoomTypeAmounts__Date_Date() {
		return bookingManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetAvailableRoomTypeAmount__Date_Date_RoomType() {
		return bookingManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__CreateBooking__Date_Date_LegalEntity_RoomType() {
		return bookingManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__CreateBooking__Date_Date_LegalEntity_Room() {
		return bookingManagerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__IsRoomAvailable__Date_Date_String() {
		return bookingManagerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__RegisterRoom__Booking_Room() {
		return bookingManagerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__CheckIn__Booking_EList() {
		return bookingManagerEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__IsRoomTypeAvailable__Date_Date_RoomType() {
		return bookingManagerEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetActiveBooking__String() {
		return bookingManagerEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetRelatedLegalEntities__Booking() {
		return bookingManagerEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__CheckOut__Booking() {
		return bookingManagerEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetBooking__int() {
		return bookingManagerEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__ChangeBookingDates__Booking_Date_Date() {
		return bookingManagerEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingManagerImpl() {
		return bookingManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingManagerImpl_BookingDataService() {
		return (EReference)bookingManagerImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingManagerImpl_RoomManager() {
		return (EReference)bookingManagerImplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingDataService() {
		return bookingDataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingDataService__GetAll__LegalEntity() {
		return bookingDataServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingDataService__GetAll__Date_Date() {
		return bookingDataServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingDataService__GetAll__Date_Date_LegalEntity() {
		return bookingDataServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingDataService__BeginTransaction() {
		return bookingDataServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingDataService__CommitTransaction() {
		return bookingDataServiceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingDataService__RollbackTransaction() {
		return bookingDataServiceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegalEntityManager() {
		return legalEntityManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityManager__FindPerson__String_String() {
		return legalEntityManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityManager__FindOrganization__String() {
		return legalEntityManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityManager__GetOrganization__String() {
		return legalEntityManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityManager__GetPerson__String() {
		return legalEntityManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityManager__CreatePerson__String_String_String_String_String() {
		return legalEntityManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityManager__CreateOrganization__String_String_String_String() {
		return legalEntityManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityManager__GetLegalEntity__int() {
		return legalEntityManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityManager__SetCreditCardInformation__LegalEntity_String_String_String_String_Date() {
		return legalEntityManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegalEntityManagerImpl() {
		return legalEntityManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalEntityManagerImpl_LegalEntityDataService() {
		return (EReference)legalEntityManagerImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegalEntityDataService() {
		return legalEntityDataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityDataService__FindPerson__String_String() {
		return legalEntityDataServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityDataService__FindOrganization__String() {
		return legalEntityDataServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityDataService__GetOrganization__String() {
		return legalEntityDataServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntityDataService__GetPerson__String() {
		return legalEntityDataServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegalEntity() {
		return legalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegalEntity_Phone() {
		return (EAttribute)legalEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegalEntity_Email() {
		return (EAttribute)legalEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalEntity_CreditCardInformation() {
		return (EReference)legalEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegalEntity_Id() {
		return (EAttribute)legalEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegalEntity__GetName() {
		return legalEntityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingFactory getBookingFactory() {
		return (BookingFactory)getEFactoryInstance();
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
		organizationEClass = createEClass(ORGANIZATION);
		createEAttribute(organizationEClass, ORGANIZATION__NAME);
		createEAttribute(organizationEClass, ORGANIZATION__ORGANIZATION_NUMBER);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRSTNAME);
		createEAttribute(personEClass, PERSON__LASTNAME);
		createEAttribute(personEClass, PERSON__SOCIAL_SECURITY_NUMBER);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__ID);
		createEAttribute(bookingEClass, BOOKING__START_DATE);
		createEAttribute(bookingEClass, BOOKING__END_DATE);
		createEAttribute(bookingEClass, BOOKING__SPECIAL_REQUEST);
		createEAttribute(bookingEClass, BOOKING__PRICE);
		createEReference(bookingEClass, BOOKING__ROOM_TYPE);
		createEReference(bookingEClass, BOOKING__TRAVEL_INFORMATION);
		createEReference(bookingEClass, BOOKING__RESPONSIBLE);
		createEReference(bookingEClass, BOOKING__ROOM_STAY);
		createEAttribute(bookingEClass, BOOKING__IS_CANCELED);
		createEOperation(bookingEClass, BOOKING___REGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION);
		createEOperation(bookingEClass, BOOKING___UNREGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION);

		travelInformationEClass = createEClass(TRAVEL_INFORMATION);
		createEAttribute(travelInformationEClass, TRAVEL_INFORMATION__ID);
		createEAttribute(travelInformationEClass, TRAVEL_INFORMATION__TRACKING_ID);
		createEAttribute(travelInformationEClass, TRAVEL_INFORMATION__COMMENT);
		createEReference(travelInformationEClass, TRAVEL_INFORMATION__PREDECESSOR);

		roomStayEClass = createEClass(ROOM_STAY);
		createEAttribute(roomStayEClass, ROOM_STAY__ACTIVE);
		createEReference(roomStayEClass, ROOM_STAY__STAY_REQUEST);
		createEReference(roomStayEClass, ROOM_STAY__REGISTERED_PERSONS);
		createEReference(roomStayEClass, ROOM_STAY__ROOM);
		createEAttribute(roomStayEClass, ROOM_STAY__ID);

		stayRequestEClass = createEClass(STAY_REQUEST);
		createEAttribute(stayRequestEClass, STAY_REQUEST__TEXT);
		createEAttribute(stayRequestEClass, STAY_REQUEST__TIME_STAMP);
		createEAttribute(stayRequestEClass, STAY_REQUEST__ID);

		creditCardInformationEClass = createEClass(CREDIT_CARD_INFORMATION);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__CARD_NUMBER);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__EXPIRATION_DATE);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__CCV);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__FIRST_NAME);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__LAST_NAME);

		bookingManagerEClass = createEClass(BOOKING_MANAGER);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE_LEGALENTITY);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_BOOKINGS__LEGALENTITY);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNTS__DATE_DATE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___IS_ROOM_AVAILABLE__DATE_DATE_STRING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___REGISTER_ROOM__BOOKING_ROOM);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CHECK_IN__BOOKING_ELIST);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_ACTIVE_BOOKING__STRING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_RELATED_LEGAL_ENTITIES__BOOKING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CHECK_OUT__BOOKING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_BOOKING__INT);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CHANGE_BOOKING_DATES__BOOKING_DATE_DATE);

		bookingManagerImplEClass = createEClass(BOOKING_MANAGER_IMPL);
		createEReference(bookingManagerImplEClass, BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE);
		createEReference(bookingManagerImplEClass, BOOKING_MANAGER_IMPL__ROOM_MANAGER);

		bookingDataServiceEClass = createEClass(BOOKING_DATA_SERVICE);
		createEOperation(bookingDataServiceEClass, BOOKING_DATA_SERVICE___GET_ALL__LEGALENTITY);
		createEOperation(bookingDataServiceEClass, BOOKING_DATA_SERVICE___GET_ALL__DATE_DATE);
		createEOperation(bookingDataServiceEClass, BOOKING_DATA_SERVICE___GET_ALL__DATE_DATE_LEGALENTITY);
		createEOperation(bookingDataServiceEClass, BOOKING_DATA_SERVICE___BEGIN_TRANSACTION);
		createEOperation(bookingDataServiceEClass, BOOKING_DATA_SERVICE___COMMIT_TRANSACTION);
		createEOperation(bookingDataServiceEClass, BOOKING_DATA_SERVICE___ROLLBACK_TRANSACTION);

		legalEntityManagerEClass = createEClass(LEGAL_ENTITY_MANAGER);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___FIND_PERSON__STRING_STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___FIND_ORGANIZATION__STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___GET_ORGANIZATION__STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___GET_PERSON__STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___CREATE_PERSON__STRING_STRING_STRING_STRING_STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___CREATE_ORGANIZATION__STRING_STRING_STRING_STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___GET_LEGAL_ENTITY__INT);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___SET_CREDIT_CARD_INFORMATION__LEGALENTITY_STRING_STRING_STRING_STRING_DATE);

		legalEntityManagerImplEClass = createEClass(LEGAL_ENTITY_MANAGER_IMPL);
		createEReference(legalEntityManagerImplEClass, LEGAL_ENTITY_MANAGER_IMPL__LEGAL_ENTITY_DATA_SERVICE);

		legalEntityDataServiceEClass = createEClass(LEGAL_ENTITY_DATA_SERVICE);
		createEOperation(legalEntityDataServiceEClass, LEGAL_ENTITY_DATA_SERVICE___FIND_PERSON__STRING_STRING);
		createEOperation(legalEntityDataServiceEClass, LEGAL_ENTITY_DATA_SERVICE___FIND_ORGANIZATION__STRING);
		createEOperation(legalEntityDataServiceEClass, LEGAL_ENTITY_DATA_SERVICE___GET_ORGANIZATION__STRING);
		createEOperation(legalEntityDataServiceEClass, LEGAL_ENTITY_DATA_SERVICE___GET_PERSON__STRING);

		legalEntityEClass = createEClass(LEGAL_ENTITY);
		createEAttribute(legalEntityEClass, LEGAL_ENTITY__PHONE);
		createEAttribute(legalEntityEClass, LEGAL_ENTITY__EMAIL);
		createEReference(legalEntityEClass, LEGAL_ENTITY__CREDIT_CARD_INFORMATION);
		createEAttribute(legalEntityEClass, LEGAL_ENTITY__ID);
		createEOperation(legalEntityEClass, LEGAL_ENTITY___GET_NAME);
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
		CaliforniaPackage theCaliforniaPackage = (CaliforniaPackage)EPackage.Registry.INSTANCE.getEPackage(CaliforniaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		organizationEClass.getESuperTypes().add(this.getLegalEntity());
		personEClass.getESuperTypes().add(this.getLegalEntity());
		bookingManagerImplEClass.getESuperTypes().add(this.getBookingManager());
		EGenericType g1 = createEGenericType(theCaliforniaPackage.getDataService());
		EGenericType g2 = createEGenericType(this.getBooking());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		bookingDataServiceEClass.getEGenericSuperTypes().add(g1);
		legalEntityManagerImplEClass.getESuperTypes().add(this.getLegalEntityManager());
		g1 = createEGenericType(theCaliforniaPackage.getDataService());
		g2 = createEGenericType(this.getLegalEntity());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		legalEntityDataServiceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganization_Name(), ecorePackage.getEString(), "name", null, 1, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOrganization_OrganizationNumber(), ecorePackage.getEString(), "organizationNumber", null, 1, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Firstname(), ecorePackage.getEString(), "firstname", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Lastname(), ecorePackage.getEString(), "lastname", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_SocialSecurityNumber(), ecorePackage.getEString(), "socialSecurityNumber", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_SpecialRequest(), ecorePackage.getEString(), "specialRequest", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_RoomType(), theFacilitiesPackage.getRoomType(), null, "roomType", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_TravelInformation(), this.getTravelInformation(), null, "travelInformation", null, 0, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Responsible(), this.getLegalEntity(), null, "responsible", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_RoomStay(), this.getRoomStay(), null, "roomStay", null, 0, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_IsCanceled(), ecorePackage.getEBoolean(), "isCanceled", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getBooking__RegisterTravelInformation__TravelInformation(), null, "registerTravelInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getTravelInformation(), "travelInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__UnregisterTravelInformation__TravelInformation(), null, "unregisterTravelInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getTravelInformation(), "travelInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(travelInformationEClass, TravelInformation.class, "TravelInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTravelInformation_Id(), ecorePackage.getEInt(), "id", null, 1, 1, TravelInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTravelInformation_TrackingId(), ecorePackage.getEString(), "trackingId", null, 1, 1, TravelInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTravelInformation_Comment(), ecorePackage.getEString(), "comment", null, 1, 1, TravelInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTravelInformation_Predecessor(), this.getTravelInformation(), null, "predecessor", null, 0, 1, TravelInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomStayEClass, RoomStay.class, "RoomStay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomStay_Active(), ecorePackage.getEBoolean(), "active", null, 1, 1, RoomStay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomStay_StayRequest(), this.getStayRequest(), null, "stayRequest", null, 0, -1, RoomStay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomStay_RegisteredPersons(), this.getPerson(), null, "registeredPersons", null, 0, -1, RoomStay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomStay_Room(), theFacilitiesPackage.getRoom(), null, "room", null, 1, 1, RoomStay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomStay_Id(), ecorePackage.getEInt(), "id", null, 1, 1, RoomStay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stayRequestEClass, StayRequest.class, "StayRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStayRequest_Text(), ecorePackage.getEString(), "text", null, 1, 1, StayRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStayRequest_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 1, 1, StayRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStayRequest_Id(), ecorePackage.getEInt(), "id", null, 1, 1, StayRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(creditCardInformationEClass, CreditCardInformation.class, "CreditCardInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreditCardInformation_CardNumber(), ecorePackage.getEString(), "cardNumber", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformation_ExpirationDate(), ecorePackage.getEDate(), "expirationDate", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformation_Ccv(), ecorePackage.getEString(), "ccv", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformation_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformation_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingManagerEClass, BookingManager.class, "BookingManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBookingManager__GetBookings__Date_Date(), this.getBooking(), "getBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetBookings__Date_Date_LegalEntity(), this.getBooking(), "getBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetBookings__LegalEntity(), this.getBooking(), "getBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetAvailableRooms__Date_Date(), theFacilitiesPackage.getRoom(), "getAvailableRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetAvailableRooms__Date_Date_RoomType(), theFacilitiesPackage.getRoom(), "getAvailableRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theFacilitiesPackage.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetAvailableRoomTypeAmounts__Date_Date(), null, "getAvailableRoomTypeAmounts", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(theFacilitiesPackage.getRoomType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getBookingManager__GetAvailableRoomTypeAmount__Date_Date_RoomType(), ecorePackage.getEInt(), "getAvailableRoomTypeAmount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theFacilitiesPackage.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CreateBooking__Date_Date_LegalEntity_RoomType(), null, "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theFacilitiesPackage.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CreateBooking__Date_Date_LegalEntity_Room(), null, "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theFacilitiesPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__IsRoomAvailable__Date_Date_String(), ecorePackage.getEBoolean(), "isRoomAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__RegisterRoom__Booking_Room(), null, "registerRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theFacilitiesPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CheckIn__Booking_EList(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPerson(), "guests", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__IsRoomTypeAvailable__Date_Date_RoomType(), ecorePackage.getEBoolean(), "isRoomTypeAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theFacilitiesPackage.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetActiveBooking__String(), this.getBooking(), "getActiveBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetRelatedLegalEntities__Booking(), this.getLegalEntity(), "getRelatedLegalEntities", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CheckOut__Booking(), null, "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetBooking__int(), this.getBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__ChangeBookingDates__Booking_Date_Date(), ecorePackage.getEBoolean(), "changeBookingDates", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "newStart", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "newEnd", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingManagerImplEClass, BookingManagerImpl.class, "BookingManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingManagerImpl_BookingDataService(), this.getBookingDataService(), null, "bookingDataService", null, 1, 1, BookingManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingManagerImpl_RoomManager(), theFacilitiesPackage.getRoomManager(), null, "roomManager", null, 1, 1, BookingManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingDataServiceEClass, BookingDataService.class, "BookingDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBookingDataService__GetAll__LegalEntity(), this.getBooking(), "getAll", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingDataService__GetAll__Date_Date(), this.getBooking(), "getAll", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingDataService__GetAll__Date_Date_LegalEntity(), this.getBooking(), "getAll", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "legal", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingDataService__BeginTransaction(), null, "beginTransaction", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingDataService__CommitTransaction(), null, "commitTransaction", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingDataService__RollbackTransaction(), null, "rollbackTransaction", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(legalEntityManagerEClass, LegalEntityManager.class, "LegalEntityManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLegalEntityManager__FindPerson__String_String(), this.getPerson(), "findPerson", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastname", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityManager__FindOrganization__String(), this.getOrganization(), "findOrganization", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityManager__GetOrganization__String(), this.getOrganization(), "getOrganization", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "organizationNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityManager__GetPerson__String(), this.getPerson(), "getPerson", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSN", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityManager__CreatePerson__String_String_String_String_String(), this.getPerson(), "createPerson", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSN", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityManager__CreateOrganization__String_String_String_String(), this.getOrganization(), "createOrganization", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "organizationNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityManager__GetLegalEntity__int(), this.getLegalEntity(), "getLegalEntity", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityManager__SetCreditCardInformation__LegalEntity_String_String_String_String_Date(), null, "setCreditCardInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "legalEntity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cardNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "expirationDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(legalEntityManagerImplEClass, LegalEntityManagerImpl.class, "LegalEntityManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegalEntityManagerImpl_LegalEntityDataService(), this.getLegalEntityDataService(), null, "legalEntityDataService", null, 1, 1, LegalEntityManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(legalEntityDataServiceEClass, LegalEntityDataService.class, "LegalEntityDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLegalEntityDataService__FindPerson__String_String(), this.getPerson(), "findPerson", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastname", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityDataService__FindOrganization__String(), this.getOrganization(), "findOrganization", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityDataService__GetOrganization__String(), this.getOrganization(), "getOrganization", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "organizationNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityDataService__GetPerson__String(), this.getPerson(), "getPerson", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSN", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(legalEntityEClass, LegalEntity.class, "LegalEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegalEntity_Phone(), ecorePackage.getEString(), "phone", null, 1, 1, LegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLegalEntity_Email(), ecorePackage.getEString(), "email", null, 1, 1, LegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLegalEntity_CreditCardInformation(), this.getCreditCardInformation(), null, "creditCardInformation", null, 0, 1, LegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLegalEntity_Id(), ecorePackage.getEInt(), "id", null, 1, 1, LegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getLegalEntity__GetName(), ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);
	}

} //BookingPackageImpl

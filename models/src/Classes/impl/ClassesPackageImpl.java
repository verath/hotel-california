/**
 */
package Classes.impl;

import Classes.AdminDiscountManager;
import Classes.AdminKeyCardManager;
import Classes.AdminRoomManager;
import Classes.Bill;
import Classes.BillDataService;
import Classes.BillManager;
import Classes.BillManagerImpl;
import Classes.Booking;
import Classes.BookingBill;
import Classes.BookingDataService;
import Classes.BookingManager;
import Classes.BookingManagerImpl;
import Classes.ClassesFactory;
import Classes.ClassesPackage;
import Classes.ConferenceRoom;
import Classes.CreditCardInformation;
import Classes.DataService;
import Classes.DisabilityApproval;
import Classes.Discount;
import Classes.DiscountLimit;
import Classes.DiscountManager;
import Classes.GuestRoom;
import Classes.KeyCard;
import Classes.KeyCardManager;
import Classes.LegalEntity;
import Classes.LegalEntityManager;
import Classes.Organization;
import Classes.PercentageDiscount;
import Classes.Person;
import Classes.Purchase;
import Classes.Room;
import Classes.RoomApproval;
import Classes.RoomManager;
import Classes.RoomStay;
import Classes.RoomType;
import Classes.Service;
import Classes.StayRequest;
import Classes.SumDiscount;
import Classes.TravelInformation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassesPackageImpl extends EPackageImpl implements ClassesPackage {
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
	private EClass bookingDataServiceEClass = null;

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
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalEntityEClass = null;

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
	private EClass roomTypeEClass = null;

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
	private EClass bookingManagerImplEClass = null;

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
	private EClass roomEClass = null;

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
	private EClass roomManagerEClass = null;

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
	private EClass adminRoomManagerEClass = null;

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
	private EClass conferenceRoomEClass = null;

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
	private EClass percentageDiscountEClass = null;

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
	private EClass billDataServiceEClass = null;

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
	private EClass legalEntityManagerEClass = null;

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
	 * @see Classes.ClassesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassesPackageImpl() {
		super(eNS_URI, ClassesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ClassesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassesPackage init() {
		if (isInited) return (ClassesPackage)EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI);

		// Obtain or create and register package
		ClassesPackageImpl theClassesPackage = (ClassesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClassesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theClassesPackage.createPackageContents();

		// Initialize created meta-data
		theClassesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClassesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassesPackage.eNS_URI, theClassesPackage);
		return theClassesPackage;
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
	public EClass getBookingDataService() {
		return bookingDataServiceEClass;
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
		return (EReference)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_RoomType() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_TravelInformation() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Responsible() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(8);
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
	public EOperation getBooking__CheckIn() {
		return bookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CheckOut() {
		return bookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__RegisterTravelInformation__TravelInformation() {
		return bookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__UnregisterTravelInformation__TravelInformation() {
		return bookingEClass.getEOperations().get(3);
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
	public EOperation getLegalEntity__Operation1() {
		return legalEntityEClass.getEOperations().get(0);
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
	public EAttribute getCreditCardInformation_CardHolder() {
		return (EAttribute)creditCardInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCardInformation_ExpirationDate() {
		return (EAttribute)creditCardInformationEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getRoomType_Id() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Name() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Description() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_RoomApprovals() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(3);
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
	public EOperation getTravelInformation__AddPredecessor__TravelInformation() {
		return travelInformationEClass.getEOperations().get(0);
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
	public EOperation getBookingManager__GetAvailableRoomTypeAmount__Date_Date() {
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
	public EOperation getBookingManager__IsRoomAvailable__Date_Date_int() {
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
	public EOperation getBookingManager__GetRoomTypes() {
		return bookingManagerEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetActiveBooking__int() {
		return bookingManagerEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetRelatedLegalEntities__Booking() {
		return bookingManagerEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__CheckOut__Booking() {
		return bookingManagerEClass.getEOperations().get(16);
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
	public EAttribute getRoom_IsCleaned() {
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
	public EReference getRoom_Room() {
		return (EReference)roomEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_DisabilityApprovals() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(9);
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
	public EOperation getRoomManager__RegisterKeyCard__KeyCard() {
		return roomManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__RegisterKeyCard__String() {
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
	public EOperation getRoomManager__UnregisterKeyCard__KeyCard() {
		return roomManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__UnregisterKeyCard__String() {
		return roomManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__UnregisterAllKeyCards__Room() {
		return roomManagerEClass.getEOperations().get(6);
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
	public EClass getAdminRoomManager() {
		return adminRoomManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminRoomManager__AddRoom__int_int_String_EList_EList() {
		return adminRoomManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminRoomManager__RemoveRoom__int() {
		return adminRoomManagerEClass.getEOperations().get(1);
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
	public EClass getBillDataService() {
		return billDataServiceEClass;
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
	public EOperation getAdminKeyCardManager__AddKeyCard__int() {
		return adminKeyCardManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminKeyCardManager__RemoveKeyCard__int() {
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
	public EOperation getLegalEntityManager__FindLegalEntity__String() {
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
	public ClassesFactory getClassesFactory() {
		return (ClassesFactory)getEFactoryInstance();
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

		bookingDataServiceEClass = createEClass(BOOKING_DATA_SERVICE);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__ID);
		createEAttribute(bookingEClass, BOOKING__START_DATE);
		createEAttribute(bookingEClass, BOOKING__END_DATE);
		createEAttribute(bookingEClass, BOOKING__SPECIAL_REQUEST);
		createEAttribute(bookingEClass, BOOKING__PRICE);
		createEReference(bookingEClass, BOOKING__ROOM_STAY);
		createEReference(bookingEClass, BOOKING__ROOM_TYPE);
		createEReference(bookingEClass, BOOKING__TRAVEL_INFORMATION);
		createEReference(bookingEClass, BOOKING__RESPONSIBLE);
		createEAttribute(bookingEClass, BOOKING__IS_CANCELED);
		createEOperation(bookingEClass, BOOKING___CHECK_IN);
		createEOperation(bookingEClass, BOOKING___CHECK_OUT);
		createEOperation(bookingEClass, BOOKING___REGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION);
		createEOperation(bookingEClass, BOOKING___UNREGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION);

		roomStayEClass = createEClass(ROOM_STAY);
		createEAttribute(roomStayEClass, ROOM_STAY__ACTIVE);
		createEReference(roomStayEClass, ROOM_STAY__STAY_REQUEST);
		createEReference(roomStayEClass, ROOM_STAY__REGISTERED_PERSONS);

		stayRequestEClass = createEClass(STAY_REQUEST);
		createEAttribute(stayRequestEClass, STAY_REQUEST__TEXT);
		createEAttribute(stayRequestEClass, STAY_REQUEST__TIME_STAMP);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRSTNAME);
		createEAttribute(personEClass, PERSON__LASTNAME);
		createEAttribute(personEClass, PERSON__SOCIAL_SECURITY_NUMBER);

		legalEntityEClass = createEClass(LEGAL_ENTITY);
		createEAttribute(legalEntityEClass, LEGAL_ENTITY__PHONE);
		createEAttribute(legalEntityEClass, LEGAL_ENTITY__EMAIL);
		createEReference(legalEntityEClass, LEGAL_ENTITY__CREDIT_CARD_INFORMATION);
		createEOperation(legalEntityEClass, LEGAL_ENTITY___OPERATION1);

		creditCardInformationEClass = createEClass(CREDIT_CARD_INFORMATION);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__CARD_NUMBER);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__CARD_HOLDER);
		createEAttribute(creditCardInformationEClass, CREDIT_CARD_INFORMATION__EXPIRATION_DATE);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__ID);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NAME);
		createEAttribute(roomTypeEClass, ROOM_TYPE__DESCRIPTION);
		createEAttribute(roomTypeEClass, ROOM_TYPE__ROOM_APPROVALS);

		travelInformationEClass = createEClass(TRAVEL_INFORMATION);
		createEAttribute(travelInformationEClass, TRAVEL_INFORMATION__ID);
		createEAttribute(travelInformationEClass, TRAVEL_INFORMATION__TRACKING_ID);
		createEAttribute(travelInformationEClass, TRAVEL_INFORMATION__COMMENT);
		createEReference(travelInformationEClass, TRAVEL_INFORMATION__PREDECESSOR);
		createEOperation(travelInformationEClass, TRAVEL_INFORMATION___ADD_PREDECESSOR__TRAVELINFORMATION);

		bookingManagerImplEClass = createEClass(BOOKING_MANAGER_IMPL);
		createEReference(bookingManagerImplEClass, BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE);

		bookingManagerEClass = createEClass(BOOKING_MANAGER);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE_LEGALENTITY);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_BOOKINGS__LEGALENTITY);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___IS_ROOM_AVAILABLE__DATE_DATE_INT);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___REGISTER_ROOM__BOOKING_ROOM);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CHECK_IN__BOOKING_ELIST);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_ROOM_TYPES);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_ACTIVE_BOOKING__INT);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_RELATED_LEGAL_ENTITIES__BOOKING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CHECK_OUT__BOOKING);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__FLOOR);
		createEAttribute(roomEClass, ROOM__ROOM_NUMBER);
		createEAttribute(roomEClass, ROOM__IS_OPERATIONAL);
		createEAttribute(roomEClass, ROOM__IS_CLEANED);
		createEAttribute(roomEClass, ROOM__DESCRIPTION);
		createEAttribute(roomEClass, ROOM__PHOTOS);
		createEReference(roomEClass, ROOM__ALLOWED_KEY_CARDS);
		createEReference(roomEClass, ROOM__ROOM_TYPE);
		createEReference(roomEClass, ROOM__ROOM);
		createEAttribute(roomEClass, ROOM__DISABILITY_APPROVALS);
		createEOperation(roomEClass, ROOM___REGISTER_KEY_CARD__KEYCARD);
		createEOperation(roomEClass, ROOM___UNREGISTER_KEY_CARD__KEYCARD);
		createEOperation(roomEClass, ROOM___UNREGISTER_KEY_CARDS);

		keyCardEClass = createEClass(KEY_CARD);
		createEAttribute(keyCardEClass, KEY_CARD__ID);

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

		roomManagerEClass = createEClass(ROOM_MANAGER);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_ROOM_TYPES);
		createEOperation(roomManagerEClass, ROOM_MANAGER___REGISTER_KEY_CARD__KEYCARD);
		createEOperation(roomManagerEClass, ROOM_MANAGER___REGISTER_KEY_CARD__STRING);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_ROOMS);
		createEOperation(roomManagerEClass, ROOM_MANAGER___UNREGISTER_KEY_CARD__KEYCARD);
		createEOperation(roomManagerEClass, ROOM_MANAGER___UNREGISTER_KEY_CARD__STRING);
		createEOperation(roomManagerEClass, ROOM_MANAGER___UNREGISTER_ALL_KEY_CARDS__ROOM);

		adminDiscountManagerEClass = createEClass(ADMIN_DISCOUNT_MANAGER);
		createEOperation(adminDiscountManagerEClass, ADMIN_DISCOUNT_MANAGER___ADD_SUM_DISCOUNT__DOUBLE);
		createEOperation(adminDiscountManagerEClass, ADMIN_DISCOUNT_MANAGER___ADD_PERCENTAGE_DISCOUNT__FLOAT);
		createEOperation(adminDiscountManagerEClass, ADMIN_DISCOUNT_MANAGER___SET_AMOUNT_LIMIT__DISCOUNT_INT);
		createEOperation(adminDiscountManagerEClass, ADMIN_DISCOUNT_MANAGER___ADD_ALLOWED_USERS__DISCOUNT_ELIST);
		createEOperation(adminDiscountManagerEClass, ADMIN_DISCOUNT_MANAGER___SET_DATE_RANGE_LIMIT__DISCOUNT_DATE_DATE);

		adminRoomManagerEClass = createEClass(ADMIN_ROOM_MANAGER);
		createEOperation(adminRoomManagerEClass, ADMIN_ROOM_MANAGER___ADD_ROOM__INT_INT_STRING_ELIST_ELIST);
		createEOperation(adminRoomManagerEClass, ADMIN_ROOM_MANAGER___REMOVE_ROOM__INT);

		guestRoomEClass = createEClass(GUEST_ROOM);
		createEAttribute(guestRoomEClass, GUEST_ROOM__NUMBER_OF_BEDS);
		createEAttribute(guestRoomEClass, GUEST_ROOM__NUMBER_OF_EXTRABEDS);

		conferenceRoomEClass = createEClass(CONFERENCE_ROOM);
		createEAttribute(conferenceRoomEClass, CONFERENCE_ROOM__NUMBER_OF_SEATS);
		createEAttribute(conferenceRoomEClass, CONFERENCE_ROOM__EQUIPMENT);

		organizationEClass = createEClass(ORGANIZATION);
		createEAttribute(organizationEClass, ORGANIZATION__NAME);
		createEAttribute(organizationEClass, ORGANIZATION__ORGANIZATION_NUMBER);

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

		percentageDiscountEClass = createEClass(PERCENTAGE_DISCOUNT);
		createEAttribute(percentageDiscountEClass, PERCENTAGE_DISCOUNT__PERCENTAGE);

		sumDiscountEClass = createEClass(SUM_DISCOUNT);
		createEAttribute(sumDiscountEClass, SUM_DISCOUNT__DISCOUNT_SUM);

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

		billDataServiceEClass = createEClass(BILL_DATA_SERVICE);

		adminKeyCardManagerEClass = createEClass(ADMIN_KEY_CARD_MANAGER);
		createEOperation(adminKeyCardManagerEClass, ADMIN_KEY_CARD_MANAGER___ADD_KEY_CARD__INT);
		createEOperation(adminKeyCardManagerEClass, ADMIN_KEY_CARD_MANAGER___REMOVE_KEY_CARD__INT);

		keyCardManagerEClass = createEClass(KEY_CARD_MANAGER);
		createEOperation(keyCardManagerEClass, KEY_CARD_MANAGER___GET_KEY_CARD__STRING);

		legalEntityManagerEClass = createEClass(LEGAL_ENTITY_MANAGER);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___FIND_PERSON__STRING_STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___FIND_ORGANIZATION__STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___GET_ORGANIZATION__STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___GET_PERSON__STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___CREATE_PERSON__STRING_STRING_STRING_STRING_STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___CREATE_ORGANIZATION__STRING_STRING_STRING_STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___FIND_LEGAL_ENTITY__STRING);
		createEOperation(legalEntityManagerEClass, LEGAL_ENTITY_MANAGER___SET_CREDIT_CARD_INFORMATION__LEGALENTITY_STRING_STRING_STRING_STRING_DATE);

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

		// Create type parameters
		ETypeParameter dataServiceEClass_E = addETypeParameter(dataServiceEClass, "E");
		ETypeParameter dataServiceEClass_ID = addETypeParameter(dataServiceEClass, "ID");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getDataService());
		EGenericType g2 = createEGenericType(this.getBooking());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		bookingDataServiceEClass.getEGenericSuperTypes().add(g1);
		personEClass.getESuperTypes().add(this.getLegalEntity());
		bookingManagerImplEClass.getESuperTypes().add(this.getBookingManager());
		adminDiscountManagerEClass.getESuperTypes().add(this.getDiscountManager());
		adminRoomManagerEClass.getESuperTypes().add(this.getRoomManager());
		guestRoomEClass.getESuperTypes().add(this.getRoom());
		conferenceRoomEClass.getESuperTypes().add(this.getRoom());
		organizationEClass.getESuperTypes().add(this.getLegalEntity());
		bookingBillEClass.getESuperTypes().add(this.getBill());
		percentageDiscountEClass.getESuperTypes().add(this.getDiscount());
		sumDiscountEClass.getESuperTypes().add(this.getDiscount());
		billManagerImplEClass.getESuperTypes().add(this.getBillManager());
		g1 = createEGenericType(this.getDataService());
		g2 = createEGenericType(this.getBill());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		billDataServiceEClass.getEGenericSuperTypes().add(g1);
		adminKeyCardManagerEClass.getESuperTypes().add(this.getKeyCardManager());

		// Initialize classes, features, and operations; add parameters
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

		initEClass(bookingDataServiceEClass, BookingDataService.class, "BookingDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_SpecialRequest(), ecorePackage.getEString(), "specialRequest", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_RoomStay(), this.getRoomStay(), null, "roomStay", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_RoomType(), this.getRoomType(), null, "roomType", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_TravelInformation(), this.getTravelInformation(), null, "travelInformation", null, 0, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Responsible(), this.getLegalEntity(), null, "responsible", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_IsCanceled(), ecorePackage.getEBoolean(), "isCanceled", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBooking__CheckIn(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__CheckOut(), null, "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__RegisterTravelInformation__TravelInformation(), null, "registerTravelInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getTravelInformation(), "travelInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__UnregisterTravelInformation__TravelInformation(), null, "unregisterTravelInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getTravelInformation(), "travelInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomStayEClass, RoomStay.class, "RoomStay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomStay_Active(), ecorePackage.getEBoolean(), "active", null, 1, 1, RoomStay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomStay_StayRequest(), this.getStayRequest(), null, "stayRequest", null, 0, -1, RoomStay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomStay_RegisteredPersons(), this.getPerson(), null, "registeredPersons", null, 1, 1, RoomStay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stayRequestEClass, StayRequest.class, "StayRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStayRequest_Text(), ecorePackage.getEString(), "text", null, 1, 1, StayRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStayRequest_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 1, 1, StayRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Firstname(), ecorePackage.getEString(), "firstname", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Lastname(), ecorePackage.getEString(), "lastname", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_SocialSecurityNumber(), ecorePackage.getEString(), "socialSecurityNumber", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(legalEntityEClass, LegalEntity.class, "LegalEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegalEntity_Phone(), ecorePackage.getEString(), "phone", null, 1, 1, LegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLegalEntity_Email(), ecorePackage.getEString(), "email", null, 1, 1, LegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLegalEntity_CreditCardInformation(), this.getCreditCardInformation(), null, "creditCardInformation", null, 0, 1, LegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getLegalEntity__Operation1(), null, "Operation1", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(creditCardInformationEClass, CreditCardInformation.class, "CreditCardInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreditCardInformation_CardNumber(), ecorePackage.getEString(), "cardNumber", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformation_CardHolder(), ecorePackage.getEString(), "cardHolder", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCardInformation_ExpirationDate(), ecorePackage.getEDate(), "expirationDate", null, 1, 1, CreditCardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Id(), ecorePackage.getEInt(), "id", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Description(), ecorePackage.getEString(), "description", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_RoomApprovals(), this.getRoomApproval(), "roomApprovals", null, 0, -1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(travelInformationEClass, TravelInformation.class, "TravelInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTravelInformation_Id(), ecorePackage.getEInt(), "id", null, 1, 1, TravelInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTravelInformation_TrackingId(), ecorePackage.getEString(), "trackingId", null, 1, 1, TravelInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTravelInformation_Comment(), ecorePackage.getEString(), "comment", null, 1, 1, TravelInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTravelInformation_Predecessor(), this.getTravelInformation(), null, "predecessor", null, 0, 1, TravelInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTravelInformation__AddPredecessor__TravelInformation(), null, "addPredecessor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getTravelInformation(), "travelInfomation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingManagerImplEClass, BookingManagerImpl.class, "BookingManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingManagerImpl_BookingDataService(), this.getBookingDataService(), null, "bookingDataService", null, 1, 1, BookingManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingManagerEClass, BookingManager.class, "BookingManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBookingManager__GetBookings__Date_Date(), this.getBooking(), "getBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetBookings__Date_Date_LegalEntity(), this.getBooking(), "getBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetBookings__LegalEntity(), this.getBooking(), "getBookings", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetAvailableRooms__Date_Date(), this.getRoom(), "getAvailableRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetAvailableRooms__Date_Date_RoomType(), this.getRoom(), "getAvailableRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetAvailableRoomTypeAmount__Date_Date(), null, "getAvailableRoomTypeAmount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(this.getRoomType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getBookingManager__GetAvailableRoomTypeAmount__Date_Date_RoomType(), ecorePackage.getEInt(), "getAvailableRoomTypeAmount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CreateBooking__Date_Date_LegalEntity_RoomType(), null, "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "RoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CreateBooking__Date_Date_LegalEntity_Room(), null, "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__IsRoomAvailable__Date_Date_int(), ecorePackage.getEBoolean(), "isRoomAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__RegisterRoom__Booking_Room(), null, "registerRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CheckIn__Booking_EList(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "guests", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__IsRoomTypeAvailable__Date_Date_RoomType(), ecorePackage.getEBoolean(), "isRoomTypeAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingManager__GetRoomTypes(), ecorePackage.getEEList(), "getRoomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetActiveBooking__int(), this.getBooking(), "getActiveBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetRelatedLegalEntities__Booking(), this.getLegalEntity(), "getRelatedLegalEntities", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CheckOut__Booking(), null, "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Floor(), ecorePackage.getEInt(), "floor", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomNumber(), ecorePackage.getEInt(), "roomNumber", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_IsOperational(), ecorePackage.getEBoolean(), "isOperational", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_IsCleaned(), ecorePackage.getEBoolean(), "isCleaned", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Description(), ecorePackage.getEString(), "description", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Photos(), ecorePackage.getEString(), "photos", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_AllowedKeyCards(), this.getKeyCard(), null, "allowedKeyCards", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomType(), this.getRoomType(), null, "roomType", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Room(), this.getRoom(), null, "room", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_DisabilityApprovals(), this.getDisabilityApproval(), "disabilityApprovals", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoom__RegisterKeyCard__KeyCard(), null, "registerKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKeyCard(), "keyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoom__UnregisterKeyCard__KeyCard(), null, "unregisterKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKeyCard(), "keyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoom__UnregisterKeyCards(), null, "unregisterKeyCards", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(keyCardEClass, KeyCard.class, "KeyCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyCard_Id(), ecorePackage.getEString(), "id", null, 1, 1, KeyCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(discountManagerEClass, DiscountManager.class, "DiscountManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getDiscountManager__GetDiscount__int(), this.getDiscount(), "getDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
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
		initEReference(getDiscountLimit_AllowedUsers(), this.getLegalEntity(), null, "allowedUsers", null, 0, -1, DiscountLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomManagerEClass, RoomManager.class, "RoomManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRoomManager__GetRoomTypes(), this.getRoomType(), "getRoomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__RegisterKeyCard__KeyCard(), null, "registerKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKeyCard(), "keycard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__RegisterKeyCard__String(), null, "registerKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "keycardNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomManager__GetRooms(), this.getRoom(), "getRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__UnregisterKeyCard__KeyCard(), null, "unregisterKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKeyCard(), "keyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__UnregisterKeyCard__String(), null, "unregisterKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "keyCardNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__UnregisterAllKeyCards__Room(), null, "unregisterAllKeyCards", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

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
		addEParameter(op, this.getLegalEntity(), "allowedUsers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminDiscountManager__SetDateRangeLimit__Discount_Date_Date(), null, "setDateRangeLimit", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "validFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "validTo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(adminRoomManagerEClass, AdminRoomManager.class, "AdminRoomManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAdminRoomManager__AddRoom__int_int_String_EList_EList(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "floor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "descriptioin", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDisabilityApproval(), "disabilityApprovals", 1, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "photos", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminRoomManager__RemoveRoom__int(), ecorePackage.getEBoolean(), "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(guestRoomEClass, GuestRoom.class, "GuestRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuestRoom_NumberOfBeds(), ecorePackage.getEInt(), "numberOfBeds", null, 1, 1, GuestRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuestRoom_NumberOfExtrabeds(), ecorePackage.getEInt(), "numberOfExtrabeds", null, 1, 1, GuestRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conferenceRoomEClass, ConferenceRoom.class, "ConferenceRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConferenceRoom_NumberOfSeats(), ecorePackage.getEInt(), "numberOfSeats", null, 1, 1, ConferenceRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConferenceRoom_Equipment(), ecorePackage.getEString(), "equipment", null, 0, -1, ConferenceRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganization_Name(), ecorePackage.getEString(), "name", null, 1, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOrganization_OrganizationNumber(), ecorePackage.getEString(), "organizationNumber", null, 1, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBill_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_IsPublished(), ecorePackage.getEBoolean(), "isPublished", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_Customer(), this.getLegalEntity(), null, "customer", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_IsPaid(), ecorePackage.getEBoolean(), "isPaid", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_Purchase(), this.getPurchase(), null, "purchase", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_CreditCardInformation(), this.getCreditCardInformation(), null, "creditCardInformation", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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
		initEReference(getBookingBill_Booking(), this.getBooking(), null, "booking", null, 1, 1, BookingBill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(percentageDiscountEClass, PercentageDiscount.class, "PercentageDiscount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPercentageDiscount_Percentage(), ecorePackage.getEFloat(), "percentage", null, 1, 1, PercentageDiscount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sumDiscountEClass, SumDiscount.class, "SumDiscount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSumDiscount_DiscountSum(), ecorePackage.getEDouble(), "discountSum", null, 1, 1, SumDiscount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billManagerImplEClass, BillManagerImpl.class, "BillManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBillManagerImpl_BillDataService(), this.getBillDataService(), null, "billDataService", null, 1, 1, BillManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billManagerEClass, BillManager.class, "BillManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBillManager__GetBill__int(), this.getBill(), "getBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__GetBookingBill__Booking(), null, "getBookingBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

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

		initEClass(billDataServiceEClass, BillDataService.class, "BillDataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adminKeyCardManagerEClass, AdminKeyCardManager.class, "AdminKeyCardManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAdminKeyCardManager__AddKeyCard__int(), null, "addKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "cardNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminKeyCardManager__RemoveKeyCard__int(), null, "removeKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "cardNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(keyCardManagerEClass, KeyCardManager.class, "KeyCardManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getKeyCardManager__GetKeyCard__String(), this.getKeyCard(), "getKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "keyCardNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);

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

		op = initEOperation(getLegalEntityManager__CreatePerson__String_String_String_String_String(), null, "createPerson", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSN", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityManager__CreateOrganization__String_String_String_String(), null, "createOrganization", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "organizationNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityManager__FindLegalEntity__String(), this.getLegalEntity(), "findLegalEntity", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLegalEntityManager__SetCreditCardInformation__LegalEntity_String_String_String_String_Date(), null, "setCreditCardInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLegalEntity(), "legalEntity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cardNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "expirationDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(roomApprovalEEnum, RoomApproval.class, "RoomApproval");

		initEEnum(disabilityApprovalEEnum, DisabilityApproval.class, "DisabilityApproval");

		// Create resource
		createResource(eNS_URI);
	}

} //ClassesPackageImpl

/**
 */
package Classes.util;

import Classes.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Classes.ClassesPackage
 * @generated
 */
public class ClassesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClassesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassesSwitch<Adapter> modelSwitch =
		new ClassesSwitch<Adapter>() {
			@Override
			public <E, ID> Adapter caseDataService(DataService<E, ID> object) {
				return createDataServiceAdapter();
			}
			@Override
			public Adapter caseBookingDataService(BookingDataService object) {
				return createBookingDataServiceAdapter();
			}
			@Override
			public Adapter caseBooking(Booking object) {
				return createBookingAdapter();
			}
			@Override
			public Adapter caseRoomStay(RoomStay object) {
				return createRoomStayAdapter();
			}
			@Override
			public Adapter caseStayRequest(StayRequest object) {
				return createStayRequestAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseLegalEntity(LegalEntity object) {
				return createLegalEntityAdapter();
			}
			@Override
			public Adapter caseCreditCardInformation(CreditCardInformation object) {
				return createCreditCardInformationAdapter();
			}
			@Override
			public Adapter caseRoomType(RoomType object) {
				return createRoomTypeAdapter();
			}
			@Override
			public Adapter caseTravelInformation(TravelInformation object) {
				return createTravelInformationAdapter();
			}
			@Override
			public Adapter caseBookingManagerImpl(BookingManagerImpl object) {
				return createBookingManagerImplAdapter();
			}
			@Override
			public Adapter caseBookingManager(BookingManager object) {
				return createBookingManagerAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseKeyCard(KeyCard object) {
				return createKeyCardAdapter();
			}
			@Override
			public Adapter caseDiscountManager(DiscountManager object) {
				return createDiscountManagerAdapter();
			}
			@Override
			public Adapter caseDiscount(Discount object) {
				return createDiscountAdapter();
			}
			@Override
			public Adapter caseDiscountLimit(DiscountLimit object) {
				return createDiscountLimitAdapter();
			}
			@Override
			public Adapter caseRoomManager(RoomManager object) {
				return createRoomManagerAdapter();
			}
			@Override
			public Adapter caseAdminDiscountManager(AdminDiscountManager object) {
				return createAdminDiscountManagerAdapter();
			}
			@Override
			public Adapter caseAdminRoomManager(AdminRoomManager object) {
				return createAdminRoomManagerAdapter();
			}
			@Override
			public Adapter caseGuestRoom(GuestRoom object) {
				return createGuestRoomAdapter();
			}
			@Override
			public Adapter caseConferenceRoom(ConferenceRoom object) {
				return createConferenceRoomAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter caseBill(Bill object) {
				return createBillAdapter();
			}
			@Override
			public Adapter casePurchase(Purchase object) {
				return createPurchaseAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseBookingBill(BookingBill object) {
				return createBookingBillAdapter();
			}
			@Override
			public Adapter casePercentageDiscount(PercentageDiscount object) {
				return createPercentageDiscountAdapter();
			}
			@Override
			public Adapter caseSumDiscount(SumDiscount object) {
				return createSumDiscountAdapter();
			}
			@Override
			public Adapter caseBillManagerImpl(BillManagerImpl object) {
				return createBillManagerImplAdapter();
			}
			@Override
			public Adapter caseBillManager(BillManager object) {
				return createBillManagerAdapter();
			}
			@Override
			public Adapter caseBillDataService(BillDataService object) {
				return createBillDataServiceAdapter();
			}
			@Override
			public Adapter caseAdminKeyCardManager(AdminKeyCardManager object) {
				return createAdminKeyCardManagerAdapter();
			}
			@Override
			public Adapter caseKeyCardManager(KeyCardManager object) {
				return createKeyCardManagerAdapter();
			}
			@Override
			public Adapter caseLegalEntityManager(LegalEntityManager object) {
				return createLegalEntityManagerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Classes.DataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.DataService
	 * @generated
	 */
	public Adapter createDataServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.BookingDataService <em>Booking Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.BookingDataService
	 * @generated
	 */
	public Adapter createBookingDataServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.RoomStay <em>Room Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.RoomStay
	 * @generated
	 */
	public Adapter createRoomStayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.StayRequest <em>Stay Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.StayRequest
	 * @generated
	 */
	public Adapter createStayRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.LegalEntity
	 * @generated
	 */
	public Adapter createLegalEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.CreditCardInformation <em>Credit Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.CreditCardInformation
	 * @generated
	 */
	public Adapter createCreditCardInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.RoomType
	 * @generated
	 */
	public Adapter createRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.TravelInformation <em>Travel Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.TravelInformation
	 * @generated
	 */
	public Adapter createTravelInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.BookingManagerImpl <em>Booking Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.BookingManagerImpl
	 * @generated
	 */
	public Adapter createBookingManagerImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.BookingManager <em>Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.BookingManager
	 * @generated
	 */
	public Adapter createBookingManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.KeyCard <em>Key Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.KeyCard
	 * @generated
	 */
	public Adapter createKeyCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.DiscountManager <em>Discount Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.DiscountManager
	 * @generated
	 */
	public Adapter createDiscountManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Discount
	 * @generated
	 */
	public Adapter createDiscountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.DiscountLimit <em>Discount Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.DiscountLimit
	 * @generated
	 */
	public Adapter createDiscountLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.RoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.RoomManager
	 * @generated
	 */
	public Adapter createRoomManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.AdminDiscountManager <em>Admin Discount Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.AdminDiscountManager
	 * @generated
	 */
	public Adapter createAdminDiscountManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.AdminRoomManager <em>Admin Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.AdminRoomManager
	 * @generated
	 */
	public Adapter createAdminRoomManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.GuestRoom <em>Guest Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.GuestRoom
	 * @generated
	 */
	public Adapter createGuestRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.ConferenceRoom <em>Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.ConferenceRoom
	 * @generated
	 */
	public Adapter createConferenceRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Bill
	 * @generated
	 */
	public Adapter createBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Purchase <em>Purchase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Purchase
	 * @generated
	 */
	public Adapter createPurchaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.BookingBill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.BookingBill
	 * @generated
	 */
	public Adapter createBookingBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.PercentageDiscount <em>Percentage Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.PercentageDiscount
	 * @generated
	 */
	public Adapter createPercentageDiscountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.SumDiscount <em>Sum Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.SumDiscount
	 * @generated
	 */
	public Adapter createSumDiscountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.BillManagerImpl <em>Bill Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.BillManagerImpl
	 * @generated
	 */
	public Adapter createBillManagerImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.BillManager <em>Bill Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.BillManager
	 * @generated
	 */
	public Adapter createBillManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.BillDataService <em>Bill Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.BillDataService
	 * @generated
	 */
	public Adapter createBillDataServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.AdminKeyCardManager <em>Admin Key Card Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.AdminKeyCardManager
	 * @generated
	 */
	public Adapter createAdminKeyCardManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.KeyCardManager <em>Key Card Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.KeyCardManager
	 * @generated
	 */
	public Adapter createKeyCardManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.LegalEntityManager <em>Legal Entity Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.LegalEntityManager
	 * @generated
	 */
	public Adapter createLegalEntityManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ClassesAdapterFactory

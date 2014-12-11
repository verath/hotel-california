/**
 */
package Classes.util;

import Classes.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Classes.ClassesPackage
 * @generated
 */
public class ClassesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesSwitch() {
		if (modelPackage == null) {
			modelPackage = ClassesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ClassesPackage.DATA_SERVICE: {
				DataService<?, ?> dataService = (DataService<?, ?>)theEObject;
				T result = caseDataService(dataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.BOOKING_DATA_SERVICE: {
				BookingDataService bookingDataService = (BookingDataService)theEObject;
				T result = caseBookingDataService(bookingDataService);
				if (result == null) result = caseDataService(bookingDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.BOOKING: {
				Booking booking = (Booking)theEObject;
				T result = caseBooking(booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.ROOM_STAY: {
				RoomStay roomStay = (RoomStay)theEObject;
				T result = caseRoomStay(roomStay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.STAY_REQUEST: {
				StayRequest stayRequest = (StayRequest)theEObject;
				T result = caseStayRequest(stayRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseLegalEntity(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.LEGAL_ENTITY: {
				LegalEntity legalEntity = (LegalEntity)theEObject;
				T result = caseLegalEntity(legalEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.CREDIT_CARD_INFORMATION: {
				CreditCardInformation creditCardInformation = (CreditCardInformation)theEObject;
				T result = caseCreditCardInformation(creditCardInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.ROOM_TYPE: {
				RoomType roomType = (RoomType)theEObject;
				T result = caseRoomType(roomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.TRAVEL_INFORMATION: {
				TravelInformation travelInformation = (TravelInformation)theEObject;
				T result = caseTravelInformation(travelInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.BOOKING_MANAGER_IMPL: {
				BookingManagerImpl bookingManagerImpl = (BookingManagerImpl)theEObject;
				T result = caseBookingManagerImpl(bookingManagerImpl);
				if (result == null) result = caseBookingManager(bookingManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.BOOKING_MANAGER: {
				BookingManager bookingManager = (BookingManager)theEObject;
				T result = caseBookingManager(bookingManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.KEY_CARD: {
				KeyCard keyCard = (KeyCard)theEObject;
				T result = caseKeyCard(keyCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.DISCOUNT_MANAGER: {
				DiscountManager discountManager = (DiscountManager)theEObject;
				T result = caseDiscountManager(discountManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.DISCOUNT: {
				Discount discount = (Discount)theEObject;
				T result = caseDiscount(discount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.DISCOUNT_LIMIT: {
				DiscountLimit discountLimit = (DiscountLimit)theEObject;
				T result = caseDiscountLimit(discountLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.ROOM_MANAGER: {
				RoomManager roomManager = (RoomManager)theEObject;
				T result = caseRoomManager(roomManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.ADMIN_DISCOUNT_MANAGER: {
				AdminDiscountManager adminDiscountManager = (AdminDiscountManager)theEObject;
				T result = caseAdminDiscountManager(adminDiscountManager);
				if (result == null) result = caseDiscountManager(adminDiscountManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.ADMIN_ROOM_MANAGER: {
				AdminRoomManager adminRoomManager = (AdminRoomManager)theEObject;
				T result = caseAdminRoomManager(adminRoomManager);
				if (result == null) result = caseRoomManager(adminRoomManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.GUEST_ROOM: {
				GuestRoom guestRoom = (GuestRoom)theEObject;
				T result = caseGuestRoom(guestRoom);
				if (result == null) result = caseRoom(guestRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.CONFERENCE_ROOM: {
				ConferenceRoom conferenceRoom = (ConferenceRoom)theEObject;
				T result = caseConferenceRoom(conferenceRoom);
				if (result == null) result = caseRoom(conferenceRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseLegalEntity(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.BILL: {
				Bill bill = (Bill)theEObject;
				T result = caseBill(bill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.PURCHASE: {
				Purchase purchase = (Purchase)theEObject;
				T result = casePurchase(purchase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.BOOKING_BILL: {
				BookingBill bookingBill = (BookingBill)theEObject;
				T result = caseBookingBill(bookingBill);
				if (result == null) result = caseBill(bookingBill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.PERCENTAGE_DISCOUNT: {
				PercentageDiscount percentageDiscount = (PercentageDiscount)theEObject;
				T result = casePercentageDiscount(percentageDiscount);
				if (result == null) result = caseDiscount(percentageDiscount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.SUM_DISCOUNT: {
				SumDiscount sumDiscount = (SumDiscount)theEObject;
				T result = caseSumDiscount(sumDiscount);
				if (result == null) result = caseDiscount(sumDiscount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.BILL_MANAGER_IMPL: {
				BillManagerImpl billManagerImpl = (BillManagerImpl)theEObject;
				T result = caseBillManagerImpl(billManagerImpl);
				if (result == null) result = caseBillManager(billManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.BILL_MANAGER: {
				BillManager billManager = (BillManager)theEObject;
				T result = caseBillManager(billManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.BILL_DATA_SERVICE: {
				BillDataService billDataService = (BillDataService)theEObject;
				T result = caseBillDataService(billDataService);
				if (result == null) result = caseDataService(billDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.ADMIN_KEY_CARD_MANAGER: {
				AdminKeyCardManager adminKeyCardManager = (AdminKeyCardManager)theEObject;
				T result = caseAdminKeyCardManager(adminKeyCardManager);
				if (result == null) result = caseKeyCardManager(adminKeyCardManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.KEY_CARD_MANAGER: {
				KeyCardManager keyCardManager = (KeyCardManager)theEObject;
				T result = caseKeyCardManager(keyCardManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.LEGAL_ENTITY_MANAGER: {
				LegalEntityManager legalEntityManager = (LegalEntityManager)theEObject;
				T result = caseLegalEntityManager(legalEntityManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <E, ID> T caseDataService(DataService<E, ID> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingDataService(BookingDataService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking(Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Stay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Stay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomStay(RoomStay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stay Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stay Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStayRequest(StayRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalEntity(LegalEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credit Card Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit Card Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditCardInformation(CreditCardInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomType(RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Travel Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Travel Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTravelInformation(TravelInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingManagerImpl(BookingManagerImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingManager(BookingManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyCard(KeyCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discount Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discount Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountManager(DiscountManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscount(Discount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discount Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discount Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountLimit(DiscountLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomManager(RoomManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Discount Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Discount Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminDiscountManager(AdminDiscountManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Room Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Room Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminRoomManager(AdminRoomManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuestRoom(GuestRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conference Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conference Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConferenceRoom(ConferenceRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBill(Bill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purchase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purchase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurchase(Purchase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Bill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Bill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingBill(BookingBill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Percentage Discount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Percentage Discount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePercentageDiscount(PercentageDiscount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sum Discount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum Discount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSumDiscount(SumDiscount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillManagerImpl(BillManagerImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillManager(BillManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillDataService(BillDataService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Key Card Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Key Card Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminKeyCardManager(AdminKeyCardManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Card Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Card Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyCardManager(KeyCardManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Entity Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Entity Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalEntityManager(LegalEntityManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ClassesSwitch

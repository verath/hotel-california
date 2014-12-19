/**
 */
package tda593.hotel.california.booking.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tda593.hotel.california.DataService;

import tda593.hotel.california.booking.*;

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
 * @see tda593.hotel.california.booking.BookingPackage
 * @generated
 */
public class BookingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BookingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingSwitch() {
		if (modelPackage == null) {
			modelPackage = BookingPackage.eINSTANCE;
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
			case BookingPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseLegalEntity(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseLegalEntity(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.BOOKING: {
				Booking booking = (Booking)theEObject;
				T result = caseBooking(booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.TRAVEL_INFORMATION: {
				TravelInformation travelInformation = (TravelInformation)theEObject;
				T result = caseTravelInformation(travelInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.ROOM_STAY: {
				RoomStay roomStay = (RoomStay)theEObject;
				T result = caseRoomStay(roomStay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.STAY_REQUEST: {
				StayRequest stayRequest = (StayRequest)theEObject;
				T result = caseStayRequest(stayRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.CREDIT_CARD_INFORMATION: {
				CreditCardInformation creditCardInformation = (CreditCardInformation)theEObject;
				T result = caseCreditCardInformation(creditCardInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.BOOKING_MANAGER: {
				BookingManager bookingManager = (BookingManager)theEObject;
				T result = caseBookingManager(bookingManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.BOOKING_MANAGER_IMPL: {
				BookingManagerImpl bookingManagerImpl = (BookingManagerImpl)theEObject;
				T result = caseBookingManagerImpl(bookingManagerImpl);
				if (result == null) result = caseBookingManager(bookingManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.BOOKING_DATA_SERVICE: {
				BookingDataService bookingDataService = (BookingDataService)theEObject;
				T result = caseBookingDataService(bookingDataService);
				if (result == null) result = caseDataService(bookingDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.LEGAL_ENTITY_MANAGER: {
				LegalEntityManager legalEntityManager = (LegalEntityManager)theEObject;
				T result = caseLegalEntityManager(legalEntityManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL: {
				LegalEntityManagerImpl legalEntityManagerImpl = (LegalEntityManagerImpl)theEObject;
				T result = caseLegalEntityManagerImpl(legalEntityManagerImpl);
				if (result == null) result = caseLegalEntityManager(legalEntityManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE: {
				LegalEntityDataService legalEntityDataService = (LegalEntityDataService)theEObject;
				T result = caseLegalEntityDataService(legalEntityDataService);
				if (result == null) result = caseDataService(legalEntityDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.LEGAL_ENTITY: {
				LegalEntity legalEntity = (LegalEntity)theEObject;
				T result = caseLegalEntity(legalEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingManager(BookingManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingManagerImpl(BookingManagerImpl object) {
		return null;
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
	public T caseBookingDataService(BookingDataService object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Legal Entity Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Entity Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalEntityManagerImpl(LegalEntityManagerImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Entity Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Entity Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalEntityDataService(LegalEntityDataService object) {
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

} //BookingSwitch

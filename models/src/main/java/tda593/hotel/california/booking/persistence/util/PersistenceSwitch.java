/**
 */
package tda593.hotel.california.booking.persistence.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tda593.hotel.california.booking.persistence.*;

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
 * @see tda593.hotel.california.booking.persistence.PersistencePackage
 * @generated
 */
public class PersistenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PersistencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceSwitch() {
		if (modelPackage == null) {
			modelPackage = PersistencePackage.eINSTANCE;
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
			case PersistencePackage.ROOM_STAY_ENTITY: {
				RoomStayEntity roomStayEntity = (RoomStayEntity)theEObject;
				T result = caseRoomStayEntity(roomStayEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.PERSON_ENTITY: {
				PersonEntity personEntity = (PersonEntity)theEObject;
				T result = casePersonEntity(personEntity);
				if (result == null) result = caseLegalEntityEntity(personEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.LEGAL_ENTITY_ENTITY: {
				LegalEntityEntity legalEntityEntity = (LegalEntityEntity)theEObject;
				T result = caseLegalEntityEntity(legalEntityEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY: {
				CreditCardInformationEntity creditCardInformationEntity = (CreditCardInformationEntity)theEObject;
				T result = caseCreditCardInformationEntity(creditCardInformationEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.STAY_REQUEST_ENTITY: {
				StayRequestEntity stayRequestEntity = (StayRequestEntity)theEObject;
				T result = caseStayRequestEntity(stayRequestEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.ORGANIZATION_ENTITY: {
				OrganizationEntity organizationEntity = (OrganizationEntity)theEObject;
				T result = caseOrganizationEntity(organizationEntity);
				if (result == null) result = caseLegalEntityEntity(organizationEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.BOOKING_ENTITY: {
				BookingEntity bookingEntity = (BookingEntity)theEObject;
				T result = caseBookingEntity(bookingEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY: {
				TravelInformationEntity travelInformationEntity = (TravelInformationEntity)theEObject;
				T result = caseTravelInformationEntity(travelInformationEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Stay Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Stay Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomStayEntity(RoomStayEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonEntity(PersonEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Entity Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Entity Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalEntityEntity(LegalEntityEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credit Card Information Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit Card Information Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditCardInformationEntity(CreditCardInformationEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stay Request Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stay Request Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStayRequestEntity(StayRequestEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationEntity(OrganizationEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingEntity(BookingEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Travel Information Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Travel Information Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTravelInformationEntity(TravelInformationEntity object) {
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

} //PersistenceSwitch

/**
 */
package tda593.hotel.california.facilities.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tda593.hotel.california.DataService;

import tda593.hotel.california.facilities.*;

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
 * @see tda593.hotel.california.facilities.FacilitiesPackage
 * @generated
 */
public class FacilitiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FacilitiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitiesSwitch() {
		if (modelPackage == null) {
			modelPackage = FacilitiesPackage.eINSTANCE;
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
			case FacilitiesPackage.ADMIN_KEY_CARD_MANAGER: {
				AdminKeyCardManager adminKeyCardManager = (AdminKeyCardManager)theEObject;
				T result = caseAdminKeyCardManager(adminKeyCardManager);
				if (result == null) result = caseKeyCardManager(adminKeyCardManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.KEY_CARD_MANAGER: {
				KeyCardManager keyCardManager = (KeyCardManager)theEObject;
				T result = caseKeyCardManager(keyCardManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.KEY_CARD: {
				KeyCard keyCard = (KeyCard)theEObject;
				T result = caseKeyCard(keyCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.ADMIN_ROOM_MANAGER: {
				AdminRoomManager adminRoomManager = (AdminRoomManager)theEObject;
				T result = caseAdminRoomManager(adminRoomManager);
				if (result == null) result = caseRoomManager(adminRoomManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.ROOM_MANAGER: {
				RoomManager roomManager = (RoomManager)theEObject;
				T result = caseRoomManager(roomManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.ROOM_TYPE: {
				RoomType roomType = (RoomType)theEObject;
				T result = caseRoomType(roomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.GUEST_ROOM: {
				GuestRoom guestRoom = (GuestRoom)theEObject;
				T result = caseGuestRoom(guestRoom);
				if (result == null) result = caseRoom(guestRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.CONFERENCE_ROOM: {
				ConferenceRoom conferenceRoom = (ConferenceRoom)theEObject;
				T result = caseConferenceRoom(conferenceRoom);
				if (result == null) result = caseRoom(conferenceRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.ROOM_MANAGER_IMPL: {
				RoomManagerImpl roomManagerImpl = (RoomManagerImpl)theEObject;
				T result = caseRoomManagerImpl(roomManagerImpl);
				if (result == null) result = caseRoomManager(roomManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.ROOM_DATA_SERVICE: {
				RoomDataService roomDataService = (RoomDataService)theEObject;
				T result = caseRoomDataService(roomDataService);
				if (result == null) result = caseDataService(roomDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.ROOM_TYPE_DATA_SERVICE: {
				RoomTypeDataService roomTypeDataService = (RoomTypeDataService)theEObject;
				T result = caseRoomTypeDataService(roomTypeDataService);
				if (result == null) result = caseDataService(roomTypeDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.KEY_CARD_MANAGER_IMPL: {
				KeyCardManagerImpl keyCardManagerImpl = (KeyCardManagerImpl)theEObject;
				T result = caseKeyCardManagerImpl(keyCardManagerImpl);
				if (result == null) result = caseKeyCardManager(keyCardManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.KEY_CARD_DATA_SERVICE: {
				KeyCardDataService keyCardDataService = (KeyCardDataService)theEObject;
				T result = caseKeyCardDataService(keyCardDataService);
				if (result == null) result = caseDataService(keyCardDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL: {
				AdminRoomManagerImpl adminRoomManagerImpl = (AdminRoomManagerImpl)theEObject;
				T result = caseAdminRoomManagerImpl(adminRoomManagerImpl);
				if (result == null) result = caseRoomManagerImpl(adminRoomManagerImpl);
				if (result == null) result = caseAdminRoomManager(adminRoomManagerImpl);
				if (result == null) result = caseRoomManager(adminRoomManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackage.ADMIN_KEY_CARD_MANAGER_IMPL: {
				AdminKeyCardManagerImpl adminKeyCardManagerImpl = (AdminKeyCardManagerImpl)theEObject;
				T result = caseAdminKeyCardManagerImpl(adminKeyCardManagerImpl);
				if (result == null) result = caseKeyCardManagerImpl(adminKeyCardManagerImpl);
				if (result == null) result = caseAdminKeyCardManager(adminKeyCardManagerImpl);
				if (result == null) result = caseKeyCardManager(adminKeyCardManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Room Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomManagerImpl(RoomManagerImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomDataService(RoomDataService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomTypeDataService(RoomTypeDataService object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Key Card Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Card Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyCardManagerImpl(KeyCardManagerImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Card Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Card Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyCardDataService(KeyCardDataService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Room Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Room Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminRoomManagerImpl(AdminRoomManagerImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Key Card Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Key Card Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminKeyCardManagerImpl(AdminKeyCardManagerImpl object) {
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

} //FacilitiesSwitch

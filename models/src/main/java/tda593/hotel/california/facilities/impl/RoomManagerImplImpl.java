/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomDataService;
import tda593.hotel.california.facilities.RoomManagerImpl;
import tda593.hotel.california.facilities.RoomType;
import tda593.hotel.california.facilities.RoomTypeDataService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomManagerImplImpl#getRoomDataService <em>Room Data Service</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomManagerImplImpl#getRoomTypeDataService <em>Room Type Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomManagerImplImpl extends MinimalEObjectImpl.Container implements RoomManagerImpl {
	/**
	 * The cached value of the '{@link #getRoomDataService() <em>Room Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomDataService()
	 * @generated
	 * @ordered
	 */
	protected RoomDataService roomDataService;

	/**
	 * The cached value of the '{@link #getRoomTypeDataService() <em>Room Type Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeDataService()
	 * @generated
	 * @ordered
	 */
	protected RoomTypeDataService roomTypeDataService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomManagerImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackage.Literals.ROOM_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomDataService getRoomDataService() {
		if (roomDataService != null && roomDataService.eIsProxy()) {
			InternalEObject oldRoomDataService = (InternalEObject)roomDataService;
			roomDataService = (RoomDataService)eResolveProxy(oldRoomDataService);
			if (roomDataService != oldRoomDataService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_DATA_SERVICE, oldRoomDataService, roomDataService));
			}
		}
		return roomDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomDataService basicGetRoomDataService() {
		return roomDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomDataService(RoomDataService newRoomDataService) {
		RoomDataService oldRoomDataService = roomDataService;
		roomDataService = newRoomDataService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_DATA_SERVICE, oldRoomDataService, roomDataService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeDataService getRoomTypeDataService() {
		if (roomTypeDataService != null && roomTypeDataService.eIsProxy()) {
			InternalEObject oldRoomTypeDataService = (InternalEObject)roomTypeDataService;
			roomTypeDataService = (RoomTypeDataService)eResolveProxy(oldRoomTypeDataService);
			if (roomTypeDataService != oldRoomTypeDataService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_TYPE_DATA_SERVICE, oldRoomTypeDataService, roomTypeDataService));
			}
		}
		return roomTypeDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeDataService basicGetRoomTypeDataService() {
		return roomTypeDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeDataService(RoomTypeDataService newRoomTypeDataService) {
		RoomTypeDataService oldRoomTypeDataService = roomTypeDataService;
		roomTypeDataService = newRoomTypeDataService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_TYPE_DATA_SERVICE, oldRoomTypeDataService, roomTypeDataService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerKeyCard(KeyCard keycard) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerKeyCard(String keycardNbr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unregisterKeyCard(KeyCard keyCard) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unregisterKeyCard(String keyCardNbr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unregisterAllKeyCards(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<RoomType, Integer> getRoomTypeAmounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomTypeAmount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_DATA_SERVICE:
				if (resolve) return getRoomDataService();
				return basicGetRoomDataService();
			case FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_TYPE_DATA_SERVICE:
				if (resolve) return getRoomTypeDataService();
				return basicGetRoomTypeDataService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_DATA_SERVICE:
				setRoomDataService((RoomDataService)newValue);
				return;
			case FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_TYPE_DATA_SERVICE:
				setRoomTypeDataService((RoomTypeDataService)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_DATA_SERVICE:
				setRoomDataService((RoomDataService)null);
				return;
			case FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_TYPE_DATA_SERVICE:
				setRoomTypeDataService((RoomTypeDataService)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_DATA_SERVICE:
				return roomDataService != null;
			case FacilitiesPackage.ROOM_MANAGER_IMPL__ROOM_TYPE_DATA_SERVICE:
				return roomTypeDataService != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FacilitiesPackage.ROOM_MANAGER_IMPL___GET_ROOM_TYPES:
				return getRoomTypes();
			case FacilitiesPackage.ROOM_MANAGER_IMPL___REGISTER_KEY_CARD__KEYCARD:
				registerKeyCard((KeyCard)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_MANAGER_IMPL___REGISTER_KEY_CARD__STRING:
				registerKeyCard((String)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_MANAGER_IMPL___GET_ROOMS:
				return getRooms();
			case FacilitiesPackage.ROOM_MANAGER_IMPL___UNREGISTER_KEY_CARD__KEYCARD:
				unregisterKeyCard((KeyCard)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_MANAGER_IMPL___UNREGISTER_KEY_CARD__STRING:
				unregisterKeyCard((String)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_MANAGER_IMPL___UNREGISTER_ALL_KEY_CARDS__ROOM:
				unregisterAllKeyCards((Room)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_MANAGER_IMPL___GET_ROOM_TYPE_AMOUNTS:
				return getRoomTypeAmounts();
			case FacilitiesPackage.ROOM_MANAGER_IMPL___GET_ROOM_TYPE_AMOUNT:
				return getRoomTypeAmount();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomManagerImplImpl

/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.KeyCardManager;
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
 *   <li>{@link tda593.hotel.california.facilities.impl.RoomManagerImplImpl#getKeyCardManager <em>Key Card Manager</em>}</li>
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
	 * The cached value of the '{@link #getKeyCardManager() <em>Key Card Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCardManager()
	 * @generated
	 * @ordered
	 */
	protected KeyCardManager keyCardManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomManagerImplImpl() {
		super();
	}
	
	public RoomManagerImplImpl(RoomTypeDataService roomTypeDataService, RoomDataService roomDataService, KeyCardManager keyCardManader) {
		this();
		this.roomTypeDataService = roomTypeDataService;
		this.roomDataService = roomDataService;
		this.keyCardManager = keyCardManader;
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
	public KeyCardManager getKeyCardManager() {
		if (keyCardManager != null && keyCardManager.eIsProxy()) {
			InternalEObject oldKeyCardManager = (InternalEObject)keyCardManager;
			keyCardManager = (KeyCardManager)eResolveProxy(oldKeyCardManager);
			if (keyCardManager != oldKeyCardManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilitiesPackage.ROOM_MANAGER_IMPL__KEY_CARD_MANAGER, oldKeyCardManager, keyCardManager));
			}
		}
		return keyCardManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardManager basicGetKeyCardManager() {
		return keyCardManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<RoomType> getRoomTypes() {
		return roomTypeDataService.getAll();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void registerKeyCard(KeyCard keyCard, String roomNumber) {
		Room room = roomDataService.get(roomNumber);
		room.registerKeyCard(keyCard);
		roomDataService.set(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void registerKeyCard(String keyCardNbr, String roomNumber) {
		KeyCard keyCard = keyCardManager.getKeyCard(keyCardNbr);
		registerKeyCard(keyCard, roomNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getRooms() {
		return roomDataService.getAll();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unregisterKeyCard(KeyCard keyCard, String roomNumber) {
		Room room = roomDataService.get(roomNumber);
		room.unregisterKeyCard(keyCard);
		roomDataService.set(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unregisterKeyCard(String keyCardNbr, String roomNumber) {
		KeyCard keyCard = keyCardManager.getKeyCard(keyCardNbr);
		unregisterKeyCard(keyCard, roomNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unregisterAllKeyCards(String roomNumber) {
		Room room = roomDataService.get(roomNumber);
		room.unregisterKeyCards();
		roomDataService.set(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<RoomType, Integer> getRoomTypeAmounts() {
		Map<RoomType, Integer> roomTypeAmounts = new HashMap<RoomType, Integer>();

		for(Room room : getRooms()) {
			RoomType roomType = room.getRoomType();
			
			Integer roomTypeAmount = roomTypeAmounts.get(roomType);
			if(roomTypeAmount == null) {
				roomTypeAmounts.put(roomType, 1);
			} else {
				roomTypeAmounts.put(roomType, roomTypeAmount + 1);
			}
		}
		
		return roomTypeAmounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getRoomTypeAmount(RoomType roomType) {
		return getRoomTypeAmounts().get(roomType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room getRoom(String roomNumber) {
		if(roomNumber == null || roomNumber.isEmpty()) {
			throw new IllegalArgumentException("Room number must not be empty.");
		}
		
		String regex = "^[0-9]$"; // Room number contains only digits?
		if(!roomNumber.matches(regex)) {
			throw new IllegalArgumentException("Room number must only contain digits.");
		}
		
		int number = 0;
		try {
			number = Integer.parseInt(roomNumber);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Room number must only contain digits.");
		}
		
		if(number < 0) {
			throw new IllegalArgumentException("Room number must not be negative.");
		}
		return roomDataService.get(roomNumber);
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
			case FacilitiesPackage.ROOM_MANAGER_IMPL__KEY_CARD_MANAGER:
				if (resolve) return getKeyCardManager();
				return basicGetKeyCardManager();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case FacilitiesPackage.ROOM_MANAGER_IMPL__KEY_CARD_MANAGER:
				return keyCardManager != null;
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
			case FacilitiesPackage.ROOM_MANAGER_IMPL___REGISTER_KEY_CARD__KEYCARD_STRING:
				registerKeyCard((KeyCard)arguments.get(0), (String)arguments.get(1));
				return null;
			case FacilitiesPackage.ROOM_MANAGER_IMPL___REGISTER_KEY_CARD__STRING_STRING:
				registerKeyCard((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case FacilitiesPackage.ROOM_MANAGER_IMPL___GET_ROOMS:
				return getRooms();
			case FacilitiesPackage.ROOM_MANAGER_IMPL___UNREGISTER_KEY_CARD__KEYCARD_STRING:
				unregisterKeyCard((KeyCard)arguments.get(0), (String)arguments.get(1));
				return null;
			case FacilitiesPackage.ROOM_MANAGER_IMPL___UNREGISTER_KEY_CARD__STRING_STRING:
				unregisterKeyCard((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case FacilitiesPackage.ROOM_MANAGER_IMPL___UNREGISTER_ALL_KEY_CARDS__STRING:
				unregisterAllKeyCards((String)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_MANAGER_IMPL___GET_ROOM_TYPE_AMOUNTS:
				return getRoomTypeAmounts();
			case FacilitiesPackage.ROOM_MANAGER_IMPL___GET_ROOM_TYPE_AMOUNT__ROOMTYPE:
				return getRoomTypeAmount((RoomType)arguments.get(0));
			case FacilitiesPackage.ROOM_MANAGER_IMPL___GET_ROOM__INT:
				return getRoom((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomManagerImplImpl

/**
 */
package tda593.hotel.california.booking.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingDataService;
import tda593.hotel.california.booking.BookingManagerImpl;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.RoomStay;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingManagerImplImpl#getBookingDataService <em>Booking Data Service</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingManagerImplImpl#getRoomManager <em>Room Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingManagerImplImpl extends MinimalEObjectImpl.Container implements BookingManagerImpl {
	/**
	 * The cached value of the '{@link #getBookingDataService() <em>Booking Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingDataService()
	 * @generated
	 * @ordered
	 */
	protected BookingDataService bookingDataService;

	/**
	 * The cached value of the '{@link #getRoomManager() <em>Room Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomManager()
	 * @generated
	 * @ordered
	 */
	protected RoomManager roomManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingManagerImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingPackage.Literals.BOOKING_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingDataService getBookingDataService() {
		if (bookingDataService != null && bookingDataService.eIsProxy()) {
			InternalEObject oldBookingDataService = (InternalEObject)bookingDataService;
			bookingDataService = (BookingDataService)eResolveProxy(oldBookingDataService);
			if (bookingDataService != oldBookingDataService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE, oldBookingDataService, bookingDataService));
			}
		}
		return bookingDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingDataService basicGetBookingDataService() {
		return bookingDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingDataService(BookingDataService newBookingDataService) {
		BookingDataService oldBookingDataService = bookingDataService;
		bookingDataService = newBookingDataService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE, oldBookingDataService, bookingDataService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManager getRoomManager() {
		if (roomManager != null && roomManager.eIsProxy()) {
			InternalEObject oldRoomManager = (InternalEObject)roomManager;
			roomManager = (RoomManager)eResolveProxy(oldRoomManager);
			if (roomManager != oldRoomManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.BOOKING_MANAGER_IMPL__ROOM_MANAGER, oldRoomManager, roomManager));
			}
		}
		return roomManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManager basicGetRoomManager() {
		return roomManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomManager(RoomManager newRoomManager) {
		RoomManager oldRoomManager = roomManager;
		roomManager = newRoomManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING_MANAGER_IMPL__ROOM_MANAGER, oldRoomManager, roomManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookings(Date from, Date to) {
		// TODO: needs service implementations first
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookings(Date from, Date to, LegalEntity customer) {
		// TODO: needs service implementations first
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBookings(LegalEntity customer) {
		// TODO: needs service implementations first
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAvailableRooms(Date from, Date to) {
		EList<Room> rooms = new BasicEList<Room>(roomManager.getRooms());
		EList<Booking> bookings = getBookings(from, to);
		EList<Room> bookedRooms = new BasicEList<Room>();
		
		for(Booking booking : bookings) {
			bookedRooms.add(booking.getRoomStay().getRoom());
		}
		
		rooms.removeAll(bookedRooms);
		
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAvailableRooms(Date from, Date to, RoomType roomType) {
		EList<Room> rooms = new BasicEList<Room>(roomManager.getRooms());
		EList<Booking> bookings = getBookings(from, to);
		EList<Room> bookedRooms = new BasicEList<Room>();
		
		for(Booking booking : bookings) {
			if(booking.getRoomType().equals(roomType)) {
				bookedRooms.add(booking.getRoomStay().getRoom());
			}
		}
		
		rooms.removeAll(bookedRooms);
		
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<RoomType, Integer> getAvailableRoomTypeAmounts(Date from, Date to) {
		Map<RoomType, Integer> roomTypeAmounts = new HashMap<RoomType, Integer>();
		
		List<RoomType> roomTypes = roomManager.getRoomTypes();
		List<Booking> bookings = getBookings(from, to);
		
		for(RoomType roomType : roomTypes) {
			int amountOfRoomTypeTotal = roomTypeAmounts.get(roomType);
			int amountOfRoomTypeAvailable = amountOfRoomTypeTotal;
			
			for(Booking booking : bookings) {
				if(booking.getRoomType().equals(roomType)) {
					amountOfRoomTypeAvailable -= 1;		// TODO: verify that this doesn't go below 0?
				}
			}
			
			roomTypeAmounts.put(roomType, amountOfRoomTypeAvailable);
		}
		
		return roomTypeAmounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getAvailableRoomTypeAmount(Date from, Date to, RoomType roomType) {
		return getAvailableRoomTypeAmounts(from, to).get(roomType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBooking(Date from, Date to, LegalEntity customer, RoomType RoomType) {
		// TODO: needs service implementations first
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBooking(Date from, Date to, LegalEntity customer, Room room) {
		// TODO: needs service implementations first
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isRoomAvailable(Date from, Date to, int roomNumber) {
		EList<Room> availableRooms = getAvailableRooms(from, to);
		
		for(Room room : availableRooms) {
			if(room.getRoomNumber() == roomNumber) {
				return true;
			}
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerRoom(Booking booking, Room room) {
		// TODO: needs service implementations first
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkIn(Booking booking, EList<Person> guests) {
		RoomType roomType = booking.getRoomType();
		
		Map<RoomType, Integer> roomTypeMap = getAvailableRoomTypeAmounts(booking.getStartDate(), booking.getEndDate());
		
		int nbrAvailableOfRoomType = roomTypeMap.get(roomType);
		
		// If none of room type that was booked was available
		if(nbrAvailableOfRoomType == 0) {
			throw new IllegalStateException("No room of that room type available.");
		}
		
		List<Room> availableRooms = getAvailableRooms(booking.getStartDate(), booking.getEndDate(), roomType);
		
		Random random = new Random();
		Room selectedRoom = availableRooms.get(random.nextInt(availableRooms.size()));
		
		// Register room stay
		RoomStay roomStay = new RoomStayImpl();
		roomStay.setActive(true);
		roomStay.setRoom(selectedRoom);
		
		List<Person> roomStayGuests = roomStay.getRegisteredPersons();
		roomStayGuests.addAll(guests);
		
		booking.setRoomStay(roomStay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isRoomTypeAvailable(Date from, Date to, RoomType roomType) {
		Map<RoomType, Integer> roomTypeAmounts = getAvailableRoomTypeAmounts(from, to);
		
		return roomTypeAmounts.get(roomType) > 0 ? true : false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomTypes() {
		// TODO: needs service implementations first
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getActiveBooking(int roomNumber) {
		// TODO: needs service implementations first
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegalEntity> getRelatedLegalEntities(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkOut(Booking booking) {
		RoomStay roomStay = booking.getRoomStay();
		roomStay.setActive(false);
		
		roomStay.getRegisteredPersons().clear();
		
		Room room = roomStay.getRoom();
		room.unregisterKeyCards();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE:
				if (resolve) return getBookingDataService();
				return basicGetBookingDataService();
			case BookingPackage.BOOKING_MANAGER_IMPL__ROOM_MANAGER:
				if (resolve) return getRoomManager();
				return basicGetRoomManager();
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
			case BookingPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE:
				setBookingDataService((BookingDataService)newValue);
				return;
			case BookingPackage.BOOKING_MANAGER_IMPL__ROOM_MANAGER:
				setRoomManager((RoomManager)newValue);
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
			case BookingPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE:
				setBookingDataService((BookingDataService)null);
				return;
			case BookingPackage.BOOKING_MANAGER_IMPL__ROOM_MANAGER:
				setRoomManager((RoomManager)null);
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
			case BookingPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE:
				return bookingDataService != null;
			case BookingPackage.BOOKING_MANAGER_IMPL__ROOM_MANAGER:
				return roomManager != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_BOOKINGS__DATE_DATE:
				return getBookings((Date)arguments.get(0), (Date)arguments.get(1));
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_BOOKINGS__DATE_DATE_LEGALENTITY:
				return getBookings((Date)arguments.get(0), (Date)arguments.get(1), (LegalEntity)arguments.get(2));
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_BOOKINGS__LEGALENTITY:
				return getBookings((LegalEntity)arguments.get(0));
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOMS__DATE_DATE:
				return getAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1));
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE:
				return getAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (RoomType)arguments.get(2));
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOM_TYPE_AMOUNTS__DATE_DATE:
				return getAvailableRoomTypeAmounts((Date)arguments.get(0), (Date)arguments.get(1));
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE:
				return getAvailableRoomTypeAmount((Date)arguments.get(0), (Date)arguments.get(1), (RoomType)arguments.get(2));
			case BookingPackage.BOOKING_MANAGER_IMPL___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE:
				createBooking((Date)arguments.get(0), (Date)arguments.get(1), (LegalEntity)arguments.get(2), (RoomType)arguments.get(3));
				return null;
			case BookingPackage.BOOKING_MANAGER_IMPL___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM:
				createBooking((Date)arguments.get(0), (Date)arguments.get(1), (LegalEntity)arguments.get(2), (Room)arguments.get(3));
				return null;
			case BookingPackage.BOOKING_MANAGER_IMPL___IS_ROOM_AVAILABLE__DATE_DATE_INT:
				return isRoomAvailable((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2));
			case BookingPackage.BOOKING_MANAGER_IMPL___REGISTER_ROOM__BOOKING_ROOM:
				registerRoom((Booking)arguments.get(0), (Room)arguments.get(1));
				return null;
			case BookingPackage.BOOKING_MANAGER_IMPL___CHECK_IN__BOOKING_ELIST:
				checkIn((Booking)arguments.get(0), (EList<Person>)arguments.get(1));
				return null;
			case BookingPackage.BOOKING_MANAGER_IMPL___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE:
				return isRoomTypeAvailable((Date)arguments.get(0), (Date)arguments.get(1), (RoomType)arguments.get(2));
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_ROOM_TYPES:
				return getRoomTypes();
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_ACTIVE_BOOKING__INT:
				return getActiveBooking((Integer)arguments.get(0));
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_RELATED_LEGAL_ENTITIES__BOOKING:
				return getRelatedLegalEntities((Booking)arguments.get(0));
			case BookingPackage.BOOKING_MANAGER_IMPL___CHECK_OUT__BOOKING:
				checkOut((Booking)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingManagerImplImpl
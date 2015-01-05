/**
 */
package tda593.hotel.california.booking.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingDataService;
import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.BookingManagerImpl;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.RoomStay;
import tda593.hotel.california.booking.StayRequest;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomManager;
import tda593.hotel.california.facilities.RoomType;
import tda593.hotel.california.util.DateUtil;

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
	
	public BookingManagerImplImpl(BookingDataService bookingDataService, RoomManager roomManager) {
		this();
		this.bookingDataService = bookingDataService;
		this.roomManager = roomManager;
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
	 * @generated NOT
	 */
	public EList<Booking> getBookings(Date from, Date to) {
		if(!DateUtil.isDateRangeValid(from, to)) {
			throw new IllegalArgumentException("The specified time period is not valid");
		}
		return bookingDataService.getAll(from, to);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getBookings(Date from, Date to, LegalEntity customer) {
		if(!DateUtil.isDateRangeValid(from, to)) {
			throw new IllegalArgumentException("The specified time period is not valid");
		} else if (customer==null) {
			throw new IllegalArgumentException("The specified customer is not valid");
		}
		
		return bookingDataService.getAll(from, to, customer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getBookings(LegalEntity customer) {
		if (customer==null) {
			throw new IllegalArgumentException("The specified customer is not valid");
		}
		return bookingDataService.getAll(customer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAvailableRooms(Date from, Date to) {
		return getAvaiableRoomsHepler(from, to, null);
	}

	/**
	 * Excludes the specified booking from the results.
	 */
	private EList<Room> getAvaiableRoomsHepler(Date from, Date to, Booking b) {
		if(!DateUtil.isDateRangeValid(from, to)) {
			throw new IllegalArgumentException("The specified time period is not valid");
		}
		
		EList<Room> rooms = new BasicEList<Room>(roomManager.getRooms());
		EList<Booking> bookings = getBookings(from, to);
		EList<Room> bookedRooms = new BasicEList<Room>();
		
		if(b != null) {
			bookings.remove(b);
		}
		
		// Remove all rooms that are specifically booked
		for(Booking booking : bookings) {
			if(booking.getRoomStay() != null && !booking.isCanceled()) {
				bookedRooms.add(booking.getRoomStay().getRoom());
			}
		}
		
		rooms.removeAll(bookedRooms);
		
		// Remove rooms that are not operational
		Iterator<Room> roomIter = rooms.iterator();
		while(roomIter.hasNext()) {
			Room curRoom = roomIter.next();
			if(!curRoom.isOperational()) {
				roomIter.remove();
			}
		}
		
		// Remove all rooms that cannot be booked since that specific room type is booked up
		Map<RoomType, Integer> availableRoomTypes = getAvailableRoomTypeAmounts(from, to);
		EList<Room> availableRooms = new BasicEList<Room>();
		
		
		RoomType bookingRoomType = null;
		if(b != null) {
			bookingRoomType = b.getRoomType();
		}
		
		for(Room room: rooms) {
			if(availableRoomTypes.get(room.getRoomType()) != 0) {
				availableRooms.add(room);
			} else if(bookingRoomType != null && bookingRoomType.getName().equals(room.getRoomType().getName())) {
				// Exclude the booking from the search
				availableRooms.add(room);
				// Do it only once for the booking
				bookingRoomType = null;
			}
		}
		
		return availableRooms;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAvailableRooms(Date from, Date to, RoomType roomType) {
		return getAvailableRoomsHelper(from, to, roomType, null);
	}
	
	private EList<Room> getAvailableRoomsHelper(Date from, Date to, RoomType roomType, Booking booking) {
		if(!DateUtil.isDateRangeValid(from, to)) {
			throw new IllegalArgumentException("The specified time period is not valid");
		}
		
		 EList<Room> availableRooms = getAvaiableRoomsHepler(from, to, booking);
		 EList<Room> filteredRooms = new BasicEList<Room>();
		 
		 for(Room room: availableRooms) {
			 if(room.getRoomType().equals(roomType)) {
				 filteredRooms.add(room);
			 }
		 }
		
		 return filteredRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<RoomType, Integer> getAvailableRoomTypeAmounts(Date from, Date to) {
		Map<RoomType, Integer> roomTypeAmounts = roomManager.getRoomTypeAmounts();
		EList<Booking> bookings = getBookings(from, to);
		
		// We need to look at bookings to see which room types are not available.
		// One might think that looking at which rooms are available is enough, but it isn't
		// since a room being available does not imply that its room type is available. This
		// is because when booking room types, a room is not assigned until check in. A room type
		// is not available if it has been booked.
		for(Booking booking : bookings) {
			RoomType roomType = booking.getRoomType();
			
			Integer amountOfRoomTypeAvailable = roomTypeAmounts.get(roomType);
			roomTypeAmounts.put(roomType, amountOfRoomTypeAvailable - 1);
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
	 * @generated NOT
	 */
	public Booking createBooking(Date from, Date to, LegalEntity customer, RoomType roomType) {
		if (customer==null) {
			throw new IllegalArgumentException("No customer specified");
		} else if(roomType == null) {
			throw new IllegalArgumentException("No room type specified");
		}
		
		try {
			// Begin transaction to lock out any other that tries to book simontaineously 
			bookingDataService.beginTransaction(); 
			
			if(!isRoomTypeAvailable(from, to, roomType)) {
				throw new IllegalArgumentException("The specified room type is either not bookable or is already "
						+ "booked in that period");
			}
		
			Booking booking = new BookingImpl();
			booking.setStartDate(from);
			booking.setEndDate(to);
			booking.setResponsible(customer);
			booking.setRoomType(roomType);
			booking.setPrice(roomType.getPrice());
			bookingDataService.set(booking);
			
			bookingDataService.commitTransaction();
			return booking;
		} catch(IllegalStateException e) {
			bookingDataService.rollbackTransaction();
			throw e;
		} catch(RuntimeException e) {
			bookingDataService.rollbackTransaction();
			throw e;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking createBooking(Date from, Date to, LegalEntity customer, Room room) {
		if (customer==null) {
			throw new IllegalArgumentException("No customer specified");
		} else if(room == null) {
			throw new IllegalArgumentException("No room specified");
		}
		
		try {
			// Begin transaction to lock out any other that tries to book simontaineously 
			bookingDataService.beginTransaction(); 
			
			if(!isRoomAvailable(from, to, room.getRoomNumber())) {
				throw new IllegalArgumentException("The specified room is either not bookable or is already "
						+ "booked in that period");
			}
		
			Booking booking = new BookingImpl();
			booking.setStartDate(from);
			booking.setEndDate(to);
			booking.setResponsible(customer);
			booking.setRoomType(room.getRoomType());
			booking.setPrice(room.getRoomType().getPrice());
			
			registerRoomStay(booking, room);
			bookingDataService.commitTransaction();
			return booking;
		} catch(IllegalStateException e) {
			bookingDataService.rollbackTransaction();
			throw e;
		} catch(RuntimeException e) {
			bookingDataService.rollbackTransaction();
			throw e;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isRoomAvailable(Date from, Date to, String roomNumber) {
		EList<Room> availableRooms = getAvailableRooms(from, to);
		
		for(Room room : availableRooms) {
			if(room.getRoomNumber().equals(roomNumber)) {
				return true;
			}
			
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void registerRoom(Booking booking, Room room) {
		RoomStay roomStay = booking.getRoomStay();
		
		if(roomStay == null) {
			roomStay = new RoomStayImpl();
			booking.setRoomStay(roomStay);
		}
				
		roomStay.setRoom(room);
		
		bookingDataService.set(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkIn(Booking booking, EList<Person> guests) {
		
		if(booking.getRoomStay()==null) {
			
			RoomType roomType = booking.getRoomType();
			
			// +1 since the current booking accounts for one
			int nbrAvailableOfRoomType = getAvailableRoomTypeAmount(booking.getStartDate(), booking.getEndDate(), roomType) + 1;
					
			// If none of room type that was booked was available
			if(nbrAvailableOfRoomType == 0) {
				throw new IllegalStateException("No room of that room type available.");
			}
			
			List<Room> availableRooms = getAvailableRoomsHelper(booking.getStartDate(), booking.getEndDate(), roomType, booking);

			// Loop through the available rooms and make sure no un-checked-out booking is still active and 
			// grab the first one which hasn't got any avtive booking attached to it
			Room selectedRoom = null;
			for(Room room : availableRooms) {
				if(getActiveBooking(room.getRoomNumber()) == null) {
					selectedRoom = room;
					break;
				}
			}
			
			if(selectedRoom == null) {
				throw new IllegalStateException("A room should be available, but the previous guest haven't checked out yet");
			}
			
			RoomStay roomStay = registerRoomStay(booking, selectedRoom);

			booking.setRoomStay(roomStay);
		}
		
		// Register room stay
		List<Person> roomStayGuests = booking.getRoomStay().getRegisteredPersons();
		roomStayGuests.addAll(guests);
		booking.getRoomStay().setActive(true);
		bookingDataService.set(booking);
	}

	private RoomStay registerRoomStay(Booking booking, Room room) {
		RoomStay roomStay = new RoomStayImpl();
		roomStay.setRoom(room);
		booking.setRoomStay(roomStay);
		bookingDataService.set(booking);
		return roomStay;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isRoomTypeAvailable(Date from, Date to, RoomType roomType) {
		Map<RoomType, Integer> availableRoomTypes = getAvailableRoomTypeAmounts(from, to);
		
		if(availableRoomTypes.get(roomType) == null) {
			return false;
		} else {
			return availableRoomTypes.get(roomType) > 0 ? true : false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking getActiveBooking(String roomNumber) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(System.currentTimeMillis());
		Date to = c.getTime();
		c.setTimeInMillis(0);
		Date from = c.getTime();
		List<Booking> bookings = bookingDataService.getAll(from, to, roomNumber);
		for(Booking booking : bookings) {
			if(booking.getRoomStay().isActive()) {
				return booking;
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkOut(Booking booking) {
		RoomStay roomStay = booking.getRoomStay();
		roomStay.setActive(false);		
		roomManager.unregisterAllKeyCards(roomStay.getRoom().getRoomNumber());
		
		// Persist the changes
		bookingDataService.set(booking);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the booking with the specified id, of null if there are none
	 * @param bookingId The id of the requested booking
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking getBooking(int bookingId) {
		return bookingDataService.get(bookingId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean changeBookingDates(Booking booking, Date newStart, Date newEnd) {
		if(newStart.after(newEnd)) {
			throw new IllegalArgumentException("start was greater than end");
		}
		
		try {
			bookingDataService.beginTransaction();
			
			if(booking.getStartDate().after(newStart)) {
				if(!isRoomAvailable(newStart, booking.getStartDate(), booking.getRoomStay().getRoom().getRoomNumber())) {
					throw new IllegalStateException();
				}
			}
			
			if(booking.getEndDate().before(newEnd)) {
				if(!isRoomAvailable(booking.getEndDate(), newEnd, booking.getRoomStay().getRoom().getRoomNumber())) {
					throw new IllegalStateException();
				}
			}
			
			booking.setStartDate(newStart);
			booking.setEndDate(newEnd);
			bookingDataService.set(booking);
			
			bookingDataService.commitTransaction();
			return true;
		} catch(IllegalStateException e) {
			bookingDataService.rollbackTransaction();
			return false;
		} catch(RuntimeException e) {
			bookingDataService.rollbackTransaction();
			throw e;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StayRequest addStayRequest(Booking booking, String stayRequest) {
		if(booking != null && booking.getRoomStay() != null && stayRequest != null && !stayRequest.isEmpty()) {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(System.currentTimeMillis());

			StayRequest stayRequestObj = BookingFactory.eINSTANCE.createStayRequest();
			stayRequestObj.setText(stayRequest);
			stayRequestObj.setTimeStamp(cal.getTime());
			booking.getRoomStay().getStayRequest().add(stayRequestObj);
			
			bookingDataService.set(booking);
			
			return stayRequestObj;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeStayRequest(Booking booking, StayRequest stayRequest) {
		if(booking != null && booking.getRoomStay() != null && stayRequest != null) {
			booking.getRoomStay().getStayRequest().remove(stayRequest);
			bookingDataService.set(booking);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<Booking, EList<StayRequest>> getStayRequests() {
		EList<Booking> bookings = bookingDataService.getAll();
		Map<Booking, EList<StayRequest>> bookingToStayRequests = new HashMap<Booking, EList<StayRequest>>();
		
		for(Booking booking : bookings) {
			EList<StayRequest> stayRequests = new BasicEList<StayRequest>();
			
			if(booking.getRoomStay() != null && !booking.getRoomStay().getStayRequest().isEmpty()) {
				stayRequests.addAll(booking.getRoomStay().getStayRequest());
				bookingToStayRequests.put(booking, stayRequests);
			}
		}
		
		return bookingToStayRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSpecialRequest(Booking booking, String specialRequest) {
		if(specialRequest == null) {
			throw new NullPointerException();
		}
		
		booking.setSpecialRequest(specialRequest);
		bookingDataService.set(booking);
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
				return createBooking((Date)arguments.get(0), (Date)arguments.get(1), (LegalEntity)arguments.get(2), (RoomType)arguments.get(3));
			case BookingPackage.BOOKING_MANAGER_IMPL___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM:
				return createBooking((Date)arguments.get(0), (Date)arguments.get(1), (LegalEntity)arguments.get(2), (Room)arguments.get(3));
			case BookingPackage.BOOKING_MANAGER_IMPL___IS_ROOM_AVAILABLE__DATE_DATE_STRING:
				return isRoomAvailable((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
			case BookingPackage.BOOKING_MANAGER_IMPL___REGISTER_ROOM__BOOKING_ROOM:
				registerRoom((Booking)arguments.get(0), (Room)arguments.get(1));
				return null;
			case BookingPackage.BOOKING_MANAGER_IMPL___CHECK_IN__BOOKING_ELIST:
				checkIn((Booking)arguments.get(0), (EList<Person>)arguments.get(1));
				return null;
			case BookingPackage.BOOKING_MANAGER_IMPL___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE:
				return isRoomTypeAvailable((Date)arguments.get(0), (Date)arguments.get(1), (RoomType)arguments.get(2));
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_ACTIVE_BOOKING__STRING:
				return getActiveBooking((String)arguments.get(0));
			case BookingPackage.BOOKING_MANAGER_IMPL___CHECK_OUT__BOOKING:
				checkOut((Booking)arguments.get(0));
				return null;
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_BOOKING__INT:
				return getBooking((Integer)arguments.get(0));
			case BookingPackage.BOOKING_MANAGER_IMPL___CHANGE_BOOKING_DATES__BOOKING_DATE_DATE:
				return changeBookingDates((Booking)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case BookingPackage.BOOKING_MANAGER_IMPL___ADD_STAY_REQUEST__BOOKING_STRING:
				return addStayRequest((Booking)arguments.get(0), (String)arguments.get(1));
			case BookingPackage.BOOKING_MANAGER_IMPL___REMOVE_STAY_REQUEST__BOOKING_STAYREQUEST:
				removeStayRequest((Booking)arguments.get(0), (StayRequest)arguments.get(1));
				return null;
			case BookingPackage.BOOKING_MANAGER_IMPL___GET_STAY_REQUESTS:
				return getStayRequests();
			case BookingPackage.BOOKING_MANAGER_IMPL___SET_SPECIAL_REQUEST__BOOKING_STRING:
				setSpecialRequest((Booking)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingManagerImplImpl

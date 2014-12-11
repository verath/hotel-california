/**
 */
package Classes.impl;

import Classes.Booking;
import Classes.BookingDataService;
import Classes.BookingManagerImpl;
import Classes.ClassesPackage;
import Classes.LegalEntity;
import Classes.Room;
import Classes.RoomType;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.BookingManagerImplImpl#getBookingDataService <em>Booking Data Service</em>}</li>
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
		return ClassesPackage.Literals.BOOKING_MANAGER_IMPL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE, oldBookingDataService, bookingDataService));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE, oldBookingDataService, bookingDataService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookings(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookings(Date from, Date to, LegalEntity customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBookings(LegalEntity customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getAvailableRooms(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getAvailableRooms(Date from, Date to, RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<RoomType, Integer> getAvailableRoomTypeAmount(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvailableRoomTypeAmount(Date from, Date to, RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBooking(Date from, Date to, LegalEntity customer, RoomType RoomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBooking(Date from, Date to, LegalEntity customer, Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoomAvailable(Date from, Date to, int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerRoom(Booking booking, Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn(Booking booking, EList<LegalEntity> guests) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoomTypeAvailable(Date from, Date to, RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoomTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getActiveBooking(int roomNumber) {
		// TODO: implement this method
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
	 * @generated
	 */
	public void checkOut(Booking booking) {
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
			case ClassesPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE:
				if (resolve) return getBookingDataService();
				return basicGetBookingDataService();
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
			case ClassesPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE:
				setBookingDataService((BookingDataService)newValue);
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
			case ClassesPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE:
				setBookingDataService((BookingDataService)null);
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
			case ClassesPackage.BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE:
				return bookingDataService != null;
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
			case ClassesPackage.BOOKING_MANAGER_IMPL___GET_BOOKINGS__DATE_DATE:
				return getBookings((Date)arguments.get(0), (Date)arguments.get(1));
			case ClassesPackage.BOOKING_MANAGER_IMPL___GET_BOOKINGS__DATE_DATE_LEGALENTITY:
				return getBookings((Date)arguments.get(0), (Date)arguments.get(1), (LegalEntity)arguments.get(2));
			case ClassesPackage.BOOKING_MANAGER_IMPL___GET_BOOKINGS__LEGALENTITY:
				return getBookings((LegalEntity)arguments.get(0));
			case ClassesPackage.BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOMS__DATE_DATE:
				return getAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1));
			case ClassesPackage.BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE:
				return getAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (RoomType)arguments.get(2));
			case ClassesPackage.BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE:
				return getAvailableRoomTypeAmount((Date)arguments.get(0), (Date)arguments.get(1));
			case ClassesPackage.BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE:
				return getAvailableRoomTypeAmount((Date)arguments.get(0), (Date)arguments.get(1), (RoomType)arguments.get(2));
			case ClassesPackage.BOOKING_MANAGER_IMPL___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE:
				createBooking((Date)arguments.get(0), (Date)arguments.get(1), (LegalEntity)arguments.get(2), (RoomType)arguments.get(3));
				return null;
			case ClassesPackage.BOOKING_MANAGER_IMPL___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM:
				createBooking((Date)arguments.get(0), (Date)arguments.get(1), (LegalEntity)arguments.get(2), (Room)arguments.get(3));
				return null;
			case ClassesPackage.BOOKING_MANAGER_IMPL___IS_ROOM_AVAILABLE__DATE_DATE_INT:
				return isRoomAvailable((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2));
			case ClassesPackage.BOOKING_MANAGER_IMPL___REGISTER_ROOM__BOOKING_ROOM:
				registerRoom((Booking)arguments.get(0), (Room)arguments.get(1));
				return null;
			case ClassesPackage.BOOKING_MANAGER_IMPL___CHECK_IN__BOOKING_ELIST:
				checkIn((Booking)arguments.get(0), (EList<LegalEntity>)arguments.get(1));
				return null;
			case ClassesPackage.BOOKING_MANAGER_IMPL___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE:
				return isRoomTypeAvailable((Date)arguments.get(0), (Date)arguments.get(1), (RoomType)arguments.get(2));
			case ClassesPackage.BOOKING_MANAGER_IMPL___GET_ROOM_TYPES:
				return getRoomTypes();
			case ClassesPackage.BOOKING_MANAGER_IMPL___GET_ACTIVE_BOOKING__INT:
				return getActiveBooking((Integer)arguments.get(0));
			case ClassesPackage.BOOKING_MANAGER_IMPL___GET_RELATED_LEGAL_ENTITIES__BOOKING:
				return getRelatedLegalEntities((Booking)arguments.get(0));
			case ClassesPackage.BOOKING_MANAGER_IMPL___CHECK_OUT__BOOKING:
				checkOut((Booking)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingManagerImplImpl

/**
 */
package tda593.hotel.california.booking.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.persistence.EntityManager;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingDataService;
import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.persistence.BookingEntity;
import tda593.hotel.california.facilities.FacilitiesFactory;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.impl.RoomTypeDataServiceImpl;
import tda593.hotel.california.facilities.persistence.RoomEntity;
import tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BookingDataServiceImpl extends MinimalEObjectImpl.Container implements BookingDataService {
	
	private EntityManager entityManager;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingDataServiceImpl() {
		super();
	}

	public BookingDataServiceImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingPackage.Literals.BOOKING_DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking get(Integer id) {
		BookingEntity roomEntity = entityManager.find(BookingEntity.class, id);
		return roomEntity == null? null : EntityToRoom(roomEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getAll() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int count() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(Booking object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(EList<Booking> objects) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(Booking object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exist(Integer object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getAll(LegalEntity customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getAll(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getAll(Date from, Date to, LegalEntity legal) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public static Booking EntityToRoom(BookingEntity bookingEntity) {
		Booking booking = BookingFactory.eINSTANCE.createBooking();
		booking.setEndDate(bookingEntity.getEndDate());
		booking.setId(bookingEntity.getId());
		booking.setIsCanceled(bookingEntity.isCanceled());
		booking.setPrice(booking.getPrice());
		//booking.setResponsible(bookingEntity.getLegalEntityEntity());
		//booking.setRoomStay(bookingEntity.getRoomStayEntity());
		booking.setRoomType(RoomTypeDataServiceImpl.EntityToRoomType(bookingEntity.getRoomTypeEntity()));
		booking.setSpecialRequest(bookingEntity.getSpecialRequest());
		//booking.setTravelInformation(bookingEntity.getTravelInformationEntity());
		return booking;
	}
	
	public static RoomEntityImpl RoomToEntity(Room room) {
		RoomEntityImpl roomEntity = new RoomEntityImpl();
		roomEntity.setRoomNumber(room.getRoomNumber());
		roomEntity.setDescription(room.getDescription());
		roomEntity.setFloor(room.getFloor());
		roomEntity.setIsCleaned(room.isCleaned());
		roomEntity.setIsOperational(room.isOperational());
		roomEntity.setRoomTypeEntity(RoomTypeDataServiceImpl.RoomTypeToEntity(room.getRoomType()));
		return roomEntity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BookingPackage.BOOKING_DATA_SERVICE___GET__OBJECT:
				return get((Integer)arguments.get(0));
			case BookingPackage.BOOKING_DATA_SERVICE___GET_ALL:
				return getAll();
			case BookingPackage.BOOKING_DATA_SERVICE___COUNT:
				return count();
			case BookingPackage.BOOKING_DATA_SERVICE___SET__OBJECT:
				set((Booking)arguments.get(0));
				return null;
			case BookingPackage.BOOKING_DATA_SERVICE___SET_ALL__ELIST:
				setAll((EList<Booking>)arguments.get(0));
				return null;
			case BookingPackage.BOOKING_DATA_SERVICE___DELETE__OBJECT:
				delete((Booking)arguments.get(0));
				return null;
			case BookingPackage.BOOKING_DATA_SERVICE___EXIST__OBJECT:
				return exist((Integer)arguments.get(0));
			case BookingPackage.BOOKING_DATA_SERVICE___GET_ALL__LEGALENTITY:
				return getAll((LegalEntity)arguments.get(0));
			case BookingPackage.BOOKING_DATA_SERVICE___GET_ALL__DATE_DATE:
				return getAll((Date)arguments.get(0), (Date)arguments.get(1));
			case BookingPackage.BOOKING_DATA_SERVICE___GET_ALL__DATE_DATE_LEGALENTITY:
				return getAll((Date)arguments.get(0), (Date)arguments.get(1), (LegalEntity)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingDataServiceImpl

/**
 */
package tda593.hotel.california.booking.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingDataService;
import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.RoomStay;
import tda593.hotel.california.booking.StayRequest;
import tda593.hotel.california.booking.TravelInformation;
import tda593.hotel.california.booking.persistence.BookingEntity;
import tda593.hotel.california.booking.persistence.PersonEntity;
import tda593.hotel.california.booking.persistence.RoomStayEntity;
import tda593.hotel.california.booking.persistence.StayRequestEntity;
import tda593.hotel.california.booking.persistence.TravelInformationEntity;
import tda593.hotel.california.booking.persistence.impl.BookingEntityImpl;
import tda593.hotel.california.booking.persistence.impl.PersonEntityImpl;
import tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl;
import tda593.hotel.california.booking.persistence.impl.StayRequestEntityImpl;
import tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl;
import tda593.hotel.california.facilities.impl.RoomDataServiceImpl;
import tda593.hotel.california.facilities.impl.RoomTypeDataServiceImpl;

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
	 * @generated NOT
	 */
	public Booking get(Integer id) {
		BookingEntity bookingEntity = entityManager.find(BookingEntity.class, id);
		return bookingEntity == null? null : entityToBooking(bookingEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getAll() {
		List<BookingEntityImpl> results = entityManager.createQuery("FROM BookingEntityImpl", BookingEntityImpl.class).getResultList();
		EList<Booking> bookingResults = new BasicEList<Booking>(results.size());
		for (BookingEntity entity : results) {
			bookingResults.add(entityToBooking(entity));
		}
		
		return bookingResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int count() {
		Long count = entityManager.createQuery("SELECT COUNT(number) FROM BookingEntityImpl", Long.class).getSingleResult();
		// TODO : change to long
		return count.intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void set(Booking object) {
		EntityTransaction transaction = entityManager.getTransaction();
		if(transaction.isActive()) {
			entityManager.persist(bookingToEntity(object));
		} else {
			transaction.begin();
			entityManager.persist(bookingToEntity(object));
			transaction.commit();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAll(EList<Booking> objects) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		for(Booking object : objects) {
			entityManager.persist(bookingToEntity(object));
		}
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void delete(Booking object) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(bookingToEntity(object));
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean exist(Integer object) {
		return get(object) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getAll(LegalEntity customer) {
		TypedQuery<BookingEntityImpl> query = entityManager.createQuery("FROM BookingEntityImpl WHERE legalEntityEntity=:customer", BookingEntityImpl.class);
		query.setParameter("customer", customer.getId());
		List<BookingEntityImpl> results = query.getResultList();
		EList<Booking> bookingResults = new BasicEList<Booking>(results.size());
		for (BookingEntity entity : results) {
			bookingResults.add(entityToBooking(entity));
		}
		
		return bookingResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getAll(Date from, Date to) {
		TypedQuery<BookingEntityImpl> query = entityManager.createQuery("FROM BookingEntityImpl WHERE startDate<=:thetsartDate AND endDate<=:theEndDate", BookingEntityImpl.class);
		query.setParameter("theStartDate", from, TemporalType.TIMESTAMP);
		query.setParameter("theEndDate", to, TemporalType.TIMESTAMP);
		List<BookingEntityImpl> results = query.getResultList();
		EList<Booking> bookingResults = new BasicEList<Booking>(results.size());
		for (BookingEntity entity : results) {
			bookingResults.add(entityToBooking(entity));
		}
		
		return bookingResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getAll(Date from, Date to, LegalEntity customer) {
		TypedQuery<BookingEntityImpl> query = entityManager.createQuery("FROM BookingEntityImpl WHERE legalEntityEntity=:customer " 
				+ "AND startDate<=:thetsartDate AND endDate<=:theEndDate", BookingEntityImpl.class);
		query.setParameter("customer", customer.getId());
		query.setParameter("theStartDate", from, TemporalType.TIMESTAMP);
		query.setParameter("theEndDate", to, TemporalType.TIMESTAMP);
		List<BookingEntityImpl> results = query.getResultList();
		EList<Booking> bookingResults = new BasicEList<Booking>(results.size());
		for (BookingEntity entity : results) {
			bookingResults.add(entityToBooking(entity));
		}
		
		return bookingResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean changeBookingDates(Booking booking, Date newStart, Date newEnd) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void rollbackTransaction() {
		entityManager.getTransaction().rollback();
	}

	public static Booking entityToBooking(BookingEntity bookingEntity) {
		Booking booking = BookingFactory.eINSTANCE.createBooking();
		booking.setEndDate(bookingEntity.getEndDate());
		booking.setId(bookingEntity.getId());
		booking.setIsCanceled(bookingEntity.isCanceled());
		booking.setPrice(bookingEntity.getPrice());
		booking.setResponsible(LegalEntityDataServiceImpl.entityToLegalEntity(bookingEntity.getLegalEntityEntity()));
		booking.setRoomStay(entityToRoomStay(bookingEntity.getRoomStayEntity()));
		booking.setRoomType(RoomTypeDataServiceImpl.entityToRoomType(bookingEntity.getRoomTypeEntity()));
		booking.setSpecialRequest(bookingEntity.getSpecialRequest());
		booking.setTravelInformation(entityToTravelInformation(bookingEntity.getTravelInformationEntity()));
		return booking;
	}
	
	public static BookingEntityImpl bookingToEntity(Booking booking) {
		BookingEntityImpl entity = new BookingEntityImpl();
		entity.setEndDate(booking.getEndDate());
		entity.setId(booking.getId());
		entity.setIsCanceled(booking.isCanceled());
		entity.setPrice(booking.getPrice());
		entity.setLegalEntityEntity(LegalEntityDataServiceImpl.legalEntityToEntity(booking.getResponsible()));
		entity.setRoomStayEntity(roomStayToEntity(booking.getRoomStay()));
		entity.setRoomTypeEntity(RoomTypeDataServiceImpl.roomTypeToEntity(booking.getRoomType()));
		entity.setSpecialRequest(booking.getSpecialRequest());
		entity.setTravelInformationEntity(travelInformationToEntity(booking.getTravelInformation()));
		return entity;
	}
	
	private static TravelInformation entityToTravelInformation(TravelInformationEntity entity) {
		TravelInformation info = BookingFactory.eINSTANCE.createTravelInformation();
		info.setComment(entity.getComment());
		info.setId(entity.getId());
		info.setTrackingId(entity.getTrackingId());
		info.setPredecessor(entityToTravelInformation(entity.getTravelInformationEntity()));
		return info;
	}
	
	private static TravelInformationEntityImpl travelInformationToEntity(TravelInformation info) {
		TravelInformationEntityImpl entity = new TravelInformationEntityImpl();
		entity.setComment(info.getComment());
		entity.setId(info.getId());
		entity.setTrackingId(info.getTrackingId());
		entity.setTravelInformationEntity(travelInformationToEntity(info.getPredecessor()));
		return entity;
	}
	
	private static StayRequestEntityImpl stayRequestToEntity(StayRequest request) {
		StayRequestEntityImpl entity = new StayRequestEntityImpl();
		entity.setId(request.getId());
		entity.setText(request.getText());
		entity.setTimeStamp(request.getTimeStamp());
		return entity;
	}
	
	private static StayRequest entityToStayRequest(StayRequestEntity entity) {
		StayRequest request = BookingFactory.eINSTANCE.createStayRequest();
		request.setId(entity.getId());
		request.setText(entity.getText());
		request.setTimeStamp(entity.getTimeStamp());
		return request;
	}
	
	private static RoomStayEntityImpl roomStayToEntity(RoomStay roomStay) {
		RoomStayEntityImpl entity = new RoomStayEntityImpl();
		entity.setActive(roomStay.isActive());
		entity.setId(roomStay.getId());
		entity.setRoomEntity(RoomDataServiceImpl.roomToEntity(roomStay.getRoom()));
		
		List<PersonEntityImpl> personEntities = new ArrayList<PersonEntityImpl>();
		for(Person person : roomStay.getRegisteredPersons()) {
			personEntities.add(LegalEntityDataServiceImpl.personToEntity(person));
		}
		entity.getPersonEntities().addAll(personEntities);
		
		List<StayRequestEntityImpl> requestEntities = new ArrayList<StayRequestEntityImpl>();
		for(StayRequest request : roomStay.getStayRequest()) {
			requestEntities.add(stayRequestToEntity(request));
		}
		entity.getStayRequestEntities().addAll(requestEntities);
		
		return entity;
	}
	
	private static RoomStay entityToRoomStay(RoomStayEntity entity) {
		RoomStay roomStay = BookingFactory.eINSTANCE.createRoomStay();
		roomStay.setActive(entity.isActive());
		roomStay.setId(entity.getId());
		roomStay.setRoom(RoomDataServiceImpl.entityToRoom(entity.getRoomEntity()));
		
		List<Person> persons = new ArrayList<Person>();
		for(PersonEntity personEntity : entity.getPersonEntities()) {
			persons.add(LegalEntityDataServiceImpl.entityToPerson(personEntity));
		}
		roomStay.getRegisteredPersons().addAll(persons);
		
		List<StayRequest> requests = new ArrayList<StayRequest>();
		for(StayRequestEntity requestEntity : entity.getStayRequestEntities()) {
			requests.add(entityToStayRequest(requestEntity));
		}
		roomStay.getStayRequest().addAll(requests);
		
		return roomStay;
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
			case BookingPackage.BOOKING_DATA_SERVICE___CHANGE_BOOKING_DATES__BOOKING_DATE_DATE:
				return changeBookingDates((Booking)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case BookingPackage.BOOKING_DATA_SERVICE___BEGIN_TRANSACTION:
				beginTransaction();
				return null;
			case BookingPackage.BOOKING_DATA_SERVICE___COMMIT_TRANSACTION:
				commitTransaction();
				return null;
			case BookingPackage.BOOKING_DATA_SERVICE___ROLLBACK_TRANSACTION:
				rollbackTransaction();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingDataServiceImpl

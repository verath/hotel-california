/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import tda593.hotel.california.facilities.ConferenceRoom;
import tda593.hotel.california.facilities.FacilitiesFactory;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.GuestRoom;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomDataService;
import tda593.hotel.california.facilities.persistence.ConferenceRoomEntity;
import tda593.hotel.california.facilities.persistence.GuestRoomEntity;
import tda593.hotel.california.facilities.persistence.KeyCardEntity;
import tda593.hotel.california.facilities.persistence.RoomEntity;
import tda593.hotel.california.facilities.persistence.impl.ConferenceRoomEntityImpl;
import tda593.hotel.california.facilities.persistence.impl.GuestRoomEntityImpl;
import tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RoomDataServiceImpl extends MinimalEObjectImpl.Container implements RoomDataService {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomDataServiceImpl() {
		super();
	}

	private EntityManager entityManager;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomDataServiceImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackage.Literals.ROOM_DATA_SERVICE;
	}

	public static Room entityToRoom(RoomEntity entity) {
		if(entity instanceof GuestRoomEntityImpl) {
			return entityToGuestRoom((GuestRoomEntity) entity);
		} else {
			return entityToConferenceRoom((ConferenceRoomEntity) entity);
		}
	}
	
	public static RoomEntityImpl roomToEntity(Room room) {
		if(room instanceof GuestRoom) {
			return guestRoomToEntity((GuestRoom) room);
		} else {
			return conferenceRoomToEntity((ConferenceRoom) room);
		}
	}

	private static Room entityToRoomHelper(RoomEntity roomEntity, Room room) {
		room.setRoomNumber(roomEntity.getRoomNumber());
		room.setDescription(roomEntity.getDescription());
		room.setFloor(roomEntity.getFloor());
		room.setIsBeingCleaned(roomEntity.isBeingCleaned());
		room.setIsOperational(roomEntity.isOperational());
		room.setRoomType(RoomTypeDataServiceImpl.entityToRoomType(roomEntity.getRoomTypeEntity()));
		
		List<KeyCard> keyCards = room.getAllowedKeyCards();
		for(KeyCardEntity keyCardEntity : roomEntity.getAllowedKeyCards()) {
			keyCards.add(KeyCardDataServiceImpl.entityToKeyCard(keyCardEntity));
		}
		
		room.getPhotos().addAll(roomEntity.getPhotos());
		
		return room;
	}
	
	private static RoomEntity roomToEntityHelper(Room room, RoomEntity roomEntity) {
		roomEntity.setRoomNumber(room.getRoomNumber());
		roomEntity.setDescription(room.getDescription());
		roomEntity.setFloor(room.getFloor());
		roomEntity.setIsCleaned(room.isBeingCleaned());
		roomEntity.setIsOperational(room.isOperational());
		roomEntity.setRoomTypeEntity(RoomTypeDataServiceImpl.roomTypeToEntity(room.getRoomType()));
		
		List<KeyCardEntity> keyCardEntities = roomEntity.getAllowedKeyCards();
		for(KeyCard keyCard : room.getAllowedKeyCards()) {
			keyCardEntities.add(KeyCardDataServiceImpl.keyCardToEntity(keyCard));
		}
		
		roomEntity.getPhotos().addAll(room.getPhotos());
		
		return roomEntity;
	}
	
	public static ConferenceRoom entityToConferenceRoom(ConferenceRoomEntity entity) {
		if(entity == null) {
			return null;
		}
		
		ConferenceRoom conferenceRoom = FacilitiesFactory.eINSTANCE.createConferenceRoom();
		entityToRoomHelper(entity, conferenceRoom);
		conferenceRoom.setNumberOfSeats(entity.getNumberOfSeats());
		if(entity.getEquipment() != null) {
			conferenceRoom.getEquipment().addAll(entity.getEquipment());
		}
		
		return conferenceRoom;
	}
	
	public static ConferenceRoomEntityImpl conferenceRoomToEntity(ConferenceRoom conferenceRoom) {
		if(conferenceRoom == null) {
			return null;
		}
		
		ConferenceRoomEntityImpl entity = new ConferenceRoomEntityImpl();
		roomToEntityHelper(conferenceRoom, entity);
		entity.setNumberOfSeats(conferenceRoom.getNumberOfSeats());
		if(conferenceRoom.getEquipment() != null) {
			entity.getEquipment().addAll(conferenceRoom.getEquipment());
		}
		
		return entity;
	}
	
	public static GuestRoom entityToGuestRoom(GuestRoomEntity entity) {
		if(entity == null) {
			return null;
		}
		
		GuestRoom guestRoom = FacilitiesFactory.eINSTANCE.createGuestRoom();
		entityToRoomHelper(entity, guestRoom);
		guestRoom.setNumberOfBeds(entity.getNumberOfBeds());
		guestRoom.setNumberOfExtrabeds(entity.getNumberOfExtrabeds());
		
		return guestRoom;
	}
	
	public static GuestRoomEntityImpl guestRoomToEntity(GuestRoom guestRoom) {
		if(guestRoom == null) {
			return null;
		}
		
		GuestRoomEntityImpl entity = new GuestRoomEntityImpl();
		roomToEntityHelper(guestRoom, entity);
		entity.setNumberOfBeds(guestRoom.getNumberOfBeds());
		entity.setNumberOfExtrabeds(guestRoom.getNumberOfExtrabeds());
		
		return entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room get(String id) {
		RoomEntityImpl entity = entityManager.find(RoomEntityImpl.class, id);
		if(entity == null) {
			return null;
		}
		
		return entityToRoom(entity);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAll() {
		List<RoomEntityImpl> results = entityManager.createQuery("FROM RoomEntityImpl", RoomEntityImpl.class).getResultList();
		EList<Room> roomResults = new BasicEList<Room>(results.size());
		for (RoomEntity entity : results) {
			roomResults.add(entityToRoom(entity));
		}
		
		return roomResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int count() {
		Long count = entityManager.createQuery("SELECT COUNT(*) FROM RoomEntityImpl", Long.class).getSingleResult();
		// TODO : change to long
		return count.intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void set(Room object) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(roomToEntity(object));
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAll(EList<Room> objects) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		for(Room room : objects) {
			entityManager.merge(roomToEntity(room));
		}
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void delete(Room room) {
		entityManager.remove(entityManager.contains(roomToEntity(room)) ? roomToEntity(room) : entityManager.merge(roomToEntity(room)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean exist(String id) {
		return get(id) != null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<GuestRoom> getAllGuestRooms() {
		List<GuestRoomEntityImpl> results = entityManager.createQuery("FROM GuestRoomEntityImpl", GuestRoomEntityImpl.class).getResultList();
		EList<GuestRoom> guestRoomResults = new BasicEList<GuestRoom>(results.size());
		for (GuestRoomEntity entity : results) {
			guestRoomResults.add(entityToGuestRoom(entity));
		}
		
		return guestRoomResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ConferenceRoom> getAllConferenceRooms() {
		List<ConferenceRoomEntityImpl> results = entityManager.createQuery("FROM ConferenceRoomEntityImpl", ConferenceRoomEntityImpl.class).getResultList();
		EList<ConferenceRoom> conferenceRooms = new BasicEList<ConferenceRoom>(results.size());
		for (ConferenceRoomEntity entity : results) {
			conferenceRooms.add(entityToConferenceRoom(entity));
		}
		
		return conferenceRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GuestRoom getGuestRoom(String id) {
		GuestRoomEntityImpl entity = entityManager.find(GuestRoomEntityImpl.class, id);
		if(entity == null) {
			return null;
		}
		
		return entityToGuestRoom(entity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConferenceRoom getConferenceRoom(String id) {
		ConferenceRoomEntityImpl entity = entityManager.find(ConferenceRoomEntityImpl.class, id);
		if(entity == null) {
			return null;
		}
		
		return entityToConferenceRoom(entity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FacilitiesPackage.ROOM_DATA_SERVICE___GET__OBJECT:
				return get((String)arguments.get(0));
			case FacilitiesPackage.ROOM_DATA_SERVICE___GET_ALL:
				return getAll();
			case FacilitiesPackage.ROOM_DATA_SERVICE___COUNT:
				return count();
			case FacilitiesPackage.ROOM_DATA_SERVICE___SET__OBJECT:
				set((Room)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_DATA_SERVICE___SET_ALL__ELIST:
				setAll((EList<Room>)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_DATA_SERVICE___DELETE__OBJECT:
				delete((Room)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_DATA_SERVICE___EXIST__OBJECT:
				return exist((String)arguments.get(0));
			case FacilitiesPackage.ROOM_DATA_SERVICE___GET_ALL_GUEST_ROOMS:
				return getAllGuestRooms();
			case FacilitiesPackage.ROOM_DATA_SERVICE___GET_ALL_CONFERENCE_ROOMS:
				return getAllConferenceRooms();
			case FacilitiesPackage.ROOM_DATA_SERVICE___GET_GUEST_ROOM__STRING:
				return getGuestRoom((String)arguments.get(0));
			case FacilitiesPackage.ROOM_DATA_SERVICE___GET_CONFERENCE_ROOM__STRING:
				return getConferenceRoom((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomDataServiceImpl

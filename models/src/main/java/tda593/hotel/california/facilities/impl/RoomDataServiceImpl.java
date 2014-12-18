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

import tda593.hotel.california.facilities.FacilitiesFactory;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomDataService;
import tda593.hotel.california.facilities.persistence.RoomEntity;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room get(String id) {
		RoomEntity roomEntity = entityManager.find(RoomEntityImpl.class, id);
		return roomEntity == null? null : entityToRoom(roomEntity);
	}

	public static Room entityToRoom(RoomEntity roomEntity) {
		Room room = FacilitiesFactory.eINSTANCE.createRoom();
		room.setRoomNumber(roomEntity.getRoomNumber());
		room.setDescription(roomEntity.getDescription());
		room.setFloor(roomEntity.getFloor());
		room.setIsCleaned(roomEntity.isCleaned());
		room.setIsOperational(roomEntity.isOperational());
		room.setRoomType(RoomTypeDataServiceImpl.entityToRoomType(roomEntity.getRoomTypeEntity()));
		return room;
	}
	
	public static RoomEntityImpl roomToEntity(Room room) {
		RoomEntityImpl roomEntity = new RoomEntityImpl();
		roomEntity.setRoomNumber(room.getRoomNumber());
		roomEntity.setDescription(room.getDescription());
		roomEntity.setFloor(room.getFloor());
		roomEntity.setIsCleaned(room.isCleaned());
		roomEntity.setIsOperational(room.isOperational());
		roomEntity.setRoomTypeEntity(RoomTypeDataServiceImpl.roomTypeToEntity(room.getRoomType()));
		return roomEntity;
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
		Long count = entityManager.createQuery("SELECT COUNT(number) FROM Rooms", Long.class).getSingleResult();
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
		entityManager.persist(roomToEntity(object));
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
			entityManager.persist(roomToEntity(room));
		}
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void delete(Room room) {
		entityManager.remove(roomToEntity(room));
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomDataServiceImpl

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
import tda593.hotel.california.facilities.RoomType;
import tda593.hotel.california.facilities.RoomTypeDataService;
import tda593.hotel.california.facilities.persistence.RoomTypeEntity;
import tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RoomTypeDataServiceImpl extends MinimalEObjectImpl.Container implements RoomTypeDataService {	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypeDataServiceImpl() {
		super();
	}

	private EntityManager entityManager;
	
	public RoomTypeDataServiceImpl(EntityManager entityManager) {
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
		return FacilitiesPackage.Literals.ROOM_TYPE_DATA_SERVICE;
	}

	public static RoomType entityToRoomType(RoomTypeEntity entity) {
		RoomType roomType = FacilitiesFactory.eINSTANCE.createRoomType();
		roomType.setDescription(entity.getDescription());
		roomType.setName(entity.getName());
		roomType.setPrice(entity.getPrice());
		return roomType;
	}
	
	public static RoomTypeEntity roomTypeToEntity(RoomType roomType) {
		RoomTypeEntityImpl roomTypeEntity = new RoomTypeEntityImpl();
		roomTypeEntity.setDescription(roomType.getDescription());
		roomTypeEntity.setName(roomType.getName());
		roomTypeEntity.setPrice(roomType.getPrice());
		return roomTypeEntity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomType get(String id) {
		RoomTypeEntity roomTypeEntity = entityManager.find(RoomTypeEntityImpl.class, id);
		return roomTypeEntity == null? null : entityToRoomType(roomTypeEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<RoomType> getAll() {
		List<RoomTypeEntityImpl> results = entityManager.createQuery("FROM RoomTypeEntityImpl", RoomTypeEntityImpl.class).getResultList();
		EList<RoomType> roomTypeResults = new BasicEList<RoomType>(results.size());
		for (RoomTypeEntity entity : results) {
			roomTypeResults.add(entityToRoomType(entity));
		}
		
		return roomTypeResults;
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
	public void set(RoomType object) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(roomTypeToEntity(object));
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAll(EList<RoomType> objects) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		for(RoomType roomType : objects) {
			entityManager.merge(roomTypeToEntity(roomType));
		}
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void delete(RoomType roomType) {
		entityManager.remove(roomTypeToEntity(roomType));
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
			case FacilitiesPackage.ROOM_TYPE_DATA_SERVICE___GET__OBJECT:
				return get((String)arguments.get(0));
			case FacilitiesPackage.ROOM_TYPE_DATA_SERVICE___GET_ALL:
				return getAll();
			case FacilitiesPackage.ROOM_TYPE_DATA_SERVICE___COUNT:
				return count();
			case FacilitiesPackage.ROOM_TYPE_DATA_SERVICE___SET__OBJECT:
				set((RoomType)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_TYPE_DATA_SERVICE___SET_ALL__ELIST:
				setAll((EList<RoomType>)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_TYPE_DATA_SERVICE___DELETE__OBJECT:
				delete((RoomType)arguments.get(0));
				return null;
			case FacilitiesPackage.ROOM_TYPE_DATA_SERVICE___EXIST__OBJECT:
				return exist((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomTypeDataServiceImpl

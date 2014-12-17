/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.facilities.FacilitiesFactory;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.RoomType;
import tda593.hotel.california.facilities.RoomTypeDataService;
import tda593.hotel.california.facilities.persistence.PersistenceFactory;
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
	
	public static RoomType EntityToRoomType(RoomTypeEntity entity) {
		RoomType roomType = FacilitiesFactory.eINSTANCE.createRoomType();
		roomType.setDescription(entity.getDescription());
		roomType.setId(entity.getId());
		roomType.setName(entity.getName());
		return roomType;
	}
	
	public static RoomTypeEntityImpl RoomTypeToEntity(RoomType roomType) {
		RoomTypeEntityImpl roomTypeEntity = (RoomTypeEntityImpl) PersistenceFactory.eINSTANCE.createRoomTypeEntity();
		roomTypeEntity.setDescription(roomType.getDescription());
		roomTypeEntity.setId(roomType.getId());
		roomTypeEntity.setName(roomType.getName());
		return roomTypeEntity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypeDataServiceImpl() {
		super();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType get(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getAll() {
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
	public void set(RoomType object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(EList<RoomType> objects) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(RoomType object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exist(String object) {
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

/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.AdminRoomManagerImpl;
import tda593.hotel.california.facilities.DisabilityApproval;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomApproval;
import tda593.hotel.california.facilities.RoomType;
import tda593.hotel.california.facilities.RoomTypeDataService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin Room Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdminRoomManagerImplImpl extends RoomManagerImplImpl implements AdminRoomManagerImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminRoomManagerImplImpl(RoomTypeDataService roomDataservice) {
		super(roomDataservice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackage.Literals.ADMIN_ROOM_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addRoom(String number, int floor, String description, DisabilityApproval disabilityApprovals, EList<String> photos, RoomType roomType) {
		if(number !=null && !number.isEmpty() && floor >= 0 && description !=null && !description.isEmpty() && disabilityApprovals !=null && roomType !=null){
			Room newRoom = new RoomImpl(number, floor, description, roomType);
			newRoom.getDisabilityApprovals().add(disabilityApprovals);
			getRoomDataService().set(newRoom);
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean removeRoom(String roomNumber) {
	try{	
		Room theRoom =	getRoomDataService().get(roomNumber);
		getRoomDataService().delete(theRoom);
	}catch(Exception e){
		return false;
	}
		return true;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addRoomType(String name, String description, RoomApproval roomApprovals, double price) {
		if(name !=null && !name.isEmpty() && description !=null && !description.isEmpty() && roomApprovals !=null && price >= 0){
			RoomType newRoomType = new RoomTypeImpl(name, description, price);	
			newRoomType.getRoomApprovals().add(roomApprovals);
		getRoomTypeDataService().set(newRoomType);
		}
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeRoomType(RoomType roomType) {
		getRoomTypeDataService().delete(roomType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AdminRoomManager.class) {
			switch (baseOperationID) {
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___ADD_ROOM__INT_INT_STRING_ELIST_ELIST_ROOMTYPE: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM__INT_INT_STRING_ELIST_ELIST_ROOMTYPE;
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___REMOVE_ROOM__INT: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM__INT;
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___ADD_ROOM_TYPE__STRING_STRING_ROOMAPPROVAL_DOUBLE: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM_TYPE__STRING_STRING_ROOMAPPROVAL_DOUBLE;
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___REMOVE_ROOM_TYPE__ROOMTYPE: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM_TYPE__ROOMTYPE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM__INT_INT_STRING_ELIST_ELIST_ROOMTYPE:
				addRoom((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (EList<DisabilityApproval>)arguments.get(3), (EList<String>)arguments.get(4), (RoomType)arguments.get(5));
				return null;
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM__INT:
				return removeRoom((Integer)arguments.get(0));
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM_TYPE__STRING_STRING_ROOMAPPROVAL_DOUBLE:
				addRoomType((String)arguments.get(0), (String)arguments.get(1), (RoomApproval)arguments.get(2), (Double)arguments.get(3));
				return null;
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM_TYPE__ROOMTYPE:
				removeRoomType((RoomType)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public boolean removeRoom(int roomNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addRoom(int number, int floor, String description,
			EList<DisabilityApproval> disabilityApprovals,
			EList<String> photos, RoomType roomType) {
		// TODO Auto-generated method stub
		
	}

} //AdminRoomManagerImplImpl

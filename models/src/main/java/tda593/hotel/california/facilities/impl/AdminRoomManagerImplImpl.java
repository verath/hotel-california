/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.AdminRoomManagerImpl;
import tda593.hotel.california.facilities.ConferenceRoom;
import tda593.hotel.california.facilities.DisabilityApproval;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.GuestRoom;
import tda593.hotel.california.facilities.KeyCardManager;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomApproval;
import tda593.hotel.california.facilities.RoomDataService;
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
	protected AdminRoomManagerImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AdminRoomManagerImplImpl(RoomTypeDataService roomTypeDataService, RoomDataService roomDataService, KeyCardManager keyCardManager) {
		super(roomTypeDataService, roomDataService, keyCardManager);
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
	 * @generated NOT
	 */
	public boolean removeRoom(String roomNumber) {
		if(roomNumber != null && !roomNumber.isEmpty()) {
			try {	
				Room theRoom = roomDataService.get(roomNumber);
				roomDataService.delete(theRoom);
			} catch(Exception e) {
				return false;
			}
		}
		
		return true;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomType addRoomType(String name, String description, EList<RoomApproval> roomApprovals, double price) {
		if(name !=null && !name.isEmpty() && description !=null && price >= 0){
			RoomType newRoomType = new RoomTypeImpl(name, description, price);	
			if(roomApprovals != null) {
				newRoomType.getRoomApprovals().addAll(roomApprovals);
			}
			
			roomTypeDataService.set(newRoomType);
			return newRoomType;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeRoomType(RoomType roomType) {
		try {	
			roomTypeDataService.delete(roomType);
		} catch(Exception e) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GuestRoom addGuestRoom(String number, int floor, String description, EList<DisabilityApproval> disabilityApprovals, EList<String> photos, RoomType roomType, int numberOfBeds, int numberOfExtraBeds) {
		if(isRoomParametersValid(number, floor, description, disabilityApprovals, photos, roomType) && numberOfBeds > 0) {
			GuestRoom guestRoom = new GuestRoomImpl(number, floor, description, roomType, photos, numberOfBeds, numberOfExtraBeds);
			
			roomDataService.set(guestRoom);
			return guestRoom;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConferenceRoom addConferenceRoom(String number, int floor, String description, EList<DisabilityApproval> disabilityApprovals, EList<String> photos, RoomType roomType, int numberOfSeats, EList<String> equipment) {
		if(isRoomParametersValid(number, floor, description, disabilityApprovals, photos, roomType) && numberOfSeats > 0) {
			ConferenceRoom conferenceRoom = new ConferenceRoomImpl(number, floor, description, roomType, photos,numberOfSeats, equipment);
			
			roomDataService.set(conferenceRoom);
			return conferenceRoom;
		}
		
		return null;
	}
	
	private boolean isRoomParametersValid(String number, int floor, String description, EList<DisabilityApproval> disabilityApprovals, EList<String> photos, RoomType roomType) {
		return (number !=null && !number.isEmpty() && floor >= 0 && description !=null && roomType !=null);
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
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___REMOVE_ROOM__STRING: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM__STRING;
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___ADD_ROOM_TYPE__STRING_STRING_ELIST_DOUBLE: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM_TYPE__STRING_STRING_ELIST_DOUBLE;
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___REMOVE_ROOM_TYPE__ROOMTYPE: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM_TYPE__ROOMTYPE;
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___ADD_GUEST_ROOM__STRING_INT_STRING_ELIST_ELIST_ROOMTYPE_INT_INT: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_GUEST_ROOM__STRING_INT_STRING_ELIST_ELIST_ROOMTYPE_INT_INT;
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___ADD_CONFERENCE_ROOM__STRING_INT_STRING_ELIST_ELIST_ROOMTYPE_INT_ELIST: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_CONFERENCE_ROOM__STRING_INT_STRING_ELIST_ELIST_ROOMTYPE_INT_ELIST;
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
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM__STRING:
				return removeRoom((String)arguments.get(0));
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM_TYPE__STRING_STRING_ELIST_DOUBLE:
				return addRoomType((String)arguments.get(0), (String)arguments.get(1), (EList<RoomApproval>)arguments.get(2), (Double)arguments.get(3));
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM_TYPE__ROOMTYPE:
				return removeRoomType((RoomType)arguments.get(0));
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_GUEST_ROOM__STRING_INT_STRING_ELIST_ELIST_ROOMTYPE_INT_INT:
				return addGuestRoom((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (EList<DisabilityApproval>)arguments.get(3), (EList<String>)arguments.get(4), (RoomType)arguments.get(5), (Integer)arguments.get(6), (Integer)arguments.get(7));
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_CONFERENCE_ROOM__STRING_INT_STRING_ELIST_ELIST_ROOMTYPE_INT_ELIST:
				return addConferenceRoom((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (EList<DisabilityApproval>)arguments.get(3), (EList<String>)arguments.get(4), (RoomType)arguments.get(5), (Integer)arguments.get(6), (EList<String>)arguments.get(7));
		}
		return super.eInvoke(operationID, arguments);
	}
} //AdminRoomManagerImplImpl

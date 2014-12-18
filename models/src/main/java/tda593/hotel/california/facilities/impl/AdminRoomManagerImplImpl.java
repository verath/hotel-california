/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.AdminRoomManagerImpl;
import tda593.hotel.california.facilities.DisabilityApproval;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.RoomApproval;

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
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackage.Literals.ADMIN_ROOM_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoom(int number, int floor, String description, EList<DisabilityApproval> disabilityApprovals, EList<String> photos) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeRoom(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoomType(String name, String description, RoomApproval roomApprovals) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoomType(int id) {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AdminRoomManager.class) {
			switch (baseOperationID) {
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___ADD_ROOM__INT_INT_STRING_ELIST_ELIST: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM__INT_INT_STRING_ELIST_ELIST;
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___REMOVE_ROOM__INT: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM__INT;
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___ADD_ROOM_TYPE__STRING_STRING_ROOMAPPROVAL: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM_TYPE__STRING_STRING_ROOMAPPROVAL;
				case FacilitiesPackage.ADMIN_ROOM_MANAGER___REMOVE_ROOM_TYPE__INT: return FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM_TYPE__INT;
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
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM__INT_INT_STRING_ELIST_ELIST:
				addRoom((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (EList<DisabilityApproval>)arguments.get(3), (EList<String>)arguments.get(4));
				return null;
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM__INT:
				return removeRoom((Integer)arguments.get(0));
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___ADD_ROOM_TYPE__STRING_STRING_ROOMAPPROVAL:
				addRoomType((String)arguments.get(0), (String)arguments.get(1), (RoomApproval)arguments.get(2));
				return null;
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL___REMOVE_ROOM_TYPE__INT:
				removeRoomType((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdminRoomManagerImplImpl

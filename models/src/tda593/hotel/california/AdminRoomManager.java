/**
 */
package tda593.hotel.california;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Room Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.CaliforniaPackage#getAdminRoomManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdminRoomManager extends RoomManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numberRequired="true" numberOrdered="false" floorRequired="true" floorOrdered="false" descriptioinRequired="true" descriptioinOrdered="false" disabilityApprovalsRequired="true" disabilityApprovalsMany="true" disabilityApprovalsOrdered="false" photosMany="true" photosOrdered="false"
	 * @generated
	 */
	void addRoom(int number, int floor, String descriptioin, EList<DisabilityApproval> disabilityApprovals, EList<String> photos);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	boolean removeRoom(int roomNumber);

} // AdminRoomManager

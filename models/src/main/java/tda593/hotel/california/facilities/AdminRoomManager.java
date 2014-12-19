/**
 */
package tda593.hotel.california.facilities;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Room Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.facilities.FacilitiesPackage#getAdminRoomManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdminRoomManager extends RoomManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numberRequired="true" numberOrdered="false" floorRequired="true" floorOrdered="false" descriptionRequired="true" descriptionOrdered="false" disabilityApprovalsRequired="true" disabilityApprovalsMany="true" disabilityApprovalsOrdered="false" photosMany="true" photosOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void addRoom(int number, int floor, String description, EList<DisabilityApproval> disabilityApprovals, EList<String> photos, RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	boolean removeRoom(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" descriptionRequired="true" descriptionOrdered="false" roomApprovalsMany="true" roomApprovalsOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void addRoomType(String name, String description, EList<RoomApproval> roomApprovals, double price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void removeRoomType(RoomType roomType);

} // AdminRoomManager

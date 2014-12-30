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
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	boolean removeRoom(String roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" descriptionRequired="true" descriptionOrdered="false" roomApprovalsMany="true" roomApprovalsOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	RoomType addRoomType(String name, String description, EList<RoomApproval> roomApprovals, double price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	boolean removeRoomType(RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" numberRequired="true" numberOrdered="false" floorRequired="true" floorOrdered="false" descriptionRequired="true" descriptionOrdered="false" disabilityApprovalsMany="true" disabilityApprovalsOrdered="false" photosMany="true" photosOrdered="false" roomTypeRequired="true" roomTypeOrdered="false" numberOfBedsRequired="true" numberOfBedsOrdered="false" numberOfExtraBedsRequired="true" numberOfExtraBedsOrdered="false"
	 * @generated
	 */
	GuestRoom addGuestRoom(String number, int floor, String description, EList<DisabilityApproval> disabilityApprovals, EList<String> photos, RoomType roomType, int numberOfBeds, int numberOfExtraBeds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" numberRequired="true" numberOrdered="false" floorRequired="true" floorOrdered="false" descriptionRequired="true" descriptionOrdered="false" disabilityApprovalsMany="true" disabilityApprovalsOrdered="false" photosMany="true" photosOrdered="false" roomTypeRequired="true" roomTypeOrdered="false" numberOfSeatsRequired="true" numberOfSeatsOrdered="false" equipmentMany="true" equipmentOrdered="false"
	 * @generated
	 */
	ConferenceRoom addConferenceRoom(String number, int floor, String description, EList<DisabilityApproval> disabilityApprovals, EList<String> photos, RoomType roomType, int numberOfSeats, EList<String> equipment);

} // AdminRoomManager

/**
 */
package tda593.hotel.california.facilities;

import java.util.Map;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.facilities.FacilitiesPackage#getRoomManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RoomManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keycardRequired="true" keycardOrdered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void registerKeyCard(KeyCard keycard, String roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keycardNbrRequired="true" keycardNbrOrdered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void registerKeyCard(String keycardNbr, String roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyCardRequired="true" keyCardOrdered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void unregisterKeyCard(KeyCard keyCard, String roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyCardNbrRequired="true" keyCardNbrOrdered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void unregisterKeyCard(String keyCardNbr, String roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void unregisterAllKeyCards(String roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Map<RoomType, Integer> getRoomTypeAmounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	int getRoomTypeAmount(RoomType roomType);

} // RoomManager

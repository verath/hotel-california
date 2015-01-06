/**
 */
package tda593.hotel.california.facilities;

import org.eclipse.emf.common.util.EList;
import tda593.hotel.california.DataService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.facilities.FacilitiesPackage#getRoomDataService()
 * @model superTypes="tda593.hotel.california.DataService<tda593.hotel.california.facilities.Room, org.eclipse.emf.ecore.EString>"
 * @generated
 */
public interface RoomDataService extends DataService<Room, String> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<GuestRoom> getAllGuestRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<ConferenceRoom> getAllConferenceRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idRequired="true" idOrdered="false"
	 * @generated
	 */
	GuestRoom getGuestRoom(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idRequired="true" idOrdered="false"
	 * @generated
	 */
	ConferenceRoom getConferenceRoom(String id);
} // RoomDataService

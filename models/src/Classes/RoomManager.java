/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.ClassesPackage#getRoomManager()
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
	 * @model keycardRequired="true" keycardOrdered="false"
	 * @generated
	 */
	void registerKeyCard(KeyCard keycard);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keycardNbrRequired="true" keycardNbrOrdered="false"
	 * @generated
	 */
	void registerKeyCard(String keycardNbr);

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
	 * @model keyCardRequired="true" keyCardOrdered="false"
	 * @generated
	 */
	void unregisterKeyCard(KeyCard keyCard);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyCardNbrRequired="true" keyCardNbrOrdered="false"
	 * @generated
	 */
	void unregisterKeyCard(String keyCardNbr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void unregisterAllKeyCards(Room room);

} // RoomManager

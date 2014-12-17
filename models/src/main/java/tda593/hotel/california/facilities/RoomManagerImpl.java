/**
 */
package tda593.hotel.california.facilities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.RoomManagerImpl#getRoomDataService <em>Room Data Service</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.RoomManagerImpl#getRoomTypeDataService <em>Room Type Data Service</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.RoomManagerImpl#getKeyCardManager <em>Key Card Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.facilities.FacilitiesPackage#getRoomManagerImpl()
 * @model
 * @generated
 */
public interface RoomManagerImpl extends RoomManager {
	/**
	 * Returns the value of the '<em><b>Room Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Data Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Data Service</em>' reference.
	 * @see #setRoomDataService(RoomDataService)
	 * @see tda593.hotel.california.facilities.FacilitiesPackage#getRoomManagerImpl_RoomDataService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomDataService getRoomDataService();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.RoomManagerImpl#getRoomDataService <em>Room Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Data Service</em>' reference.
	 * @see #getRoomDataService()
	 * @generated
	 */
	void setRoomDataService(RoomDataService value);

	/**
	 * Returns the value of the '<em><b>Room Type Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Data Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type Data Service</em>' reference.
	 * @see #setRoomTypeDataService(RoomTypeDataService)
	 * @see tda593.hotel.california.facilities.FacilitiesPackage#getRoomManagerImpl_RoomTypeDataService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomTypeDataService getRoomTypeDataService();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.RoomManagerImpl#getRoomTypeDataService <em>Room Type Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type Data Service</em>' reference.
	 * @see #getRoomTypeDataService()
	 * @generated
	 */
	void setRoomTypeDataService(RoomTypeDataService value);

	/**
	 * Returns the value of the '<em><b>Key Card Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Card Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Card Manager</em>' reference.
	 * @see #setKeyCardManager(KeyCardManager)
	 * @see tda593.hotel.california.facilities.FacilitiesPackage#getRoomManagerImpl_KeyCardManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	KeyCardManager getKeyCardManager();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.RoomManagerImpl#getKeyCardManager <em>Key Card Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Card Manager</em>' reference.
	 * @see #getKeyCardManager()
	 * @generated
	 */
	void setKeyCardManager(KeyCardManager value);

} // RoomManagerImpl

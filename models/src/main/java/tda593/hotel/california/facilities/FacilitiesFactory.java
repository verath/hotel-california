/**
 */
package tda593.hotel.california.facilities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.facilities.FacilitiesPackage
 * @generated
 */
public interface FacilitiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacilitiesFactory eINSTANCE = tda593.hotel.california.facilities.impl.FacilitiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Key Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Card</em>'.
	 * @generated
	 */
	KeyCard createKeyCard();

	/**
	 * Returns a new object of class '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Type</em>'.
	 * @generated
	 */
	RoomType createRoomType();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Room Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Manager Impl</em>'.
	 * @generated
	 */
	RoomManagerImpl createRoomManagerImpl();

	/**
	 * Returns a new object of class '<em>Room Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Data Service</em>'.
	 * @generated
	 */
	RoomDataService createRoomDataService();

	/**
	 * Returns a new object of class '<em>Room Type Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Type Data Service</em>'.
	 * @generated
	 */
	RoomTypeDataService createRoomTypeDataService();

	/**
	 * Returns a new object of class '<em>Conference Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conference Room</em>'.
	 * @generated
	 */
	ConferenceRoom createConferenceRoom();

	/**
	 * Returns a new object of class '<em>Guest Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest Room</em>'.
	 * @generated
	 */
	GuestRoom createGuestRoom();

	/**
	 * Returns a new object of class '<em>Key Card Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Card Manager Impl</em>'.
	 * @generated
	 */
	KeyCardManagerImpl createKeyCardManagerImpl();

	/**
	 * Returns a new object of class '<em>Key Card Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Card Data Service</em>'.
	 * @generated
	 */
	KeyCardDataService createKeyCardDataService();

	/**
	 * Returns a new object of class '<em>Admin Room Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin Room Manager Impl</em>'.
	 * @generated
	 */
	AdminRoomManagerImpl createAdminRoomManagerImpl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FacilitiesPackage getFacilitiesPackage();

} //FacilitiesFactory

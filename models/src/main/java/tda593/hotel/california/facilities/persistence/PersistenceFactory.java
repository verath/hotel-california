/**
 */
package tda593.hotel.california.facilities.persistence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.facilities.persistence.PersistencePackage
 * @generated
 */
public interface PersistenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistenceFactory eINSTANCE = tda593.hotel.california.facilities.persistence.impl.PersistenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Key Card Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Card Entity</em>'.
	 * @generated
	 */
	KeyCardEntity createKeyCardEntity();

	/**
	 * Returns a new object of class '<em>Room Type Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Type Entity</em>'.
	 * @generated
	 */
	RoomTypeEntity createRoomTypeEntity();

	/**
	 * Returns a new object of class '<em>Room Approval Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Approval Entity</em>'.
	 * @generated
	 */
	RoomApprovalEntity createRoomApprovalEntity();

	/**
	 * Returns a new object of class '<em>Disability Approval Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disability Approval Entity</em>'.
	 * @generated
	 */
	DisabilityApprovalEntity createDisabilityApprovalEntity();

	/**
	 * Returns a new object of class '<em>Conference Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conference Room</em>'.
	 * @generated
	 */
	ConferenceRoom createConferenceRoom();

	/**
	 * Returns a new object of class '<em>Room Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Entity</em>'.
	 * @generated
	 */
	RoomEntity createRoomEntity();

	/**
	 * Returns a new object of class '<em>Guest Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest Room</em>'.
	 * @generated
	 */
	GuestRoom createGuestRoom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersistencePackage getPersistencePackage();

} //PersistenceFactory

/**
 */
package tda593.hotel.california.booking.persistence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.booking.persistence.PersistencePackage
 * @generated
 */
public interface PersistenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistenceFactory eINSTANCE = tda593.hotel.california.booking.persistence.impl.PersistenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Room Stay Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Stay Entity</em>'.
	 * @generated
	 */
	RoomStayEntity createRoomStayEntity();

	/**
	 * Returns a new object of class '<em>Person Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Entity</em>'.
	 * @generated
	 */
	PersonEntity createPersonEntity();

	/**
	 * Returns a new object of class '<em>Legal Entity Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legal Entity Entity</em>'.
	 * @generated
	 */
	LegalEntityEntity createLegalEntityEntity();

	/**
	 * Returns a new object of class '<em>Credit Card Information Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credit Card Information Entity</em>'.
	 * @generated
	 */
	CreditCardInformationEntity createCreditCardInformationEntity();

	/**
	 * Returns a new object of class '<em>Stay Request Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stay Request Entity</em>'.
	 * @generated
	 */
	StayRequestEntity createStayRequestEntity();

	/**
	 * Returns a new object of class '<em>Organization Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization Entity</em>'.
	 * @generated
	 */
	OrganizationEntity createOrganizationEntity();

	/**
	 * Returns a new object of class '<em>Booking Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Entity</em>'.
	 * @generated
	 */
	BookingEntity createBookingEntity();

	/**
	 * Returns a new object of class '<em>Travel Information Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Travel Information Entity</em>'.
	 * @generated
	 */
	TravelInformationEntity createTravelInformationEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersistencePackage getPersistencePackage();

} //PersistenceFactory

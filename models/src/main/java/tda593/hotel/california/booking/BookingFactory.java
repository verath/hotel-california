/**
 */
package tda593.hotel.california.booking;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.booking.BookingPackage
 * @generated
 */
public interface BookingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookingFactory eINSTANCE = tda593.hotel.california.booking.impl.BookingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization</em>'.
	 * @generated
	 */
	Organization createOrganization();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking</em>'.
	 * @generated
	 */
	Booking createBooking();

	/**
	 * Returns a new object of class '<em>Room Stay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Stay</em>'.
	 * @generated
	 */
	RoomStay createRoomStay();

	/**
	 * Returns a new object of class '<em>Stay Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stay Request</em>'.
	 * @generated
	 */
	StayRequest createStayRequest();

	/**
	 * Returns a new object of class '<em>Travel Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Travel Information</em>'.
	 * @generated
	 */
	TravelInformation createTravelInformation();

	/**
	 * Returns a new object of class '<em>Credit Card Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credit Card Information</em>'.
	 * @generated
	 */
	CreditCardInformation createCreditCardInformation();

	/**
	 * Returns a new object of class '<em>Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager Impl</em>'.
	 * @generated
	 */
	BookingManagerImpl createBookingManagerImpl();

	/**
	 * Returns a new object of class '<em>Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Service</em>'.
	 * @generated
	 */
	BookingDataService createBookingDataService();

	/**
	 * Returns a new object of class '<em>Legal Entity Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legal Entity Manager Impl</em>'.
	 * @generated
	 */
	LegalEntityManagerImpl createLegalEntityManagerImpl();

	/**
	 * Returns a new object of class '<em>Legal Entity Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legal Entity Data Service</em>'.
	 * @generated
	 */
	LegalEntityDataService createLegalEntityDataService();

	/**
	 * Returns a new object of class '<em>Legal Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legal Entity</em>'.
	 * @generated
	 */
	LegalEntity createLegalEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BookingPackage getBookingPackage();

} //BookingFactory

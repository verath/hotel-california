/**
 */
package tda593.hotel.california.booking;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.BookingManagerImpl#getBookingDataService <em>Booking Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.booking.BookingPackage#getBookingManagerImpl()
 * @model
 * @generated
 */
public interface BookingManagerImpl extends BookingManager {
	/**
	 * Returns the value of the '<em><b>Booking Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Data Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Data Service</em>' reference.
	 * @see #setBookingDataService(BookingDataService)
	 * @see tda593.hotel.california.booking.BookingPackage#getBookingManagerImpl_BookingDataService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingDataService getBookingDataService();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.booking.BookingManagerImpl#getBookingDataService <em>Booking Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Data Service</em>' reference.
	 * @see #getBookingDataService()
	 * @generated
	 */
	void setBookingDataService(BookingDataService value);

} // BookingManagerImpl

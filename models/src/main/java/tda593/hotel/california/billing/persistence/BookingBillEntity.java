/**
 */
package tda593.hotel.california.billing.persistence;

import javax.persistence.Entity;

import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.booking.persistence.BookingEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Bill Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.BookingBillEntity#getBookingEntity <em>Booking Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getBookingBillEntity()
 * @model
 * @generated
 */
public interface BookingBillEntity extends Bill {
	/**
	 * Returns the value of the '<em><b>Booking Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Entity</em>' reference.
	 * @see #setBookingEntity(BookingEntity)
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getBookingBillEntity_BookingEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingEntity getBookingEntity();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.BookingBillEntity#getBookingEntity <em>Booking Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Entity</em>' reference.
	 * @see #getBookingEntity()
	 * @generated
	 */
	void setBookingEntity(BookingEntity value);

} // BookingBillEntity

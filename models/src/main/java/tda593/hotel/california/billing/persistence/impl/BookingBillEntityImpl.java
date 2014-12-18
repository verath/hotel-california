/**
 */
package tda593.hotel.california.billing.persistence.impl;

import javax.persistence.OneToOne;

import tda593.hotel.california.billing.impl.BillImpl;
import tda593.hotel.california.billing.persistence.BookingBillEntity;
import tda593.hotel.california.booking.persistence.BookingEntity;
import tda593.hotel.california.booking.persistence.impl.BookingEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Bill Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BookingBillEntityImpl#getBookingEntity <em>Booking Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingBillEntityImpl extends BillEntityImpl implements BookingBillEntity {
	@OneToOne(targetEntity = BookingEntityImpl.class)
	private BookingEntity bookingEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingBillEntityImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingEntity getBookingEntity() {
		return bookingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingEntity(BookingEntity newBookingEntity) {
		bookingEntity = newBookingEntity;
	}
} //BookingBillEntityImpl

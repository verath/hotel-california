/**
 */
package tda593.hotel.california.billing.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.BookingBill;

import tda593.hotel.california.booking.Booking;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.impl.BookingBillImpl#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingBillImpl extends BillImpl implements BookingBill {
	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected Booking booking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingBillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.BOOKING_BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBooking() {
		if (booking != null && booking.eIsProxy()) {
			InternalEObject oldBooking = (InternalEObject)booking;
			booking = (Booking)eResolveProxy(oldBooking);
			if (booking != oldBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BillingPackage.BOOKING_BILL__BOOKING, oldBooking, booking));
			}
		}
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking basicGetBooking() {
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooking(Booking newBooking) {
		Booking oldBooking = booking;
		booking = newBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.BOOKING_BILL__BOOKING, oldBooking, booking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BillingPackage.BOOKING_BILL__BOOKING:
				if (resolve) return getBooking();
				return basicGetBooking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BillingPackage.BOOKING_BILL__BOOKING:
				setBooking((Booking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BillingPackage.BOOKING_BILL__BOOKING:
				setBooking((Booking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BillingPackage.BOOKING_BILL__BOOKING:
				return booking != null;
		}
		return super.eIsSet(featureID);
	}

} //BookingBillImpl

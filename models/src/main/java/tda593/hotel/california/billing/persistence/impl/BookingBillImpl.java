/**
 */
package tda593.hotel.california.billing.persistence.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tda593.hotel.california.billing.impl.BillImpl;

import tda593.hotel.california.billing.persistence.BookingBill;
import tda593.hotel.california.billing.persistence.PersistencePackage;

import tda593.hotel.california.booking.persistence.BookingEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BookingBillImpl#getBookingEntity <em>Booking Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingBillImpl extends BillImpl implements BookingBill {
	/**
	 * The cached value of the '{@link #getBookingEntity() <em>Booking Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingEntity()
	 * @generated
	 * @ordered
	 */
	protected BookingEntity bookingEntity;

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
		return PersistencePackage.Literals.BOOKING_BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingEntity getBookingEntity() {
		if (bookingEntity != null && bookingEntity.eIsProxy()) {
			InternalEObject oldBookingEntity = (InternalEObject)bookingEntity;
			bookingEntity = (BookingEntity)eResolveProxy(oldBookingEntity);
			if (bookingEntity != oldBookingEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.BOOKING_BILL__BOOKING_ENTITY, oldBookingEntity, bookingEntity));
			}
		}
		return bookingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingEntity basicGetBookingEntity() {
		return bookingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingEntity(BookingEntity newBookingEntity) {
		BookingEntity oldBookingEntity = bookingEntity;
		bookingEntity = newBookingEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BOOKING_BILL__BOOKING_ENTITY, oldBookingEntity, bookingEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.BOOKING_BILL__BOOKING_ENTITY:
				if (resolve) return getBookingEntity();
				return basicGetBookingEntity();
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
			case PersistencePackage.BOOKING_BILL__BOOKING_ENTITY:
				setBookingEntity((BookingEntity)newValue);
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
			case PersistencePackage.BOOKING_BILL__BOOKING_ENTITY:
				setBookingEntity((BookingEntity)null);
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
			case PersistencePackage.BOOKING_BILL__BOOKING_ENTITY:
				return bookingEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //BookingBillImpl

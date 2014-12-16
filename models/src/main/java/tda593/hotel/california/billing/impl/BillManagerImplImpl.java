/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillManagerImpl;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.Discount;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.impl.BillManagerImplImpl#getBillDataService <em>Bill Data Service</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.BillManagerImplImpl#getBookingManager <em>Booking Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillManagerImplImpl extends MinimalEObjectImpl.Container implements BillManagerImpl {
	/**
	 * The cached value of the '{@link #getBillDataService() <em>Bill Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillDataService()
	 * @generated
	 * @ordered
	 */
	protected BillDataService billDataService;

	/**
	 * The cached value of the '{@link #getBookingManager() <em>Booking Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingManager()
	 * @generated
	 * @ordered
	 */
	protected BookingManager bookingManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillManagerImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.BILL_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillDataService getBillDataService() {
		if (billDataService != null && billDataService.eIsProxy()) {
			InternalEObject oldBillDataService = (InternalEObject)billDataService;
			billDataService = (BillDataService)eResolveProxy(oldBillDataService);
			if (billDataService != oldBillDataService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BillingPackage.BILL_MANAGER_IMPL__BILL_DATA_SERVICE, oldBillDataService, billDataService));
			}
		}
		return billDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillDataService basicGetBillDataService() {
		return billDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillDataService(BillDataService newBillDataService) {
		BillDataService oldBillDataService = billDataService;
		billDataService = newBillDataService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.BILL_MANAGER_IMPL__BILL_DATA_SERVICE, oldBillDataService, billDataService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingManager getBookingManager() {
		if (bookingManager != null && bookingManager.eIsProxy()) {
			InternalEObject oldBookingManager = (InternalEObject)bookingManager;
			bookingManager = (BookingManager)eResolveProxy(oldBookingManager);
			if (bookingManager != oldBookingManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BillingPackage.BILL_MANAGER_IMPL__BOOKING_MANAGER, oldBookingManager, bookingManager));
			}
		}
		return bookingManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingManager basicGetBookingManager() {
		return bookingManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingManager(BookingManager newBookingManager) {
		BookingManager oldBookingManager = bookingManager;
		bookingManager = newBookingManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.BILL_MANAGER_IMPL__BOOKING_MANAGER, oldBookingManager, bookingManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill getBill(int id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBookingBill(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void billItem(Bill bill, int serviceId, int quantity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllServices() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSubBill(Bill subBill, Bill toBill) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyDiscount(Discount discount, Bill bill) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void publishBill(Bill bill) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void markBillAsPaid(Bill bill, boolean isPaid) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BillingPackage.BILL_MANAGER_IMPL__BILL_DATA_SERVICE:
				if (resolve) return getBillDataService();
				return basicGetBillDataService();
			case BillingPackage.BILL_MANAGER_IMPL__BOOKING_MANAGER:
				if (resolve) return getBookingManager();
				return basicGetBookingManager();
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
			case BillingPackage.BILL_MANAGER_IMPL__BILL_DATA_SERVICE:
				setBillDataService((BillDataService)newValue);
				return;
			case BillingPackage.BILL_MANAGER_IMPL__BOOKING_MANAGER:
				setBookingManager((BookingManager)newValue);
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
			case BillingPackage.BILL_MANAGER_IMPL__BILL_DATA_SERVICE:
				setBillDataService((BillDataService)null);
				return;
			case BillingPackage.BILL_MANAGER_IMPL__BOOKING_MANAGER:
				setBookingManager((BookingManager)null);
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
			case BillingPackage.BILL_MANAGER_IMPL__BILL_DATA_SERVICE:
				return billDataService != null;
			case BillingPackage.BILL_MANAGER_IMPL__BOOKING_MANAGER:
				return bookingManager != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BillingPackage.BILL_MANAGER_IMPL___GET_BILL__INT:
				return getBill((Integer)arguments.get(0));
			case BillingPackage.BILL_MANAGER_IMPL___GET_BOOKING_BILL__BOOKING:
				getBookingBill((Booking)arguments.get(0));
				return null;
			case BillingPackage.BILL_MANAGER_IMPL___BILL_ITEM__BILL_INT_INT:
				billItem((Bill)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case BillingPackage.BILL_MANAGER_IMPL___GET_ALL_SERVICES:
				getAllServices();
				return null;
			case BillingPackage.BILL_MANAGER_IMPL___ADD_SUB_BILL__BILL_BILL:
				addSubBill((Bill)arguments.get(0), (Bill)arguments.get(1));
				return null;
			case BillingPackage.BILL_MANAGER_IMPL___APPLY_DISCOUNT__DISCOUNT_BILL:
				applyDiscount((Discount)arguments.get(0), (Bill)arguments.get(1));
				return null;
			case BillingPackage.BILL_MANAGER_IMPL___PUBLISH_BILL__BILL:
				publishBill((Bill)arguments.get(0));
				return null;
			case BillingPackage.BILL_MANAGER_IMPL___MARK_BILL_AS_PAID__BILL_BOOLEAN:
				markBillAsPaid((Bill)arguments.get(0), (Boolean)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillManagerImplImpl
/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.BankingManager;
import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillManagerImpl;
import tda593.hotel.california.billing.BillingFactory;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.BookingBill;
import tda593.hotel.california.billing.CreditCardInformation;
import tda593.hotel.california.billing.CreditCardManager;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.Purchase;
import tda593.hotel.california.billing.Service;
import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntity;

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


	public BillManagerImplImpl(BillDataService billDataService, BookingManager bookingManager) {
		this();
		this.billDataService = billDataService;
		this.bookingManager = bookingManager;
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
	 * Returns the bill with the specified if, or null if there is none
	 * @param id Bill's id
	 * @return Bill (or null if none exist)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Bill getBill(int id) {
		return billDataService.get(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BookingBill getBookingBill(Booking booking) {
		if(booking != null) {
			return billDataService.getBookingBill(booking);
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void billItem(Bill bill, int quantity, Service service) {
		if(bill == null) {
			throw new IllegalArgumentException("No bill selected.");
		}
		
		if(quantity<=0) {
			throw new IllegalArgumentException("Invalid quantity");
		}
		
		if(service==null) {
			throw new IllegalArgumentException("No service selected");
		}
		
		Purchase purchase = new PurchaseImpl();
		purchase.setService(service);
		purchase.setQuantity(quantity);
		purchase.setPrice(service.getPrice()); // Snapshot
		
		bill.registerPurchase(purchase);
		billDataService.set(bill);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addSubBill(Bill subBill, Bill toBill) {
		if(subBill != null && toBill != null) {
			toBill.addSubBill(subBill);
			billDataService.set(toBill);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void applyDiscount(Discount discount, Bill bill) {
		if(discount != null && bill != null) {
			bill.applyDiscount(discount);
			billDataService.set(bill);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void publishBill(Bill bill) {
		if(bill != null) {
			bill.publishBill();
			billDataService.set(bill);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Mark the bill as paid/unpaid depending on the desired state (isPaid param).
	 * Charges the amount of the bill to the registered credit card information
	 * of the customer. Charges a negative amount if the bill is paid and is being
	 * marked as unpaid (i.e. a pay back). 
	 * 
	 * Return true if the payment or pay back succeeded. Returns false if it does not,
	 * or there is no credit card info registered on the customer, or if the bill already
	 * is in the desired state.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean markBillAsPaid(Bill bill, boolean isPaid, BankingManager bankingManager, CreditCardManager creditCardManager) {
		// If the bill already is in the specified state
		if(bill.isPaid() == isPaid) {
			return false;
		}
		
		CreditCardInformation cc = creditCardManager.getCreditCardInformation(bill.getCustomer());
		Calendar cal = Calendar.getInstance();
		
		
		if(cc == null) {
			return false;
		} 
		cal.setTime(cc.getExpirationDate());
		if(!bankingManager.makePayment(cc.getCardNumber(), cc.getCcv(), 
				cal.get(Calendar.MONTH), cal.get(Calendar.YEAR), 
				cc.getFirstName(), cc.getLastName(), isPaid? bill.getPrice() : -bill.getPrice())) {
			return false;
		}
		bill.setIsPaid(isPaid);
		billDataService.set(bill);
		return true;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Bill createBill(LegalEntity customer) {
		if(customer != null) {
			BillImpl bill = new BillImpl();
			bill.setCustomer(customer);
			billDataService.set(bill);
			return bill;
		}
		
		return null;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BookingBill createBookingBill(LegalEntity customer, Booking booking) {
		if(customer != null && booking != null) {
			BookingBill bill = BillingFactory.eINSTANCE.createBookingBill();
			bill.setCustomer(customer);
			bill.setBooking(booking);
			billDataService.set(bill);
			return bill;
		}
		
		return null;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Bill> getBills(LegalEntity customer) {
		if(customer != null) {
			return billDataService.getAll(customer);
		}
		
		return new BasicEList<Bill>();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Bill> getUnpaidBills(LegalEntity customer) {
		if(customer != null) {
			EList<Bill> results = getBills(customer);
			Iterator<Bill> it = results.iterator();
			while(it.hasNext()) {
				Bill b = it.next();
				if(b.isPaid()) {
					it.remove();
				}
			}
			
			return results;
		}
		
		return new BasicEList<Bill>();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void markBillAsPaid(Bill bill, boolean isPaid) {
		if(bill != null) {
			bill.setIsPaid(true);
			billDataService.set(bill);
		}
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
				return getBookingBill((Booking)arguments.get(0));
			case BillingPackage.BILL_MANAGER_IMPL___BILL_ITEM__BILL_INT_SERVICE:
				billItem((Bill)arguments.get(0), (Integer)arguments.get(1), (Service)arguments.get(2));
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
			case BillingPackage.BILL_MANAGER_IMPL___MARK_BILL_AS_PAID__BILL_BOOLEAN_BANKINGMANAGER_CREDITCARDMANAGER:
				return markBillAsPaid((Bill)arguments.get(0), (Boolean)arguments.get(1), (BankingManager)arguments.get(2), (CreditCardManager)arguments.get(3));
			case BillingPackage.BILL_MANAGER_IMPL___CREATE_BILL__LEGALENTITY:
				return createBill((LegalEntity)arguments.get(0));
			case BillingPackage.BILL_MANAGER_IMPL___CREATE_BOOKING_BILL__LEGALENTITY_BOOKING:
				return createBookingBill((LegalEntity)arguments.get(0), (Booking)arguments.get(1));
			case BillingPackage.BILL_MANAGER_IMPL___GET_BILLS__LEGALENTITY:
				return getBills((LegalEntity)arguments.get(0));
			case BillingPackage.BILL_MANAGER_IMPL___GET_UNPAID_BILLS__LEGALENTITY:
				return getUnpaidBills((LegalEntity)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillManagerImplImpl

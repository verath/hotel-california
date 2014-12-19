/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.Purchase;
import tda593.hotel.california.booking.LegalEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.impl.BillImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.BillImpl#getDate <em>Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.BillImpl#isPublished <em>Is Published</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.BillImpl#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.BillImpl#getPurchase <em>Purchase</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.BillImpl#getUsedDiscounts <em>Used Discounts</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.BillImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.BillImpl#getSubBills <em>Sub Bills</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillImpl extends MinimalEObjectImpl.Container implements Bill {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublished() <em>Is Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublished()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLISHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublished() <em>Is Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublished()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublished = IS_PUBLISHED_EDEFAULT;

	/**
	 * The default value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected boolean isPaid = IS_PAID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPurchase() <em>Purchase</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchase()
	 * @generated
	 * @ordered
	 */
	protected EList<Purchase> purchase;

	/**
	 * The cached value of the '{@link #getUsedDiscounts() <em>Used Discounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedDiscounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Discount> usedDiscounts;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected LegalEntity customer;

	/**
	 * The cached value of the '{@link #getSubBills() <em>Sub Bills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubBills()
	 * @generated
	 * @ordered
	 */
	protected EList<Bill> subBills;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.BILL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.BILL__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublished() {
		return isPublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPublished(boolean newIsPublished) {
		boolean oldIsPublished = isPublished;
		isPublished = newIsPublished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.BILL__IS_PUBLISHED, oldIsPublished, isPublished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntity getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (LegalEntity)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BillingPackage.BILL__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntity basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(LegalEntity newCustomer) {
		LegalEntity oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.BILL__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bill> getSubBills() {
		if (subBills == null) {
			subBills = new EObjectResolvingEList<Bill>(Bill.class, this, BillingPackage.BILL__SUB_BILLS);
		}
		return subBills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaid() {
		return isPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPaid(boolean newIsPaid) {
		boolean oldIsPaid = isPaid;
		isPaid = newIsPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.BILL__IS_PAID, oldIsPaid, isPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Purchase> getPurchase() {
		if (purchase == null) {
			purchase = new EObjectResolvingEList<Purchase>(Purchase.class, this, BillingPackage.BILL__PURCHASE);
		}
		return purchase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discount> getUsedDiscounts() {
		if (usedDiscounts == null) {
			usedDiscounts = new EObjectResolvingEList<Discount>(Discount.class, this, BillingPackage.BILL__USED_DISCOUNTS);
		}
		return usedDiscounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void applyDiscount(Discount discount) {
		if(discount != null) {
			usedDiscounts.add(discount);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addSubBill(Bill subBill) {
		if(subBill != null) {
			subBills.add(subBill);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void registerPurchase(Purchase purchase) {
		if(purchase != null) {
			this.purchase.add(purchase);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void publishBill() {
		setIsPublished(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unregisterPurchase(Purchase purchase) {
		if(purchase != null) {
			this.purchase.remove(purchase);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeSubBill(Bill subBill) {
		if(subBill != null) {
			subBills.remove(subBill);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unPublishBill() {
		setIsPublished(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getPrice() {
		double totalSum = 0;
		
		// Get prices from all purchases
		for(Purchase pur : purchase) {
			totalSum += pur.getPrice() * pur.getQuantity();
		}
		
		// Get prices from all sub-bills
		for(Bill subBill : subBills) {
			totalSum += subBill.getPrice();
		}
		
		// Apply discounts
		for(Discount discount : usedDiscounts) {
			totalSum = discount.getPriceWithDiscount(totalSum);
		}
		
		return totalSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeDiscount(Discount discount) {
		if(discount != null) {
			usedDiscounts.remove(discount);
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
			case BillingPackage.BILL__ID:
				return getId();
			case BillingPackage.BILL__DATE:
				return getDate();
			case BillingPackage.BILL__IS_PUBLISHED:
				return isPublished();
			case BillingPackage.BILL__IS_PAID:
				return isPaid();
			case BillingPackage.BILL__PURCHASE:
				return getPurchase();
			case BillingPackage.BILL__USED_DISCOUNTS:
				return getUsedDiscounts();
			case BillingPackage.BILL__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case BillingPackage.BILL__SUB_BILLS:
				return getSubBills();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BillingPackage.BILL__ID:
				setId((Integer)newValue);
				return;
			case BillingPackage.BILL__DATE:
				setDate((Date)newValue);
				return;
			case BillingPackage.BILL__IS_PUBLISHED:
				setIsPublished((Boolean)newValue);
				return;
			case BillingPackage.BILL__IS_PAID:
				setIsPaid((Boolean)newValue);
				return;
			case BillingPackage.BILL__PURCHASE:
				getPurchase().clear();
				getPurchase().addAll((Collection<? extends Purchase>)newValue);
				return;
			case BillingPackage.BILL__USED_DISCOUNTS:
				getUsedDiscounts().clear();
				getUsedDiscounts().addAll((Collection<? extends Discount>)newValue);
				return;
			case BillingPackage.BILL__CUSTOMER:
				setCustomer((LegalEntity)newValue);
				return;
			case BillingPackage.BILL__SUB_BILLS:
				getSubBills().clear();
				getSubBills().addAll((Collection<? extends Bill>)newValue);
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
			case BillingPackage.BILL__ID:
				setId(ID_EDEFAULT);
				return;
			case BillingPackage.BILL__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case BillingPackage.BILL__IS_PUBLISHED:
				setIsPublished(IS_PUBLISHED_EDEFAULT);
				return;
			case BillingPackage.BILL__IS_PAID:
				setIsPaid(IS_PAID_EDEFAULT);
				return;
			case BillingPackage.BILL__PURCHASE:
				getPurchase().clear();
				return;
			case BillingPackage.BILL__USED_DISCOUNTS:
				getUsedDiscounts().clear();
				return;
			case BillingPackage.BILL__CUSTOMER:
				setCustomer((LegalEntity)null);
				return;
			case BillingPackage.BILL__SUB_BILLS:
				getSubBills().clear();
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
			case BillingPackage.BILL__ID:
				return id != ID_EDEFAULT;
			case BillingPackage.BILL__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case BillingPackage.BILL__IS_PUBLISHED:
				return isPublished != IS_PUBLISHED_EDEFAULT;
			case BillingPackage.BILL__IS_PAID:
				return isPaid != IS_PAID_EDEFAULT;
			case BillingPackage.BILL__PURCHASE:
				return purchase != null && !purchase.isEmpty();
			case BillingPackage.BILL__USED_DISCOUNTS:
				return usedDiscounts != null && !usedDiscounts.isEmpty();
			case BillingPackage.BILL__CUSTOMER:
				return customer != null;
			case BillingPackage.BILL__SUB_BILLS:
				return subBills != null && !subBills.isEmpty();
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
			case BillingPackage.BILL___APPLY_DISCOUNT__DISCOUNT:
				applyDiscount((Discount)arguments.get(0));
				return null;
			case BillingPackage.BILL___ADD_SUB_BILL__BILL:
				addSubBill((Bill)arguments.get(0));
				return null;
			case BillingPackage.BILL___REGISTER_PURCHASE__PURCHASE:
				registerPurchase((Purchase)arguments.get(0));
				return null;
			case BillingPackage.BILL___PUBLISH_BILL:
				publishBill();
				return null;
			case BillingPackage.BILL___UNREGISTER_PURCHASE__PURCHASE:
				unregisterPurchase((Purchase)arguments.get(0));
				return null;
			case BillingPackage.BILL___REMOVE_SUB_BILL__BILL:
				removeSubBill((Bill)arguments.get(0));
				return null;
			case BillingPackage.BILL___UN_PUBLISH_BILL:
				unPublishBill();
				return null;
			case BillingPackage.BILL___GET_PRICE:
				return getPrice();
			case BillingPackage.BILL___REMOVE_DISCOUNT__DISCOUNT:
				removeDiscount((Discount)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", date: ");
		result.append(date);
		result.append(", isPublished: ");
		result.append(isPublished);
		result.append(", isPaid: ");
		result.append(isPaid);
		result.append(')');
		return result.toString();
	}

} //BillImpl

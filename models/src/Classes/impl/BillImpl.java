/**
 */
package Classes.impl;

import Classes.Bill;
import Classes.ClassesPackage;
import Classes.CreditCardInformation;
import Classes.Discount;
import Classes.LegalEntity;
import Classes.Purchase;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.BillImpl#getId <em>Id</em>}</li>
 *   <li>{@link Classes.impl.BillImpl#getDate <em>Date</em>}</li>
 *   <li>{@link Classes.impl.BillImpl#isPublished <em>Is Published</em>}</li>
 *   <li>{@link Classes.impl.BillImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link Classes.impl.BillImpl#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link Classes.impl.BillImpl#getPurchase <em>Purchase</em>}</li>
 *   <li>{@link Classes.impl.BillImpl#getCreditCardInformation <em>Credit Card Information</em>}</li>
 *   <li>{@link Classes.impl.BillImpl#getUsedDiscounts <em>Used Discounts</em>}</li>
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
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected LegalEntity customer;

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
	 * The cached value of the '{@link #getCreditCardInformation() <em>Credit Card Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardInformation()
	 * @generated
	 * @ordered
	 */
	protected CreditCardInformation creditCardInformation;

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
		return ClassesPackage.Literals.BILL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BILL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BILL__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BILL__IS_PUBLISHED, oldIsPublished, isPublished));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.BILL__CUSTOMER, oldCustomer, customer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BILL__CUSTOMER, oldCustomer, customer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BILL__IS_PAID, oldIsPaid, isPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Purchase> getPurchase() {
		if (purchase == null) {
			purchase = new EObjectResolvingEList<Purchase>(Purchase.class, this, ClassesPackage.BILL__PURCHASE);
		}
		return purchase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformation getCreditCardInformation() {
		if (creditCardInformation != null && creditCardInformation.eIsProxy()) {
			InternalEObject oldCreditCardInformation = (InternalEObject)creditCardInformation;
			creditCardInformation = (CreditCardInformation)eResolveProxy(oldCreditCardInformation);
			if (creditCardInformation != oldCreditCardInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.BILL__CREDIT_CARD_INFORMATION, oldCreditCardInformation, creditCardInformation));
			}
		}
		return creditCardInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformation basicGetCreditCardInformation() {
		return creditCardInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCardInformation(CreditCardInformation newCreditCardInformation) {
		CreditCardInformation oldCreditCardInformation = creditCardInformation;
		creditCardInformation = newCreditCardInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BILL__CREDIT_CARD_INFORMATION, oldCreditCardInformation, creditCardInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discount> getUsedDiscounts() {
		if (usedDiscounts == null) {
			usedDiscounts = new EObjectResolvingEList<Discount>(Discount.class, this, ClassesPackage.BILL__USED_DISCOUNTS);
		}
		return usedDiscounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyDiscount(Discount discount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSubBill(Bill bill) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerPurchase(Purchase purchase) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void publishBill() {
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
			case ClassesPackage.BILL__ID:
				return getId();
			case ClassesPackage.BILL__DATE:
				return getDate();
			case ClassesPackage.BILL__IS_PUBLISHED:
				return isPublished();
			case ClassesPackage.BILL__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ClassesPackage.BILL__IS_PAID:
				return isPaid();
			case ClassesPackage.BILL__PURCHASE:
				return getPurchase();
			case ClassesPackage.BILL__CREDIT_CARD_INFORMATION:
				if (resolve) return getCreditCardInformation();
				return basicGetCreditCardInformation();
			case ClassesPackage.BILL__USED_DISCOUNTS:
				return getUsedDiscounts();
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
			case ClassesPackage.BILL__ID:
				setId((Integer)newValue);
				return;
			case ClassesPackage.BILL__DATE:
				setDate((Date)newValue);
				return;
			case ClassesPackage.BILL__IS_PUBLISHED:
				setIsPublished((Boolean)newValue);
				return;
			case ClassesPackage.BILL__CUSTOMER:
				setCustomer((LegalEntity)newValue);
				return;
			case ClassesPackage.BILL__IS_PAID:
				setIsPaid((Boolean)newValue);
				return;
			case ClassesPackage.BILL__PURCHASE:
				getPurchase().clear();
				getPurchase().addAll((Collection<? extends Purchase>)newValue);
				return;
			case ClassesPackage.BILL__CREDIT_CARD_INFORMATION:
				setCreditCardInformation((CreditCardInformation)newValue);
				return;
			case ClassesPackage.BILL__USED_DISCOUNTS:
				getUsedDiscounts().clear();
				getUsedDiscounts().addAll((Collection<? extends Discount>)newValue);
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
			case ClassesPackage.BILL__ID:
				setId(ID_EDEFAULT);
				return;
			case ClassesPackage.BILL__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ClassesPackage.BILL__IS_PUBLISHED:
				setIsPublished(IS_PUBLISHED_EDEFAULT);
				return;
			case ClassesPackage.BILL__CUSTOMER:
				setCustomer((LegalEntity)null);
				return;
			case ClassesPackage.BILL__IS_PAID:
				setIsPaid(IS_PAID_EDEFAULT);
				return;
			case ClassesPackage.BILL__PURCHASE:
				getPurchase().clear();
				return;
			case ClassesPackage.BILL__CREDIT_CARD_INFORMATION:
				setCreditCardInformation((CreditCardInformation)null);
				return;
			case ClassesPackage.BILL__USED_DISCOUNTS:
				getUsedDiscounts().clear();
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
			case ClassesPackage.BILL__ID:
				return id != ID_EDEFAULT;
			case ClassesPackage.BILL__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ClassesPackage.BILL__IS_PUBLISHED:
				return isPublished != IS_PUBLISHED_EDEFAULT;
			case ClassesPackage.BILL__CUSTOMER:
				return customer != null;
			case ClassesPackage.BILL__IS_PAID:
				return isPaid != IS_PAID_EDEFAULT;
			case ClassesPackage.BILL__PURCHASE:
				return purchase != null && !purchase.isEmpty();
			case ClassesPackage.BILL__CREDIT_CARD_INFORMATION:
				return creditCardInformation != null;
			case ClassesPackage.BILL__USED_DISCOUNTS:
				return usedDiscounts != null && !usedDiscounts.isEmpty();
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
			case ClassesPackage.BILL___APPLY_DISCOUNT__DISCOUNT:
				applyDiscount((Discount)arguments.get(0));
				return null;
			case ClassesPackage.BILL___ADD_SUB_BILL__BILL:
				addSubBill((Bill)arguments.get(0));
				return null;
			case ClassesPackage.BILL___REGISTER_PURCHASE__PURCHASE:
				registerPurchase((Purchase)arguments.get(0));
				return null;
			case ClassesPackage.BILL___PUBLISH_BILL:
				publishBill();
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

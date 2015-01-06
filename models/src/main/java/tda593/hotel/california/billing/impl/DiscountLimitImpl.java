/**
 */
package tda593.hotel.california.billing.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.DiscountLimit;

import tda593.hotel.california.booking.LegalEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discount Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.impl.DiscountLimitImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.DiscountLimitImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.DiscountLimitImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.DiscountLimitImpl#getAllowedUsers <em>Allowed Users</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.DiscountLimitImpl#getTimesLeftToUse <em>Times Left To Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscountLimitImpl extends MinimalEObjectImpl.Container implements DiscountLimit {
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
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedUsers() <em>Allowed Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<LegalEntity> allowedUsers;

	/**
	 * The default value of the '{@link #getTimesLeftToUse() <em>Times Left To Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimesLeftToUse()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMES_LEFT_TO_USE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimesLeftToUse() <em>Times Left To Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimesLeftToUse()
	 * @generated
	 * @ordered
	 */
	protected int timesLeftToUse = TIMES_LEFT_TO_USE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscountLimitImpl() {
		super();
	}
	
	public DiscountLimitImpl(Date startDate, Date endDate, EList<LegalEntity> allowedUsers, int timesLeftToUse) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.allowedUsers = allowedUsers;
		this.timesLeftToUse = timesLeftToUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.DISCOUNT_LIMIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.DISCOUNT_LIMIT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.DISCOUNT_LIMIT__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.DISCOUNT_LIMIT__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegalEntity> getAllowedUsers() {
		if (allowedUsers == null) {
			allowedUsers = new EObjectResolvingEList<LegalEntity>(LegalEntity.class, this, BillingPackage.DISCOUNT_LIMIT__ALLOWED_USERS);
		}
		return allowedUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimesLeftToUse() {
		return timesLeftToUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimesLeftToUse(int newTimesLeftToUse) {
		int oldTimesLeftToUse = timesLeftToUse;
		timesLeftToUse = newTimesLeftToUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.DISCOUNT_LIMIT__TIMES_LEFT_TO_USE, oldTimesLeftToUse, timesLeftToUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BillingPackage.DISCOUNT_LIMIT__ID:
				return getId();
			case BillingPackage.DISCOUNT_LIMIT__START_DATE:
				return getStartDate();
			case BillingPackage.DISCOUNT_LIMIT__END_DATE:
				return getEndDate();
			case BillingPackage.DISCOUNT_LIMIT__ALLOWED_USERS:
				return getAllowedUsers();
			case BillingPackage.DISCOUNT_LIMIT__TIMES_LEFT_TO_USE:
				return getTimesLeftToUse();
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
			case BillingPackage.DISCOUNT_LIMIT__ID:
				setId((Integer)newValue);
				return;
			case BillingPackage.DISCOUNT_LIMIT__START_DATE:
				setStartDate((Date)newValue);
				return;
			case BillingPackage.DISCOUNT_LIMIT__END_DATE:
				setEndDate((Date)newValue);
				return;
			case BillingPackage.DISCOUNT_LIMIT__ALLOWED_USERS:
				getAllowedUsers().clear();
				getAllowedUsers().addAll((Collection<? extends LegalEntity>)newValue);
				return;
			case BillingPackage.DISCOUNT_LIMIT__TIMES_LEFT_TO_USE:
				setTimesLeftToUse((Integer)newValue);
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
			case BillingPackage.DISCOUNT_LIMIT__ID:
				setId(ID_EDEFAULT);
				return;
			case BillingPackage.DISCOUNT_LIMIT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case BillingPackage.DISCOUNT_LIMIT__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case BillingPackage.DISCOUNT_LIMIT__ALLOWED_USERS:
				getAllowedUsers().clear();
				return;
			case BillingPackage.DISCOUNT_LIMIT__TIMES_LEFT_TO_USE:
				setTimesLeftToUse(TIMES_LEFT_TO_USE_EDEFAULT);
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
			case BillingPackage.DISCOUNT_LIMIT__ID:
				return id != ID_EDEFAULT;
			case BillingPackage.DISCOUNT_LIMIT__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case BillingPackage.DISCOUNT_LIMIT__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case BillingPackage.DISCOUNT_LIMIT__ALLOWED_USERS:
				return allowedUsers != null && !allowedUsers.isEmpty();
			case BillingPackage.DISCOUNT_LIMIT__TIMES_LEFT_TO_USE:
				return timesLeftToUse != TIMES_LEFT_TO_USE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", timesLeftToUse: ");
		result.append(timesLeftToUse);
		result.append(')');
		return result.toString();
	}

} //DiscountLimitImpl

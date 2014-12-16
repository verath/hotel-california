/**
 */
package tda593.hotel.california.billing.persistence.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tda593.hotel.california.billing.persistence.DiscountLimitEntity;
import tda593.hotel.california.billing.persistence.PersistencePackage;

import tda593.hotel.california.booking.persistence.LegalEntityEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discount Limit Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl#getAllowedUsers <em>Allowed Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscountLimitEntityImpl extends MinimalEObjectImpl.Container implements DiscountLimitEntity {
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
	protected EList<LegalEntityEntity> allowedUsers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscountLimitEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.DISCOUNT_LIMIT_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DISCOUNT_LIMIT_ENTITY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DISCOUNT_LIMIT_ENTITY__START_DATE, oldStartDate, startDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DISCOUNT_LIMIT_ENTITY__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegalEntityEntity> getAllowedUsers() {
		if (allowedUsers == null) {
			allowedUsers = new EObjectResolvingEList<LegalEntityEntity>(LegalEntityEntity.class, this, PersistencePackage.DISCOUNT_LIMIT_ENTITY__ALLOWED_USERS);
		}
		return allowedUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__ID:
				return getId();
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__START_DATE:
				return getStartDate();
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__END_DATE:
				return getEndDate();
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__ALLOWED_USERS:
				return getAllowedUsers();
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
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__ID:
				setId((Integer)newValue);
				return;
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__START_DATE:
				setStartDate((Date)newValue);
				return;
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__END_DATE:
				setEndDate((Date)newValue);
				return;
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__ALLOWED_USERS:
				getAllowedUsers().clear();
				getAllowedUsers().addAll((Collection<? extends LegalEntityEntity>)newValue);
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
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__ALLOWED_USERS:
				getAllowedUsers().clear();
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
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__ID:
				return id != ID_EDEFAULT;
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY__ALLOWED_USERS:
				return allowedUsers != null && !allowedUsers.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DiscountLimitEntityImpl

/**
 */
package tda593.hotel.california.billing.persistence.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tda593.hotel.california.billing.persistence.BillEntity;
import tda593.hotel.california.billing.persistence.DiscountEntity;
import tda593.hotel.california.billing.persistence.PersistencePackage;
import tda593.hotel.california.billing.persistence.PurchaseEntity;

import tda593.hotel.california.booking.persistence.CreditCardInformationEntity;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getDate <em>Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#isPublished <em>Is Published</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getUsedDiscounts <em>Used Discounts</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getLegalEntityEntity <em>Legal Entity Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getPurchaseEntity <em>Purchase Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getCreditCardInformationEntity <em>Credit Card Information Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillEntityImpl extends MinimalEObjectImpl.Container implements BillEntity {
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
	 * The cached value of the '{@link #getUsedDiscounts() <em>Used Discounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedDiscounts()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscountEntity> usedDiscounts;

	/**
	 * The cached value of the '{@link #getLegalEntityEntity() <em>Legal Entity Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalEntityEntity()
	 * @generated
	 * @ordered
	 */
	protected LegalEntityEntity legalEntityEntity;

	/**
	 * The cached value of the '{@link #getPurchaseEntity() <em>Purchase Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<PurchaseEntity> purchaseEntity;

	/**
	 * The cached value of the '{@link #getCreditCardInformationEntity() <em>Credit Card Information Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardInformationEntity()
	 * @generated
	 * @ordered
	 */
	protected CreditCardInformationEntity creditCardInformationEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.BILL_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BILL_ENTITY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BILL_ENTITY__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BILL_ENTITY__IS_PUBLISHED, oldIsPublished, isPublished));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BILL_ENTITY__IS_PAID, oldIsPaid, isPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscountEntity> getUsedDiscounts() {
		if (usedDiscounts == null) {
			usedDiscounts = new EObjectResolvingEList<DiscountEntity>(DiscountEntity.class, this, PersistencePackage.BILL_ENTITY__USED_DISCOUNTS);
		}
		return usedDiscounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityEntity getLegalEntityEntity() {
		if (legalEntityEntity != null && legalEntityEntity.eIsProxy()) {
			InternalEObject oldLegalEntityEntity = (InternalEObject)legalEntityEntity;
			legalEntityEntity = (LegalEntityEntity)eResolveProxy(oldLegalEntityEntity);
			if (legalEntityEntity != oldLegalEntityEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.BILL_ENTITY__LEGAL_ENTITY_ENTITY, oldLegalEntityEntity, legalEntityEntity));
			}
		}
		return legalEntityEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityEntity basicGetLegalEntityEntity() {
		return legalEntityEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalEntityEntity(LegalEntityEntity newLegalEntityEntity) {
		LegalEntityEntity oldLegalEntityEntity = legalEntityEntity;
		legalEntityEntity = newLegalEntityEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BILL_ENTITY__LEGAL_ENTITY_ENTITY, oldLegalEntityEntity, legalEntityEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseEntity> getPurchaseEntity() {
		if (purchaseEntity == null) {
			purchaseEntity = new EObjectResolvingEList<PurchaseEntity>(PurchaseEntity.class, this, PersistencePackage.BILL_ENTITY__PURCHASE_ENTITY);
		}
		return purchaseEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformationEntity getCreditCardInformationEntity() {
		if (creditCardInformationEntity != null && creditCardInformationEntity.eIsProxy()) {
			InternalEObject oldCreditCardInformationEntity = (InternalEObject)creditCardInformationEntity;
			creditCardInformationEntity = (CreditCardInformationEntity)eResolveProxy(oldCreditCardInformationEntity);
			if (creditCardInformationEntity != oldCreditCardInformationEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.BILL_ENTITY__CREDIT_CARD_INFORMATION_ENTITY, oldCreditCardInformationEntity, creditCardInformationEntity));
			}
		}
		return creditCardInformationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformationEntity basicGetCreditCardInformationEntity() {
		return creditCardInformationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCardInformationEntity(CreditCardInformationEntity newCreditCardInformationEntity) {
		CreditCardInformationEntity oldCreditCardInformationEntity = creditCardInformationEntity;
		creditCardInformationEntity = newCreditCardInformationEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BILL_ENTITY__CREDIT_CARD_INFORMATION_ENTITY, oldCreditCardInformationEntity, creditCardInformationEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.BILL_ENTITY__ID:
				return getId();
			case PersistencePackage.BILL_ENTITY__DATE:
				return getDate();
			case PersistencePackage.BILL_ENTITY__IS_PUBLISHED:
				return isPublished();
			case PersistencePackage.BILL_ENTITY__IS_PAID:
				return isPaid();
			case PersistencePackage.BILL_ENTITY__USED_DISCOUNTS:
				return getUsedDiscounts();
			case PersistencePackage.BILL_ENTITY__LEGAL_ENTITY_ENTITY:
				if (resolve) return getLegalEntityEntity();
				return basicGetLegalEntityEntity();
			case PersistencePackage.BILL_ENTITY__PURCHASE_ENTITY:
				return getPurchaseEntity();
			case PersistencePackage.BILL_ENTITY__CREDIT_CARD_INFORMATION_ENTITY:
				if (resolve) return getCreditCardInformationEntity();
				return basicGetCreditCardInformationEntity();
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
			case PersistencePackage.BILL_ENTITY__ID:
				setId((Integer)newValue);
				return;
			case PersistencePackage.BILL_ENTITY__DATE:
				setDate((Date)newValue);
				return;
			case PersistencePackage.BILL_ENTITY__IS_PUBLISHED:
				setIsPublished((Boolean)newValue);
				return;
			case PersistencePackage.BILL_ENTITY__IS_PAID:
				setIsPaid((Boolean)newValue);
				return;
			case PersistencePackage.BILL_ENTITY__USED_DISCOUNTS:
				getUsedDiscounts().clear();
				getUsedDiscounts().addAll((Collection<? extends DiscountEntity>)newValue);
				return;
			case PersistencePackage.BILL_ENTITY__LEGAL_ENTITY_ENTITY:
				setLegalEntityEntity((LegalEntityEntity)newValue);
				return;
			case PersistencePackage.BILL_ENTITY__PURCHASE_ENTITY:
				getPurchaseEntity().clear();
				getPurchaseEntity().addAll((Collection<? extends PurchaseEntity>)newValue);
				return;
			case PersistencePackage.BILL_ENTITY__CREDIT_CARD_INFORMATION_ENTITY:
				setCreditCardInformationEntity((CreditCardInformationEntity)newValue);
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
			case PersistencePackage.BILL_ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case PersistencePackage.BILL_ENTITY__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case PersistencePackage.BILL_ENTITY__IS_PUBLISHED:
				setIsPublished(IS_PUBLISHED_EDEFAULT);
				return;
			case PersistencePackage.BILL_ENTITY__IS_PAID:
				setIsPaid(IS_PAID_EDEFAULT);
				return;
			case PersistencePackage.BILL_ENTITY__USED_DISCOUNTS:
				getUsedDiscounts().clear();
				return;
			case PersistencePackage.BILL_ENTITY__LEGAL_ENTITY_ENTITY:
				setLegalEntityEntity((LegalEntityEntity)null);
				return;
			case PersistencePackage.BILL_ENTITY__PURCHASE_ENTITY:
				getPurchaseEntity().clear();
				return;
			case PersistencePackage.BILL_ENTITY__CREDIT_CARD_INFORMATION_ENTITY:
				setCreditCardInformationEntity((CreditCardInformationEntity)null);
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
			case PersistencePackage.BILL_ENTITY__ID:
				return id != ID_EDEFAULT;
			case PersistencePackage.BILL_ENTITY__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case PersistencePackage.BILL_ENTITY__IS_PUBLISHED:
				return isPublished != IS_PUBLISHED_EDEFAULT;
			case PersistencePackage.BILL_ENTITY__IS_PAID:
				return isPaid != IS_PAID_EDEFAULT;
			case PersistencePackage.BILL_ENTITY__USED_DISCOUNTS:
				return usedDiscounts != null && !usedDiscounts.isEmpty();
			case PersistencePackage.BILL_ENTITY__LEGAL_ENTITY_ENTITY:
				return legalEntityEntity != null;
			case PersistencePackage.BILL_ENTITY__PURCHASE_ENTITY:
				return purchaseEntity != null && !purchaseEntity.isEmpty();
			case PersistencePackage.BILL_ENTITY__CREDIT_CARD_INFORMATION_ENTITY:
				return creditCardInformationEntity != null;
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
		result.append(", date: ");
		result.append(date);
		result.append(", isPublished: ");
		result.append(isPublished);
		result.append(", isPaid: ");
		result.append(isPaid);
		result.append(')');
		return result.toString();
	}

} //BillEntityImpl

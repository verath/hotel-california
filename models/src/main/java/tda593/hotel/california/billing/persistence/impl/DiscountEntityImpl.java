/**
 */
package tda593.hotel.california.billing.persistence.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.persistence.DiscountEntity;
import tda593.hotel.california.billing.persistence.DiscountLimitEntity;
import tda593.hotel.california.billing.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discount Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl#getCode <em>Code</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl#getDiscountLimitEntity <em>Discount Limit Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiscountEntityImpl extends MinimalEObjectImpl.Container implements DiscountEntity {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected int code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiscountLimitEntity() <em>Discount Limit Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountLimitEntity()
	 * @generated
	 * @ordered
	 */
	protected DiscountLimitEntity discountLimitEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscountEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.DISCOUNT_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(int newCode) {
		int oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DISCOUNT_ENTITY__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DISCOUNT_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountLimitEntity getDiscountLimitEntity() {
		if (discountLimitEntity != null && discountLimitEntity.eIsProxy()) {
			InternalEObject oldDiscountLimitEntity = (InternalEObject)discountLimitEntity;
			discountLimitEntity = (DiscountLimitEntity)eResolveProxy(oldDiscountLimitEntity);
			if (discountLimitEntity != oldDiscountLimitEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY, oldDiscountLimitEntity, discountLimitEntity));
			}
		}
		return discountLimitEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountLimitEntity basicGetDiscountLimitEntity() {
		return discountLimitEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscountLimitEntity(DiscountLimitEntity newDiscountLimitEntity) {
		DiscountLimitEntity oldDiscountLimitEntity = discountLimitEntity;
		discountLimitEntity = newDiscountLimitEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY, oldDiscountLimitEntity, discountLimitEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.DISCOUNT_ENTITY__CODE:
				return getCode();
			case PersistencePackage.DISCOUNT_ENTITY__NAME:
				return getName();
			case PersistencePackage.DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY:
				if (resolve) return getDiscountLimitEntity();
				return basicGetDiscountLimitEntity();
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
			case PersistencePackage.DISCOUNT_ENTITY__CODE:
				setCode((Integer)newValue);
				return;
			case PersistencePackage.DISCOUNT_ENTITY__NAME:
				setName((String)newValue);
				return;
			case PersistencePackage.DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY:
				setDiscountLimitEntity((DiscountLimitEntity)newValue);
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
			case PersistencePackage.DISCOUNT_ENTITY__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case PersistencePackage.DISCOUNT_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PersistencePackage.DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY:
				setDiscountLimitEntity((DiscountLimitEntity)null);
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
			case PersistencePackage.DISCOUNT_ENTITY__CODE:
				return code != CODE_EDEFAULT;
			case PersistencePackage.DISCOUNT_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PersistencePackage.DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY:
				return discountLimitEntity != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DiscountEntityImpl

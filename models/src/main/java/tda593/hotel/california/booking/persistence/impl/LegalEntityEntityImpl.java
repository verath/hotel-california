/**
 */
package tda593.hotel.california.booking.persistence.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.persistence.CreditCardInformationEntity;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;
import tda593.hotel.california.booking.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Entity Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl#getCreditCardInformationEntity <em>Credit Card Information Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "LegalEntities")
public class LegalEntityEntityImpl extends MinimalEObjectImpl.Container implements LegalEntityEntity {
	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreditCardInformationEntity() <em>Credit Card Information Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardInformationEntity()
	 * @generated
	 * @ordered
	 */
	@OneToOne(targetEntity = CreditCardInformationEntityImpl.class)
	protected CreditCardInformationEntity creditCardInformationEntity;

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
	@Id
	@GeneratedValue
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalEntityEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.LEGAL_ENTITY_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.LEGAL_ENTITY_ENTITY__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.LEGAL_ENTITY_ENTITY__EMAIL, oldEmail, email));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.LEGAL_ENTITY_ENTITY__CREDIT_CARD_INFORMATION_ENTITY, oldCreditCardInformationEntity, creditCardInformationEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.LEGAL_ENTITY_ENTITY__CREDIT_CARD_INFORMATION_ENTITY, oldCreditCardInformationEntity, creditCardInformationEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.LEGAL_ENTITY_ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.LEGAL_ENTITY_ENTITY__PHONE:
				return getPhone();
			case PersistencePackage.LEGAL_ENTITY_ENTITY__EMAIL:
				return getEmail();
			case PersistencePackage.LEGAL_ENTITY_ENTITY__CREDIT_CARD_INFORMATION_ENTITY:
				if (resolve) return getCreditCardInformationEntity();
				return basicGetCreditCardInformationEntity();
			case PersistencePackage.LEGAL_ENTITY_ENTITY__ID:
				return getId();
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
			case PersistencePackage.LEGAL_ENTITY_ENTITY__PHONE:
				setPhone((String)newValue);
				return;
			case PersistencePackage.LEGAL_ENTITY_ENTITY__EMAIL:
				setEmail((String)newValue);
				return;
			case PersistencePackage.LEGAL_ENTITY_ENTITY__CREDIT_CARD_INFORMATION_ENTITY:
				setCreditCardInformationEntity((CreditCardInformationEntity)newValue);
				return;
			case PersistencePackage.LEGAL_ENTITY_ENTITY__ID:
				setId((Integer)newValue);
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
			case PersistencePackage.LEGAL_ENTITY_ENTITY__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case PersistencePackage.LEGAL_ENTITY_ENTITY__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case PersistencePackage.LEGAL_ENTITY_ENTITY__CREDIT_CARD_INFORMATION_ENTITY:
				setCreditCardInformationEntity((CreditCardInformationEntity)null);
				return;
			case PersistencePackage.LEGAL_ENTITY_ENTITY__ID:
				setId(ID_EDEFAULT);
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
			case PersistencePackage.LEGAL_ENTITY_ENTITY__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case PersistencePackage.LEGAL_ENTITY_ENTITY__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case PersistencePackage.LEGAL_ENTITY_ENTITY__CREDIT_CARD_INFORMATION_ENTITY:
				return creditCardInformationEntity != null;
			case PersistencePackage.LEGAL_ENTITY_ENTITY__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (phone: ");
		result.append(phone);
		result.append(", email: ");
		result.append(email);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //LegalEntityEntityImpl

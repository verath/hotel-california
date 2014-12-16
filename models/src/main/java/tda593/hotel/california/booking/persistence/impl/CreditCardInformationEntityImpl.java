/**
 */
package tda593.hotel.california.booking.persistence.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.persistence.CreditCardInformationEntity;
import tda593.hotel.california.booking.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Card Information Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl#getCardHolder <em>Card Holder</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl#getExpirationDate <em>Expiration Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreditCardInformationEntityImpl extends MinimalEObjectImpl.Container implements CreditCardInformationEntity {
	/**
	 * The default value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected String cardNumber = CARD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardHolder() <em>Card Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardHolder()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_HOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardHolder() <em>Card Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardHolder()
	 * @generated
	 * @ordered
	 */
	protected String cardHolder = CARD_HOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationDate = EXPIRATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCardInformationEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.CREDIT_CARD_INFORMATION_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardNumber(String newCardNumber) {
		String oldCardNumber = cardNumber;
		cardNumber = newCardNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__CARD_NUMBER, oldCardNumber, cardNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardHolder() {
		return cardHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardHolder(String newCardHolder) {
		String oldCardHolder = cardHolder;
		cardHolder = newCardHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__CARD_HOLDER, oldCardHolder, cardHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(Date newExpirationDate) {
		Date oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__CARD_NUMBER:
				return getCardNumber();
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__CARD_HOLDER:
				return getCardHolder();
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__EXPIRATION_DATE:
				return getExpirationDate();
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
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__CARD_NUMBER:
				setCardNumber((String)newValue);
				return;
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__CARD_HOLDER:
				setCardHolder((String)newValue);
				return;
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__EXPIRATION_DATE:
				setExpirationDate((Date)newValue);
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
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__CARD_NUMBER:
				setCardNumber(CARD_NUMBER_EDEFAULT);
				return;
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__CARD_HOLDER:
				setCardHolder(CARD_HOLDER_EDEFAULT);
				return;
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
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
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__CARD_NUMBER:
				return CARD_NUMBER_EDEFAULT == null ? cardNumber != null : !CARD_NUMBER_EDEFAULT.equals(cardNumber);
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__CARD_HOLDER:
				return CARD_HOLDER_EDEFAULT == null ? cardHolder != null : !CARD_HOLDER_EDEFAULT.equals(cardHolder);
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
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
		result.append(" (cardNumber: ");
		result.append(cardNumber);
		result.append(", cardHolder: ");
		result.append(cardHolder);
		result.append(", expirationDate: ");
		result.append(expirationDate);
		result.append(')');
		return result.toString();
	}

} //CreditCardInformationEntityImpl

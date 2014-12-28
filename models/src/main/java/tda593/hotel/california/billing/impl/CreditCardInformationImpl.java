/**
 */
package tda593.hotel.california.billing.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.CreditCardInformation;

import tda593.hotel.california.booking.LegalEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Card Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.impl.CreditCardInformationImpl#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.CreditCardInformationImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.CreditCardInformationImpl#getCcv <em>Ccv</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.CreditCardInformationImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.CreditCardInformationImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.impl.CreditCardInformationImpl#getLegalEntity <em>Legal Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreditCardInformationImpl extends MinimalEObjectImpl.Container implements CreditCardInformation {
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
	 * The default value of the '{@link #getCcv() <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcv()
	 * @generated
	 * @ordered
	 */
	protected static final String CCV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcv() <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcv()
	 * @generated
	 * @ordered
	 */
	protected String ccv = CCV_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLegalEntity() <em>Legal Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalEntity()
	 * @generated
	 * @ordered
	 */
	protected LegalEntity legalEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCardInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.CREDIT_CARD_INFORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.CREDIT_CARD_INFORMATION__CARD_NUMBER, oldCardNumber, cardNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.CREDIT_CARD_INFORMATION__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcv() {
		return ccv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcv(String newCcv) {
		String oldCcv = ccv;
		ccv = newCcv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.CREDIT_CARD_INFORMATION__CCV, oldCcv, ccv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.CREDIT_CARD_INFORMATION__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.CREDIT_CARD_INFORMATION__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntity getLegalEntity() {
		if (legalEntity != null && legalEntity.eIsProxy()) {
			InternalEObject oldLegalEntity = (InternalEObject)legalEntity;
			legalEntity = (LegalEntity)eResolveProxy(oldLegalEntity);
			if (legalEntity != oldLegalEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BillingPackage.CREDIT_CARD_INFORMATION__LEGAL_ENTITY, oldLegalEntity, legalEntity));
			}
		}
		return legalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntity basicGetLegalEntity() {
		return legalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalEntity(LegalEntity newLegalEntity) {
		LegalEntity oldLegalEntity = legalEntity;
		legalEntity = newLegalEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.CREDIT_CARD_INFORMATION__LEGAL_ENTITY, oldLegalEntity, legalEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BillingPackage.CREDIT_CARD_INFORMATION__CARD_NUMBER:
				return getCardNumber();
			case BillingPackage.CREDIT_CARD_INFORMATION__EXPIRATION_DATE:
				return getExpirationDate();
			case BillingPackage.CREDIT_CARD_INFORMATION__CCV:
				return getCcv();
			case BillingPackage.CREDIT_CARD_INFORMATION__FIRST_NAME:
				return getFirstName();
			case BillingPackage.CREDIT_CARD_INFORMATION__LAST_NAME:
				return getLastName();
			case BillingPackage.CREDIT_CARD_INFORMATION__LEGAL_ENTITY:
				if (resolve) return getLegalEntity();
				return basicGetLegalEntity();
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
			case BillingPackage.CREDIT_CARD_INFORMATION__CARD_NUMBER:
				setCardNumber((String)newValue);
				return;
			case BillingPackage.CREDIT_CARD_INFORMATION__EXPIRATION_DATE:
				setExpirationDate((Date)newValue);
				return;
			case BillingPackage.CREDIT_CARD_INFORMATION__CCV:
				setCcv((String)newValue);
				return;
			case BillingPackage.CREDIT_CARD_INFORMATION__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case BillingPackage.CREDIT_CARD_INFORMATION__LAST_NAME:
				setLastName((String)newValue);
				return;
			case BillingPackage.CREDIT_CARD_INFORMATION__LEGAL_ENTITY:
				setLegalEntity((LegalEntity)newValue);
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
			case BillingPackage.CREDIT_CARD_INFORMATION__CARD_NUMBER:
				setCardNumber(CARD_NUMBER_EDEFAULT);
				return;
			case BillingPackage.CREDIT_CARD_INFORMATION__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case BillingPackage.CREDIT_CARD_INFORMATION__CCV:
				setCcv(CCV_EDEFAULT);
				return;
			case BillingPackage.CREDIT_CARD_INFORMATION__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case BillingPackage.CREDIT_CARD_INFORMATION__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case BillingPackage.CREDIT_CARD_INFORMATION__LEGAL_ENTITY:
				setLegalEntity((LegalEntity)null);
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
			case BillingPackage.CREDIT_CARD_INFORMATION__CARD_NUMBER:
				return CARD_NUMBER_EDEFAULT == null ? cardNumber != null : !CARD_NUMBER_EDEFAULT.equals(cardNumber);
			case BillingPackage.CREDIT_CARD_INFORMATION__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
			case BillingPackage.CREDIT_CARD_INFORMATION__CCV:
				return CCV_EDEFAULT == null ? ccv != null : !CCV_EDEFAULT.equals(ccv);
			case BillingPackage.CREDIT_CARD_INFORMATION__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case BillingPackage.CREDIT_CARD_INFORMATION__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case BillingPackage.CREDIT_CARD_INFORMATION__LEGAL_ENTITY:
				return legalEntity != null;
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
		result.append(", expirationDate: ");
		result.append(expirationDate);
		result.append(", ccv: ");
		result.append(ccv);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(')');
		return result.toString();
	}

} //CreditCardInformationImpl

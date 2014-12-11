/**
 */
package tda593.hotel.california.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.CaliforniaPackage;
import tda593.hotel.california.CreditCardInformation;
import tda593.hotel.california.LegalEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.impl.LegalEntityImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link tda593.hotel.california.impl.LegalEntityImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link tda593.hotel.california.impl.LegalEntityImpl#getCreditCardInformation <em>Credit Card Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LegalEntityImpl extends MinimalEObjectImpl.Container implements LegalEntity {
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
	 * The cached value of the '{@link #getCreditCardInformation() <em>Credit Card Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardInformation()
	 * @generated
	 * @ordered
	 */
	protected CreditCardInformation creditCardInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaliforniaPackage.Literals.LEGAL_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaliforniaPackage.LEGAL_ENTITY__PHONE, oldPhone, phone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaliforniaPackage.LEGAL_ENTITY__EMAIL, oldEmail, email));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaliforniaPackage.LEGAL_ENTITY__CREDIT_CARD_INFORMATION, oldCreditCardInformation, creditCardInformation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaliforniaPackage.LEGAL_ENTITY__CREDIT_CARD_INFORMATION, oldCreditCardInformation, creditCardInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Operation1() {
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
			case CaliforniaPackage.LEGAL_ENTITY__PHONE:
				return getPhone();
			case CaliforniaPackage.LEGAL_ENTITY__EMAIL:
				return getEmail();
			case CaliforniaPackage.LEGAL_ENTITY__CREDIT_CARD_INFORMATION:
				if (resolve) return getCreditCardInformation();
				return basicGetCreditCardInformation();
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
			case CaliforniaPackage.LEGAL_ENTITY__PHONE:
				setPhone((String)newValue);
				return;
			case CaliforniaPackage.LEGAL_ENTITY__EMAIL:
				setEmail((String)newValue);
				return;
			case CaliforniaPackage.LEGAL_ENTITY__CREDIT_CARD_INFORMATION:
				setCreditCardInformation((CreditCardInformation)newValue);
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
			case CaliforniaPackage.LEGAL_ENTITY__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case CaliforniaPackage.LEGAL_ENTITY__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case CaliforniaPackage.LEGAL_ENTITY__CREDIT_CARD_INFORMATION:
				setCreditCardInformation((CreditCardInformation)null);
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
			case CaliforniaPackage.LEGAL_ENTITY__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case CaliforniaPackage.LEGAL_ENTITY__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case CaliforniaPackage.LEGAL_ENTITY__CREDIT_CARD_INFORMATION:
				return creditCardInformation != null;
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
			case CaliforniaPackage.LEGAL_ENTITY___OPERATION1:
				Operation1();
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
		result.append(" (phone: ");
		result.append(phone);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //LegalEntityImpl

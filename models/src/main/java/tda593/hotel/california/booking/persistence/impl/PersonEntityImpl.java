/**
 */
package tda593.hotel.california.booking.persistence.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tda593.hotel.california.booking.persistence.PersistencePackage;
import tda593.hotel.california.booking.persistence.PersonEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.PersonEntityImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.PersonEntityImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.PersonEntityImpl#getSocialSecurityNumber <em>Social Security Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonEntityImpl extends LegalEntityEntityImpl implements PersonEntity {
	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocialSecurityNumber() <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialSecurityNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SOCIAL_SECURITY_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSocialSecurityNumber() <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialSecurityNumber()
	 * @generated
	 * @ordered
	 */
	protected String socialSecurityNumber = SOCIAL_SECURITY_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.PERSON_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSON_ENTITY__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSON_ENTITY__LASTNAME, oldLastname, lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocialSecurityNumber(String newSocialSecurityNumber) {
		String oldSocialSecurityNumber = socialSecurityNumber;
		socialSecurityNumber = newSocialSecurityNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSON_ENTITY__SOCIAL_SECURITY_NUMBER, oldSocialSecurityNumber, socialSecurityNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.PERSON_ENTITY__FIRSTNAME:
				return getFirstname();
			case PersistencePackage.PERSON_ENTITY__LASTNAME:
				return getLastname();
			case PersistencePackage.PERSON_ENTITY__SOCIAL_SECURITY_NUMBER:
				return getSocialSecurityNumber();
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
			case PersistencePackage.PERSON_ENTITY__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case PersistencePackage.PERSON_ENTITY__LASTNAME:
				setLastname((String)newValue);
				return;
			case PersistencePackage.PERSON_ENTITY__SOCIAL_SECURITY_NUMBER:
				setSocialSecurityNumber((String)newValue);
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
			case PersistencePackage.PERSON_ENTITY__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case PersistencePackage.PERSON_ENTITY__LASTNAME:
				setLastname(LASTNAME_EDEFAULT);
				return;
			case PersistencePackage.PERSON_ENTITY__SOCIAL_SECURITY_NUMBER:
				setSocialSecurityNumber(SOCIAL_SECURITY_NUMBER_EDEFAULT);
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
			case PersistencePackage.PERSON_ENTITY__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case PersistencePackage.PERSON_ENTITY__LASTNAME:
				return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
			case PersistencePackage.PERSON_ENTITY__SOCIAL_SECURITY_NUMBER:
				return SOCIAL_SECURITY_NUMBER_EDEFAULT == null ? socialSecurityNumber != null : !SOCIAL_SECURITY_NUMBER_EDEFAULT.equals(socialSecurityNumber);
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
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(", socialSecurityNumber: ");
		result.append(socialSecurityNumber);
		result.append(')');
		return result.toString();
	}

} //PersonEntityImpl

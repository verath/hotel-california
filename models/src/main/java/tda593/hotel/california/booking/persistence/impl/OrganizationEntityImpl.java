/**
 */
package tda593.hotel.california.booking.persistence.impl;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tda593.hotel.california.booking.persistence.OrganizationEntity;
import tda593.hotel.california.booking.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.OrganizationEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.OrganizationEntityImpl#getOrganizationNumber <em>Organization Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
@Table(name = "Organizations")
public class OrganizationEntityImpl extends LegalEntityEntityImpl implements OrganizationEntity {
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
	 * The default value of the '{@link #getOrganizationNumber() <em>Organization Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationNumber() <em>Organization Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationNumber()
	 * @generated
	 * @ordered
	 */
	protected String organizationNumber = ORGANIZATION_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ORGANIZATION_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ORGANIZATION_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationNumber() {
		return organizationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationNumber(String newOrganizationNumber) {
		String oldOrganizationNumber = organizationNumber;
		organizationNumber = newOrganizationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ORGANIZATION_ENTITY__ORGANIZATION_NUMBER, oldOrganizationNumber, organizationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.ORGANIZATION_ENTITY__NAME:
				return getName();
			case PersistencePackage.ORGANIZATION_ENTITY__ORGANIZATION_NUMBER:
				return getOrganizationNumber();
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
			case PersistencePackage.ORGANIZATION_ENTITY__NAME:
				setName((String)newValue);
				return;
			case PersistencePackage.ORGANIZATION_ENTITY__ORGANIZATION_NUMBER:
				setOrganizationNumber((String)newValue);
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
			case PersistencePackage.ORGANIZATION_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PersistencePackage.ORGANIZATION_ENTITY__ORGANIZATION_NUMBER:
				setOrganizationNumber(ORGANIZATION_NUMBER_EDEFAULT);
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
			case PersistencePackage.ORGANIZATION_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PersistencePackage.ORGANIZATION_ENTITY__ORGANIZATION_NUMBER:
				return ORGANIZATION_NUMBER_EDEFAULT == null ? organizationNumber != null : !ORGANIZATION_NUMBER_EDEFAULT.equals(organizationNumber);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", organizationNumber: ");
		result.append(organizationNumber);
		result.append(')');
		return result.toString();
	}

} //OrganizationEntityImpl

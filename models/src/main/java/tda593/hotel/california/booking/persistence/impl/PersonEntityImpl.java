/**
 */
package tda593.hotel.california.booking.persistence.impl;

import javax.persistence.Entity;
import javax.persistence.Table;

import tda593.hotel.california.booking.persistence.PersonEntity;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Person Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.PersonEntityImpl#getFirstname
 * <em>Firstname</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.PersonEntityImpl#getLastname
 * <em>Lastname</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.PersonEntityImpl#getSocialSecurityNumber
 * <em>Social Security Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generatedNOT
 */
@Entity
@Table(name = "Persons")
public class PersonEntityImpl extends LegalEntityEntityImpl implements
		PersonEntity {

	private String firstname;

	private String lastname;

	private String socialSecurityNumber;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PersonEntityImpl() {
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
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

} // PersonEntityImpl

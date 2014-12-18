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

import tda593.hotel.california.booking.persistence.CreditCardInformationEntity;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Legal Entity Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl#getPhone
 * <em>Phone</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl#getEmail
 * <em>Email</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl#getCreditCardInformationEntity
 * <em>Credit Card Information Entity</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl#getId
 * <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generatedNOT
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "LegalEntities")
public class LegalEntityEntityImpl implements LegalEntityEntity {

	private String phone;

	private String email;

	@OneToOne(targetEntity = CreditCardInformationEntityImpl.class)
	private CreditCardInformationEntity creditCardInformationEntity;

	@Id
	@GeneratedValue
	private int id;

	public LegalEntityEntityImpl() {
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CreditCardInformationEntity getCreditCardInformationEntity() {
		return creditCardInformationEntity;
	}

	public void setCreditCardInformationEntity(
			CreditCardInformationEntity creditCardInformationEntity) {
		this.creditCardInformationEntity = creditCardInformationEntity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
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

} // LegalEntityEntityImpl

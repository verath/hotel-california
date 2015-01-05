/**
 */
package tda593.hotel.california.billing.persistence.impl;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import tda593.hotel.california.billing.persistence.CreditCardInformationEntity;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;
import tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Credit Card Information Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl#getCardNumber
 * <em>Card Number</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl#getCardHolder
 * <em>Card Holder</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl#getExpirationDate
 * <em>Expiration Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generatedNOT
 */
@Entity
public class CreditCardInformationEntityImpl implements
		CreditCardInformationEntity {

	@Id
	private String cardNumber;

	private String ccv;

	private String firstName;
	private String lastName;

	private Date expirationDate;

	@OneToOne(targetEntity = LegalEntityEntityImpl.class, cascade = CascadeType.ALL)
	private LegalEntityEntity owner;
	
	public CreditCardInformationEntityImpl() {
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getCcv() {
		return ccv;
	}

	public void setCcv(String ccv) {
		this.ccv = ccv;
	}

	public void setFirstName(String cardHolder) {
		this.firstName = cardHolder;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cardNumber: ");
		result.append(cardNumber);
		result.append(", cardHolder: ");
		result.append(firstName);
		result.append(", expirationDate: ");
		result.append(expirationDate);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String value) {
		lastName = value;
	}

	@Override
	public LegalEntityEntity getOwner() {
		return owner;
	}

	@Override
	public void setOwner(LegalEntityEntity owner) {
		this.owner = owner;
	}

} // CreditCardInformationEntityImpl

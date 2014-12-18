/**
 */
package tda593.hotel.california.booking.persistence.impl;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import tda593.hotel.california.booking.persistence.CreditCardInformationEntity;

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

	private String cardHolder;

	private Date expirationDate;

	public CreditCardInformationEntityImpl() {
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
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
		result.append(cardHolder);
		result.append(", expirationDate: ");
		result.append(expirationDate);
		result.append(')');
		return result.toString();
	}

} // CreditCardInformationEntityImpl

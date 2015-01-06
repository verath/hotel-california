package tda593.hotel.california.integration.mock.banking;

import tda593.hotel.california.billing.impl.BankingManagerImplImpl;

import java.util.Map;

/**
 * Created by Peter on 2014-12-30.
 */
public class MockBankingManager extends BankingManagerImplImpl {
	private final Map<String, CreditCardData> creditCardsDB;

	MockBankingManager(Map<String, CreditCardData> creditCardsDB) {
		this.creditCardsDB = creditCardsDB;
	}

	@Override
	public boolean makePayment(String ccNumber, String ccv, int expiryMonth,
			int expiryYear, String firstName, String lastName, double sum) {
		if (!isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear,
				firstName, lastName)) {
			return false;
		}

		CreditCardData creditCardData = creditCardsDB.get(ccNumber);
		double remainingBalance = creditCardData.getBalance() - sum;

		if (remainingBalance >= 0) {
			creditCardData.setBalance(remainingBalance);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isCreditCardValid(String ccNumber, String ccv,
			int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: Should also check parameters and make sure year/month is valid
		// etc.
		return creditCardsDB.containsKey(ccNumber);
	}
}

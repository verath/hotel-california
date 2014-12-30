package tda593.hotel.california.integration.mock.banking;

import tda593.hotel.california.integration.TestAdminBankingManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Peter on 2014-12-28.
 */
public class MockTestAdminBankingManager extends TestAdminBankingManager {

	private final Map<String, CreditCardData> creditCardsDB = new HashMap<>();

	@Override
	public double makeDeposit(String ccNumber, String ccv, int expiryMonth,
			int expiryYear, String firstName, String lastName, double sum) {
		if (!creditCardsDB.containsKey(ccNumber)) {
			return -1;
		}

		CreditCardData ccData = creditCardsDB.get(ccNumber);
		ccData.setBalance(ccData.getBalance() + sum);
		return ccData.getBalance();
	}

	@Override
	public boolean addCreditCard(String ccNumber, String ccv, int expiryMonth,
			int expiryYear, String firstName, String lastName) {
		if (creditCardsDB.containsKey(ccNumber)) {
			return false;
		} else {
			CreditCardData ccData = new CreditCardData(ccv, expiryMonth,
					expiryYear, firstName, lastName, 0.0);
			creditCardsDB.put(ccNumber, ccData);
			return true;
		}
	}

	@Override
	public boolean removeCreditCard(String ccNumber, String ccv,
			int expiryMonth, int expiryYear, String firstName, String lastName) {
		if (!creditCardsDB.containsKey(ccNumber)) {
			return false;
		} else {
			creditCardsDB.remove(ccNumber);
			return true;
		}
	}

	@Override
	public double getBalance(String ccNumber, String ccv, int expiryMonth,
			int expiryYear, String firstName, String lastName) {
		if (!creditCardsDB.containsKey(ccNumber)) {
			return -1;
		} else {
			return creditCardsDB.get(ccNumber).getBalance();
		}

	}

	public MockBankingManager getBankingManager() {
		return new MockBankingManager(creditCardsDB);
	}

}

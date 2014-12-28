package tda593.hotel.california.integration.mock;

import tda593.hotel.california.billing.impl.BankingManagerImplImpl;
import tda593.hotel.california.integration.TestAdminBankingManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Peter on 2014-12-28.
 */
public class MockTestAdminBankingManager extends TestAdminBankingManager {

    private final Map<String, Double> ccBalance = new HashMap<>();

    @Override
    public double makeDeposit(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum) {
        if(!ccBalance.containsKey(ccNumber)) {
            return -1;
        }

        return ccBalance.put(ccNumber, ccBalance.get(ccNumber) + sum);
    }

    @Override
    public boolean addCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
        if(ccBalance.containsKey(ccNumber)) {
            return false;
        } else {
            ccBalance.put(ccNumber, 0.0);
        }
        return true;
    }

    @Override
    public boolean removeCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
        if(!ccBalance.containsKey(ccNumber)) {
            return false;
        } else {
            ccBalance.remove(ccNumber);
            return true;
        }
    }

    @Override
    public double getBalance(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
        Double balance = ccBalance.get(ccNumber);
        if(balance != null) {
            return balance;
        } else {
            return 0;
        }
    }

    public MockBankingManager getBankingManager() {
        return new MockBankingManager();
    }


    public class MockBankingManager extends BankingManagerImplImpl {
        private final Map<String, Double> ccBalance;

        MockBankingManager() {
            this.ccBalance = MockTestAdminBankingManager.this.ccBalance;
        }

        @Override
        public boolean makePayment(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum) {
            if(!ccBalance.containsKey(ccNumber)) {
                return false;
            }
            double balance = ccBalance.get(ccNumber);

            if(balance >= sum) {
                balance -= sum;
                ccBalance.put(ccNumber, balance);
                return true;
            } else {
                return false;
            }
        }

        @Override
        public boolean isCreditCardValid(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
            return ccBalance.containsKey(ccNumber);
        }
    }
}

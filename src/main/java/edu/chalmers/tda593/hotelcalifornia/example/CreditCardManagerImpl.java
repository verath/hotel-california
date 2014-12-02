package edu.chalmers.tda593.hotelcalifornia.example;

/**
 * An implementation of the CreditCardManager interface. This is the
 * class Guice will instantiate and inject into our BillingService, as
 * configured in the BillingModule.
 */
public class CreditCardManagerImpl implements CreditCardManager {
    @Override
    public void doPayment(String ccNumber, double sum) {
        System.out.println(sum + " has been taken from CreditCard " + ccNumber);
    }

    @Override
    public boolean isValid(String ccNumber) {
        return ccNumber.length() == 12;
    }
}

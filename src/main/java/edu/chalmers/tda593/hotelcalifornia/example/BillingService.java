package edu.chalmers.tda593.hotelcalifornia.example;

import com.google.inject.Inject;

/**
 * An example class using a dependency injected via Guice. Note
 * that this class can also be created manually, meaning it can
 * be easily tested.
 */
public class BillingService {
    private final CreditCardManager creditCardManager;

    @Inject
    public BillingService(CreditCardManager creditCardManager) {
        this.creditCardManager = creditCardManager;
    }

    public void bill(String ccNumber, double cost) {
        if (creditCardManager.isValid(ccNumber)) {
            creditCardManager.doPayment(ccNumber, cost);
        }
    }
}

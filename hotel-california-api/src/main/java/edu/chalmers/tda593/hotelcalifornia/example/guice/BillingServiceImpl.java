package edu.chalmers.tda593.hotelcalifornia.example.guice;

import com.google.inject.Inject;

/**
 * An example class using a dependency injected via Guice. Note
 * that this class can also be created manually, meaning it can
 * be easily tested.
 */
class BillingServiceImpl implements BillingService {
    private final CreditCard creditCard;

    @Inject
    public BillingServiceImpl(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void bill(String ccNumber, double cost) {
        if (creditCard.isValid(ccNumber)) {
            creditCard.doPayment(ccNumber, cost);
        }
    }
}

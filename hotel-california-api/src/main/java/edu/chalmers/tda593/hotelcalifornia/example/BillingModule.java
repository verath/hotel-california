package edu.chalmers.tda593.hotelcalifornia.example;

import com.google.inject.AbstractModule;

/**
 * Configuration class for Guice.
 * @See https://github.com/google/guice/wiki/Bindings
 */
class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        // Bind CreditCardManager to CreditCardManagerImpl, meaning
        // anytime Guice sees CreditCardManager it will inject an instance
        // of CreditCardManagerImpl.
        bind(CreditCard.class).to(CreditCardImpl.class);
    }
}

package edu.chalmers.tda593.hotelcalifornia.example;

import com.google.inject.AbstractModule;

/**
 * Configuration class for Guice.
 * @See https://github.com/google/guice/wiki/Bindings
 */
public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        // Bind CreditCardManager to CreditCardManagerImpl, meaning
        // anytime Guice sees CreditCardManager it will inject an instance
        // of CreditCardManagerImpl.
        bind(CreditCardManager.class).to(CreditCardManagerImpl.class);
    }
}

package edu.chalmers.tda593.hotelcalifornia.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Example component interface, exposing a billing service.
 */
public class ExampleComponent {

    private ExampleComponent() {
    }

    public static BillingService getBillingService() {
        // A Guice injector configured via a BillingModule object.
        Injector injector = Guice.createInjector(new BillingModule());

        // Use the Guice injector to get an instance of the BillingService class.
        // This automatically creates the dependencies required for BillingService
        // and injects those into the BillingService.
        return injector.getInstance(BillingServiceImpl.class);
    }
}

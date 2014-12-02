package edu.chalmers.tda593.hotelcalifornia.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        // A Guice injector configured via a BillingModule object.
        Injector injector = Guice.createInjector(new BillingModule());

        // Use the Guice injector to get an instance of the BillingService class.
        // This automatically creates the dependencies required for BillingService
        // and injects those into the BillingService.
        BillingService billingService = injector.getInstance(BillingService.class);

        // We not have an instance of the BillingService without us ever calling new.
        billingService.bill("123456789012", 3.14);
    }
}

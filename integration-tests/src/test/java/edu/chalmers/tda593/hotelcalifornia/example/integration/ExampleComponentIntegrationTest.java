package edu.chalmers.tda593.hotelcalifornia.example.integration;

import edu.chalmers.tda593.hotelcalifornia.example.BillingService;
import edu.chalmers.tda593.hotelcalifornia.example.ExampleComponent;
import org.junit.Before;
import org.junit.Test;

public class ExampleComponentIntegrationTest {

    private BillingService billingService;

    @Before
    public void setUp() throws Exception {
        billingService = ExampleComponent.getBillingService();
    }

    @Test
    public void testWorkingBillingServiceIsProvided() throws Exception {
        billingService.bill("133", 20);
    }
}

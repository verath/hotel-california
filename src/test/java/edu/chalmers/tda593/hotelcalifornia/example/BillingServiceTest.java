package edu.chalmers.tda593.hotelcalifornia.example;

import edu.chalmers.tda593.hotelcalifornia.example.BillingService;
import edu.chalmers.tda593.hotelcalifornia.example.CreditCardManager;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * A test class using mockito to mock the dependencies. Used so that we
 * can isolate the class under test.
 *
 * {@see https://github.com/mockito/mockito/blob/master/README.md}
 */
public class BillingServiceTest {

    private BillingService billingService;
    private CreditCardManager creditCardManagerMock;

    @Before
    public void setUp() throws Exception {
        creditCardManagerMock = mock(CreditCardManager.class);
        billingService = new BillingService(creditCardManagerMock);
    }

    @Test
    public void testBillVerifiesCardBeforePayment() throws Exception {
        billingService.bill("123", 1);
        verify(creditCardManagerMock).isValid("123");
    }

    @Test
    public void testBillDoesNotContinueOnInvalidCreditCard() throws Exception {
        when(creditCardManagerMock.isValid("123")).thenReturn(false);
        billingService.bill("123", 2);
        verify(creditCardManagerMock, never()).doPayment("123", 2);
    }
}
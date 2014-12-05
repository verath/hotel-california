package edu.chalmers.tda593.hotelcalifornia.example;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * A test class using mockito to mock the dependencies. Used so that we
 * can isolate the class under test.
 *
 * {@see https://github.com/mockito/mockito/blob/master/README.md}
 */
public class BillingServiceImplTest {

    private BillingServiceImpl billingService;
    private CreditCard creditCardMock;

    @Before
    public void setUp() throws Exception {
        creditCardMock = mock(CreditCard.class);
        billingService = new BillingServiceImpl(creditCardMock);
    }

    @Test
    public void testBillVerifiesCardBeforePayment() throws Exception {
        billingService.bill("123", 1);
        verify(creditCardMock).isValid("123");
    }

    @Test
    public void testBillDoesNotContinueOnInvalidCreditCard() throws Exception {
        when(creditCardMock.isValid("123")).thenReturn(false);
        billingService.bill("123", 2);
        verify(creditCardMock, never()).doPayment("123", 2);
    }
}
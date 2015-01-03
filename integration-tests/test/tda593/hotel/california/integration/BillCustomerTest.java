package tda593.hotel.california.integration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import tda593.hotel.california.billing.AdminDiscountManager;
import tda593.hotel.california.billing.AdminServiceManager;
import tda593.hotel.california.billing.BankingManager;
import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.CreditCardInformation;
import tda593.hotel.california.billing.CreditCardManager;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.Service;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Organization;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.facilities.AdminRoomManager;

public class BillCustomerTest extends AbstractHotelCaliforniaIntegrationTest {

	private BillManager billManager;
	private LegalEntityManager legalEntityManager;
	private CreditCardManager creditCardManager;
	private BankingManager bankingManager;
	private TestAdminBankingManager adminBankingManager;
	private AdminServiceManager adminServiceManager;
	private AdminDiscountManager discountManager;
	
	private Calendar c = Calendar.getInstance();
	
	private Service bananas, champagne;
	private Person customer1;
	private Organization customer2;
	private String validCreditCardNumber = "2190 8910 1029 8908 6752";
	private String validCCV = "902";
	private String validFirstName = "Bob", validLastName = "Smith";
	private Date validDate;
	
	@Before
	public void setUpData() {
		legalEntityManager = managersHandler.getLegalEntityManager();
		creditCardManager = managersHandler.getCreditCardManager();
		bankingManager = managersHandler.getBankingManager();
		billManager = managersHandler.getBillManager();
		adminBankingManager = managersHandler.getTestAdminBankingManager();
		adminServiceManager = managersHandler.getAdminServiceManager();
		discountManager = managersHandler.getAdminDiscountManager();
		
		LegalEntityManager legalEntityManager = managersHandler.getLegalEntityManager();
		AdminRoomManager adminRoomManager = managersHandler.getAdminRoomManager();

		// Create some entities
		customer1 = legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");
		customer2 = legalEntityManager.createOrganization("The uber company", "819201-9190", "031938201", "theone@uber.com");
		
		// Add valid create credit cards for the entities
		c.set(2019, 8, 1);
		adminBankingManager.addCreditCard("3019 0189 0120 8190 9281", "980", c.get(Calendar.MONDAY), c.get(Calendar.YEAR), customer1.getFirstname(), 
				customer1.getLastname());
		
		c.set(2018, 9, 1);
		validDate = c.getTime();
		adminBankingManager.addCreditCard(validCreditCardNumber, validCCV, c.get(Calendar.MONDAY), c.get(Calendar.YEAR), 
				validFirstName, validLastName);
		
		// set valid info for customer1
		creditCardManager.setCreditCardInformation(customer1, customer1.getFirstname(), customer1.getLastname(), 
				"3019 0189 0120 8190 9281", "980", c.getTime(), bankingManager);

		
		// Set up some services
		bananas = adminServiceManager.createService("Bananas", 12.250);
		champagne = adminServiceManager.createService("Champagne", 99.99);
		
	}
	
	/**
	 * This is the main flow of the use case: Bill Customer
	 */
	@Test
	public void testBillCustomer() {
		// Purchase some items
		Bill bill = billManager.createBill(customer1);
		billManager.billItem(bill, 3, bananas);
		billManager.billItem(bill, 1, champagne);
		
		// Assume: there is at least one chosen unpublished bill.
		// Assume: Actor does not enter discounts 
		// System publishes the bill and displays a screen with a summary of the bill to be paid (receipt).
		billManager.publishBill(bill);
		assertTrue(bill.isPublished());
		
		// Actor chooses to pay immediately.
		// Insert deposit to check balance after payment
		CreditCardInformation cc = creditCardManager.getCreditCardInformation(bill.getCustomer());
		c.setTime(cc.getExpirationDate());
		double accountBalance = bill.getPrice() + 100;
		adminBankingManager.makeDeposit(cc.getCardNumber(), cc.getCcv(), 
				c.get(Calendar.MONTH), c.get(Calendar.YEAR), cc.getFirstName(), cc.getLastName(), accountBalance);
		
		assertTrue(billManager.markBillAsPaid(bill, true, bankingManager, creditCardManager));
		
		// Verify that the right amount has been charged
		assertTrue(accountBalance - bill.getPrice() == adminBankingManager.getBalance(cc.getCardNumber(), cc.getCcv(), 
				c.get(Calendar.MONTH), c.get(Calendar.YEAR), cc.getFirstName(), cc.getLastName()));
		
	}
	
	/**
	 * This is the alternative flow: No chosen bill
	 */
	@Test
	public void testBillCustomerNoChosenBill() {
		// Add a published bill
		Bill unknownBill = billManager.createBill(customer1);
		billManager.billItem(unknownBill, 19, bananas);
		billManager.billItem(unknownBill, 2, champagne);
		billManager.publishBill(unknownBill);
		
		// Add an unpublished bill
		unknownBill = billManager.createBill(customer1);
		billManager.billItem(unknownBill, 8, bananas);
		billManager.billItem(unknownBill, 10, champagne);
		
		// Let's pretend that we have no knowledge about the bill above.
		// System asks the actor for a name to search for, in order to find the customer.
		// Actor enters a name.
		List<Person> results = legalEntityManager.findPerson(customer1.getFirstname(), customer1.getLastname());
		assertTrue(results.size() > 0);
		// Actor chooses one of the customers from the list
		LegalEntity customer = results.get(0);
		
		// System finds and displays all unpaid bills that are not sub-bills that are connected to the customer.
		List<Bill> billResults = billManager.getBills(customer);
		// Assume: there is at least one unpaid bill
		// Alternative flow here: System notifies that there are no unpaid bills -> Exit
		int unpaidBillsAmount = 0;
		for (Bill b : billResults) {
			if(!b.isPaid() && b.isPublished()) {
				unpaidBillsAmount++;
			}
		}
		
		// Check that only the published bill gets counted
		assertTrue(unpaidBillsAmount == 1);
		
		// Actor chooses one of the bills should be published.
		Bill bill = billResults.get(0);
		
		// And back to the main flow....
	}

	
	/**
	 * This is the alternative flow: Actor does want to enter discounts
	 */
	@Test
	public void testBillCustomerWithDiscount() {
		// Purchase some items
		Bill bill = billManager.createBill(customer1);
		billManager.billItem(bill, 1, bananas);
		billManager.billItem(bill, 7, champagne);
		double priceBeforeDiscount = bill.getPrice();
		
		// Create some discounts
		String percentageCode = "DISCOUNT10PERCENT";
		discountManager.addPercentageDiscount(percentageCode, "10% off only until 31rd January", 0.1f);
		
		// Assume: there is at least one chosen unpublished bill.
		// Actor enters discount codes
		// Assume: Discount codes are valid. IF not system notifies -> try again OR exit use case
		Discount percentageDiscount = discountManager.getDiscount(percentageCode);

		billManager.applyDiscount(percentageDiscount, bill);
		
		billManager.publishBill(bill);
		assertTrue(bill.isPublished());
		
		double priceAfterDiscount = bill.getPrice();
		assertTrue(priceAfterDiscount < priceBeforeDiscount*(1-0.1f) + 0.0000001f &&
				priceAfterDiscount > priceBeforeDiscount*(1-0.1f) - 0.0000001f);
		
		// And back to the main flow...
	}
	
	/**
	 * This is the alternative flow: Money withdrawn failed.
	 */
	@Test
	public void testBillCustomerWhenMoneyWithdrawalFails() {
		// Add bill for customer 2 which has no valid credit card 
		Bill bill = billManager.createBill(customer2);
		billManager.billItem(bill, 9, bananas);
		billManager.billItem(bill, 90, champagne);
		
		// Assume: there is at least one chosen unpublished bill.
		// Assume: Actor does not enter discounts 
		// System publishes the bill and displays a screen with a summary of the bill to be paid (receipt).
		billManager.publishBill(bill);
		assertTrue(bill.isPublished());
		
		// Actor chooses to pay immediately and fails
		assertFalse(billManager.markBillAsPaid(bill, true, bankingManager, creditCardManager));
		// System alerts the actor that the payment didn’t succeed and ask if it should try again
		// Assume: actor wants to try to make payment again with the same credit card information
		assertFalse(billManager.markBillAsPaid(bill, true, bankingManager, creditCardManager));
		
		// Lets assume actor wants to try with a different credit card
		assertTrue(creditCardManager.setCreditCardInformation(bill.getCustomer(), 
				validFirstName, validLastName, validCreditCardNumber, validCCV, 
				validDate, bankingManager));
		
		// Insert deposit to check balance after payment
		CreditCardInformation cc = creditCardManager.getCreditCardInformation(bill.getCustomer());
		assertTrue(cc != null);
		c.setTime(cc.getExpirationDate());
		double accountBalance = bill.getPrice();
		adminBankingManager.makeDeposit(cc.getCardNumber(), cc.getCcv(), 
				c.get(Calendar.MONTH), c.get(Calendar.YEAR), cc.getFirstName(), cc.getLastName(), accountBalance);
		
		// Now the payment should succeed
		assertTrue(billManager.markBillAsPaid(bill, true, bankingManager, creditCardManager));
		
		// Verify that the right amount has been charged
		assertTrue(accountBalance - bill.getPrice() == adminBankingManager.getBalance(cc.getCardNumber(), cc.getCcv(), 
				c.get(Calendar.MONTH), c.get(Calendar.YEAR), cc.getFirstName(), cc.getLastName()));
		
	}
}

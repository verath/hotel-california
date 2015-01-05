package tda593.hotel.california.integration;

import static org.junit.Assert.*;

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
import tda593.hotel.california.billing.Service;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Organization;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.facilities.AdminRoomManager;

public class BillingRelatedTest extends AbstractHotelCaliforniaIntegrationTest {
	private BillManager billManager;
	private LegalEntityManager legalEntityManager;
	private CreditCardManager creditCardManager;
	private BankingManager bankingManager;
	private AdminServiceManager adminServiceManager;
	private TestAdminBankingManager adminBankingManager;
	
	private Calendar c = Calendar.getInstance();
	
	private Service bananas, champagne, peanuts;
	private Person customer1;
	private Organization customer2;
	
	@Before
	public void setUpData() {
		legalEntityManager = managersHandler.getLegalEntityManager();
		creditCardManager = managersHandler.getCreditCardManager();
		bankingManager = managersHandler.getBankingManager();
		billManager = managersHandler.getBillManager();
		adminBankingManager = managersHandler.getTestAdminBankingManager();	
		adminServiceManager = managersHandler.getAdminServiceManager();
		
		// Create some entities
		customer1 = legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");
		customer2 = legalEntityManager.createOrganization("The uber company", "819201-9190", "031938201", "theone@uber.com");
	
		c.set(19, 8, 1);
		adminBankingManager.addCreditCard("3019 0189 0120 8190 9281", "980", c.get(Calendar.MONTH), c.get(Calendar.YEAR), customer1.getFirstname(),
				customer1.getLastname());
		
		// set valid info for customer1
		creditCardManager.setCreditCardInformation(customer1, customer1.getFirstname(), customer1.getLastname(), 
				"3019 0189 0120 8190 9281", "980", c.getTime(), bankingManager);
		
		// Set up some services
		bananas = adminServiceManager.createService("Bananas", 12.250);
		champagne = adminServiceManager.createService("Champagne", 99.99);
		peanuts = adminServiceManager.createService("Peanuts", 19.75);
	}

	/**
	 * Test for FR #018 "A receptionist should be able to view what a customer owes."
	 */
	@Test
	public void testGetWhatCustomerOwes() {
		// Create one unpublished and unpaid bill
		Bill bill1 = billManager.createBill(customer1);
		billManager.billItem(bill1, 9, bananas);
		billManager.billItem(bill1, 1, peanuts);
		double bill1Sum = bill1.getPrice();
		
		// Create one published and unpaid bill
		Bill bill2 = billManager.createBill(customer1);
		billManager.billItem(bill2, 1, champagne);
		billManager.billItem(bill2, 4, peanuts);
		billManager.publishBill(bill2);
		double bill2Sum = bill2.getPrice();
		
		// Create one published and paid bill
		Bill bill3 = billManager.createBill(customer1);
		billManager.billItem(bill3, 2, champagne);
		billManager.publishBill(bill3);
		CreditCardInformation cc = creditCardManager.getCreditCardInformation(bill3.getCustomer());
		Date exp = cc.getExpirationDate();
		c.setTime(exp);
		adminBankingManager.makeDeposit(cc.getCardNumber(), cc.getCcv(), 
				c.get(Calendar.MONTH), c.get(Calendar.YEAR), cc.getFirstName(), cc.getLastName(), bill3.getPrice());
		assertTrue(billManager.markBillAsPaid(bill3, true, bankingManager, creditCardManager));
		
		
		// Retrieved the unpaid bills and check that the result contains only the two unpaid bills
		List<Bill> unpaidBills = billManager.getUnpaidBills(customer1);	
		assertEquals(unpaidBills.size(), 2);
		assertTrue(unpaidBills.get(0).getId() == bill1.getId() || unpaidBills.get(0).getId() == bill2.getId());
		
		if(unpaidBills.get(0).getId() == bill1.getId()) {
			assertTrue(unpaidBills.get(1).getId() == bill2.getId());
		} else {
			assertTrue(unpaidBills.get(1).getId() == bill1.getId());
		}
		
		// This would be what the user would se
		double totalDue = 0;
		for(Bill b : unpaidBills) {
			totalDue += b.getPrice();
		}
		
		assertTrue(totalDue == bill1Sum + bill2Sum);
	}

}

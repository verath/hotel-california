package tda593.hotel.california.integration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tda593.hotel.california.billing.AdminDiscountManager;
import tda593.hotel.california.billing.AdminServiceManager;
import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillManager;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.Service;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;

public class ApplyDiscountTest extends AbstractHotelCaliforniaIntegrationTest {

	private BillManager billManager;
	private AdminServiceManager adminServiceManager;
	private AdminDiscountManager discountManager;
		
	private Service bananas, champagne;
	private Person customer;
	
	@Before
	public void setUpData() {
		billManager = managersHandler.getBillManager();
		adminServiceManager = managersHandler.getAdminServiceManager();
		discountManager = managersHandler.getAdminDiscountManager();
		
		LegalEntityManager legalEntityManager = managersHandler.getLegalEntityManager();
		
		// Create a customer
		customer = legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");	
		
		// Set up some services
		bananas = adminServiceManager.createService("Bananas", 12.250);
		champagne = adminServiceManager.createService("Champagne", 99.99);

	}
	
	/**
	 *  Test to apply percentage discount
	 */
	@Test
	public void testPercentageDiscount() {
		// Purchase some items
		Bill bill = billManager.createBill(customer);
		billManager.billItem(bill, 1, bananas);
		billManager.billItem(bill, 7, champagne);
		double priceBeforeDiscount = bill.getPrice();
		
		// Create some discounts
		String percentage10Code = "DISCOUNT10PERCENT";
		discountManager.addPercentageDiscount(percentage10Code, "10% off only until 31rd January", 0.1f);
		
		// Assume: Discount codes are valid. IF not system notifies -> try again OR exit use case
		Discount percentage10Discount = discountManager.getDiscount(percentage10Code);

		billManager.applyDiscount(percentage10Discount, bill);
		
		billManager.publishBill(bill);
		assertTrue(bill.isPublished());
		
		double priceAfterDiscount = bill.getPrice();
		assertTrue(priceAfterDiscount < priceBeforeDiscount*(1-0.1f) + 0.0000001f && 
				priceAfterDiscount > priceBeforeDiscount*(1-0.1f) - 0.0000001f);
	}
	
	/**
	 *  Test to apply sum discount
	 */
	@Test
	public void testSumDiscount() {
		// Purchase some items
		Bill bill = billManager.createBill(customer);
		billManager.billItem(bill, 1, bananas);
		billManager.billItem(bill, 7, champagne);
		double priceBeforeDiscount = bill.getPrice();
		
		// Create some discounts		
		String sum1Code = "DISCOUNT1SEK";
		discountManager.addSumDiscount(sum1Code, "1 kr off only until 31rd January", 15);
				
		// Assume: Discount codes are valid. IF not system notifies -> try again OR exit use case
		Discount sum1Discount = discountManager.getDiscount(sum1Code);

		billManager.applyDiscount(sum1Discount, bill);
		
		billManager.publishBill(bill);
		assertTrue(bill.isPublished());
		
		double priceAfterDiscount = bill.getPrice();
		
		assertTrue(priceBeforeDiscount-15 == priceAfterDiscount);
	}
	
	/**
	 *  Test to apply sum discount with discount > price
	 */
	@Test
	public void testSumDiscountWithDiscountExceedingPrice() {
		// Purchase some items
		Bill bill = billManager.createBill(customer);
		billManager.billItem(bill, 1, bananas);
		billManager.billItem(bill, 7, champagne);
		
		// Create some discounts		
		String sum1000Code = "DISCOUNT10SEK";
		discountManager.addSumDiscount(sum1000Code, "10 kr off only until 31rd January", 1000);
		
		// Assume: Discount codes are valid. IF not system notifies -> try again OR exit use case
		Discount sum1000Discount = discountManager.getDiscount(sum1000Code);

		billManager.applyDiscount(sum1000Discount, bill);
		
		billManager.publishBill(bill);
		assertTrue(bill.isPublished());
		
		double priceAfterDiscount = bill.getPrice();
				
		assertTrue(0 == priceAfterDiscount);
	}
	
}

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
import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingManager;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Organization;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.RoomType;

public class RegisterPurchaseTest extends AbstractHotelCaliforniaIntegrationTest {

	private BillManager billManager;
	private LegalEntityManager legalEntityManager;
	private CreditCardManager creditCardManager;
	private BankingManager bankingManager;
	private TestAdminBankingManager adminBankingManager;
	private AdminServiceManager adminServiceManager;
	private AdminDiscountManager discountManager;
	private BookingManager bookingManager;
	
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
		bookingManager = managersHandler.getBookingManager();
		
		LegalEntityManager legalEntityManager = managersHandler.getLegalEntityManager();
		AdminRoomManager adminRoomManager = managersHandler.getAdminRoomManager();

		// Create room type
		adminRoomManager.addRoomType("RoomType1", "", null, 1);
		RoomType roomType = adminRoomManager.getRoomTypes().get(0);
		
		// Create a room
		adminRoomManager.addGuestRoom(1+"1", 1, "N/A", null, null, roomType, 2, 0);
		
		// Create a customer
		customer1 = legalEntityManager.createPerson("Thomas", "Anderson", "1", "0712345678", "neo@matrix.com");	
		
		// Set up some services
		bananas = adminServiceManager.createService("Bananas", 12.250);
		champagne = adminServiceManager.createService("Champagne", 99.99);
		
		// Create a booking
		c.set(2015, 5, 10);
		Date from = c.getTime();
		c.set(2015, 5, 14);
		Date to = c.getTime();
		
		bookingManager.createBooking(from, to, legalEntityManager.getPerson("1"), roomType);
	}

	/**
	 * This is more or less main flow of the use case: Register purchase
	 */
	@Test
	public void testRegisterPurchase() {
		// System asks for a room number.
		// Actor enters the room number.
		// Assume: room number is valid and there is an active room stay.
		Booking activeBooking = bookingManager.getActiveBooking("11");
		// System returns the registered legal entities on the room stay (customer and all registered guests that are also customers to the hotel).
		// Assume: the actor confirms the legal entity making the purchase.
		// TODO: How do we know this legal entity has valid credit card information?
		LegalEntity customer = activeBooking.getRoomStay().getRegisteredPersons().get(0);
		
		Bill bill = billManager.getBookingBill(activeBooking);
		
		if(bill.isPublished()) {
			billManager.createBookingBill(customer, activeBooking);
		}
		
	}
	
	
}

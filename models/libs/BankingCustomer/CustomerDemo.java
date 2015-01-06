package se.chalmers.cse.mdsd1415.BankingDemo;

import javax.xml.soap.SOAPException;

public class CustomerDemo {

	/**
	 * Demonstrating method for the use of the Customer banking interface.
	 */
	public static void main(String args[]) {
		// CustomerRequires interface
		try {
			// Acquire CustomerRequires object
			se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires banking = se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
					.instance();

			// Check for credit card validity
			if (banking.isCreditCardValid("00000000", "000", 11, 16, "Peter",
					"Pan")) {
				System.out.println("Valid credit card");
			} else {
				System.out.println("Invalid credit card");
			}

			// Make a payment
			if (banking.makePayment("00000000", "000", 11, 16, "Peter", "Pan",
					25.50)) {
				System.out.println("Payment of 25.50 successfully processed");
			} else {
				System.out
						.println("Payment failed - invalid credit card or insufficient credit");
			}

		} catch (SOAPException e) {
			System.err
					.println("Error occurred while communicating with the bank");
			e.printStackTrace();
		}
	}

}
package tda593.hotel.california.integration;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;

import javax.xml.soap.SOAPException;

/**
 * Created by Peter on 2014-12-28.
 */
public class TestAdminBankingManager {

    private AdministratorRequires administratorRequires;

    public TestAdminBankingManager() {
        try {
            administratorRequires = AdministratorRequires.instance();
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }

    public double makeDeposit(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum) {
        try {
            return administratorRequires.makeDeposit(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, sum);
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public boolean addCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
        if(expiryYear > 20) {
            throw new IllegalArgumentException("Credit card year should not include the century (should be 14 instead of 2014)");
        }

        try {
            administratorRequires.removeCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
            return administratorRequires.addCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean removeCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
        try {
            return administratorRequires.removeCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        return false;
    }

    public double getBalance(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
        try {
            return administratorRequires.getBalance(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        return -1;
    }
}

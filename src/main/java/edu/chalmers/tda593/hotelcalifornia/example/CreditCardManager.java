package edu.chalmers.tda593.hotelcalifornia.example;

/**
 * An interface for some dependency.
 */
public interface CreditCardManager {

    public void doPayment(String ccNumber, double sum);

    public boolean isValid(String ccNumber);
}

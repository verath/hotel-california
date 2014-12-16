package edu.chalmers.tda593.hotelcalifornia.example.guice;

public interface CreditCard {

    public void doPayment(String ccNumber, double sum);

    public boolean isValid(String ccNumber);
}

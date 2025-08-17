package StrategyDesignPattern.Payment.PaymentMethod;

import StrategyDesignPattern.Payment.IPaymentStrategy;

public class CreditCardPayment implements IPaymentStrategy {
    private final String cardNumber;
    private final String expiryDate;

    public CreditCardPayment(String cardNumber, String expiryDate) {this.cardNumber = cardNumber; this.expiryDate = expiryDate;}

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Credit Card Payment");
        if(!cardNumber.isBlank() && !expiryDate.isBlank()) {
            System.out.println("Validation Completed");
            return true;
        }
        System.out.println("Err: Validation FAILED");
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Spent: Rs. " + amount + "\nPayment Completed");
    }
}

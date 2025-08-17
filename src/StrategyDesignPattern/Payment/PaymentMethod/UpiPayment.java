package StrategyDesignPattern.Payment.PaymentMethod;

import StrategyDesignPattern.Payment.IPaymentStrategy;

public class UpiPayment implements IPaymentStrategy {
    String upiId;

    public UpiPayment(String upiId) { this.upiId = upiId; }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating UPI Payment");
        if(!upiId.isBlank()) {
            System.out.println("Validation Completed");
            return true;
        }
        System.out.println("Err: Validation FAILED");
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Debit from Bank: Rs. " + amount + "\nPayment Completed");
    }
}

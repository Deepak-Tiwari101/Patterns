package StrategyDesignPattern.Payment.PaymentMethod;

import StrategyDesignPattern.Payment.IPaymentStrategy;

public class CryptoPayment implements IPaymentStrategy {
    private final String cryptoWalletId;

    public CryptoPayment(String walletId) { this.cryptoWalletId = walletId; }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Credit Card Payment");
        if(!cryptoWalletId.isBlank()) {
            System.out.println("Validation Completed");
            return true;
        }
        System.out.println("Err: Validation FAILED");
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Debit from Crypto Wallet: Rs. " + amount + "\nPayment Completed");
    }
}

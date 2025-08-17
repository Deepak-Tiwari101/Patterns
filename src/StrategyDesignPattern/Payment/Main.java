package StrategyDesignPattern.Payment;

import StrategyDesignPattern.Payment.PaymentMethod.CreditCardPayment;
import StrategyDesignPattern.Payment.PaymentMethod.CryptoPayment;
import StrategyDesignPattern.Payment.PaymentMethod.UpiPayment;

public class Main {
    public static void main(String[] args) {
        ShoppingPayment payment = new ShoppingPayment();

        payment.setPaymentStrategy(new CreditCardPayment("1234 5678 8765 4321", "04/28"));
        payment.checkout(10000);

        System.out.println("\n");

        payment.setPaymentStrategy(new UpiPayment("tiwarideepak@okaxis"));
        payment.checkout(150);

        System.out.println("\n");

        payment.setPaymentStrategy(new CryptoPayment("Ef234$$1@69"));
        payment.checkout(5000);
    }
}

package StrategyDesignPattern.Payment;

public class ShoppingPayment {
    private IPaymentStrategy paymentStrategy;

    public void setPaymentStrategy(IPaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
    public void checkout(int amount) {
        if(paymentStrategy.validatePaymentDetails()) {
            paymentStrategy.pay(amount);
            return;
        }
        throw new RuntimeException("Err: Payment Unsuccessful as validation failed");
    }
}

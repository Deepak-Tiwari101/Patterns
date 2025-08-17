package StrategyDesignPattern.Payment;

public interface IPaymentStrategy {
    boolean validatePaymentDetails();
    void pay(int amount);
}

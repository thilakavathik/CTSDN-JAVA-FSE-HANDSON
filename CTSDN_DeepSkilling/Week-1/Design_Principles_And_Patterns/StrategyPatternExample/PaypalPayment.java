package StrategyPatternExample;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying Rs." + amount + " using PayPal.");
    }
}

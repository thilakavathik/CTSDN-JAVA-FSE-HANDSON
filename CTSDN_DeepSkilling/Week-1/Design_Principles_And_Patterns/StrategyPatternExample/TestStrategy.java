package StrategyPatternExample;

public class TestStrategy {
    public static void main(String[] args) {
        PaymentContext context;

        context = new PaymentContext(new CreditCardPayment());
        context.executePayment(100.0);

        context = new PaymentContext(new PaypalPayment());
        context.executePayment(200.0);
    }
}

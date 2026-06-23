package AdapterPatternExample;

public class PaypalGateway {
    public void makePayment(double amount) {
        System.out.println("Processing payment of Rs." + amount + " through PayPal.");
    }
}

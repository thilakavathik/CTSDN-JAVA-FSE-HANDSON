package AdapterPatternExample;

public class RazorpayGateway {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of Rs." + amount + " through Razorpay.");
    }
}

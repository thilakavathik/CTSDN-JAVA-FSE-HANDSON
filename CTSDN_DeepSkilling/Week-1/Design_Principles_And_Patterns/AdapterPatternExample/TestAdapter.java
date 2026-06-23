package AdapterPatternExample;

public class TestAdapter {
    public static void main(String[] args) {
        PaymentProcessor razorpayProcessor = new RazorpayAdapter();
        razorpayProcessor.processPayment(1000.0);

        PaymentProcessor paypalProcessor = new PaypalAdapter();
        paypalProcessor.processPayment(1500.0);
    }
}

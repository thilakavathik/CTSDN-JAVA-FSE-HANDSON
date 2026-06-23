package CustomerOrderSort;

public class Order {
    int orderID;
    String customerName;
    double totalPrice;

    public Order(int orderID, String customerName, double totalPrice) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return orderID + " " + customerName + " Rs." + totalPrice;
    }
}

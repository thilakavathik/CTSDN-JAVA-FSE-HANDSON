package CustomerOrderSort;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(101, "Alice", 250.75);
        Order order2 = new Order(102, "Bob", 150.50);
        Order order3 = new Order(103, "Charlie", 300.00);

        Order[] orders = { order1, order2, order3 };

        System.out.println("Orders before sorting:");
        for (Order order : orders) {
            System.out.println(order);
        }

        SortFunctions.bubbleSort(orders);

        System.out.println("\nOrders after Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        Order[] ordersForQuickSort = { order1, order2, order3 };
        SortFunctions.quickSort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);

        System.out.println("\nOrders after Quick Sort:");
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }
    }
}

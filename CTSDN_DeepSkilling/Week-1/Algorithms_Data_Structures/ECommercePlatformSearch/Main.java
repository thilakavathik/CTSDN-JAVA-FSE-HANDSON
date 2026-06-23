package ECommercePlatformSearch;

public class Main {
    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Monitor", "Electronics")
        };

        Product result1 = SearchFunction.linearSearch(products, 103);

        if (result1 != null) {
            System.out.println("Linear Search Found: "
                    + result1.productName);
        }

        Product result2 = SearchFunction.binarySearch(products, 104);

        if (result2 != null) {
            System.out.println("Binary Search Found: "
                    + result2.productName);
        }
    }
}

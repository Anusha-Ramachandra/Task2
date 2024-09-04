import java.util.Scanner;

public class XYZ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five products from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter product ID for product " + (i + 1) + ": ");
            String pid = scanner.next();
            System.out.print("Enter price for product " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity for product " + (i + 1) + ": ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find the product with the highest price
        Product highestPriceProduct = products[0];
        for (Product product : products) {
            if (product.getPrice() > highestPriceProduct.getPrice()) {
                highestPriceProduct = product;
            }
        }

        // Print the PID of the product with the highest price
        System.out.println("Product with the highest price has PID: " + highestPriceProduct.getPid());

        // Calculate and print the total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: $" + totalAmountSpent);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate and return the total amount spent on all products
    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }
}
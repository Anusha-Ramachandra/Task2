public class Product {
    private String pid;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(String pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for properties
    public String getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

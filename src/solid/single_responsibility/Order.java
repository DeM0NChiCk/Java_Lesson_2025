package solid.single_responsibility;

public class Order {

    private String product;
    private int amount;

    public Order(String product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public void printOrder() {
        System.out.println("Order: " + product + ", Amount: " + amount);
    }

    public void saveToDatebase() {
        System.out.println("Saving...");
    }
}

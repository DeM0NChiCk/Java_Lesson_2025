package solid.single_responsibility;

public class OrderLike {

    private final String product;
    private final int amount;

    public OrderLike(String product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}

class DatebaseOrder implements DatabaseRepository {

    @Override
    public void saveToDatebase() {
        System.out.println("Saving...");
    }
}

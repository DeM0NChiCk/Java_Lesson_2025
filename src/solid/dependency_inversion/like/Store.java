package solid.dependency_inversion.like;

public class Store {
    private final Transaction transaction;

    public Store(Transaction transaction) {
        this.transaction = transaction;
    }

    public void purchase(int amount) {
        transaction.doTransaction(amount);
    }

    @Override
    public String toString() {
        return "Я магазин с независимой возможностью оплаты";
    }
}

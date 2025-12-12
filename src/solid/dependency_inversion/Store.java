package solid.dependency_inversion;

public class Store {
    private DebitCard debitCard;

    public Store() {
        this.debitCard = new DebitCard();
    }

    public void purchase(int amount) {
        debitCard.doTransaction(amount);
    }
}

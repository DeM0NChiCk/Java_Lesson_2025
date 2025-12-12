package solid.dependency_inversion.like;

public class DebitSBP implements Transaction {
    @Override
    public void doTransaction(int amount) {
        System.out.println("Оплата с помощью СБП");
    }
}

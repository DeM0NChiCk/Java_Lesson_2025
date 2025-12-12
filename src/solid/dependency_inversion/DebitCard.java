package solid.dependency_inversion;

import solid.dependency_inversion.Transaction;

public class DebitCard implements Transaction {
    public void doTransaction(int amount) {
        System.out.println("Оплата с помощью карты");
    }
}

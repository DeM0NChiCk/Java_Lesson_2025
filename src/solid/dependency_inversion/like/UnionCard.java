package solid.dependency_inversion.like;

public class UnionCard implements BankCard {
    @Override
    public void doTransaction(int amount) {
        System.out.println("Оплата картой юнион пей");
    }

    @Override
    public void cardReturn() {
        System.out.println("Возврат на карту юнион");
    }
}

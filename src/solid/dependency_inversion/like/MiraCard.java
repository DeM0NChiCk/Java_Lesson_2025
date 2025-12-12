package solid.dependency_inversion.like;

public class MiraCard implements BankCard {
    @Override
    public void doTransaction(int amount) {
        System.out.println("Оплата картой мир");
    }

    @Override
    public void cardReturn() {
        System.out.println("Возврат на карту мир");
    }
}

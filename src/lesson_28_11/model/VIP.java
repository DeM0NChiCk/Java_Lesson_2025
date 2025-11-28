package lesson_28_11.model;

public final class VIP extends Client{

    public boolean status = true;

    public VIP(int id, String country, int age, String username, String password, String address) {
        super(id, country, age, username, password, address);
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void buyProcutInShop(Product product, int count) {
        super.buyProcutInShop(product, count);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Я VIP");
    }
}

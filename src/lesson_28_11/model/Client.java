package lesson_28_11.model;

public class Client extends User {

    private String address;
    private int productCount;

    public static int countBuy;

    public Client(int id, String country, int age, String username, String password, String address) {
        super(id, country, age, username, username, password);
        this.address = address;
    }

    public void buyProductInShop(Product product, int count) {
        for (int i = 0; i<= count; i++) {
            product.removeOne();
            productCount++;
        }
        countBuy++;
        System.out.println("Покупка совершена! " + product.TAG + "\nОсталось товара: " + product.getCount());
    }

    @Override
    public void print() {
        System.out.println("Address: " + address + "\nCount product:" + productCount);
    }

    @Override
    public String toString() {
        return "Client(id = " + getId() + ",u sername = " + getUsername() + ", age = " + getAge() + ", " + super.toString() + ", address = " + address + ", productCount = " + productCount + ", countBuy = " + countBuy + ")";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

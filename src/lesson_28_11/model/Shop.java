package lesson_28_11.model;

public class Shop extends Place{

    private Product[] stand;

    public Shop(String address, String square, String title, Product[] products) {
        super(address, square, title);
        this.stand = products;
    }
    // TODO: title
    @Override
    public String getTitle() {
        return "";
    }

    // TODO: Возможность изменять название магазина, есть только у Employee с job = "manager"
    @Override
    public void setTitle(String title) {

    }

    // TODO:
    //  1) Добавить возможность продавать продукты оптом (return Product[])
    //  2) Пополнять магазин из склада
}

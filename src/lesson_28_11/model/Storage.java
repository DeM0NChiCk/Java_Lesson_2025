package lesson_28_11.model;

public class Storage extends Place{

    private Product[][] loc;

    public Storage(String address, String square, String title, int numberLocs, int column) {
        super(address, square, title);
        this.loc = new Product[numberLocs][column];
    }

    public Product[][] getLoc() {
        return loc;
    }
    // TODO: title + address
    @Override
    public String getTitle() {
        return "";
    }
    // TODO: Возможность изменять название магазина, есть только у Employee с job = "director"
    @Override
    public void setTitle(String title) {

    }

    // TODO: добавить возможность пополнять склад
}

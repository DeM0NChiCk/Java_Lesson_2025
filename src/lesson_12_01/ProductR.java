package lesson_12_01;

public record ProductR(String name, String dec, Double price) {

    public ProductR(String name, String dec, Double price){
        this.name = name;
        this.dec = dec;
        if (price < 0) {
            price = 0d;
        }
        this.price = price;
    }

    public ProductR(Double price, String fullname, String dec){
        this(fullname, dec, price);
    }

    @Override
    public String name() {
        return name;
    }
}

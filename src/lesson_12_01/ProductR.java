package lesson_12_01;

public record ProductR(String name, String dec, Double price) {
    public static String textEx;

    public ProductR {
        if (price < 0) {
            price = 0d;
        }
    }

    public ProductR(Double price, String fullname, String dec){
        this(fullname, dec, price);
    }

    @Override
    public String name() {
        if (name.length() < 10) {
            return "Example user";
        }
        return name;
    }

    public String getName() {
        return name;
    }

    static{
        textEx = "ex text record";
    }
}

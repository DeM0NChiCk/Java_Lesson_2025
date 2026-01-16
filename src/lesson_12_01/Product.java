package lesson_12_01;

import java.util.Objects;

public class Product {

    private final String name;
    private final String dec;
    private final Double price;

    public Product(String name, String dec, Double price) {
        this.name = name;
        this.dec = dec;
        this.price = price;
    }

    public String name() {
        return name;
    }

    public String dec() {
        return dec;
    }

    public double price() {
        return price;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Product other)) return false;
        return other.name.equals(name) && other.dec.equals(dec) && other.price.equals(price);
    }

    public int hashCode() {
        return Objects.hash(name, dec, price);
    }

    public String toString() {
        return String.format("Person[name=%s, dec=%s, price=%f]", name, dec, price);
    }
}
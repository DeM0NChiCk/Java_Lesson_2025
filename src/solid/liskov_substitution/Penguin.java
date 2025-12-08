package solid.liskov_substitution;

public class Penguin extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Я не умею летать");
    }
}

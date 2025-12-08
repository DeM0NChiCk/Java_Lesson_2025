package solid.liskov_substitution;

public class SparrowLike extends BirdLike implements Fly{

    @Override
    public void fly() {
        System.out.println("Я лечу!");
    }
}

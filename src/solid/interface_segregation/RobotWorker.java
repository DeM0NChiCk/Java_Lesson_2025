package solid.interface_segregation;

public class RobotWorker implements Worker{
    @Override
    public void work() {

    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Я не умею кушать");
    }

    @Override
    public void clear() {

    }
}

package solid.interface_segregation;

public class HumanWorkerLike implements WorkerLike, EatableLike {
    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }

    @Override
    public void clear() {

    }
}

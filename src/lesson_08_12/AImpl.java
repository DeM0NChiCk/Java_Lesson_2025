package lesson_08_12;

public class AImpl extends A implements GetService{

    public AImpl(int a1, int a2) {
        super(a1, a2);
    }

    @Override
    void setA1(int a1) {

    }

    @Override
    void setA2(int a2) {

    }

    @Override
    public int get1() {
        return 0;
    }

    @Override
    public int get2() {
        return 0;
    }
}

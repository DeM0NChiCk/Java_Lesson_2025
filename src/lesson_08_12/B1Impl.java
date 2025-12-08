package lesson_08_12;

public class B1Impl extends B implements GetService{
    public B1Impl(int a1, int a2, int b1, int b2) {
        super(a1, a2, b1, b2);
    }

    @Override
    int getB1() {
        return 0;
    }

    @Override
    int getB2() {
        return 0;
    }

    @Override
    void setB1(int b1) {

    }

    @Override
    void setB2(int b2) {

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

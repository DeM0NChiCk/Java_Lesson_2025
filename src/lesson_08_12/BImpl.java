package lesson_08_12;

public class BImpl extends B {

    public BImpl(int a1, int a2, int b1, int b2) {
        super(a1, a2, b1, b2);
    }

    @Override
    int getB1() {
        return 5;
    }

    @Override
    int getB2() {
        return 6;
    }

    @Override
    void setB1(int b1) {

    }

    @Override
    void setB2(int b2) {

    }

//    @Override
//    int getA1() {
//        return 0;
//    }
//
//    @Override
//    int getA2() {
//        return 0;
//    }

    @Override
    void setA1(int a1) {

    }

    @Override
    void setA2(int a2) {

    }
}

package lesson_08_12;

public class Main {
    public static void main(String[] args) {
        BImpl b1 = new BImpl(3,4, 1, 2);
        B1Impl b11 = new B1Impl(3,4, 1, 2);
        AImpl a1 = new AImpl(1, 2);
        GetService getService = b11;

        ((B1Impl)getService).setA2(2);

        GetService staticGetService = createGetService(10, b11, a1);
        staticGetService = createGetService(-10, b11, a1);
    }

    static GetService createGetService(int i, B1Impl b11, AImpl a1) {
        if (i <= 0) {
            return b11;
        } else {
            return a1;
        }
    }
}

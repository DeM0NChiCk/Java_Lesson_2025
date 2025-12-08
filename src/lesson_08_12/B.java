package lesson_08_12;

public abstract class B extends A {

    private int b1;
    private int b2;

    public B(int a1, int a2, int b1, int b2) {
        super(a1, a2);
        this.b1 = b1;
        this.b2 = b2;
    }

    abstract int getB1();
    abstract int getB2();

    abstract void setB1(int b1);
    abstract void setB2(int b2);
}

package lesson_08_12;

public abstract class A {

    private int a1;
    private int a2;

    public A(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

//    abstract int getA1();
//    abstract int getA2();

    abstract void setA1(int a1);
    abstract void setA2(int a2);
}

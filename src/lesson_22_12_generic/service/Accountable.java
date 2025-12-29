package lesson_22_12_generic.service;

public interface Accountable<T, S> {
    T getId();
    S getSum();
    void setSum(S sum);
}

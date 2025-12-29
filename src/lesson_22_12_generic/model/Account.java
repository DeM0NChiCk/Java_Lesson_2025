package lesson_22_12_generic.model;

import lesson_22_12_generic.service.Accountable;

public class Account<T, S> implements Accountable<T, S> {
    private final T id;
    private S sum;

    public  Account(T id, S sum){
        this.id = id;
        this.sum = sum;
    }
    @Override
    public T getId() { return id; }
    @Override
    public S getSum() { return sum; }
    @Override
    public void setSum(S sum) { this.sum = sum; }
}

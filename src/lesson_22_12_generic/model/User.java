package lesson_22_12_generic.model;

public class User<T> {
    private T id;
    private String name;

    public T getId(){ return id; }
    public void setId(T id){ this.id = id; }

    public String getName() { return name; }

    public User(T id, String name){

        this.id = id;
        this.name = name;
    }
}

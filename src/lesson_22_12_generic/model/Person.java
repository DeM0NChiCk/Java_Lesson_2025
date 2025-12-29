package lesson_22_12_generic.model;

public class Person<T> {
    private T id;
    private String name;

    T getId(){ return id; }
    void setId(T id){ this.id = id; }

    String getName() { return name; }

    Person(T id, String name){

        this.id = id;
        this.name = name;
    }

    Person<Object> bob = new Person<>(2.0, "Bob");
    Person<Integer> tom = new Person<>(1, "Tom");
    Person<String> sam = new Person<>("F-456", "Sam");


}

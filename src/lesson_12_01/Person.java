package lesson_12_01;

public class Person implements Cloneable{  // применяем интерфейс  Cloneable

    String name;

    Person(String name){ this.name = name; }

    void print(){
        System.out.println("Person " + name);
    }

    public Person clone() throws CloneNotSupportedException {

        return (Person) super.clone();
    }
}

package lesson_22_12_generic.service;

public class Printer {

    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}

package lesson_12_01;

public class Printer {
    private String text;

    public Printer(String text) {
        this.text = text;
    }

    public String toPrint(int b) {
        var a = "Я из класса Printer";
        System.out.println("Я из класса Printer");

        return a + b + text;
    }
}
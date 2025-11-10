package lesson_10_11;

import lesson_07_11.Main;

import java.util.Arrays;

public class ExampleStringFunc {
    public static void main(String[] args) {

        String exText = "Привет мир! \t Я\sизучаю Java\n";
        String exText2 = exText;
        String exText3 = new String("Привет мир! \t Я\sизучаю Java\n");

        println(exText == exText2);
        println(exText == exText3);
        println(exText.equals(exText3));
        println(exText2 + "122");

        char[] arrExText = exText.toCharArray();

        println(exText);
        println(Arrays.toString(arrExText));

        int res = sum(1,2);
        String b = "";
        String res1 = sum(b, 2);
        String res2 = sum(b, 2);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static String sum(int a, String b) {
        return sum(a) + b;
    }

    public static int sum(int a) {
        return a + a;
    }

    public static String sum(String b, int a) {
        return a + b;
    }

    public static void println(String a) {
        System.out.println(a);
    }

    public static void println(Boolean a) {
        System.out.println(a);
    }

    // функция обязательно что-то возвращает
    // <модификатор доступа> <тип данных> <имя метода> (набор параметров)
}

package lesson_21_11;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) throws IllegalArgumentException{
        Scanner scr = new Scanner(System.in);
        int[] arr = null;
//        arr[1] = 2;

        System.out.println(Arrays.toString(arr));

        int age = scr.nextInt();
        validateAge(age);
        try {
            validateAge(age);
        } catch (IllegalArgumentException e) {
            print(e.getMessage());
        }
    }

    static void print (String mes) {
        System.out.println(mes);
    }

    static void validateAge(int age) {if (age < 18) {
            throw new IllegalArgumentException("Возраст должен быть больше 17");
        }
    }
}

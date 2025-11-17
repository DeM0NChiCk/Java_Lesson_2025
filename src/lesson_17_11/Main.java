package lesson_17_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;

        a+=10;

        for(int i = 0; i < 10; i++) {
            a+=10;
        }
//        if (a > b)
//            return a;
//        else
//            return b;

        double k = (double) 10 / 4;     // 10.0 / 4 = 2.5
        System.out.println(k);

        System.out.println(a);

//        if (a > b)
//            return a;
//        else
//            return b;

        if (a > 5) {
            System.out.println("a>5");
        } else {
            System.out.println("a<5");
        }
        int b = 1;

        String res = b > 5 ? "a>5" : "a<5";

        System.out.println( a > 5 ? "a>5" : "a<5");

        fun1("Hello", 0);

//        if (a > b)
//            return a;
//        else
//            return b;

        max(a, b);


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nRec = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
            sout(sum);
        }
        sout("Result for: " + sum);

        sout("Result rec: " + sum(nRec));

        recursion(1);
    }

    public static void fun1(String a, int b){
        System.out.println(a);
    }

    public static int fun1(int b, String a) {
        return 0;
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        }
        else
            return b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static double max(double a, double b) {
        return a >= b ? a : b;
    }

    public static void sout(String message) {
        System.out.println(message);
    }

    public static void sout(int message) {
        System.out.println(message);
    }

    public static int sum(int n){
        if (n > 1) {
            System.out.println(n);
            return n + sum(n - 1);
        }
        return n;
    }

    public static void recursion(int i) {
        sout("There is recursion " + i);
        recursion(++i);
    }
}

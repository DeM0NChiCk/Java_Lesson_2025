package lesson_15_12;

import java.util.Arrays;

public class Main {
    String exStr;

    public static void main(String[] args) {
        String str1 = "Aaa";
        char[] strArr1 = "Aaa".toCharArray();
        String str2 = new String("Aaa");
        String str3 = new String(new char[]{'A', 'a', 'a'});
        String str4 = "Aaa";
        String str5 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);
        System.out.println(str5);

        if (str1 == str4) {
            System.out.println("1 Строки одинаковые");
        } else {
            System.out.println("1 Строки разные");
        }

        if (str1 == str2) {
            System.out.println("2 Строки одинаковые");
        } else {
            System.out.println("2 Строки разные");
        }

        if (str3 == str2) {
            System.out.println("3 Строки одинаковые");
        } else {
            System.out.println("3 Строки разные");
        }

        if (str1.equals(str2) && str1.equals(str3) && str1.equals(str4)) {
            System.out.println("4 Строки одинаковые");
        } else {
            System.out.println("4 Строки разные");
        }

        int str1Length = str1.length();
        System.out.println(new String());
        System.out.println("");
        String sNull = null;
        System.out.println(sNull);
        String sSpec = "        ";

        System.out.println("" == new String() ? "Строки одинаковые" : "Строки разные");

        System.out.println(Arrays.toString(str3.toCharArray()));
        System.out.println(sSpec.isBlank());
        System.out.println(sSpec.isEmpty());
        String concatStr = sSpec + str1;
        System.out.println(concatStr);
        System.out.println(sSpec.concat(str1));
        String strJoin = String.join(",", str1, str2, str3);
        System.out.println(strJoin);
        System.out.println(str2.compareTo(str1));
        System.out.println(sSpec.compareTo(str1));
        System.out.println((char) (str1.charAt(0) + 4));
        char[] b = new char[2];
        str1.getChars(0, 2, b, 0);
        System.out.println(Arrays.toString(b));
        System.out.println(str1.regionMatches(0, "aa", 0, 2));
        System.out.println(str1.regionMatches(true, 0, "aa", 0, 2));
        System.out.println(strJoin.indexOf("aa"));
        System.out.println(strJoin.lastIndexOf("aa"));
        System.out.println(concatStr.strip());
        System.out.println(strJoin.replace("Aaa", "\t").strip());
    }
}

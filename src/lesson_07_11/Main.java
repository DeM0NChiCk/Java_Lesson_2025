package lesson_07_11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean check = true;
        boolean isOk = true;

        // константные значения, который нельзя будет изменить
        final int STATUS_CODE_BASE = 4;
        final int STATUS_CODE_ADMIN = 3;
        final String TEXT_BASE = "ex = ";

        int ex;
        ex = STATUS_CODE_BASE;

        while (check) {   // если while true - выполняем цикл  / false - завершаем цикл и идём дальше

            if (ex == STATUS_CODE_ADMIN) {
                System.out.println(TEXT_BASE + ex);
            }
            System.out.println("Введите имя: ");
            String textUserString = scanner.next(); // до первого разделителя в виде пробела \s
            System.out.println("Введите возраст: ");
            int textUserAge = scanner.nextInt(); // 12\n
            // 123\n
            // 12414\n
            final String COUNTRY_USER_ADMIN = "Russia";
            System.out.println("Введите свою страну: ");
            scanner.nextLine();
            String textCountry = scanner.nextLine(); // до первого разделителя в виде переноса строки \n

            if (textUserAge < 20) {
                check = false;
            }
            ex = STATUS_CODE_BASE;
                // textUserString == "Admin"
            if ((textUserString.equals("Admin") || textUserString.equals("admin") ) && COUNTRY_USER_ADMIN.equals(textCountry) ) {
                System.out.println("Готов к работе");
                ex = STATUS_CODE_ADMIN;

            } else {
                System.out.println("Приятного использования приложения!");
            }

        }

        int a;
        a = 13;

        do {
            System.out.println("Привет! " + a);
            a++;
        }
        while (a<12); // < > == != >= <= .equels() в условие всегда будет возвращено Boolean - true/false
        /* Выполнение блока do
         Проверяем условие для while
         a<12
         a ? = 14
         14 < 12  -- false
        цикл завершён, блок do больше не выполняется.

         */


        byte ageHuman = 21;

        byte ageMax = 20;

        String today = "Суббота";
        String tomorrow = "Суббота";

        int changeValue = 0;

        boolean condition;

        String textUserString = scanner.next();

        condition = today.equals(textUserString);

        System.out.println(condition);

        while (condition) {
            changeValue++;
            System.out.println(today + " : " + changeValue);
            if (changeValue == 4) {
                today = "Среда";
                condition = false;
                System.out.println("Программа завершена " + today);
            }
        }

        for (int i = 0; i <= 4; i++) {

            // пример того, как мы можем влиять на i во время каждой итерации (не рекомендуется!)

            switch (today) {
                case "Cуббота":
                    System.out.println("Выходной: " + today + " : " + i);
                    break;
                case "Среда":
                    System.out.println("Рабочий день: " + today + " : " + i);
                    break;
                case "Пятница":
                    System.out.println("Последний рабочий день: " + today + " : " + i);
                    break;
                default:
                    System.out.println(today + " : " + i);
            }

            int i1 = i == 3 ? i++ : i--;  // пример тернарной операции, которая всегда возвращает значение

            System.out.println("i1: "+ i1);

            System.out.println("i: " + i);
            System.out.println("i++: " + ++i);
            if (i == 3) {
                today = "Пятница";
            }
        }

        System.out.println("Хорошего дня!");


        System.out.printf("Сегодня день: %s", textUserString);

        // i++ инкремент i -> i = i + 1 | ++i  i = i + 1 -> i
        // i-- декремент i -> i = i - 1 | --i  i = i - 1 -> i

        int res;
        boolean a1 = true;
        boolean b1 = false; // это была хитрая логика которая сравнивала значения и при false res = 10, а при true res = 100

        if (a1 & b1) { // то в этом случае ленивая операция будет ошибочной по логике, потому что условие b1 не будет выполено
            //TODO
        }

        if (a1 && b1 && true && false) {

        }

        int xLazy = 10;
        int yLazy = 5;

        xLazy++; // xLazy выполнена операция -> xLazy = xLazy + 1
        ++xLazy; // xLazy = xLazy + 1 -> xLazy выполнена операция
        xLazy--; // xLazy выполнена операция -> xLazy = xLazy - 1
        --xLazy; // xLazy = xLazy - 1 -> xLazy выполнена операция
        //         10    > 6
        if (b1 & xLazy++ > ++yLazy) {
            System.out.println(xLazy);
            System.out.println(yLazy);
        } else {
            System.out.println(xLazy); // 11
            System.out.println(yLazy); // 6
        }
//          false   11    >     6
        if (b1 && xLazy++ > ++yLazy) {
            System.out.println(xLazy);
            System.out.println(yLazy);
        } else {
            System.out.println(xLazy); // 11
            System.out.println(yLazy); // 6
        }
    }

}


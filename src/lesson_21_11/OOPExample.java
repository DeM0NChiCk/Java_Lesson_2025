package lesson_21_11;

import java.util.Arrays;

public class OOPExample {
    public static void main(String[] args) {
        int age0 = 10; String name0 = "Alex"; String login0; String hashPassowrd0; boolean statusOnline0;
        int age1; String name1; String login1; String hashPassowrd1; boolean statusOnline1;
        int age2; String name2; String login2; String hashPassowrd2; boolean statusOnline2;
        int age3; String name3; String login3; String hashPassowrd3; boolean statusOnline3;
        int age4 = 45; String name4 = "Alex"; String login4; String hashPassowrd4; boolean statusOnline4;

        int[] ages = {18, 14, 10, 20, 40};
        String adminName = "Alex";
        Arrays.sort(ages);
        User.isStatusOnlineAll = true;
        User admin = new User(adminName, 19);
        admin.login = "alex@mail.ru";
        admin.hashPassword = "pass1";

        int sale = User.SALE;
        User.isStatusOnlineAll = false;

        admin.grow(1);

        System.out.printf("""
                Age : %d
                Name : %s
                Login : %s
                Status : %b
                """, admin.getAge(), admin.name, admin.login, admin.isStatusOnline
        );
    }
}

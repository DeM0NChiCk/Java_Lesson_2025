package lesson_19_12;

import lesson_19_12.enums.Day;
import lesson_19_12.model.Chauffeur;
import lesson_19_12.model.Cleaner;
import lesson_19_12.model.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+79998884422");
        Phone phone2 = new Phone("+79988884422");
        Phone phone3 = new Phone("+79988884422");
        Phone phone4 = phone1;

        System.out.println("""
                1-2: %s
                2-3: %s
                1-4: %s
                """.formatted(
                        phone1.equals(phone2),
                        phone2.equals(phone3),
                        phone1.equals(phone4)
                )
        );
        System.out.println("""
                1: %s
                2: %s
                3: %s
                4: %s
                """.formatted(
                        phone1.hashCode(),
                        phone2.hashCode(),
                        phone3.hashCode(),
                        phone4.hashCode()
                )
        );

//        int a = null;
        Integer a = null;

        String ex = "1234";
        int exInt = Integer.parseInt(ex);
        int exResStr = Integer.parseInt(ex) * 5;
        int exRes = exInt * 5;

        Integer obj = 100; // по умолчанию в JAVA любое целочисленное значение это int

        Integer a1 = 6;
        Integer b = 2;
        Integer c = a1 + b;
        System.out.println(c);

        Integer a2 = 1;
        Integer b2 = 1;
        Integer c2 = new Integer(1);

        System.out.println(a2 == b2); // true
        System.out.println(a2 == c2);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.TYPE);

//        int i = Integer.parseInt("aaa");
//        System.out.println(i);

        System.out.println(Integer.valueOf(exRes).toString() + 10);
        System.out.println(Integer.parseInt(Integer.toString(5) + 5) + 10);

        int x = 4;
        int y = 40;

        System.out.println(Integer.max(x,y)); // 40
        System.out.println(Integer.min(x,y));

//        String todayString = "Суб";
//        Cleaner cleaner = new Cleaner(Cleaner.DAY_CLEANING);
//        cleaner.cleaning();
//        Chauffeur chauffeur = new Chauffeur(Chauffeur.DAY_FINISH_DRIVE);
//        chauffeur.drive();

        Day today = Day.SATURDAY;
        Cleaner cleaner = new Cleaner(today);
        cleaner.cleaning();
        Chauffeur chauffeur = new Chauffeur(today);
        chauffeur.drive();

        Day[] days = Day.values();
        for(Day d: days) {
            System.out.print(d + " ");
        }
    }
}

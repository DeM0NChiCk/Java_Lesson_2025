package lesson_21_11;

public class User {
    String login; // null
    private int age; // 0
    String name; // null
    String hashPassword; // null
    boolean isStatusOnline = true; // false

    public static  final int SALE = 10;
    public static boolean isStatusOnlineAll = false;

    private User() {}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    {
        age = 10;
    }

    void grow(int age) {
        if (age > 0)
            this.age += age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

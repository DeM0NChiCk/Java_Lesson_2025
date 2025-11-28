package lesson_28_11;

import lesson_28_11.model.Client;
import lesson_28_11.model.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(
                1,
                "R",
                22,
                " ",
                "DE",
                "12345"
        );
        user1.print();

        Client client1 = new Client(
                1,
                "R",
                22,
                " ",
                "12345",
                "Kazan"
        );
        client1.print();
    }
}

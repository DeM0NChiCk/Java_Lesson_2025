package lesson_22_12_generic;

import lesson_22_12_generic.model.*;
import lesson_22_12_generic.service.Messenger;
import lesson_22_12_generic.service.Printer;

public class Main {
    public static void main(String[] args) {
//        Account acc1 = new Account(2334, 5000);
//        Account acc2 = new Account("sid5523", 5000);

        AccountObject acc1 = new AccountObject(2334, 5000);
        AccountObject acc2 = new AccountObject("sid5523", 5000);

        String id2 = (String) acc2.getId();
        int id1 = (int) acc1.getId();

//        AccountObject acc3 = new AccountObject("2345", 5000);
//       int acc3Id = (int) acc3.getId();
//        System.out.println(acc3Id);

        Account<Integer, Integer> acc4 = new Account<>(2334, 5000);
        Account<String, Integer> acc5 = new Account<>("sid5523", 5000);

        Printer printer = new Printer();
        printer.print(new String[] {"1", "2"});
        printer.print(new Integer[] {1, 2});

        Account<String, Double> acc6 = new Account<String, Double>("354", 5000.87);
        String id = acc6.getId();
        Double sum = acc6.getSum();
        System.out.printf("Id: %s Sum: %f \n", id, sum);

        Message message = new EmailMessage("Привет, ты спишь?", "someaddress@hmail.com");

        Messenger<Message> simpleMessenger = new Messenger<>(message);

        EmailMessage email = (EmailMessage) simpleMessenger.getMessage();
//        SmsMessage sms = (SmsMessage) simpleMessenger.getMessage();

        System.out.println("Address: " + email.getAddress());

        EmailMessage email1 = new EmailMessage("Привет, ты спишь?", "someaddress@hmail.com");
        Messenger<EmailMessage> mailClient = new Messenger<EmailMessage>(email);
        mailClient.send();  // Отправляется сообщение: Привет, ты спишь?

        SmsMessage sms2 = new SmsMessage("Hello World", "+71234567890");
//        Messenger<SmsMessage> phone = new Messenger<SmsMessage>(sms);
//        phone.send();   // Отправляется сообщение: Hello World

        var mailClient1 = new Messenger<EmailMessage>(email);
        mailClient1.send();

        User<Object> bob = new User<>(2.0, "Bob");
        User<Integer> tom = new User<>(1, "Tom");
        User<String> sam = new User<>("F-456", "Sam");
        User<Double> tom1 = new User<>(1.1, "Tom");
        User<Long> tom3 = new User<>(11L, "Tom");
        User<Float> tom4 = new User<>(1.2F, "Tom");
        User<Integer> tom5 = new User<>(1, "Tom");

//        printPersonInfo(bob);
        printPersonInfo(tom);
        printPersonInfo(tom1);
        printPersonInfo(tom3);
        printPersonInfo(tom4);
//        printPersonInfo(sam);

        setIntegerId(bob, 51);
//        setIntegerId(tom, 52);
//        setIntegerId(sam, 53);
    }

    static void printPersonInfo(User<? extends Number> user) {

        System.out.print("Name: " + user.getName());
        Number id = user.getId();
        System.out.println(";  Id: " + id);
    }

    static void setIntegerId(User<? super Number> user, Number id) {
        Object idGet = user.getId();
        user.setId(id);
    }

}

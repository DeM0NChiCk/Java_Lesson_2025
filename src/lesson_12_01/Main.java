package lesson_12_01;

import lesson_12_01.interfaces.*;
import lesson_12_01.state.*;

public class Main {

    static int exMainLambda = -10;
    static Message messageLambdaStatic = aValue -> "Я создан с помощью lambda в переменную - " + aValue + " " + exMainLambda;
//    static Message messageLambdaStaticREC = aValue -> {
//        System.out.println("Я создан message " + aValue);
//        printRec();
//        return "Я создан message " + aValue;
//    };
//    static Mail mailLambdaStaticREC = () -> {
//        System.out.println("Я создан mail");
//        print(10, messageLambdaStaticREC);
//    };

    public static void main(String[] args) {

        Product productSimple = new Product("продукт", "Обычный", 2.3d);
        System.out.println(productSimple);
        ProductR productR = new ProductR("продукт", "Record", -20d);
        System.out.println(productR);



        Printer printer = new Printer("\nHello, world!");

//        Message[] messages = new Message[] {printer};

        System.out.println(print(10, printer::toPrint));

        System.out.println(print(15, CashReg::printCheck));

        System.out.println(print(20, new Message() {
            @Override
            public String sendMessage(int a) {
                return "Я создан с помощью анонимного класса: " + a;
            }
        }));

        System.out.println(print(100, a -> "Я создан с помощью lambda - " + a));

        int a = 10;

        Message messageLambda = aValue -> "Я создан с помощью lambda в переменную - " + aValue;
        Mail messageLambdaVoid = () -> {
            System.out.print("Я void метод из lambda mail");
            int aLam= 20;
            System.out.println(" " + (aLam*10));
            System.out.println(print(1000, messageLambdaStatic));

        };

        Mail mail = messageLambdaVoid;

        System.out.println(print(200, messageLambda));
        System.out.println(print(300, messageLambda));
        printMail(messageLambdaVoid);
        printMail2(() -> {
            System.out.print("Я void метод из lambda mail2 " + a);
            int aLam= 20;
            System.out.println(" " + (aLam*10));
        });
        printMail(messageLambdaVoid);
        printMail(mail);

        Message messageLambda2 = aValue -> "Я создан с помощью lambda в переменную - " + aValue + exMainLambda;
//        printRec();

        Operation<String> stringOperation = String::concat;
        Operation<Integer> intOperation = Integer::sum;
        System.out.println(stringOperation.operation("10", "20"));
        System.out.println(intOperation.operation(10, 20) * 1);

        messageLambdaVoid.sendMessage();

        System.out.println(messageLambda2.getClass().getSimpleName());
        System.out.println(messageLambda2.getClass().getSuperclass().getSimpleName());

        Printable<String> stringPrintable = System.out::println;

        stringPrintable.print("aaa");

        State stateStart = new CreateState(0, " ", "Hello");
        State stateLoading = new LoadingState(100, "...", "LOADING...");
        State stateFail = new FailState(400, "$#$$%#$%$", "@FAIL!!!@");
        State stateFinish = new SuccessState(200, "SUCCESS", "HELLO WORLD!");

        stateStart.getState(); stateLoading.getState();stateFinish.getState();stateFail.getState();
    }

    static String print(int mes, Message message) {
        return message.sendMessage(mes);
    }

    static void printMail(Mail mail) {
        mail.sendMessage();
    }

    static void printMail2(Mail2 mail2) {
        mail2.sendMail();
    }

//    static void printRec() {
//        printMail(mailLambdaStaticREC);
//    };

}

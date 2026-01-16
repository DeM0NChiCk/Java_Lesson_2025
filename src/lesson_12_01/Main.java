package lesson_12_01;

public class Main {
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

        System.out.println(print(200, messageLambda));
        System.out.println(print(300, messageLambda));
    }

    static String print(int mes, Message message) {
        return message.sendMessage(mes);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир!");

        boolean valueBool1 = true;
        System.out.println(valueBool1);
        char valueChar2 = '1';
        char valueChar3 = 36;
        System.out.println(valueChar2);
        System.out.println(valueChar3);
        byte valueByte0;
        valueByte0 = 0; //  0000 0000          byte: -128 127
        byte valueByte1 = 1; //  0000 0001
        byte valueByteM1 = -1;// 1000 0001
        byte valueByte2 = 4; //  0000 0100
        short valueShot1 = 0; // 0000 0010 0100 0000
        int valueInt0;
        long valueLong0 = 0L;
        long valueLong1;
        System.out.println(valueByte0);
        System.out.println(valueByte1);
        valueInt0 = 0;
        System.out.println(valueByteM1);
        System.out.println(valueByte2);
        System.out.println(valueShot1);
        System.out.println(valueInt0);
        valueLong1 = 3;
        System.out.println(valueLong1 = 5);
        float valueFloat0 = 0.0124124124124F;
        double valueDouble0 = 0.0124124124124;
        System.out.println(valueFloat0);
        System.out.println(valueDouble0);
        byte value100 = 100;
        char a = (char) value100;
        System.out.println(a);
        // 0.0000000009 -> 0.000000001 | smartcast -> 0.000000000
        // camelStyle - java
        // code_style - python
        // code-style - для переменных в java нет

        value100++; // 101
        System.out.println(value100++); // 101

        if (value100 > 100) {
            System.out.println("ДА");
        } else {
            System.out.println("НЕТ");
        }
        System.out.println(++value100); // 103
    }

    // пример, как назвать метод с решением
    public static void v1n1() {

    }
}


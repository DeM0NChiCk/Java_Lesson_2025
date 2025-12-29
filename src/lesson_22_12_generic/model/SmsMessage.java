package lesson_22_12_generic.model;

public class SmsMessage extends Message {

    private String number;  // номер телефона
    public String getNumber(){ return number; }

    public SmsMessage(String text, String number) {
        super(text);
        this.number = number;
    }
}

package lesson_22_12_generic.model;

public class EmailMessage extends Message {

    private String address;  // адрес электронной почты
    public String getAddress(){ return address; }

    public EmailMessage(String text, String address) {

        super(text);
        this.address = address;
    }
}

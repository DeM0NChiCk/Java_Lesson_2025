package lesson_22_12_generic.service;

import lesson_22_12_generic.model.Message;

public class Messenger<T extends Message> {
    private T message;
    public T getMessage() { return this.message; }

    public Messenger(T message) { this.message = message;  }

    public void send() {
        System.out.println("Отправляется сообщение: " + message.getText());
    }
}

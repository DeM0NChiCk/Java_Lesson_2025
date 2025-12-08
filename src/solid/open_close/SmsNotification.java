package solid.open_close;

public class SmsNotification implements NotificationServiceLike{

    @Override
    public void send() {
        System.out.println("Письмо отправлено по смс.");
    }
}

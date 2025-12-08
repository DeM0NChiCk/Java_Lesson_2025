package solid.open_close;

public class EmailNotification implements NotificationServiceLike{
    @Override
    public void send() {
        System.out.println("Письмо отправлено на e-mail");
    }
}

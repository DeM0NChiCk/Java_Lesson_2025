package solid.open_close;

public class NotificationService {

    public void sendNotification(String type) {
        if (type.equals("email")) {
            System.out.println("Письмо отправлено на указанный e-mail");
        } else if (type.equals("sms")) {
            System.out.println("Письмо отправлено по номеру ...");
        }
    }
}

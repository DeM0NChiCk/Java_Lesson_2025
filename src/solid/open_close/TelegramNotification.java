package solid.open_close;

public class TelegramNotification implements NotificationServiceLike{
    @Override
    public void send() {
        System.out.println("Отправить уведомление по Telegram");
    }
}

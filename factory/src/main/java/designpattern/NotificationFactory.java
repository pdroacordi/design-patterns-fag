package designpattern;

public class NotificationFactory {
    public static INotification createNotification(NotificationType type) {
        INotification notification;
        switch (type) {
            case EMAIL:
                notification = new EmailNotification();
                break;
            case SMS:
                notification = new SMSNotification();
                break;
            case PUSH:
                notification = new PushNotification();
                break;
            default:
                throw new IllegalArgumentException("Tipo de notificação inválido");
        };
        return notification;
    }
}

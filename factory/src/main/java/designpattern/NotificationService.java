package designpattern;


public class NotificationService {
    public void sendNotification(NotificationType type, String recipient, String message) {
        INotification notification = NotificationFactory.createNotification(type);
        notification.configure(recipient);
        notification.send(message);
    }
}

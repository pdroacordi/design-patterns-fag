package designpattern;

public class Client {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.sendNotification(NotificationType.EMAIL, "aluno@dominio.com", "Olá!");
        service.sendNotification(NotificationType.SMS, "+5599999999", "Oi!");
        service.sendNotification(NotificationType.PUSH, "DEVICE123", "Hey!");
    }
}

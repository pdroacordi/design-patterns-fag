package designpattern;

public class SMSNotification implements INotification {
    private String phoneNumber;

    @Override
    public void configure(String target) {
        this.phoneNumber = target;
        System.out.println("Configuring SMS for: " + this.phoneNumber);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending SMS to " + this.phoneNumber + ": " + message);
    }
}

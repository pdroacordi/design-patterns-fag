package designpattern;

public class EmailNotification implements INotification {
    private String emailAddress;

    @Override
    public void configure(String target) {
        this.emailAddress = target;
        System.out.println("Configuring Email for: " + this.emailAddress);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending Email to " + this.emailAddress + ": " + message);
    }
}

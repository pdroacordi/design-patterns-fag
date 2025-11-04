package designpattern;

public interface INotification {
    void configure(String target);
    void send(String message);
}

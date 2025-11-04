package designpattern;

import designpattern.INotification;

public class PushNotification implements INotification {
    private String deviceId;

    @Override
    public void configure(String target) {
        this.deviceId = target;
        System.out.println("Configuring Push for: " + this.deviceId);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending Push to " + this.deviceId + ": " + message);
    }
}

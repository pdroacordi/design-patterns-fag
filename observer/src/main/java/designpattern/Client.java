package designpattern;

import designpattern.observers.EmailObserver;
import designpattern.observers.LogObserver;
import designpattern.observers.MetricsObserver;
import designpattern.service.UserRegistrationPublisher;

public class Client {
    public static void main(String[] args) {
        UserRegistrationPublisher userRegistrationPublisher = new UserRegistrationPublisher();

        userRegistrationPublisher.addObserver(new EmailObserver());
        userRegistrationPublisher.addObserver(new LogObserver());
        userRegistrationPublisher.addObserver(new MetricsObserver());

        userRegistrationPublisher.registerUser("aluno@faculdade.com", "senha123");
    }
}

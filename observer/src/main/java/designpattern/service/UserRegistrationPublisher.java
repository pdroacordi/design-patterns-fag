package designpattern.service;

import designpattern.observers.UserRegistrationObserver;
import java.util.ArrayList;
import java.util.List;

public class UserRegistrationPublisher {
    private final List<UserRegistrationObserver> observers = new ArrayList<>();

    public void addObserver(UserRegistrationObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(UserRegistrationObserver observer) {
        observers.remove(observer);
    }

    public void registerUser(String email, String password) {
        System.out.println("Salvando usuário " + email + " no banco de dados...");

        for (UserRegistrationObserver observer : observers) {
            try {
                observer.onUserRegistered(email);
            } catch (Exception e) {
                System.out.println("Erro ao notificar observer: " + e.getMessage());
            }
        }

        System.out.println("Usuário " + email + " cadastrado com sucesso.");
    }
}

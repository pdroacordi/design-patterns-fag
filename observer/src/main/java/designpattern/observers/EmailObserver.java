package designpattern.observers;

public class EmailObserver implements UserRegistrationObserver {
    @Override
    public void onUserRegistered(String email) {
        System.out.println("EMAIL: Enviando e-mail de boas-vindas para " + email);
    }
}

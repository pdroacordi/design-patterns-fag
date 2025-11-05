package designpattern.observers;

public class MetricsObserver implements UserRegistrationObserver {
    @Override
    public void onUserRegistered(String email) {
        System.out.println("METRICAS: Incrementando contador de novos usuários.");
    }
}

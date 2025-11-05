package designpattern.observers;

public class LogObserver implements UserRegistrationObserver {
    @Override
    public void onUserRegistered(String email) {
        System.out.println("LOG: Registrando auditoria. Ação: CADASTRO, Usuário: " + email);
    }
}

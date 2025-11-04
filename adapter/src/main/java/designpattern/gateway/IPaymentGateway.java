package designpattern.gateway;

public interface IPaymentGateway {
    boolean processPayment(String cardNumber, double amount, String cvv);
}

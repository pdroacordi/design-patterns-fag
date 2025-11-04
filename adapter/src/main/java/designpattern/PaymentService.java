package designpattern;

import designpattern.gateway.IPaymentGateway;

public class PaymentService {
    private final IPaymentGateway paymentGateway;

    public PaymentService(IPaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processOrder(double amount, String cardNumber, String cvv) {
        System.out.println("Processing payment...");
        boolean success = paymentGateway.processPayment(cardNumber, amount, cvv);
        System.out.println("Payment processed: " + (success ? "Successfully" : "Failed"));
    }
}

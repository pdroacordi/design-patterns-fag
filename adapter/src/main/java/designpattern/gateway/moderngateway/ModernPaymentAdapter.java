package designpattern.gateway.moderngateway;

import designpattern.gateway.IPaymentGateway;

public class ModernPaymentAdapter implements IPaymentGateway {
    private final ModernPaymentClient modernPayment;

    public ModernPaymentAdapter(ModernPaymentClient modernPayment) {
        this.modernPayment = modernPayment;
    }

    @Override
    public boolean processPayment(String cardNumber, double amount, String cvv) {
        return modernPayment.process(amount, cardNumber);
    }
}

package designpattern.gateway.legacygateway;

import designpattern.gateway.IPaymentGateway;

public class LegacyPaymentAdapter implements IPaymentGateway {
    private final LegacyPaymentClient legacyPayment;

    public LegacyPaymentAdapter(LegacyPaymentClient legacyPayment) {
        this.legacyPayment = legacyPayment;
    }

    @Override
    public boolean processPayment(String cardNumber, double amount, String cvv) {
        try {
            legacyPayment.process(amount, cardNumber, cvv);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

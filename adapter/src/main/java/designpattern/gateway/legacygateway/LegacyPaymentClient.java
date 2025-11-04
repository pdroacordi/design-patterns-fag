package designpattern.gateway.legacygateway;

public class LegacyPaymentClient {
    public void process(double value, String cardNumber, String cvv) {
        System.out.println("Processing payment of R$" + value + " with card " + cardNumber + " (CVV: " + cvv + ")");
    }
}

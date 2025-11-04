package designpattern.gateway.moderngateway;

import java.util.Random;

public class ModernPaymentClient {
    public boolean process(double value, String creditCard) {
        System.out.println("Processing payment of R$" + value + " with card " + creditCard);
        Random random = new Random();
        return random.nextBoolean();
    }
}

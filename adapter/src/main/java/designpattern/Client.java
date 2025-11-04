package designpattern;

import designpattern.gateway.IPaymentGateway;
import designpattern.gateway.legacygateway.LegacyPaymentAdapter;
import designpattern.gateway.legacygateway.LegacyPaymentClient;
import designpattern.gateway.moderngateway.ModernPaymentAdapter;
import designpattern.gateway.moderngateway.ModernPaymentClient;

public class Client {
    public static void main(String[] args) {
        IPaymentGateway modernPayment = new ModernPaymentAdapter(new ModernPaymentClient());
        IPaymentGateway legacyPayment = new LegacyPaymentAdapter(new LegacyPaymentClient());

        PaymentService modernPaymentService = new PaymentService(modernPayment);
        PaymentService legacyPaymentService = new PaymentService(legacyPayment);

        System.out.println("Using modern payment system:");
        modernPaymentService.processOrder(100.0, "1111-2222-3333-4444", "123");

        System.out.println("\nUsing legacy payment system:");
        legacyPaymentService.processOrder(200.0, "5555-6666-7777-8888", "456");
    }
}

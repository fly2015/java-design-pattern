package structural.bridge.examples.payment.concrete_implementor;

import structural.bridge.examples.payment.implementor.PaymentProcessor;

public class PaypalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Process paypal payment of amount:" + amount + "");
    }
}

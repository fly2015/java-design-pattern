package structural.bridge.examples.payment.concrete_implementor;

import structural.bridge.examples.payment.implementor.PaymentProcessor;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Process credit card payment of amount:" + amount );
    }
}

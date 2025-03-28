package structural.bridge.examples.payment.abstraction;

import structural.bridge.examples.payment.implementor.PaymentProcessor;

public class OnlinePayment extends Payment {
    public OnlinePayment(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Online payment");
        paymentProcessor.processPayment(amount);
    }
}

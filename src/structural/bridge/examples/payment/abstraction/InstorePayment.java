package structural.bridge.examples.payment.abstraction;

import structural.bridge.examples.payment.implementor.PaymentProcessor;

public class InstorePayment extends Payment {
    public InstorePayment(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    public void pay(double amount) {
        System.out.println("In-store payment");
        paymentProcessor.processPayment(amount);
    }
}

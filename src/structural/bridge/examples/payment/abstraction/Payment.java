package structural.bridge.examples.payment.abstraction;

import structural.bridge.examples.payment.implementor.PaymentProcessor;

public abstract class Payment {
    protected PaymentProcessor paymentProcessor;// Bridge to Implementation

    public Payment(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public abstract void pay(double amount);
}

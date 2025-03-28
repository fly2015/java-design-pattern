package structural.bridge.examples.payment;

import structural.bridge.examples.payment.abstraction.InstorePayment;
import structural.bridge.examples.payment.abstraction.OnlinePayment;
import structural.bridge.examples.payment.abstraction.Payment;
import structural.bridge.examples.payment.concrete_implementor.CreditCardProcessor;
import structural.bridge.examples.payment.concrete_implementor.PaypalProcessor;
import structural.bridge.examples.payment.implementor.PaymentProcessor;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new CreditCardProcessor();
        Payment payment = new InstorePayment(paymentProcessor);
        payment.pay(100);

        paymentProcessor = new PaypalProcessor();
        payment = new InstorePayment(paymentProcessor);
        payment.pay(2000);

        paymentProcessor = new PaypalProcessor();
        payment = new OnlinePayment(paymentProcessor);
        payment.pay(1000);

        paymentProcessor = new CreditCardProcessor();
        payment = new OnlinePayment(paymentProcessor);
        payment.pay(3000);
    }
}

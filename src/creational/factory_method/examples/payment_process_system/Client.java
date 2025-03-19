package creational.factory_method.examples.payment_process_system;

import creational.factory_method.examples.payment_process_system.method.PaymentMethod;
import creational.factory_method.examples.payment_process_system.process.BankTransferPaymentFactory;
import creational.factory_method.examples.payment_process_system.process.CreditPaymentFactory;
import creational.factory_method.examples.payment_process_system.process.PaymentFactory;
import creational.factory_method.examples.payment_process_system.process.PaypalPaymentFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Order something....");
        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type payment type: ");
        String input = reader.readLine();

        /*PaymentType paymentType = PaymentType.valueOf(input);
        PaymentFactory paymentFactory = switch (paymentType)
        {
            case CREDIT_CARD -> new CreditPaymentFactory();
            case PAYPAL -> new PaypalPaymentFactory();
            case BANK_TRANSFER -> new BankTransferPaymentFactory();
            default -> throw new IllegalStateException("Unexpected value: " + paymentType);
        };*/

        PaymentFactory paymentFactory = new CreditPaymentFactory();
        System.out.println("Payment processing...");
        PaymentMethod paymentMethod = paymentFactory.getPaymentMethod();
        paymentMethod.processPayment();
    }
}

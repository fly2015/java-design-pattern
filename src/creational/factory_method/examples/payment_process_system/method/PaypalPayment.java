package creational.factory_method.examples.payment_process_system.method;

public class PaypalPayment extends PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Paypal payment processed");
    }
}

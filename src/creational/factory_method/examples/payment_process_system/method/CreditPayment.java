package creational.factory_method.examples.payment_process_system.method;

public class CreditPayment extends PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Credit payment processed");
    }
}

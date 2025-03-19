package creational.factory_method.examples.payment_process_system.method;

public class BankTransferPayment extends PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Bank transfer payment processed");
    }
}

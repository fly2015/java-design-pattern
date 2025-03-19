package creational.factory_method.examples.payment_process_system.process;

import creational.factory_method.examples.payment_process_system.method.BankTransferPayment;
import creational.factory_method.examples.payment_process_system.method.PaymentMethod;

public class BankTransferPaymentFactory extends PaymentFactory{
    @Override
    public PaymentMethod getPaymentMethod() {
        return new BankTransferPayment();
    }
}

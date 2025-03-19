package creational.factory_method.examples.payment_process_system.process;

import creational.factory_method.examples.payment_process_system.method.CreditPayment;
import creational.factory_method.examples.payment_process_system.method.PaymentMethod;

public class CreditPaymentFactory extends PaymentFactory{
    @Override
    public PaymentMethod getPaymentMethod() {
        return new CreditPayment();
    }
}

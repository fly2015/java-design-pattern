package creational.factory_method.examples.payment_process_system.process;

import creational.factory_method.examples.payment_process_system.method.PaymentMethod;
import creational.factory_method.examples.payment_process_system.method.PaypalPayment;

public class PaypalPaymentFactory extends PaymentFactory{
    @Override
    public PaymentMethod getPaymentMethod() {
        return new PaypalPayment();
    }
}

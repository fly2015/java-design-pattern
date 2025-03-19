package creational.factory_method.examples.order.process.otp;

import creational.factory_method.examples.order.dto.Ordering;

public interface IOTPSender {
	void sendOTP();
    void sendOTP(Ordering ordering);
}

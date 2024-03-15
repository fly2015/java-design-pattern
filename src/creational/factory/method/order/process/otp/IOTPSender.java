package creational.factory.method.order.process.otp;

import creational.factory.method.order.dto.Ordering;

public interface IOTPSender {
	void sendOTP();
    void sendOTP(Ordering ordering);
}

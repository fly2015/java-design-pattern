package creational.factory.method.order.process.otp;

import creational.factory.method.order.dto.Ordering;

public class OTPSenderImpl implements IOTPSender{
	public void sendOTP() {
		// TODO Auto-generated method stub
		
	}

    /**
     * @see creational.factory.method.order.process.otp.IOTPSender#sendOTP(creational.factory.method.order.dto.Ordering)
     */
    @Override
    public void sendOTP(Ordering ordering)
    {
        System.out.println("Send OTP confirm for: " + ordering);
        
    }
}

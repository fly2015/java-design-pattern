package creational.factory_method.examples.order.process.otp;

import creational.factory_method.examples.order.dto.Ordering;

public class OTPSenderImpl implements IOTPSender{
	public void sendOTP() {
		// TODO Auto-generated method stub
		
	}

    /**
     * @see creational.factory_method.examples.order.process.otp.IOTPSender#sendOTP(creational.factory_method.examples.order.dto.Ordering)
     */
    @Override
    public void sendOTP(Ordering ordering)
    {
        System.out.println("Send OTP confirm for: " + ordering);
        
    }
}

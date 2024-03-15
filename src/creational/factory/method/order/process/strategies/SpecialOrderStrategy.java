package creational.factory.method.order.process.strategies;

import creational.factory.method.order.dto.OrderResult;
import creational.factory.method.order.dto.Ordering;
import creational.factory.method.order.process.AbstractOrderStrategy;
import creational.factory.method.order.process.otp.IOTPSender;
import creational.factory.method.order.process.sendmail.IMailSenderStrategy;

public class SpecialOrderStrategy extends AbstractOrderStrategy 
{
    private IMailSenderStrategy mailSenderStrategy;
    private IOTPSender iotpSender;
	@Override
	public OrderResult processOrder(Ordering ordering) throws Exception {
		writeOrder(ordering);
		mailSenderStrategy.sendMail(ordering);
		iotpSender.sendOTP(ordering);
		
		return new OrderResult();
	}
	
    public IMailSenderStrategy getMailSenderStrategy()
    {
        return mailSenderStrategy;
    }
    public void setMailSenderStrategy(IMailSenderStrategy mailSenderStrategy)
    {
        this.mailSenderStrategy = mailSenderStrategy;
    }
    public IOTPSender getIotpSender()
    {
        return iotpSender;
    }
    public void setIotpSender(IOTPSender iotpSender)
    {
        this.iotpSender = iotpSender;
    }
    
}

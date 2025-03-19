package creational.factory_method.examples.order.process.strategies;

import creational.factory_method.examples.order.dto.OrderResult;
import creational.factory_method.examples.order.dto.Ordering;
import creational.factory_method.examples.order.process.AbstractOrderStrategy;
import creational.factory_method.examples.order.process.otp.IOTPSender;
import creational.factory_method.examples.order.process.sendmail.IMailSenderStrategy;

public class SpecialOrderStrategy extends AbstractOrderStrategy 
{
    private IMailSenderStrategy mailSenderStrategy;
    private IOTPSender iotpSender;
	@Override
	public OrderResult processOrderHook(Ordering ordering) throws Exception {
        System.out.println("Do something for special order");
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

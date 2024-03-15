package creational.factory.method.order.process.strategies;

import creational.factory.method.order.dto.OrderResult;
import creational.factory.method.order.dto.Ordering;
import creational.factory.method.order.process.AbstractOrderStrategy;
import creational.factory.method.order.process.sendmail.IMailSenderStrategy;

public class WholeSaleOrderStrategy extends AbstractOrderStrategy
{
    private IMailSenderStrategy mailSenderStrategy;
	@Override
	public OrderResult processOrder(Ordering ordering) throws Exception {
		writeOrder(ordering);
		mailSenderStrategy.sendMail(ordering);
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
}

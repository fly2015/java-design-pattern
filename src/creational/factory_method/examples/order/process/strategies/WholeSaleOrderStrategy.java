package creational.factory_method.examples.order.process.strategies;

import creational.factory_method.examples.order.dto.OrderResult;
import creational.factory_method.examples.order.dto.Ordering;
import creational.factory_method.examples.order.process.AbstractOrderStrategy;
import creational.factory_method.examples.order.process.sendmail.IMailSenderStrategy;

public class WholeSaleOrderStrategy extends AbstractOrderStrategy
{
    private IMailSenderStrategy mailSenderStrategy;
	@Override
	public OrderResult processOrderHook(Ordering ordering) throws Exception {
        System.out.println("Do something for whole sale order");
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

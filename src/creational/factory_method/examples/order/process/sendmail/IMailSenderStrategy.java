package creational.factory_method.examples.order.process.sendmail;

import creational.factory_method.examples.order.dto.Ordering;

public interface IMailSenderStrategy {
	public void sendMail();
    public void sendMail(Ordering ordering);
}

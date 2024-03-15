package creational.factory.method.order.process.sendmail;

import creational.factory.method.order.dto.Ordering;

public interface IMailSenderStrategy {
	public void sendMail();
    public void sendMail(Ordering ordering);
}

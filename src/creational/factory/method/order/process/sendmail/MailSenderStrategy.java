package creational.factory.method.order.process.sendmail;

import creational.factory.method.order.dto.Ordering;

public class MailSenderStrategy implements IMailSenderStrategy{

	public void sendMail() {
		// TODO Auto-generated method stub
		
	}

    /**
     * @see creational.factory.method.order.process.sendmail.IMailSenderStrategy#sendMail(creational.factory.method.order.dto.Ordering)
     */
    @Override
    public void sendMail(Ordering ordering)
    {
        System.out.println("Send mail for order: " + ordering);
        
    }

}

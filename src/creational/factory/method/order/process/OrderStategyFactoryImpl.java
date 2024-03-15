package creational.factory.method.order.process;

import java.util.HashMap;
import java.util.Map;

import creational.factory.method.order.dto.OrderType;
import creational.factory.method.order.process.otp.OTPSenderImpl;
import creational.factory.method.order.process.sendmail.MailSenderStrategy;
import creational.factory.method.order.process.strategies.RetailOrderStrategy;
import creational.factory.method.order.process.strategies.SpecialOrderStrategy;
import creational.factory.method.order.process.strategies.WholeSaleOrderStrategy;

public class OrderStategyFactoryImpl implements IOrderStategyFactory{
	private static Map<OrderType, AbstractOrderStrategy> orderStrategies = new HashMap<OrderType, AbstractOrderStrategy>();
	static
	{
		//
		WholeSaleOrderStrategy wholeSaleOrderStrategy = new WholeSaleOrderStrategy();
		wholeSaleOrderStrategy.setMailSenderStrategy(new MailSenderStrategy());
		orderStrategies.put(OrderType.WHOLESALE_ORDER, wholeSaleOrderStrategy);
		
		//
		orderStrategies.put(OrderType.RETAIL_ORDER, new RetailOrderStrategy());
		
		//
		SpecialOrderStrategy specialOrderStrategy = new SpecialOrderStrategy();
		specialOrderStrategy.setIotpSender(new OTPSenderImpl());
		specialOrderStrategy.setMailSenderStrategy(new MailSenderStrategy());
		orderStrategies.put(OrderType.SPECIAL_ORDER, specialOrderStrategy);
	}
	public AbstractOrderStrategy createOrderStrategy(OrderType orderType) {
		// TODO Auto-generated method stub
		return orderStrategies.get(orderType);
	}
	
}

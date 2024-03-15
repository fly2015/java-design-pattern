package creational.factory.method.order.process.strategies;

import creational.factory.method.order.dto.OrderResult;
import creational.factory.method.order.dto.Ordering;
import creational.factory.method.order.process.AbstractOrderStrategy;

public class RetailOrderStrategy extends AbstractOrderStrategy{
	@Override
	public OrderResult processOrder(Ordering ordering) {
		writeOrder(ordering);
		
		return new OrderResult();
	}
}

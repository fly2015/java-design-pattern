package creational.factory_method.examples.order.process.strategies;

import creational.factory_method.examples.order.dto.OrderResult;
import creational.factory_method.examples.order.dto.Ordering;
import creational.factory_method.examples.order.process.AbstractOrderStrategy;

public class RetailOrderStrategy extends AbstractOrderStrategy{
	@Override
	public OrderResult processOrderHook(Ordering ordering) {
		System.out.println("Do something for retail order");
		writeOrder(ordering);
		
		return new OrderResult();
	}
}

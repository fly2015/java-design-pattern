package creational.factory.method.order.process;

import creational.factory.method.order.dto.OrderResult;
import creational.factory.method.order.dto.Ordering;

public abstract class AbstractOrderStrategy {

	public abstract OrderResult processOrder(Ordering ordering) throws Exception;
	protected void writeOrder(Ordering ordering) 
	{
		System.out.println("Writting order for order type " + ordering.getOrderType().name());
	}
}

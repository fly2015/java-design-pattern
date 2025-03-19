package creational.factory_method.examples.order.process;

import creational.factory_method.examples.order.dto.OrderResult;
import creational.factory_method.examples.order.dto.Ordering;

public abstract class AbstractOrderStrategy {

	public OrderResult processOrder(Ordering ordering) throws Exception
	{
		// do something general for all orders like validation
		validate(ordering);
		return processOrderHook(ordering);
	}

	private void validate(Ordering ordering) {

	}

	public abstract OrderResult processOrderHook(Ordering ordering) throws Exception;
	protected void writeOrder(Ordering ordering)
	{
		System.out.println("Writing order for order type " + ordering.getOrderType().name());
	}
}

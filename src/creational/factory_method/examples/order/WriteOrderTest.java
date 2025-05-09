package creational.factory_method.examples.order;

import creational.factory_method.examples.order.dto.OrderType;
import creational.factory_method.examples.order.dto.Ordering;
import creational.factory_method.examples.order.process.AbstractOrderStrategy;
import creational.factory_method.examples.order.process.IOrderStategyFactory;
import creational.factory_method.examples.order.process.OrderStategySimpleFactory;
import creational.factory_method.examples.order.process.strategies.RetailOrderStrategy;
import creational.factory_method.examples.order.process.strategies.SpecialOrderStrategy;
import creational.factory_method.examples.order.process.strategies.WholeSaleOrderStrategy;
import org.junit.Assert;
import org.junit.Test;

public class WriteOrderTest {
	@Test
	public void testWriteOrderStrategies() throws Exception
	{
		IOrderStategyFactory stategyFactory = new OrderStategySimpleFactory();
		
		Ordering ordering1 = new Ordering();
		ordering1.setOrderType(OrderType.WHOLESALE_ORDER);
		AbstractOrderStrategy orderStrategy1 = stategyFactory.createOrderStrategy(OrderType.WHOLESALE_ORDER);
		Assert.assertTrue(orderStrategy1 instanceof WholeSaleOrderStrategy);
		orderStrategy1.processOrder(ordering1);
		
		Ordering ordering2 = new Ordering();
		ordering2.setOrderType(OrderType.RETAIL_ORDER);
		AbstractOrderStrategy orderStrategy2 = stategyFactory.createOrderStrategy(OrderType.RETAIL_ORDER);
		Assert.assertTrue(orderStrategy2 instanceof RetailOrderStrategy);
		orderStrategy2.processOrder(ordering2);
		
		Ordering ordering3 = new Ordering();
		ordering3.setOrderType(OrderType.SPECIAL_ORDER);
		AbstractOrderStrategy orderStrategy3 = stategyFactory.createOrderStrategy(OrderType.SPECIAL_ORDER);
		Assert.assertTrue(orderStrategy3 instanceof SpecialOrderStrategy);
		orderStrategy3.processOrder(ordering3);
	}
}

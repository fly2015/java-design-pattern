package creational.factory_method.examples.order.process;

import creational.factory_method.examples.order.dto.OrderType;

public interface IOrderStategyFactory {
	AbstractOrderStrategy createOrderStrategy(OrderType orderType);
}

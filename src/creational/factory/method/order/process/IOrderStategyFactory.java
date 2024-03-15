package creational.factory.method.order.process;

import creational.factory.method.order.dto.OrderType;

public interface IOrderStategyFactory {
	AbstractOrderStrategy createOrderStrategy(OrderType orderType);
}

package creational.factory_method.examples.order.process;

import creational.factory_method.examples.order.dto.OrderType;
import creational.factory_method.examples.order.process.strategies.RetailOrderStrategy;

public class RetailOrderStrategyFactory implements IOrderStategyFactory {
    @Override
    public AbstractOrderStrategy createOrderStrategy(OrderType orderType) {
        return new RetailOrderStrategy();
    }
}

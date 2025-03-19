package creational.factory_method.examples.pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // this is the factory method
    // let subclasses decide which pizza to instantiate
    // factory method is abstract so subclasses are forced to implement it through inheritance
    public abstract Pizza createPizza(String type);
}

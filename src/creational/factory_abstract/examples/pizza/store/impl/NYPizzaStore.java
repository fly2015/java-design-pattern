package creational.factory_abstract.examples.pizza.store.impl;

import creational.factory_abstract.examples.pizza.impl.NYStyleClamPizza;
import creational.factory_abstract.examples.pizza.Pizza;
import creational.factory_abstract.examples.pizza.impl.NYStyleCheesePizza;
import creational.factory_abstract.examples.pizza.impl.NYStylePepperoniPizza;
import creational.factory_abstract.examples.pizza.impl.NYStyleVeggiePizza;
import creational.factory_abstract.examples.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory_abstract.examples.pizza.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public NYPizzaStore(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza(pizzaIngredientFactory);
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza(pizzaIngredientFactory);
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza(pizzaIngredientFactory);
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza(pizzaIngredientFactory);
        } else {
            return null;
        }
    }
}

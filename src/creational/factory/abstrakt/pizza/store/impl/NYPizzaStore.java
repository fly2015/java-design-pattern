package creational.factory.abstrakt.pizza.store.impl;

import creational.factory.abstrakt.pizza.Pizza;
import creational.factory.abstrakt.pizza.impl.*;
import creational.factory.abstrakt.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory.abstrakt.pizza.store.PizzaStore;

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

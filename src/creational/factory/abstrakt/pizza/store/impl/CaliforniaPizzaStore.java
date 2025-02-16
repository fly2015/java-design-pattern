package creational.factory.abstrakt.pizza.store.impl;

import creational.factory.abstrakt.pizza.Pizza;
import creational.factory.abstrakt.pizza.impl.CaliforniaStyleCheesePizza;
import creational.factory.abstrakt.pizza.impl.CaliforniaStyleClamPizza;
import creational.factory.abstrakt.pizza.impl.CaliforniaStylePepperoniPizza;
import creational.factory.abstrakt.pizza.impl.CaliforniaStyleVeggiePizza;
import creational.factory.abstrakt.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory.abstrakt.pizza.store.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {
    private PizzaIngredientFactory  pizzaIngredientFactory;
    public CaliforniaPizzaStore(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza(pizzaIngredientFactory);
        } else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza(pizzaIngredientFactory);
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza(pizzaIngredientFactory);
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza(pizzaIngredientFactory);
        } else {
            return null;
        }
    }
}

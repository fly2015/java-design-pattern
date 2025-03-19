package creational.factory_abstract.examples.pizza.store.impl;

import creational.factory_abstract.examples.pizza.impl.CaliforniaStyleCheesePizza;
import creational.factory_abstract.examples.pizza.impl.CaliforniaStyleClamPizza;
import creational.factory_abstract.examples.pizza.impl.CaliforniaStyleVeggiePizza;
import creational.factory_abstract.examples.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory_abstract.examples.pizza.Pizza;
import creational.factory_abstract.examples.pizza.impl.CaliforniaStylePepperoniPizza;
import creational.factory_abstract.examples.pizza.store.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {
    private PizzaIngredientFactory pizzaIngredientFactory;
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

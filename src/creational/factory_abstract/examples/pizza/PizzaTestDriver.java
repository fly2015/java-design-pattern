package creational.factory_abstract.examples.pizza;

import creational.factory_abstract.examples.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory_abstract.examples.pizza.store.impl.CaliforniaPizzaStore;
import creational.factory_abstract.examples.pizza.store.impl.NYPizzaStore;
import creational.factory_abstract.examples.pizza.ingredient.factory.impl.CaliforniaPizzaIngredientFactory;
import creational.factory_abstract.examples.pizza.ingredient.factory.impl.NYPizzaIngredientFactory;
import creational.factory_abstract.examples.pizza.store.PizzaStore;

public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaIngredientFactory californiaPizzaIngredientFactory = new CaliforniaPizzaIngredientFactory();
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore(californiaPizzaIngredientFactory);
        Pizza pizza = californiaPizzaStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName() + "\n");

        PizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
        PizzaStore nyPizzaStore = new NYPizzaStore(nyPizzaIngredientFactory);
        pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName() + "\n");
    }
}

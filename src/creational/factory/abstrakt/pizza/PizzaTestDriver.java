package creational.factory.abstrakt.pizza;

import creational.factory.abstrakt.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory.abstrakt.pizza.ingredient.factory.impl.CaliforniaPizzaIngredientFactory;
import creational.factory.abstrakt.pizza.ingredient.factory.impl.NYPizzaIngredientFactory;
import creational.factory.abstrakt.pizza.store.PizzaStore;
import creational.factory.abstrakt.pizza.store.impl.CaliforniaPizzaStore;
import creational.factory.abstrakt.pizza.store.impl.NYPizzaStore;

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

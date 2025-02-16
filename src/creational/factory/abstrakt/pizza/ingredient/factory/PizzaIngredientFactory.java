package creational.factory.abstrakt.pizza.ingredient.factory;

import creational.factory.abstrakt.pizza.ingredient.Cheese;
import creational.factory.abstrakt.pizza.ingredient.Dough;
import creational.factory.abstrakt.pizza.ingredient.Sauce;
import creational.factory.abstrakt.pizza.ingredient.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
}

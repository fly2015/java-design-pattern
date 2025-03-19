package creational.factory_abstract.examples.pizza.ingredient.factory.impl;

import creational.factory_abstract.examples.pizza.ingredient.Dough;
import creational.factory_abstract.examples.pizza.ingredient.Sauce;
import creational.factory_abstract.examples.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory_abstract.examples.pizza.ingredient.Cheese;
import creational.factory_abstract.examples.pizza.ingredient.Veggies;
import creational.factory_abstract.examples.pizza.ingredient.impl.NYChease;
import creational.factory_abstract.examples.pizza.ingredient.impl.NYDough;
import creational.factory_abstract.examples.pizza.ingredient.impl.NYSauce;
import creational.factory_abstract.examples.pizza.ingredient.impl.NYVeggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NYChease();
    }

    @Override
    public Veggies[] createVeggies() {
        return new NYVeggies[0];
    }
}

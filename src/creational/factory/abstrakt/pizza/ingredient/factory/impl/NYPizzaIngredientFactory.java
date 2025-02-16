package creational.factory.abstrakt.pizza.ingredient.factory.impl;

import creational.factory.abstrakt.pizza.ingredient.Cheese;
import creational.factory.abstrakt.pizza.ingredient.Dough;
import creational.factory.abstrakt.pizza.ingredient.Sauce;
import creational.factory.abstrakt.pizza.ingredient.Veggies;
import creational.factory.abstrakt.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory.abstrakt.pizza.ingredient.impl.NYChease;
import creational.factory.abstrakt.pizza.ingredient.impl.NYDough;
import creational.factory.abstrakt.pizza.ingredient.impl.NYSauce;
import creational.factory.abstrakt.pizza.ingredient.impl.NYVeggies;

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

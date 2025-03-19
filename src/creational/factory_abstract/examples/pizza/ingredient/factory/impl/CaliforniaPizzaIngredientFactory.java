package creational.factory_abstract.examples.pizza.ingredient.factory.impl;

import creational.factory_abstract.examples.pizza.ingredient.Dough;
import creational.factory_abstract.examples.pizza.ingredient.Sauce;
import creational.factory_abstract.examples.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory_abstract.examples.pizza.ingredient.Cheese;
import creational.factory_abstract.examples.pizza.ingredient.Veggies;
import creational.factory_abstract.examples.pizza.ingredient.impl.CaliforniaCheese;
import creational.factory_abstract.examples.pizza.ingredient.impl.CaliforniaDough;
import creational.factory_abstract.examples.pizza.ingredient.impl.CaliforniaSauce;
import creational.factory_abstract.examples.pizza.ingredient.impl.CaliforniaVeggies;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new CaliforniaDough();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new CaliforniaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new CaliforniaVeggies[0];
    }
}

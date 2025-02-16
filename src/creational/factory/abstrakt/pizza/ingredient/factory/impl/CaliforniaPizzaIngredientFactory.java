package creational.factory.abstrakt.pizza.ingredient.factory.impl;

import creational.factory.abstrakt.pizza.ingredient.Cheese;
import creational.factory.abstrakt.pizza.ingredient.Dough;
import creational.factory.abstrakt.pizza.ingredient.Sauce;
import creational.factory.abstrakt.pizza.ingredient.Veggies;
import creational.factory.abstrakt.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory.abstrakt.pizza.ingredient.impl.CaliforniaCheese;
import creational.factory.abstrakt.pizza.ingredient.impl.CaliforniaDough;
import creational.factory.abstrakt.pizza.ingredient.impl.CaliforniaSauce;
import creational.factory.abstrakt.pizza.ingredient.impl.CaliforniaVeggies;

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

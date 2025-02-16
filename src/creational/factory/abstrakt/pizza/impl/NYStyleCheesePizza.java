package creational.factory.abstrakt.pizza.impl;

import creational.factory.abstrakt.pizza.Pizza;
import creational.factory.abstrakt.pizza.ingredient.Cheese;
import creational.factory.abstrakt.pizza.ingredient.Veggies;
import creational.factory.abstrakt.pizza.ingredient.factory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        setName("NY Style Cheese Pizza");
        creational.factory.abstrakt.pizza.ingredient.Dough nyDough = ingredientFactory.createDough();
        creational.factory.abstrakt.pizza.ingredient.Sauce nySauce = ingredientFactory.createSauce();
        Veggies[] nyVeggies = ingredientFactory.createVeggies();
        Cheese vyCheese = ingredientFactory.createCheese();
    }
}

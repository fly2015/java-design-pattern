package creational.factory.abstrakt.pizza.impl;

import creational.factory.abstrakt.pizza.Pizza;
import creational.factory.abstrakt.pizza.ingredient.Cheese;
import creational.factory.abstrakt.pizza.ingredient.Veggies;
import creational.factory.abstrakt.pizza.ingredient.factory.PizzaIngredientFactory;

public class CaliforniaStyleClamPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public CaliforniaStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    public void prepare() {
        setName("California Style Clam Pizza");
        creational.factory.abstrakt.pizza.ingredient.Dough dough = ingredientFactory.createDough();
        creational.factory.abstrakt.pizza.ingredient.Sauce sauce = ingredientFactory.createSauce();
        Cheese cheese = ingredientFactory.createCheese();
        Veggies[] veggies = ingredientFactory.createVeggies();
    }
}

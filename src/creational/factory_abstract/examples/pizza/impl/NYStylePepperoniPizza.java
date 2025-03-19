package creational.factory_abstract.examples.pizza.impl;

import creational.factory_abstract.examples.pizza.ingredient.Dough;
import creational.factory_abstract.examples.pizza.ingredient.Sauce;
import creational.factory_abstract.examples.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory_abstract.examples.pizza.Pizza;
import creational.factory_abstract.examples.pizza.ingredient.Cheese;
import creational.factory_abstract.examples.pizza.ingredient.Veggies;

public class NYStylePepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public NYStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        setName("NY Style Pepperoni Pizza");
        Dough nyDough = ingredientFactory.createDough();
        Sauce nySauce = ingredientFactory.createSauce();
        Veggies[] nyVeggies = ingredientFactory.createVeggies();
        Cheese vyCheese = ingredientFactory.createCheese();
    }
}

package creational.factory_abstract.examples.pizza.impl;

import creational.factory_abstract.examples.pizza.Pizza;
import creational.factory_abstract.examples.pizza.ingredient.Cheese;
import creational.factory_abstract.examples.pizza.ingredient.Dough;
import creational.factory_abstract.examples.pizza.ingredient.Sauce;
import creational.factory_abstract.examples.pizza.ingredient.Veggies;
import creational.factory_abstract.examples.pizza.ingredient.factory.PizzaIngredientFactory;

public class CaliforniaStyleCheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public CaliforniaStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
       this.ingredientFactory = ingredientFactory;
    }


    @Override
    public void prepare() {
        setName("California Style Cheese Pizza");
        Dough nyDough = ingredientFactory.createDough();
        Sauce nySauce = ingredientFactory.createSauce();
        Veggies[] nyVeggies = ingredientFactory.createVeggies();
        Cheese vyCheese = ingredientFactory.createCheese();
    }
}

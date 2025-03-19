package creational.factory_abstract.examples.pizza.impl;

import creational.factory_abstract.examples.pizza.Pizza;
import creational.factory_abstract.examples.pizza.ingredient.Dough;
import creational.factory_abstract.examples.pizza.ingredient.Sauce;
import creational.factory_abstract.examples.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory_abstract.examples.pizza.ingredient.Cheese;
import creational.factory_abstract.examples.pizza.ingredient.Veggies;

public class CaliforniaStyleVeggiePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public CaliforniaStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        setName("California Style Veggie Pizza");
        Dough dough = ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
        Cheese cheese = ingredientFactory.createCheese();
        Veggies[] veggies = ingredientFactory.createVeggies();
    }
}

package creational.factory_abstract.examples.pizza.impl;

import creational.factory_abstract.examples.pizza.Pizza;
import creational.factory_abstract.examples.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory_abstract.examples.pizza.ingredient.Cheese;
import creational.factory_abstract.examples.pizza.ingredient.Veggies;

public class CaliforniaStylePepperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public CaliforniaStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        setName("California Style Pepperoni Pizza");
        creational.factory_abstract.examples.pizza.ingredient.Dough dough = ingredientFactory.createDough();
        creational.factory_abstract.examples.pizza.ingredient.Sauce sauce = ingredientFactory.createSauce();
        Cheese cheese = ingredientFactory.createCheese();
        Veggies[] veggies = ingredientFactory.createVeggies();
    }
}

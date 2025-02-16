package creational.factory.abstrakt.pizza.impl;

import creational.factory.abstrakt.pizza.Pizza;
import creational.factory.abstrakt.pizza.ingredient.factory.PizzaIngredientFactory;
import creational.factory.abstrakt.pizza.ingredient.Cheese;
import creational.factory.abstrakt.pizza.ingredient.Veggies;

public class CaliforniaStylePepperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public CaliforniaStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        setName("California Style Pepperoni Pizza");
        creational.factory.abstrakt.pizza.ingredient.Dough dough = ingredientFactory.createDough();
        creational.factory.abstrakt.pizza.ingredient.Sauce sauce = ingredientFactory.createSauce();
        Cheese cheese = ingredientFactory.createCheese();
        Veggies[] veggies = ingredientFactory.createVeggies();
    }
}

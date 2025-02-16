package creational.factory.abstrakt.pizza;

import creational.factory.abstrakt.pizza.ingredient.Cheese;
import creational.factory.abstrakt.pizza.ingredient.Veggies;

public abstract class Pizza {
    private String name;
    creational.factory.abstrakt.pizza.ingredient.Dough Dough;
    creational.factory.abstrakt.pizza.ingredient.Sauce Sauce;
    Veggies[] veggies;
    Cheese cheese;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

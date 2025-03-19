package creational.factory_method.examples.pizza;

public class CaliforniaStyleVeggiePizza extends Pizza {
    public CaliforniaStyleVeggiePizza() {
        name = "California Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

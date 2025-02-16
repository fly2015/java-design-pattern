package creational.factory.method.pizza;

public class CaliforniaStyleClamPizza extends Pizza {
    public CaliforniaStyleClamPizza() {
        name = "California Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

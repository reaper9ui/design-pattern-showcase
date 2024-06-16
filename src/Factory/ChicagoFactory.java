package Factory;

import FoodItems.Pizza;

public class ChicagoFactory extends PizzaStore{
    Pizza pizza;

    public ChicagoFactory(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Pizza createPizza(String pizza) {
        return null;
        // NEEDS COOKING  :D
    }
}

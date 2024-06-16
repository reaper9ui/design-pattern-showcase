package Factory;

import FoodItems.Pizza;

public class NewYakFactory extends PizzaStore {
    Pizza pizza;

    public NewYakFactory(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Pizza createPizza(String pizza) {
        return null;
        //   NEEDS  COOKING : D
    }
}

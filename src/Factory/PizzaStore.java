package Factory;

import FoodItems.Pizza;

public abstract class PizzaStore {
    Pizza pizza;

    public Pizza orderPizza(String pizza){

        this.pizza = createPizza(pizza);


        return this.pizza;
    }

    public abstract Pizza createPizza(String pizza);
}

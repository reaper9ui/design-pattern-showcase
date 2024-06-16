package Toppings;

import FoodItems.Pizza;

public class Pepperono extends ToppingDecorator{

    Pizza pizza;
    public Pepperono(Pizza pizza) {
        this.pizza = pizza;
    }

    public double cost(){
        return .20 + pizza.cost();
    }

}

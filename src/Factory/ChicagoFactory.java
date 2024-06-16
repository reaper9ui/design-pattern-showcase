package Factory;

import FoodItems.Pizza;
import PizzaTypes.MegaPizza;

public class ChicagoFactory extends PizzaStore{
    Pizza pizza;

    @Override
    public Pizza createPizza(String pizza) {
       if(pizza.equals("MegaPizza")){
            return new MegaPizza();
       }

       return null;
    }
}

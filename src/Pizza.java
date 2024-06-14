import Toppings.Topping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Pizza extends Order{

    Stack<Topping> toppingStack = new Stack<>();
    String crust;
    boolean gluten;


    public ArrayList<Topping> getToppings(){
        ArrayList<Topping> toppingArr = new ArrayList<>();

        while(!toppingStack.isEmpty()) {
            Topping tmp = toppingStack.pop();
            toppingArr.add(tmp);
        }
        return toppingArr;
    }






}

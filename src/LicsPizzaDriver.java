import Employees.Waiter;
import Factory.ChicagoFactory;
import Factory.NewYakFactory;
import Factory.PizzaStore;
import Factory.ShopChooser;
import FoodItems.Pizza;
import Menu.DinnerMenu;
import Menu.MenuComponent;
import Toppings.Pepperono;

import java.util.Scanner;

public class LicsPizzaDriver {

    public static void main(String[] args) {
        PizzaStore factory = null;
        ShopChooser shop = new ShopChooser();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a number for each location: \n " +
                " 1. NYC Shop \n" +
                " 2. Chicago Shop \n ");
        int chooseShop = scanner.nextInt();
        factory = shop.Shopper(chooseShop);

        scanner.nextLine();

        MenuComponent dinnerMenu = new DinnerMenu("Dinner Menu", "Menu for Dinner");
        MenuComponent allMenus = new MenuComponent();

        Waiter waiter = new Waiter(allMenus);

      //Before waiter will ever print id need to fix the iterator

        System.out.print("What will you have for FoodItems.Pizza?:  \n " );
        waiter.printMenu();
        String Entree = scanner.nextLine();
        Pizza flower = new Pizza();
        flower = factory.createPizza(Entree);
        flower.print();
        System.out.print("Any Toppings ( i recommend )?:  \n " );
        String toppers = scanner.nextLine();
        if(toppers.equals("Pepperono")){
            flower = new Pepperono(flower);
        }
//      System.out.print("Anything else?:  \n " );
//      String addOns = scanner.nextLine();
        System.out.print("Sounds good, we will have that right out for you" + flower.cost());
    }
}
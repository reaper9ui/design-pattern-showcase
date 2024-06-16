import Employees.Waiter;
import Menu.DinnerMenu;
import Menu.MenuComponent;

import java.util.Scanner;

public class LicsPizzaDriver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose Your Store : \n " +
                " NYC Shop \n" +
                " Sussex Shop \n" +
                " Chicago Shop \n ");
        String chooseShop = scanner.nextLine();

        MenuComponent dinnerMenu = new DinnerMenu("Dinner Menu", "Menu for Dinner");
        MenuComponent allMenus = new MenuComponent();

        Waiter waiter = new Waiter(allMenus);

      //Before waiter will ever print id need to fix the iterator

        System.out.print("What will you have for FoodItems.Pizza?:  \n " );
        waiter.printMenu();
        String Entree = scanner.nextLine();
        System.out.print("Anything else?:  \n " );
        String addOns = scanner.nextLine();
        System.out.print("Sounds good, we will have that right out for you");
    }
}
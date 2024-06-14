

//i been tryna get geeked all night

import Employees.Waiter;
import Menu.DinnerMenu;
import Menu.MenuComponent;
import Menu.MenuItem;

public class LicsPizzaDriver {
    public static void main(String[] args) {

        MenuComponent dinnerMenu = new DinnerMenu("Dinner Menu", "Menu for Dinner");
        MenuComponent allMenus = new MenuComponent();

        Waiter waiter = new Waiter(allMenus);

        waiter.printMenu(); //Before waiter will ever print id need to fix the iterator


    }
}
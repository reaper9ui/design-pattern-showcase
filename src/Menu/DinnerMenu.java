package Menu;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class DinnerMenu extends MenuComponent {
    ArrayList<MenuComponent> menu = new ArrayList();
    String name;
    String description;

    public DinnerMenu(String name, String description) {
        this.name = name;
        this.description = description;

    }

    @Override
    public void add(MenuComponent menuComponent) {
        menu.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menu.remove(menuComponent);
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.print(getDescription());


        Iterator iterator = menu.iterator();
        while (iterator.hasNext()) {
            MenuComponent item = (MenuComponent)iterator.next();
            item.print();
        }
    }

}

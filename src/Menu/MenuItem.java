package Menu;

public class MenuItem extends MenuComponent{

    String name;
    String description;
    boolean vegan;
    double price;

    public MenuItem(String name
            ,String description
            ,boolean vegan
            ,boolean gluten
            ,double price){
        this.name = name;
        this.description = description;
        this.vegan = vegan;
        this.price = price;
    }

    @Override
    public void print(){
        System.out.print(getName());
        if(vegan)System.out.print("v");
        System.out.print(getDescription());
        System.out.print(getPrice());
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isVegan() {
        return vegan;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

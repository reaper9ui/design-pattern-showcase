package Menu;

import java.util.Iterator;

public class MenuComponent implements Iterator {

        public void add(MenuComponent menuItem){
            throw new UnsupportedOperationException("Can not add to menu item ");
        }

        public void remove (MenuComponent menuItem){
            throw new UnsupportedOperationException();
        }

        public MenuComponent getItem(int i ){
            throw new UnsupportedOperationException();
        }

        public String getDescription() {
            throw new UnsupportedOperationException();
        }

        public double getPrice(){
            throw new UnsupportedOperationException();
        }

        public boolean isVegan(){
            throw new UnsupportedOperationException();
        }

        public boolean isGluten(){
            throw new UnsupportedOperationException();
        }

        public  void print(){

        }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}

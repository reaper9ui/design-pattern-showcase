package Factory;

public class ShopChooser {
   public PizzaStore Shopper(int chooseShop) {

       if (chooseShop == 1) {
           return  new NewYakFactory();
       } else {
           return  new ChicagoFactory();
       }

   }

}

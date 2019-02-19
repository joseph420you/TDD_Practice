/**
 * Created by Joseph on 2019/2/19.
 */
public class Cashier {
    final private int PRICE = 100;
    private ShoppingCar shoppingCar;

    public int account(Books... books) {
        shoppingCar = new ShoppingCar(books);
        return getCost();
    }

    private int getCost(){
        return (int)(PRICE * shoppingCar.getDiffBookAmount() * shoppingCar.getDiscount());
    }
}
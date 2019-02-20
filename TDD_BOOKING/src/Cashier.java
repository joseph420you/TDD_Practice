/**
 * Created by Joseph on 2019/2/19.
 */
public class Cashier {
    final private int PRICE = 100;
    private ShoppingCar shoppingCar;
    private Books[] books;

    public int account(Books... books) {
        this.books = books;
        this.shoppingCar = new ShoppingCar(books);
        return getCost();
    }

    private int getCost(){
        if(books.length==2 && books[0].equals(books[1])){
            return (int)(2 * PRICE * shoppingCar.getDiffBookAmount() * shoppingCar.getDiscount());
        }else {
            return (int) (PRICE * shoppingCar.getDiffBookAmount() * shoppingCar.getDiscount());
        }
    }
}
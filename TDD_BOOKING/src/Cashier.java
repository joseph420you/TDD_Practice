/**
 * Created by Joseph on 2019/2/19.
 */
public class Cashier {
    public int account(Books... books) {
        if(books.length==2 && !books[0].equals(books[1])){
            return (int)(100*2*0.95);
        }
        return 100;
    }
}
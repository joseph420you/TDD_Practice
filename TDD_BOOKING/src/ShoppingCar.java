import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Joseph on 2019/2/19.
 */
public class ShoppingCar {
    private Set<Books> filter;

    public ShoppingCar(Books... books) {
        this.filter = new HashSet<Books>(Arrays.asList(books));
    }

    public double getDiscount() {
        switch (filter.size()){
            case 1:
                return 1;
            case 2:
                return 0.95;
            case 3:
                return 0.90;
            case 4:
                return 0.80;
            default:
                return 0.75;
        }
    }

    public int getDiffBookAmount() {
        return filter.size();
    }
}

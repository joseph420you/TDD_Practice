import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Joseph on 2019/2/19.
 */
public class TestBooking {
    @Test
    public void buyOneBookCost100() {
        Cashier cashier = new Cashier();
        int cost = cashier.account(Books.A);
        assertEquals(100, cost);
    }
}
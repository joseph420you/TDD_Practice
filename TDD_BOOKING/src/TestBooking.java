import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Joseph on 2019/2/19.
 */
public class TestBooking {

    private Cashier cashier;

    @Before
    public void init() {
        this.cashier = new Cashier();
    }

    @Test
    public void buy_One_Book_Cost_100() {
        resultShouldBe(100, cashier.account(Books.A));
    }

    @Test
    public void buy_2_Diff_Books_Cost_190_With_5_Per_Discount() {
        resultShouldBe(190, cashier.account(Books.A, Books.B));
    }

    private void resultShouldBe(int expected, int cost) {
        assertEquals(expected, cost);
    }
}
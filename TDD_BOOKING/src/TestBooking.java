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

    @Test
    public void buy_3_Diff_Books_Cost_270_With_10_Per_Discount() {
        resultShouldBe(270, cashier.account(Books.A, Books.B, Books.C));
    }

    @Test
    public void buy_4_Diff_Books_Cost_320_With_20_Per_Discount() {
        resultShouldBe(320, cashier.account(Books.A, Books.B, Books.C, Books.D));
    }

    @Test
    public void buy_5_Diff_Books_Cost_375_With_25_Per_Discount() {
        resultShouldBe(375, cashier.account(Books.A, Books.B, Books.C, Books.D, Books.E));
    }

    private void resultShouldBe(int expected, int cost) {
        assertEquals(expected, cost);
    }
}
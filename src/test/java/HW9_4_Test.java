import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HW9_4_Test {

    /**
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    HW9_4 bv;

    @BeforeEach
    void setUp() {
       bv = new HW9_4();
    }

    @Order(1)
    @Test
    public void testHW9HappyPathBiggerValueFirst() {
        int expected = 9999;

        int actual = bv.BiggerValue(3333, 9999);

        Assertions.assertEquals(expected, actual);
    }

    @Order(2)
    @Test
    public void testHW9HappyPathBiggerValueSecond() {
        int expected = 0;

        int actual = bv.BiggerValue(-3333, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Order(2)
    @Test
    public void testHW9HappyPathBiggerValueNegativeNumbers() {
        int expected = -1;

        int actual = bv.BiggerValue(-3333, -1);

        Assertions.assertEquals(expected, actual);
    }

    @Order(2)
    @Test
    public void testHW9HappyPathBiggerValueNegative() {
        int expected = 0;

        int actual = bv.BiggerValue(-2, -2);

        Assertions.assertEquals(expected, actual);
    }



}

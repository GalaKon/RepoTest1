import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HW9_6_Test {

    /**
     * Test Data:
     * 89, 89
     * Expected result: 0
     * -89, 89
     * Expected result: -1
     * 89, -89
     * Expected result: 1
     */

    HW9_6 ane;

    @BeforeEach
    void setUp() {
        ane = new HW9_6();
    }

    @Order(1)
    @Test

    public void testHW9HappyPathAreNumbersEqualZero() {
        int expected = 0;

        int actual = ane.AreNumbersEqual(89, 89);

        Assertions.assertEquals(expected, actual);
    }

    @Order(2)
    @Test

    public void testHW9HappyPathAreNumbersEqualMinusOne() {
        int expected = -1;

        int actual = ane.AreNumbersEqual(-89, 89);

        Assertions.assertEquals(expected, actual);
    }

    @Order(3)
    @Test

    public void testHW9HappyPathAreNumbersEqualPlusOne() {
        int expected = 1;

        int actual = ane.AreNumbersEqual(89, -89);

        Assertions.assertEquals(expected, actual);
    }

    @Order(4)
    @Test

    public void testHW9HappyPathAreNumbersNegative() {
        int expected = 0;

        int actual = ane.AreNumbersEqual(0, 0);

        Assertions.assertEquals(expected, actual);
    }

}

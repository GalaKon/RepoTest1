import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HW9_3_Test {
    /**
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     * {-7, -3} → -10
     */

    HW9_3 sa;

    @BeforeEach
    void setUp() {
        sa = new HW9_3();}

    @Order(1)
    @Test
    public void testHW9HappyPathSumArrayFirst() {
        int expected = 15;
        int[] array = {0, 1, 2, 3, 4, 5};

        int actual = sa.sumArray(array);

        Assertions.assertEquals(expected, actual);
    }

    @Order(2)
    @Test
    public void testHW9HappyPathSumArraySecond() {
        int expected = -10;
        int[] array = {-7, -3};

        int actual = sa.sumArray(array);

        Assertions.assertEquals(expected, actual);
    }

    @Order(3)
    @Test
    public void testHW9HappyPathSumArrayNegative() {
        int expected = 0;
        int[] array = {};

        int actual = sa.sumArray(array);

        Assertions.assertEquals(expected, actual);
    }

    @Order(4)
    @Test
    public void testHW9HappyPathSumArrayNegativeNumber() {
        int expected = -50;
        int[] array = {-50};

        int actual = sa.sumArray(array);

        Assertions.assertEquals(expected, actual);
    }

    @Order(4)
    @Test
    public void testHW9HappyPathSumArrayNegativeNumbers() {
        int expected = -50;
        int[] array = {-10, -3, -2, -7, -1, 0, -4, -3, -12, -8};

        int actual = sa.sumArray(array);

        Assertions.assertEquals(expected, actual);
    }


}

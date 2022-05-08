import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HW9_8_Test {

    /**
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    HW9_8 mma;

    @BeforeEach
    void setUp() {

        mma = new HW9_8();
    }

    @Order(1)
    @Test
    public void testHW9HappyPathMinMaxAve() {

        int[] expected = {3, 7, 5};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] actual = mma.MinMaxAve(array, 2, 6);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Order(3)
    @Test
    public void testHW9NegativeMinMaxAve() {

        int[] expected = {};
        int[] array = {};

        int[] actual = mma.MinMaxAve(array, 2, 6);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Order(2)
    @Test
    public void testHW9HappyPathMinMaxAveSecond() {

        int[] expected = {200, 2000000, 444440};
        int[] array = {2, 20, 200, 2000, 20000, 200000, 2000000, 20000000};

        int[] actual = mma.MinMaxAve(array, 2, 6);

        Assertions.assertArrayEquals(expected, actual);
    }

}

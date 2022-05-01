import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HW9_1_Test {
    HW9_1 oe;

    @BeforeEach
    void setUp() {
        oe = new HW9_1();
    }

    /** 1.
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     * 2147483647 + 1 →  “Undefined”
     */

    @Order(1)
    @Test
    public void testHW9HappyPathOdd() {

        int a = -345;
        String expected = "Odd";

        HW9_1 oe = new HW9_1();
        String actual = oe.OddEven(a);

        Assertions.assertEquals(expected, actual);
    }

    @Order(2)
    @Test
    public void testHW9HappyPathEvenFirst() {

        int a = 0;
        String expected = "Even";

        HW9_1 oe = new HW9_1();
        String actual = oe.OddEven(a);

        Assertions.assertEquals(expected, actual);
    }

    @Order(3)
    @Test
    public void testHW9HappyPathEvenSecond() {

        int a = 222222;
        String expected = "Even";

        HW9_1 oe = new HW9_1();
        String actual = oe.OddEven(a);

        Assertions.assertEquals(expected, actual);
    }

    @Order(4)
    @Test
    public void testHW9HappyPathUndefined() {

        int a = 2147483647 + 1;
        String expected = "Undefined";

        HW9_1 oe = new HW9_1();
        String actual = oe.OddEven(a);

        Assertions.assertEquals(expected, actual);
    }

    @Order(5)
    @Test
    public void testHW9Negative() {

        int a = -2147483648;
        String expected = "Undefined";

        HW9_1 oe = new HW9_1();
        String actual = oe.OddEven(a);

        Assertions.assertEquals(expected, actual);
    }


}

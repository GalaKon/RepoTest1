import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HW9_5_Test {

    /**
     * Проверьте работу метода на числах 555, 0 и -555.
     */

    HW9_5 pn;

    @BeforeEach
    void setUp() {
        pn = new HW9_5();
    }

    @Order(1)
    @Test

    public void testHW9HappyPathIsPositiveNumberFirst() {
        boolean expected = true;

        boolean actual = pn.IsPositiveNumber(555);

        Assertions.assertEquals(expected, actual);
    }

    @Order(2)
    @Test

    public void testHW9HappyPathIsPositiveNumberZero() {
        boolean expected = true;

        boolean actual = pn.IsPositiveNumber(0);

        Assertions.assertEquals(expected, actual);
    }

    @Order(3)
    @Test

    public void testHW9IsPositiveNumberNegativeNumber() {
        boolean expected = false;

        boolean actual = pn.IsPositiveNumber(-555);

        Assertions.assertEquals(expected, actual);
    }

    @Order(4)
    @Test

    public void testHW9IsPositiveNumberTooLargeInt() {
        boolean expected = false;

        boolean actual = pn.IsPositiveNumber(2147483647 + 1);

        Assertions.assertEquals(expected, actual);
    }

}

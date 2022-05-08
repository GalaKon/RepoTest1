import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HW9_7_Test {

    /**
     * If M is multiple of 3 and 5 then return "Good Number".
     * If M is only multiple of 3 and not of 5 then return "Bad Number"
     * If M is only multiple of 5 and not of 3 then return "Poor Number"
     * If M doesn't satisfy any of the above conditions then return "-1"
     */

    HW9_7 nm;

    @BeforeEach
    void setUp() {
        nm = new HW9_7();
    }

    @Order(1)
    @Test

    public void testHW9HappyPathGoodNumber() {
        String  expected = "Good Number";

        String actual = nm.numberM(15);

        Assertions.assertEquals(expected, actual);
    }

    @Order(2)
    @Test

    public void testHW9HappyPathBadNumber() {
        String  expected = "Bad Number";

        String actual = nm.numberM(9);

        Assertions.assertEquals(expected, actual);
    }

    @Order(3)
    @Test

    public void testHW9HappyPathPoorNumber() {
        String  expected = "Poor Number";

        String actual = nm.numberM(10);

        Assertions.assertEquals(expected, actual);
    }

    @Order(4)
    @Test

    public void testHW9HappyPathMinusOne() {
        String  expected = "-1";

        String actual = nm.numberM(1);

        Assertions.assertEquals(expected, actual);
    }

//    @Order(4)
//    @Test
//
//    public void testHW9HappyNegative() {
//        String  expected = " ";
//
//        String actual = nm.numberM(2147483647 + 2);
//
//        Assertions.assertEquals(expected, actual);
//    }


}

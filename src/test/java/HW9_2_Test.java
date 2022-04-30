import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_2_Test {

    /**
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result = {590, 985, 68}
     *
     */
    @Test
    public void testHW9_2_HappyPath() {

//        int start = -45;
//        int end = 68;
//        int step = 1;
        int[] expected = {590, 985, 68};
        int[] array = {-45, 590, 234, 985, 12, 68};

        HW9_2 oi = new HW9_2();
        int[] actual = oi.OddIndices(array);

        Assertions.assertArrayEquals(expected, actual);
    }


}

public class HW9_4 {

    /**
     * Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
     */

    public int BiggerValue(int a, int b) {

        int max;

        if (a > b) {
            max = a;
        } else if (b > a) {
            max = b;
        } else {
            return 0;
        }

        return max;
    }
}

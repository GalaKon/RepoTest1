public class HW9_8 {

    /**
     * Написать алгоритм MinMaxAve, который принимает массив чисел int[] и 2 значения индексов.
     * Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
     * и среднее среди всех значений между 2-мя индексами.
     */

    public int[] MinMaxAve(int[] a, int firstIndex, int lastIndex) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int average;
        int sum = 0;

        if (a.length > 0) {

            for (int i = firstIndex; i <= lastIndex; i++) {

                if (max < a[i]) {
                    max = a[i];
                }

                if (min > a[i]) {
                    min = a[i];
                }
                sum = sum + a[i];
            }
            average = sum / (lastIndex - firstIndex + 1);

        } else {

            return new int[] {};
        }

        return new int[] {min, max, average};
    }
}

public class HW9_3 {

    /**
     * Написать алгоритм SumArray, который возвращает сумму всех чисел массива
     */
    // {0, 1, 2, 3, 4, 5} → 15
    public int sumArray (int[] array) {

        if(array.length != 0) {

            int sumArr = 0;

            for (int i = 0; i < array.length; i++) {
                sumArr = sumArr + array[i];

            }

            return sumArr;
        }

        return 0;
    }


}

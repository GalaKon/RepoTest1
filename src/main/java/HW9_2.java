public class HW9_2 {

    /**
     * Написать алгоритм OddIndices, который принимает массив чисел, и возвращает массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
    */

    public int[] OddIndices(int[] array) {
        int length = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                length++;
            }
        }

        int[] oddInd = new int[length];

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                oddInd[count] = array[i];
                count++;
            }
        }

        return oddInd;
    }

}

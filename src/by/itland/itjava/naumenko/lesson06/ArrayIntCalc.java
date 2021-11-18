package by.itland.itjava.naumenko.lesson06;

public class ArrayIntCalc {

    static void printArray(int[] array) {
        for (int el : array) {
            System.out.print(el + " ");
        }
    }

    public static void modificationArrayMulNumber(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
        printArray(array);
    }

    int sumArray(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        return sum;
    }


}

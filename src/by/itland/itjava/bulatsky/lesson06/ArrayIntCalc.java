package by.itland.itjava.bulatsky.lesson06;

import by.itland.itjava.bulatsky.lesson05.PrintNumber;

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
    }

    public static double findAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static void modificationGreaterAverage(int[] array, int n, double average) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average)
                array[i] += n;
        }
        printArray(array);
    }

    public static void modificationLessAverage(int[] array, double average) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average)
                array[i] *= -1;
        }
        printArray(array);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }

        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }

        }
        return max;
    }
   // public static int findMinIndex(int[] array)

}

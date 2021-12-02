package by.itland.itjava.timshina.lesson06;

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

    public static double findAverage(int[] array) {
        int av = 0;
        for (int i = 0; i < array.length; i++) {
            av += array[i];
        }

        return (double) av / array.length;
    }

    public static void modificationGreaterAverage(int[] array, int n, double average) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                array[i] += n;
            }
        }
        printArray(array);
    }

    public static void modificationLessAverage(int[] array, double average) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                array[i] *= -1;
            }
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

    public static int findMinIndex(int[] array) {
        int min = findMin(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                return i;
            }
        }
        return 0;
    }

    public static int findMaxIndex(int[] array) {
        int max = findMax(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                return i;
            }
        }
        return 0;
    }

    public static void changeMaxMinElement(int[] array) {
        int dop = 0;
        int MinInd = findMinIndex(array);
        int MaxInd = findMaxIndex(array);
        dop = array[MinInd];
        array[MinInd] = array[MaxInd];
        array[MaxInd] = dop;
        printArray(array);
    }

    public static void printEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void printOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 || array[i] % 2 == -1) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static boolean findElement(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }

        }
        return false;
    }
    public static int indexElement(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }

        }
        return -1;
    }
}

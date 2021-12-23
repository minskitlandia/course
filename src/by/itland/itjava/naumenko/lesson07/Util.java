package by.itland.itjava.naumenko.lesson07;

public class Util {
    public static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)Math.random()*10;
        }
        return arr;
    }

    public static void printArray(int[] array) {
    }
}

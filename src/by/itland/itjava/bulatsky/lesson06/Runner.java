package by.itland.itjava.bulatsky.lesson06;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Исходный массив");
        ArrayIntCalc.printArray(array);
        System.out.println("\nМассив после первого изменения");
        int n = scanner.nextInt();
        ArrayIntCalc.modificationArrayMulNumber(array,n);
    }
}

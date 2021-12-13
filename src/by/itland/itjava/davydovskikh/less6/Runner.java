package by.itland.itjava.davydovskikh.less6;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Исходный массив:");
        ArrayIntCalc.printArray(array);
        System.out.println("\nМассив после первого изменения");
        int n = scanner.nextInt();
        ArrayIntCalc.modificationArrayMulNumber(array, n);
        double average = ArrayIntCalc.findAverage(array);
        System.out.println("\nСреднее арифметическое значение массива: " + average);
        System.out.println("Массив после второго изменения") ;
        ArrayIntCalc.modificationGreaterAverage(array,n,average);
        System.out.println("\nМассив после третьего изменения");
        ArrayIntCalc.modificationLessAverage(array,average);
        System.out.println("\nМинимальный элемент: " + ArrayIntCalc.findMin(array) );
        System.out.println("Максимальный элемент: " + ArrayIntCalc.findMax(array) );
        System.out.println("Индекс минимального элемента: "+ArrayIntCalc.findMinIndex(array));
        System.out.println("Индекс максимального элемента: "+ArrayIntCalc.findMaxIndex(array));
        System.out.println("Массив после четверного измения изменения");
        ArrayIntCalc.changeMaxMinElement(array);
        System.out.print("\nВсе четные элементы массива: ");
        ArrayIntCalc.printEven(array);
        System.out.print("\nВсе нечетные элементы массива: ");
        ArrayIntCalc.printOdd(array);
        System.out.print("\nИндекс искомого элемента: " + ArrayIntCalc.indexElement(array,n));
    }
}

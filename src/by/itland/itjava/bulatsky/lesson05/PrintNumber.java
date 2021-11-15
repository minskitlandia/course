package by.itland.itjava.bulatsky.lesson05;

import java.util.Scanner;

public class PrintNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumberFromZeroToTenInclude(n);
                printNumberFromTenToZeroExclude(n);
                int k = scanner.nextInt();
                int j = scanner.nextInt();
                printNumberFromNToKStep(n, k, j);
    }

    static void printNumberFromNToKStep(int n, int k, int step) {
        for (int i = n; i < k; i += step) {
            System.out.print(i + " ");
        }
    }

    static void printNumberFromZeroToTenInclude(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    static void printNumberFromTenToZeroExclude(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}

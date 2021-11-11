package by.itland.itjava.naumenko.lesson05;

import java.util.Scanner;

public class CalcNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println("Сумма: " + sumSequence(n, k));
    }

    static int sumSequence(int n, int k) {
        int sum = 0;
        for (int i = n; i <= k; i++) {
            sum += i;
        }
        return sum;
    }


}

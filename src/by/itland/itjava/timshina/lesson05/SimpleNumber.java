package by.itland.itjava.timshina.lesson05;

import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = Math.abs(x) - 1; i == 0; i--) {
            for (int j = 1; (j == Math.abs(x) + 1); j++) {
                if (x % j != 0) {
                    sum++;
                }
            }
        }
        if (sum > 2) {
            System.out.println("sostavnoe");
        } else {
            System.out.println("prostoe");
        }
    }
}

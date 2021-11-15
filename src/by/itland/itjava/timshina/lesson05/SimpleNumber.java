package by.itland.itjava.timshina.lesson05;

import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean res = true;
        int prom = 0;

        if (x == 1) {
            System.out.printf("Цифра %d не простое и не составное", x);
        } else {
            for (int i = 2; i <= Math.abs(x) / 2; i++) {
                prom = Math.abs(x) % i;
                if (prom == 0) {
                    res = false;
                    break;
                }
            }
            if (res) {
                System.out.printf("Число %d простое", x);
            } else {
                System.out.printf("Число %d составное", x);
            }
        }

    }
}
package by.itland.itjava.Artyr000.lesson03;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 0) {
            System.out.println("Число отрицательное");
        }
        else if (a > 0)
            System.out.println("Число положительное");
        else {
            System.out.println("Число ноль");
        }
    }
}


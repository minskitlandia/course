package by.itland.itjava.Artyr000.lesson03;

import java.util.Scanner;

public class CheckLastNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k < 0 || k > 9)
            System.out.println("Число к не может быть отрицательным и больше 9");

    }
}

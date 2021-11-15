package by.itland.itjava.Artyr000.lesson03;

import java.util.Scanner;

public class CheckLastNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int p = Math.abs(n)%10;
        if (n < 0)
            Math.abs(n * (-1));
        else
            Math.abs(n * 1);
        //if (k < 0 || k > 9)0)
        //    System.out.println("Число к не может быть отрицательным и больше 9");
        //else if (k = p)
        //    System.out.println("Цифра " + p + " является последней числа " + n);
        //else
        //    System.out.println("Цифра " + p + " не является последней числа " + n);
    }
}

package by.itland.itjava.bulatsky.lesson03;

import java.util.Scanner;

public class EqualNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        if (i == b && b == a)
            System.out.println(i + " " + b + " " + a);
        else if (i == b)
            System.out.println(i + " " + b);
        else if (i == a)
            System.out.println(i + " " + a);
        else if (b == a)
            System.out.println(b + " " + a);
        if (i != b && i != a && b != a)
            System.out.println("Одинаковых чисел нет");


    }
}

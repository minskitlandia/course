package by.itland.itjava.davydovskikh.less3;

import java.util.Scanner;

public class EqualNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (b == a && b == c)
            System.out.println(a + " " + b + " " + c);
        else if (a == b) {
            System.out.println(a + " " + b);
        } else if (a == c) {
            System.out.println(a + " " + c);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else {
            System.out.println("Одинаковых чисел нет");
        }
    }
}
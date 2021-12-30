package by.itland.itjava.davydovskikh.controlwork;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d + %d = %d%n", a,b, Calculator.add(a,b));
        System.out.printf("%d - %d = %d%n", a,b, Calculator.sub(a,b));
        System.out.printf("%d * %d = %d%n", a,b, Calculator.mul(a,b));
        System.out.printf("%d / %d = %.1f%n", a,b, Calculator.div(a,b));
    }
}

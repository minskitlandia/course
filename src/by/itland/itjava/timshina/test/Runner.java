package by.itland.itjava.timshina.test;

import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d + %d = %d", a, b, Calculator.add(a, b));
        System.out.printf("\n%d - %d = %d", a, b, Calculator.sub(a, b));
        System.out.printf("\n%d * %d = %d", a, b, Calculator.mul(a, b));
        System.out.printf ("\n%d / %.0f = %.1f", a, (double)b, Calculator.div(a, b));
    }
}

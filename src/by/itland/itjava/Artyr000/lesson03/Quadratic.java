package by.itland.itjava.Artyr000.lesson03;

import java.util.Locale;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D = b * b - 4 * a * c;
        double x = ((-b + Math.sqrt(D)) / (2 * a));
        double y = ((-b - Math.sqrt(D)) / (2 * a));
        if (D < 0)
            System.out.print("Уравнение не имеет корней");
        else {
            System.out.printf("x1=%.2f; x2=%.2f", x, y);
//            System.out.print("x1=" + x%2f + "; x2=" + y%2f);
        }
    }
}

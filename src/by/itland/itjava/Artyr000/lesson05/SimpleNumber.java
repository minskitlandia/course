package by.itland.itjava.Artyr000.lesson05;

import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        if (a < 0)
            b = (a * (-1));
        else
            b = a;
        if (b %2 ==0)
            System.out.println("Число " + a + " составное");
        else if (b %3 ==0)
            System.out.println("Число " + a + " составное");
        else if (b %5 ==0)
            System.out.println("Число " + a + " составное");
        else if (b %7 ==0)
            System.out.println("Число " + a + " составное");
        else if (b %11 ==0)
            System.out.println("Число " + a + " составное");
        else if (b %13 ==0)
            System.out.println("Число " + a + " составное");
        else
            System.out.println("Число " + a + " простое");

    }
}

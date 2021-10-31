package by.itland.itjava.drobyazko.lesson03;

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();//дробное число//
        int a = (int) x; //целое число//
        double b =100*(x - a);
        int c = (int) Math.round(b);
        if ((double) a % 100 >= 11 && (double) a % 100 <= 20)
            System.out.print(a + " рублей ");
        else if ((double) a % 10 == 1)
            System.out.print(a + " рубль ");
        else if ((double) a % 10 == 2)
            System.out.print(a + " рубля ");
        else if ((double) a % 10 == 3)
            System.out.print(a + " рубля ");
        else if ((double) a % 10 == 4)
            System.out.print(a + " рубля ");
        else
            System.out.print(a + " рублей ");
        if ((c >= 10) && (c <= 20))
            System.out.print(c + " копеек");
        else if (c % 10 == 1)
            System.out.print(c + " копейка");
        else if (c % 10 == 2)
            System.out.print(c+ " копейки");
        else if ((double)c % 10 == 3)
            System.out.print(c + " копейки");
        else if ((double)c % 10 == 4)
            System.out.print(c + " копейки");
        else if ((double)c % 10 == 5)
            System.out.print(c + " копейки");
        else
            System.out.print(c + " копеек");
    }
}

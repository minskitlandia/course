package by.itland.itjava.Artyr000.lesson03;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if ((a % 4 == 0 && a%100 != 0) || (a%400 == 0)) {
            System.out.println("Високосный");
        }
        else if ( a < 0)
        {
            System.out.println("Год не может быть отрицательным");
        }
        else{
            System.out.println("Невисокосный");
        }
    }
}



package by.itland.itjava.davydovskikh.less3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 != 0 && year % 100 == 0) {
            System.out.println("Невисокосный");
        } else if (year % 4 == 0) {
            System.out.println("Високосный");
        } else if (year < 1)
            System.out.println("Год не может быть отрицательным");
    }
}



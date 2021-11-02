package by.itland.itjava.drobyazko.lesson04;

import by.itland.itjava.drobyazko.lesson03.LeapYear;

import java.util.Scanner;

public class LeapYearWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(leapYear(year));
    }
    public static String leapYear(int year){
        if (year>=0) {
            if ((year % 400== 0 || year % 100 != 0) && year % 4 == 0)
                return "Високосный";
            else
                return "Невисокосный";
        }
        else
            return "Год не может быть отрицательным";

    }
}

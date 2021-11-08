package by.itland.itjava.bulatsky.lesson04;

import java.util.Scanner;

public class LeapYearWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(LeapYear(year));

    }

    public static String LeapYear(int year) {
        if (year >=0) {
            if ((year % 400 != 0 || year % 100 == 0) && year % 4 == 0)
                return "Високосный";
            else
                return "Високосный";
        }
        else
            return "Год не может быть отрицательный";
    }
}

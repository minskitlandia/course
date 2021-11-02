package by.itland.itjava.davydovskikh.less3;

import java.util.Scanner;

public class NumberDayYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dd = scanner.nextInt();
        int day = Math.abs(dd);
        int mm = scanner.nextInt();
        int month = Math.abs(mm);
        int year = scanner.nextInt();
        int result = 0;
        if (!((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))) {
            if (month == 1)
                result = Math.abs(day);
            if (month == 2)
                result = 31 + Math.abs(day);
            if (month == 3)
                result = 28 + 31 + Math.abs(day);
            if (month == 4)
                result = 31 + 28 + 31 + Math.abs(day);
            if (month == 5)
                result = 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 6)
                result = 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 7)
                result = 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 8)
                result = 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 9)
                result = 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 10)
                result = 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 11)
                result = 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 12)
                result = 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
        } else {
            if (month == 1)
                result = Math.abs(day);
            if (month == 2)
                result = 31 + Math.abs(day);
            if (month == 3)
                result = 29 + 31 + Math.abs(day);
            if (month == 4)
                result = 31 + 28 + 31 + Math.abs(day);
            if (month == 5)
                result = 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 6)
                result = 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 7)
                result = 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 8)
                result = 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 9)
                result = 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 10)
                result = 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 11)
                result = 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
            if (month == 12)
                result = 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
        }
        System.out.println(result);
    }
}
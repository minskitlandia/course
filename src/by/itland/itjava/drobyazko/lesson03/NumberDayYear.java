package by.itland.itjava.drobyazko.lesson03;

import java.util.Scanner;

public class NumberDayYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int dday = Math.abs(day);
        int month = scanner.nextInt();
        int mmonth = Math.abs(month);
        int year = scanner.nextInt();
        int pyear = Math.abs(year);
        if ((double) pyear % 4 != 0 && (double) pyear % 400 != 0 || (double) pyear % 100 == 0 && (double) pyear % 400 != 0) {
            if (mmonth == 1)
                System.out.println(dday);
            else if (mmonth == 2)
                System.out.println(dday + 31);
            else if (mmonth == 3)
                System.out.println(dday + 31 + 28);
            else if (mmonth == 4)
                System.out.println(dday + 31 * 2 + 28);
            else if (mmonth == 5)
                System.out.println(dday + 31 * 2 + 28 + 30);
            else if (mmonth == 6)
                System.out.println(dday + 31 * 3 + 28 + 30);
            else if (mmonth == 7)
                System.out.println(dday + 31 * 3 + 28 + 30 * 2);
            else if (mmonth == 8)
                System.out.println(dday + 31 * 4 + 28 + 30 * 2);
            else if (mmonth == 9)
                System.out.println(dday + 31 * 4 + 28 + 30 * 3);
            else if (mmonth == 10)
                System.out.println(dday + 31 * 5 + 28 + 30 * 3);
            else if (mmonth == 11)
                System.out.println(dday + 31 * 5 + 28 + 30 * 4);
            else
                System.out.println(dday + 31 * 6 + 28 + 30 * 4);
        } else {
            if (mmonth == 1)
                System.out.println(dday);
            else if (mmonth == 2)
                System.out.println(dday + 31);
            else if (mmonth == 3)
                System.out.println(dday + 31 + 29);
            else if (mmonth == 4)
                System.out.println(dday + 31 * 2 + 29);
            else if (mmonth == 5)
                System.out.println(dday + 31 * 2 + 29 + 30);
            else if (mmonth == 6)
                System.out.println(dday + 31 * 3 + 29 + 30);
            else if (mmonth == 7)
                System.out.println(dday + 31 * 3 + 29 + 30 * 2);
            else if (mmonth == 8)
                System.out.println(dday + 31 * 4 + 29 + 30 * 2);
            else if (mmonth == 9)
                System.out.println(dday + 31 * 4 + 29 + 30 * 3);
            else if (mmonth == 10)
                System.out.println(dday + 31 * 5 + 29 + 30 * 3);
            else if (mmonth == 11)
                System.out.println(dday + 31 * 5 + 29 + 30 * 4);
            else
                System.out.println(dday + 31 * 6 + 29 + 30 * 4);
        }
    }
}

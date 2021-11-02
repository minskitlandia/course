package by.itland.itjava.drobyazko.lesson04;

import java.util.Locale;
import java.util.Scanner;

public class NumberDayLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        int day = scanner.nextInt();
        getNumberDay(day,month);
    }
    public static void getNumberDay (int day, String month ){
        month = month.toLowerCase();
        if (month.equals("январь"))
            System.out.println(day);
        if (month.equals("февраль"))
            System.out.println(day + 31);
        if (month.equals("март"))
            System.out.println(day + 31 + 29);
        if (month.equals("апрель"))
            System.out.println(day + 31 * 2 + 29);
        if (month.equals("май"))
            System.out.println(day + 31 * 2 + 29 + 30);
        if (month.equals("июнь"))
            System.out.println(day + 31 * 3 + 29 + 30);
        if (month.equals("июль"))
            System.out.println(day + 31 * 3 + 29 + 30 * 2);
        if (month.equals("август"))
            System.out.println(day + 31 * 4 + 29 + 30 * 2);
        if (month.equals("сентябрь"))
            System.out.println(day + 31 * 5 + 29 + 30 * 2);
        if (month.equals("октябрь"))
            System.out.println(day + 31 * 5 + 29 + 30 * 3);
        if (month.equals("ноябрь"))
            System.out.println(day + 31 * 6 + 29 + 30 * 3);
        if (month.equals("декабрь"))
            System.out.println(day + 31 * 6 + 29 + 30 * 4);
//        return 0;
    }
}

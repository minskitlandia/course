package by.itland.itjava.timshina.lesson04;

import java.util.Locale;
import java.util.Scanner;

public class NumberDayLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        int day = scanner.nextInt();
        getNumberDay(day, month);
        System.out.println(getNumberDay(day, month));

    }

    public static int getNumberDay(int day, String month) {
        if (month.toLowerCase().equals("январь"))
            return Math.abs(day);
        if (month.toLowerCase().equals("февраль"))
            return 31 + Math.abs(day);
        if (month.toLowerCase().equals("март"))
            return 29 + 31 + Math.abs(day);
        if (month.toLowerCase().equals("апрель"))
            return 31 + 29 + 31 + Math.abs(day);
        if (month.toLowerCase().equals("май"))
            return 30 + 31 + 29 + 31 + Math.abs(day);
        if (month.toLowerCase().equals("июнь"))
            return 31 + 30 + 31 + 29 + 31 + Math.abs(day);
        if (month.toLowerCase().equals("июль"))
            return 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
        if (month.toLowerCase().equals("август"))
            return 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
        if (month.toLowerCase().equals("сентябрь"))
            return 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
        if (month.toLowerCase().equals("октябрь"))
            return 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
        if (month.toLowerCase().equals("ноябрь"))
            return 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
        if (month.toLowerCase().equals("декабрь"))
            return 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
        return 0;

    }
}

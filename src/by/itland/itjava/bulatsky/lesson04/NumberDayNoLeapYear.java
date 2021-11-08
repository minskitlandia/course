package by.itland.itjava.bulatsky.lesson04;

import java.util.Scanner;

public class NumberDayNoLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        int day = scanner.nextInt();
        System.out.println(getNumberDay(day, month));

    }

    public static int getNumberDay(int day, String month) {
        month = month.toLowerCase();
        if (month.equals("январь"))
            return Math.abs(day);
        else if (month.equals("февраль"))
            return 31 + Math.abs(day);
       else if (month.equals("март"))
            return 29 + 31 + Math.abs(day);
       else if (month.equals("апрель"))
            return 31 + 28 + 31 + Math.abs(day);
       else if (month.equals("май"))
            return 30 + 31 + 28 + 31 + Math.abs(day);
       else if (month.equals("июнь"))
            return 31 + 30 + 31 + 28 + 31 + Math.abs(day);
       else if (month.equals("июль"))
            return 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
       else if (month.equals("агуст"))
            return 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
       else if (month.equals("сентябрь"))
            return 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
       else if (month.equals("октябпь"))
            return 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
       else if (month.equals("ноябрь"))
            return 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
       else if (month.equals("декабрь"))
            return 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day);
        else
        return 0;
    }
}

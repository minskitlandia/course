package by.itland.itjava.Artyr000.lessin04;

import java.util.Scanner;

public class NumberDayNoLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        int day = scanner.nextInt();
        getNumberDay(day, month);
    }
    public static void getNumberDay (int day, String month ){
        if (month.equals("январь"))
            System.out.println(Math.abs(day));
        if (month.equals("февраль"))
            System.out.println(31 + Math.abs(day));
        if (month.equals("март"))
            System.out.println(28 + 31 + Math.abs(day));
        if (month.equals("апрель"))
            System.out.println(31 + 28 + 31 + Math.abs(day));
        if (month.equals("май"))
            System.out.println(30 + 31 + 28 + 31 + Math.abs(day));
        if (month.equals("июнь"))
            System.out.println(31 + 30 + 31 + 28 + 31 + Math.abs(day));
        if (month.equals("июль"))
            System.out.println(30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day));
        if (month.equals("август"))
            System.out.println(31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day));
        if (month.equals("сентябрь"))
            System.out.println(31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day));
        if (month.equals("октябрь"))
            System.out.println(30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day));
        if (month.equals("ноябрь"))
            System.out.println(31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day));
        if (month.equals("декабрь"))
            System.out.println(30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(day));
    }
}

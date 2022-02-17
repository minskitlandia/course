package by.itland.itjava.Artyr000.lesson04;

import java.util.Scanner;

public class NumberDayLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        int day = scanner.nextInt();
        getNumberDay(day, month);
    }
    public static void getNumberDay (int day, String month ){
        month = month.toLowerCase();
        if (month.equals("январь"))
            System.out.println(Math.abs(day));
        else if (month.equals("февраль"))
            System.out.println(31 + Math.abs(day));
        else if (month.equals("март"))
            System.out.println(29 + 31 + Math.abs(day));
        else if (month.equals("апрель"))
            System.out.println(31 + 29 + 31 + Math.abs(day));
        else if (month.equals("май"))
            System.out.println(30 + 31 + 29 + 31 + Math.abs(day));
        else if (month.equals("июнь"))
            System.out.println(31 + 30 + 31 + 29 + 31 + Math.abs(day));
        else if (month.equals("июль"))
            System.out.println(30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day));
        else if (month.equals("август"))
            System.out.println(31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day));
        else if (month.equals("сентябрь"))
            System.out.println(31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day));
        else if (month.equals("октябрь"))
            System.out.println(30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day));
        else if (month.equals("ноябрь"))
            System.out.println(31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day));
        else if (month.equals("декабрь"))
            System.out.println(30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day));
    }
}

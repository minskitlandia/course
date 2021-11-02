package by.itland.itjava.drobyazko.lesson04;

import java.util.Scanner;

public class NumberDayNoLeapYear {
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
            System.out.println(day + 31 + 28);
        if (month.equals("апрель"))
            System.out.println(day + 31 * 2 + 28);
        if (month.equals("май"))
            System.out.println(day + 31 * 2 + 28 + 30);
        if (month.equals("июнь"))
            System.out.println(day + 31 * 3 + 28 + 30);
        if (month.equals("июль"))
            System.out.println(day + 31 * 3 + 28 + 30 * 2);
        if (month.equals("август"))
            System.out.println(day + 31 * 4 + 28 + 30 * 2);
        if (month.equals("сентябрь"))
            System.out.println(day + 31 * 5 + 28 + 30 * 2);
        if (month.equals("октябрь"))
            System.out.println(day + 31 * 5 + 28 + 30 * 3);
        if (month.equals("ноябрь"))
            System.out.println(day + 31 * 6 + 28 + 30 * 3);
        if (month.equals("декабрь"))
            System.out.println(day + 31 * 6 + 28 + 30 * 4);
//        return 0;
    }
}

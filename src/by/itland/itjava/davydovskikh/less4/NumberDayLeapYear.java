package by.itland.itjava.davydovskikh.less4;

import java.util.Scanner;

public class NumberDayLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        int day = scanner.nextInt();
        System.out.println(getNumberDay(day, month));
    }

    public static int getNumberDay(int day, String month) {
        switch (month.toLowerCase()) {
            case "январь":
                return Math.abs(day);
            case "февраль":
                return 31 + Math.abs(day);
            case "март":
                return 29 + 31 + Math.abs(day);
            case "апрель":
                return 31 + 29 + 31 + Math.abs(day);
            case "май":
                return 30 + 31 + 29 + 31 + Math.abs(day);
            case "июнь":
                return 31 + 30 + 31 + 29 + 31 + Math.abs(day);
            case "июль":
                return 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
            case "август":
                return 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
            case "сентябрь":
                return 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
            case "октябрь":
                return 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
            case "ноябрь":
                return 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
            case "декабрь":
                return 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + Math.abs(day);
            default:
                return 0;
        }
    }
}

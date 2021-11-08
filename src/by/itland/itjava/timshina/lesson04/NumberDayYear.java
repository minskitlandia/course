package by.itland.itjava.timshina.lesson04;

import java.util.Locale;
import java.util.Scanner;

public class NumberDayYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        String month = scanner.next();
        int year = scanner.nextInt();
        if (checkMonth(month.toLowerCase())) {
            if (LeapYearWithMethod.leapYear(Math.abs(year)).equals("Високосный")) {
                System.out.println(NumberDayLeapYear.getNumberDay(day, month));
            } else {
                System.out.println(NumberDayNoLeapYear.getNumberDay(day, month));
            }
        }
        else{
            System.out.println("Ошибка");
        }
    }


    private static boolean checkMonth(String month){
        switch (month) {
            case "январь":
            case "февраль":
            case "март":
            case "апрель":
            case "май":
            case "июнь":
            case "июль":
            case "август":
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
            case "декабрь":
                return true;
            default: return false;
        }

    }
}

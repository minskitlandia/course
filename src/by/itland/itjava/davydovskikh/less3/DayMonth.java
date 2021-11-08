package by.itland.itjava.davydovskikh.less3;

import java.util.Scanner;

public class DayMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        if ((day <= 0 && month <= 0) || (day > 7 && month > 12)) {
            System.out.print("Неправильное значение месяца и дня ");
        } else if (day >= 8) {
            System.out.print("Неправильное значение дня ");
        } else if (month >= 13) {
            System.out.print("Неправильное значение месяца ");
        }
        if (month == 1) {
            System.out.print("Январь - ");
        } else if (month == 2) {
            System.out.print("Февраль - ");
        } else if (month == 3) {
            System.out.print("Март - ");
        } else if (month == 4) {
            System.out.print("Апрель - ");
        } else if (month == 5) {
            System.out.print("Май - ");
        } else if (month == 6) {
            System.out.print("Июнь - ");
        } else if (month == 7) {
            System.out.print("Июль - ");
        } else if (month == 8) {
            System.out.print("Август - ");
        } else if (month == 9) {
            System.out.print("Сентябрь - ");
        } else if (month == 10) {
            System.out.print("Октябрь - ");
        } else if (month == 11) {
            System.out.print("Ноябрь - ");
        } else {
            System.out.print("Декабрь - ");
        }
        if (day == 1) {
            System.out.println("понедельник");
        } else if (day == 2) {
            System.out.println("вторник");
        } else if (day == 3) {
            System.out.println("среда");
        } else if (day == 4) {
            System.out.println("четверг");
        } else if (day == 5) {
            System.out.println("пятница");
        } else if (day == 6) {
            System.out.println("суббота");
        } else {
            System.out.println("воскресенье");
        }
    }
}
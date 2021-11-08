package by.itland.itjava.davydovskikh.less3;

import java.util.Scanner;

public class DayMonthModification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        if (day < 0 && month < 0) {
            System.out.print("Неправильное значение месяца и дня ");
        } else if (day < 0) {
            System.out.print("Неправильное значение дня ");
        } else if (month < 0) {
            System.out.print("Неправильное значение месяца ");
        }
        if (month % 12 == 1) {
            System.out.print("Январь - ");
        } else if (month % 12 == 2) {
            System.out.print("Февраль - ");
        } else if (month % 12 == 3) {
            System.out.print("Март - ");
        } else if (month % 12 == 4) {
            System.out.print("Апрель - ");
        } else if (month % 12 == 5) {
            System.out.print("Май - ");
        } else if (month % 12 == 6) {
            System.out.print("Июнь - ");
        } else if (month % 12 == 7) {
            System.out.print("Июль - ");
        } else if (month % 12 == 8) {
            System.out.print("Август - ");
        } else if (month % 12 == 9) {
            System.out.print("Сентябрь - ");
        } else if (month % 12 == 10) {
            System.out.print("Октябрь - ");
        } else if (month % 12 == 11) {
            System.out.print("Ноябрь - ");
        } else {
            System.out.print("Декабрь - ");
        }
        if (day == 1) {
            System.out.println("понедельник");
        } else if (day % 7 == 2) {
            System.out.println("вторник");
        } else if (day % 7 == 3) {
            System.out.println("среда");
        } else if (day % 7 == 4) {
            System.out.println("четверг");
        } else if (day % 7 == 5) {
            System.out.println("пятница");
        } else if (day % 7 == 6) {
            System.out.println("суббота");
        } else {
            System.out.println("воскресенье");
        }
    }
}

package by.itland.itjava.drobyazko.lesson04;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String dday= getNameDay (number);
        System.out.printf("%s",dday);
    }
    private static void printDay(int day){
        switch (day) {
            case 1:
                System.out.println("понедельник");
            case 2:
                System.out.println("вторник");
            case 3:
                System.out.println("среда");
            case 4:
                System.out.println("четверг");
            case 5:
                System.out.println("пятница");
            case 6:
                System.out.println("суббота");
            case 7:
                System.out.println("воскресенье");
            default:
                System.out.println("error");
        }

    }
    public static  String getNameDay(int day){
        switch (day) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "error";
        }
    }

}

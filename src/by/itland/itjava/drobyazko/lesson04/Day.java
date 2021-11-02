package by.itland.itjava.drobyazko.lesson04;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String dday= printDay (number);
        System.out.printf("%s",dday);
    }
    private static String printDay(int day){
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

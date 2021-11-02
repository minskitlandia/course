package by.itland.itjava.davydovskikh.less3;

import java.util.Scanner;

public class MultiplicationNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int res = i * j;

        String s1 = convertNumberToString(i);
        String s2 = convertNumberToString(j);
        String s3 = convertNumberToString(res);
        System.out.printf("%s умножить на %s равно %s%n",
                s1, s2, s3);
    }

    public static String convertNumberToString(int number) {
        switch (number) {
            case 0:
                return "ноль";
            case 1:
                return "один";
            case 2:
                return "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
            case 10:
                return "десять";
            case 11:
                return "одиннадцать";
            case 12:
                return "двенадцать";
            case 13:
                return "тринадцать";
            case 14:
                return "четырнадцать";
            case 15:
                return "пятнадцать";
            case 16:
                return "шестнадцать";
            case 17:
                return "семьнадцать";
            case 18:
                return "восемьнадцать";
            case 19:
                return "девятнадцать";
            case 20:
                return "двадцать";
            case 21:
                return "двадцать один";
            default:
                return "нужно вводить толко цифры, т.е. значения от 0 до 10";
        }
    }
}
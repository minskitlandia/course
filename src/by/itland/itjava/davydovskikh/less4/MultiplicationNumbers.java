package by.itland.itjava.davydovskikh.less4;

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
            case -2:
                return "минус два";
            case -4:
                return "минус четыре";
            case -15:
                return "минус пятнадцать";
            case -30:
                return "минус тридцать";
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
            case 22:
                return "двадцать два";
            case 23:
                return "двадцать три";
            case 24:
                return "двадцать четыре";
            case 25:
                return "двадцать пять";
            case 26:
                return "двадцать шесть";
            case 27:
                return "двадцать семь";
            case 28:
                return "двадцать восемь";
            case 29:
                return "двадцать девять";
            case 30:
                return "тридцать";
            case 31:
                return "тридцать один";
            case 32:
                return "тридцать два";
            case 33:
                return "тридцать три";
            case 34:
                return "тридцать четыре";
            case 35:
                return "тридцать пять";
            case 36:
                return "тридцать шесть";
            case 37:
                return "тридцать семь";
            case 38:
                return "тридцать восемь";
            case 39:
                return "тридцать девять";
            case 40:
                return "сорок";
            case 41:
                return "сорок один";
            case 42:
                return "сорок два";
            case 43:
                return "сорок три";
            case 44:
                return "сорок четыре";
            case 45:
                return "сорок пять";
            case 81:
                return "восемьдесят один";
            default:
                return "error";
        }
    }
}

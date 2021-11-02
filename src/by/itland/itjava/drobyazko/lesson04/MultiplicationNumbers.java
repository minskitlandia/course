package by.itland.itjava.drobyazko.lesson04;

import java.util.Scanner;

public class MultiplicationNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int res = i * j;

        String s1 = convertNumberToString (i);
        String s2 = convertNumberToString(j);
        String s3 = convertNumberToString(res);
        System.out.printf("%s умножить на %s равно %s", s1, s2, s3);
    }
    private static String convertNumberToString(int number){
        switch (number){
            case 0: return "ноль";
            case 1: return "один";
            case 2: return "два";
            case 3: return "три";
            case 4: return "четыре";
            case 5: return "пять";
            case 6: return "шесть";
            case 7: return "семь";
            case 8: return "восемь";
            case 9: return "девять";
            case 10: return "десять";
            case 12: return "двенадцать";
            case 14: return "четырнадцать";
            case 15: return "пятнадцать";
            case 16: return "шестнадцать";
            case 18: return "восемнадцать";
            case 20: return "двадцать";
            case 21: return "двадцать один";
            case 24: return "двадцать четыре";
            case 25: return "двадцать пять";
            case 27: return "двадцать семь";
            case 28: return "двадцать восемь";
            case 30: return "тридцать";
            case 32: return "тридцать два";
            case 35: return "тридцать пять";
            case 36: return "тридцать шесть";
            case 40: return "сорок";
            case 42: return "сорок два";
            case 45: return "сорок пять";
            case 48: return "сорок восемь";
            case 50: return "пятьдесят";
            case 54: return "пятьдесят четыре";
            case 56: return "пятьдесят шесть";
            case 60: return "шестьдесят";
            case 63: return "шестьдесят три";
            case 64: return "шестьдесят четыре";
            case 70: return "семьдесят";
            case 72: return "семьдесят два";
            case 80: return "восемьдесят";
            case 81: return "восемьдесят один";
            case 90: return "девяносто";
            case 100: return "сто";
            case -1: return "минус один";
            case -2: return "минус два";
            case -3: return "минус три";
            case -4: return "минус четыре";
            case -5: return "минус пять";
            case -6: return "минус шесть";
            case -7: return "минус семь";
            case -8: return "минус восемь";
            case -9: return "минус девять";
            case -10: return "минус десять";
            case -12: return "минус двенадцать";
            case -14: return "минус четырнадцать";
            case -15: return "минус пятнадцать";
            case -16: return "минус шестнадцать";
            case -18: return "минус восемнадцать";
            case -20: return "минус двадцать";
            case -21: return "минус двадцать один";
            case -24: return "минус двадцать четыре";
            case -25: return "минус двадцать пять";
            case -27: return "минус двадцать семь";
            case -28: return "минус двадцать восемь";
            case -30: return "минус тридцать";
            case -32: return "минус тридцать два";
            case -35: return "минус тридцать пять";
            case -36: return "минус тридцать шесть";
            case -40: return "минус сорок";
            case -42: return "минус сорок два";
            case -45: return "минус сорок пять";
            case -48: return "минус сорок восемь";
            case -50: return "минус пятьдесят";
            case -54: return "минус пятьдесят четыре";
            case -56: return "минус пятьдесят шесть";
            case -60: return "минус шестьдесят";
            case -63: return "минус шестьдесят три";
            case -64: return "минус шестьдесят четыре";
            case- 70: return "минус семьдесят";
            case -72: return "минус семьдесят два";
            case -80: return "минус восемьдесят";
            case -81: return "минус восемьдесят один";
            case -90: return "минус девяносто";
            case -100: return "минус сто";

            default: return "error";
        }
    }
}

package by.itland.itjava.timshina.lesson04;

import java.util.Scanner;

public class MultiplicationNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int с = a * b;

        String s1 = convertNumberToString(Math.abs(a));
        String s2 = convertNumberToString(Math.abs(b));
        String s3 = convertNumberToString(Math.abs(с));

        if ( (a > 0 && b > 0)) {
            System.out.printf("%s умножить на %s равно %s", s1, s2, s3);
        }
        else if(a < 0 && b < 0){
            System.out.printf("минус %s умножить на минус %s равно %s", s1, s2, s3);
        }
        else if (a < 0) {
            System.out.printf("минус %s умножить на %s равно минус %s", s1, s2, s3);
        }
        else{
            System.out.printf("%s умножить на минус %s равно минус %s", s1, s2, s3);
        }
    }

    public static String convertNumberToString(int number) {
        switch (number) {
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
            case 0:
                return "ноль";
            case 12:
                return "двенадцать";
            case 21:
                return "двадцать один";
            case 30:
                return "тридцать";
            case 15:
                return "пятнадцать";
            case 81:
                return "восемьдесят один";
            default:
                return "";


        }
    }
}

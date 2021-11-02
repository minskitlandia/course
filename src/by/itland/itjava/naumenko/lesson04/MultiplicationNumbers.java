package by.itland.itjava.naumenko.lesson04;

import java.util.Scanner;

public class MultiplicationNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int res = i*j;

        String s1 = convertNumberToString(i);
        String s2 = convertNumberToString(j);
        String s3 = convertNumberToString(res);
        System.out.printf("%s умножить на %s равно %s%n",
                s1, s2, s3);
    }

    public static String convertNumberToString(int number) {
        switch (number){
            case 1:return "один";
            case 3:return "три";
            case 5:return "пять";
            case 15:return "пятнадцать";
            default: return "Error";
        }
//        return "ERROR";
    }
}

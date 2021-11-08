package by.itland.itjava.naumenko.lesson03;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0)
            System.out.println("Число отрицательное");
        else if (number>0)
            System.out.println("Число положительное");
        else
            System.out.println("Число ноль");


    }
}


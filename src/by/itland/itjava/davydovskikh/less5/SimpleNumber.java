package by.itland.itjava.davydovskikh.less5;

import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (checkSimple(Math.abs(number)) == 2) {
            System.out.println("Число " + number + " простое");
        } else {
            System.out.println("Число " + number + " составное");
        }
    }

    private static int checkSimple(int number) {
        int countDev = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                countDev++;
            }
            if (countDev > 2) {
                break;
            }
        }
        return countDev;
    }
}

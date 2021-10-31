package by.itland.itjava.naumenko.lesson04.lesson04;

import by.itland.itjava.naumenko.lesson04.TestIfExample;

import java.util.Scanner;

public class TestPublic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        TestIfExample.switchDay(i);
    }
}

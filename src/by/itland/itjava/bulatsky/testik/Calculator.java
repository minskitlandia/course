package by.itland.itjava.bulatsky.testik;

import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;

    }
    public static double div (int a, int b){
        return a/(double)b;
    }



    public static class Runner {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();

        }

    }
}

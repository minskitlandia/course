package by.itland.itjava.drobyazko.lesson05;

import java.util.Scanner;

public class CalcNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println("Сумма: "+sumSequence(n,k));
        System.out.println("Произведение: "+mulSequence(n,k));
        System.out.println(n + "! = " + factorial(n));
        System.out.println("Сумма четных: " + sumEven(n,k));
        System.out.println("Сумма нечетных: " + sumOdd(n,k));

    }
    static int sumSequence(int n, int k) {
        int sum = 0;
        for (int i=n; i<=k;i++ ){
            sum +=i;
        }
        return sum;
    }
    static int mulSequence (int n, int k){
        int mul = 1;
        for (int i=n; i<k;i++ ){
            mul *=i;
        }
        return mul;
    }
    static int factorial(int n){
        int mul = 1;
        for (int i=1; i <=n;i++ ){
            mul *=i;
        }
        return mul;

    }
    static int sumEven(int n, int k){
        int sum = 0;
        for (int i=n; i<=k; i ++){
            if (i%2 != 0){
                continue;
            }
            sum += i;
        }
        return sum;
    }
    static int sumOdd(int n, int k){
        int sum = 0;
        for (int i=n; i<=k; i ++){
            if (i%2 == 0){
                continue;
            }
            sum += i;
        }
        return sum;
    }

}

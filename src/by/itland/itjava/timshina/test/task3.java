package by.itland.itjava.timshina.test;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();

        }
        print(a);
        System.out.println();

        int b[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            if (check(a[i])){
                b[i]=a[i];
            }

        }
        print(b);

    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static boolean check(int x) {
        int prom = 0;
        boolean res = true;
        if (x == 1) res = false;
        else {
            for (int i = 2; i <= Math.abs(x) / 2; i++) {
                prom = Math.abs(x) % i;
                if (prom == 0) {
                    res = false;
                    return res;
                }
            }
        }
        return res;
    }

}

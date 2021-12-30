package by.itland.itjava.davydovskikh.controlwork;

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
            if(check(a[i])){
                b[i]=a[i];
            }
        }
        print(b);
    }
    private static void print (int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    private static boolean check(int x){
        int pr = 0;
        boolean result = true;
        if (x==1) result = false;
        else{
            for (int i = 2; i <= Math.abs(x) / 2; i++) {
                pr = Math.abs(x) % i;
                if (pr == 0){
                    result = false;
                    return result;
                }
            }
        }
        return result;
    }
}

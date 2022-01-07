package by.itland.itjava.davydovskikh.controlwork;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        while (a>9){
            b= b+a%10;
            a=a/10;
        }
        b=b+a;
        System.out.println(b);
    }
}

package by.itland.itjava.bulatsky.testik;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        while (a>9){
            b=b+a%10;
            a=a/10;
        }
        b=b+a;
        System.out.println(b);
    }
}

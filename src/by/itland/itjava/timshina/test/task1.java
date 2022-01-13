package by.itland.itjava.timshina.test;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = 0;
        while  (x>9){
            a=a+x%10;
            x=x/10;
        }
        a=a+x;
        System.out.println(a);
    }
}

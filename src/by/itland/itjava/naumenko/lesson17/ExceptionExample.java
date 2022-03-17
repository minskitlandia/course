package by.itland.itjava.naumenko.lesson17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String[] arr = new String[2];
        arr[0]="one";
        arr[1]="two";
        System.out.println(arr[2]);
        ExceptionExample j = new ExceptionExample();
//        System.out.println(i + j);
//        try {
//        System.out.println(ThrowExceptionExample.div(i, j));
//        }catch (ArithmeticException e){
//            System.out.println("ERROR");
//        }
    }
}

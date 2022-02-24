package by.itland.itjava.bulatsky.lesson14_3;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();


       Var result = parser.calculator(input);
        System.out.println(result);
    }
}

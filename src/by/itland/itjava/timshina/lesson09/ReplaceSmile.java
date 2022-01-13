package by.itland.itjava.timshina.lesson09;

import java.util.Scanner;

public class ReplaceSmile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String res =  line.replaceAll("\\(", "\\)");
        System.out.println(res);

    }
}

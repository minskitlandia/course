package by.itland.itjava.davydovskikh.less9;

import java.util.Scanner;

public class ReplaceSmile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String result = line.replaceAll(":\\(", ":)");
        System.out.println(result);
    }
}

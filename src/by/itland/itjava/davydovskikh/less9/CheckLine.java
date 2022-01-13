package by.itland.itjava.davydovskikh.less9;

import java.util.Scanner;

public class CheckLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String word = scanner.nextLine();
        System.out.println(checkLine(line, word));
    }

    private static boolean checkLine(String line, String word) {
        return line.toLowerCase().startsWith(word.toLowerCase()) && line.toLowerCase().endsWith(word.toLowerCase());
    }
}




//ctrl+alt+v - создаёт переменную типа который находится справа
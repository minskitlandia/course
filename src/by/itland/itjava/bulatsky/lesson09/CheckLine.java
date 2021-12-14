package by.itland.itjava.bulatsky.lesson09;

import java.util.Locale;
import java.util.Scanner;

public class CheckLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String word = scanner.nextLine();
        System.out.println(checkLine (line,word));
    }

    private static boolean checkLine(String line, String word) {
        return  line.toLowerCase(Locale.ROOT).startsWith(word) && line.toLowerCase(Locale.ROOT).endsWith(word);
    }

}

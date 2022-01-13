package by.itland.itjava.drobyazko.lesson09;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class CheckLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Line = scanner.nextLine();
        String word = scanner.nextLine();
        System.out.println(checkLine(Line, word));

    }

    private static boolean checkLine(String Line, String word) {
        return Line.toLowerCase().startsWith(word.toLowerCase())
        && Line.toLowerCase().endsWith(word.toLowerCase());
    }
}

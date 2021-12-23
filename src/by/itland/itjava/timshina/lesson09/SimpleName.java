package by.itland.itjava.timshina.lesson09;

import java.util.Locale;
import java.util.Scanner;

public class SimpleName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String[] split = name.split("\\s+");
        System.out.println(nanana(split));
    }

    private static String nanana(String[] split) {
//        String surname = split[0];
//        String name = split[1];
//        String fathername = split[2];
//
//        char s = surname.charAt(0);
//        char n = name.charAt(0);
//        char f = fathername.charAt(0);

        return (split[0].charAt(0) + "." + split[1].charAt(0) + "." + split[2].charAt(0) + ".").toUpperCase();
    }
}

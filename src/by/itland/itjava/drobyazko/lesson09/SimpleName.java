package by.itland.itjava.drobyazko.lesson09;

import java.util.Scanner;

public class SimpleName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] split = name.split(" +");
        System.out.println(getInitial(split));

    }

    private static String getInitial(String[] split) {
        StringBuilder in = new StringBuilder();
        in.append(split[0].charAt(0)).append(".").append(split[1].charAt(0)).append(".").append(split[2].charAt(0)).append(".");
        return in.toString().toUpperCase();

    }
}

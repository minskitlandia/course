package by.itland.itjava.naumenko.lesson09;

import java.util.Scanner;

public class SimpleName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] split = name.split("\\s+");
        System.out.println(getInitial(split));
    }
    private static String getInitial(String[] split) {
        String surname = split[0];
        String name = split[1];
        String fatherName = split[2];
        char a = surname.charAt(0);
        char b = name.charAt(0);
        char c = fatherName.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(".")
                .append(b).append(".")
                .append(c).append(".");
        return sb.toString().toUpperCase();
    }
}

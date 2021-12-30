package by.itland.itjava.davydovskikh.less9;

import java.util.Scanner;

public class SimpleName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initials = scanner.nextLine();
        String[] split = initials.split(" +");
        System.out.println(getInitial(split));
    }

    private static String getInitial(String[] split) {
        String surname = split[0];
        String name = split[1];
        String FatherName = split[2];
        char sur = surname.charAt(0);
        char n = name.charAt(0);
        char fn = FatherName.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(sur).append(".").append(n).append(".").append(fn).append(".");
        return sb.toString().toUpperCase();
    }
}

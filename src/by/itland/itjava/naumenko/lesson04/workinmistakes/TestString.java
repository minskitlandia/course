package by.itland.itjava.naumenko.lesson04.workinmistakes;

import java.util.Locale;

public class TestString {
    public static void main(String[] args) {
        String s1 = "кОт";
        String s2 = "кот";
        String s3 = new String("кот");
        System.out.println(s1.toLowerCase().equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

    }
}

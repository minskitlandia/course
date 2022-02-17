package by.itland.itjava.Artyr000.lesson01;

import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {
        //1.1
        System.out.println("Я Бельский Артур");
        System.out.println("Начинаю изучать java");
        //1.2
        String surname = "Бельский";
        String name = "Артур";
        String language = "java";
        System.out.println("Я " + surname + " " + name);
        System.out.printf("Я %s %s", surname, name);
        System.out.println("Начинаю изучать " + language);
        result(surname, name, language);
    }

    public static void result(String surname, String name, String language) {

        System.out.println("Я" + " " + surname + " " + name);
        System.out.println("Начинаю" + " " + "изучать" + " " + language);
    }

}

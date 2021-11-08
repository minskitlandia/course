package by.itland.itjava.davydovskikh.less3;

import java.util.Scanner;

public class AgeHuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.nextLine();
        int age = scanner.nextInt();
        if (age <= 100 && age > 13) {
            if ((double) age % 10 == 1)
                System.out.println(name + " " + age + " год");
            else if ((double) age % 10 == 2)
                System.out.println(name + " " + age + " года");
            else if ((double) age % 10 == 3)
                System.out.println(name + " " + age + " года");
            else if ((double) age % 10 == 4)
                System.out.println(name + " " + age + " года");
            else
                System.out.println(name + " " + age + " лет");
        } else {
            if ((double) age % 100 == 1)
                System.out.println(name + " " + age + " год");
            else if ((double) age % 100 == 2)
                System.out.println(name + " " + age + " года");
            else if ((double) age % 100 == 3)
                System.out.println(name + " " + age + " года");
            else if ((double) age % 100 == 4)
                System.out.println(name + " " + age + " года");
            else
                System.out.println(name + " " + age + " лет");
        }
    }
}
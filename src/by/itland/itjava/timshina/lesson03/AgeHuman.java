package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class AgeHuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.print(name + " ");
        if (age % 10 == 1 && age % 100 != 11){
            System.out.println(age+" год");
        }
        else if((age < 105) && (age % 10==2 || age%10==3 || age%10==4)){
            System.out.println(age+" года");
        }
        else{
            System.out.println(age+" лет");
        }
    }
}

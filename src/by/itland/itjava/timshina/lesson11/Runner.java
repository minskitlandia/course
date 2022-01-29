package by.itland.itjava.timshina.lesson11;

import by.itland.itjava.timshina.lesson11.Furniture.Chair;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("1. Furniture\n2. Apps\n3. Geom\n4. Recipes\n5. Wagon\n6. Human");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x){
            case 1:
                Chair taburet = new Chair("табуретка", 60, 40, 4, 50, false);
                Chair stul = new Chair("стул", 50, 30, 3, 40, true);
                System.out.println(taburet);
                System.out.println(stul);
                break;
            default:
                System.out.println("error");
        }
    }
}

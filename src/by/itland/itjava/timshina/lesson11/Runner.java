package by.itland.itjava.timshina.lesson11;

import by.itland.itjava.timshina.lesson11.Apps.Apps;
import by.itland.itjava.timshina.lesson11.Apps.Desktop;
import by.itland.itjava.timshina.lesson11.Apps.Phone;
import by.itland.itjava.timshina.lesson11.Apps.Tablet;
import by.itland.itjava.timshina.lesson11.Furniture.Chair;
import by.itland.itjava.timshina.lesson11.Geom.*;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("1. Furniture\n2. Apps\n3. Geom\n4. Recipes\n5. Wagon\n6. Human");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                Chair taburet = new Chair("табуретка", 60, 40, 4, 50, false);
                Chair stul = new Chair("стул", 50, 30, 3, 40, true);
                System.out.println(taburet);
                System.out.println(stul);
                break;
            case 2:
                System.out.println("1. Phone\n2. Tablet\n3. Desktop");
                int a = scanner.nextInt();
                switch (a) {
                    case 1:
                        Phone phone1 = new Phone("Gallery", "Arial", false);
                        System.out.println(phone1);
                    case 2:
                        Tablet tablet1 = new Tablet("Spotify", "Arial", false, "150x90", "Top");
                        System.out.println(tablet1);
                    case 3:
                        System.out.println("1. Full size\n2. Medium size\n3. Small size");
                        int d = scanner.nextInt();
                        switch (d) {
                            case 1:
                                Desktop desktop1 = new Desktop("YouTube", "Arial", true, "297x210", "Centre, top");
                                System.out.println(desktop1);
                            case 2:
                                Desktop desktop2 = new Desktop("YouTube", "Arial", true, "198x140", "Centre, top");
                                System.out.println(desktop2);
                            case 3:
                                Desktop desktop3 = new Desktop("YouTube", "Arial", true, "100x70", "Centre, top");
                                System.out.println(desktop3);
                        }
                }
                break;
            case 3:
                Line line = new Line(2, "green", 20);
                Rect rect = new Rect(2, "red", 15, 20);
                Ring ring = new Ring(2, "yellow", 5);
                Ellipse ellipse = new Ellipse(2, "blue", 5, 4);
                Geom[] geom = new Geom[4];
                geom[0] = line;
                geom[1] = rect;
                geom[2] = ring;
                geom[3] = ellipse;
                for (Geom item:geom){
                    System.out.println(item);
                    item.draw();
                }
                break;
            default:
                System.out.println("error");
        }
    }
}

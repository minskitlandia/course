package by.itland.itjava.timshina.lesson11;

import by.itland.itjava.timshina.lesson11.Apps.Desktop;
import by.itland.itjava.timshina.lesson11.Apps.Phone;
import by.itland.itjava.timshina.lesson11.Apps.Tablet;
import by.itland.itjava.timshina.lesson11.Furniture.Chair;
import by.itland.itjava.timshina.lesson11.Furniture.Shelf;
import by.itland.itjava.timshina.lesson11.Furniture.Table;
import by.itland.itjava.timshina.lesson11.Furniture.Wardroab;
import by.itland.itjava.timshina.lesson11.Geom.*;
import by.itland.itjava.timshina.lesson11.Human.Employee;
import by.itland.itjava.timshina.lesson11.Human.Human;
import by.itland.itjava.timshina.lesson11.Human.Student;
import by.itland.itjava.timshina.lesson11.Recipes.Pizza;
import by.itland.itjava.timshina.lesson11.Recipes.Porridge;
import by.itland.itjava.timshina.lesson11.Recipes.Recipes;
import by.itland.itjava.timshina.lesson11.Recipes.Salad;
import by.itland.itjava.timshina.lesson11.Wagon.AutoWagon;
import by.itland.itjava.timshina.lesson11.Wagon.Cistern;
import by.itland.itjava.timshina.lesson11.Wagon.Wagon;


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
                Shelf shelf = new Shelf("полочка", 20, 40, 2, 30);
                Table table = new Table("столик", 30, 20, 3, 30);
                Wardroab wardroab = new Wardroab("шкааааф", 100, 100, "дерево какое-то", 2, 6);
                System.out.println(taburet);
                System.out.println(stul);
                System.out.println(shelf);
                System.out.println(table);
                System.out.println(wardroab);
                break;
            case 2:
                System.out.println("1. Phone\n2. Tablet\n3. Desktop");
                int a = scanner.nextInt();
                switch (a) {
                    case 1:
                        Phone phone1 = new Phone("Gallery", "Arial", false);
                        System.out.println(phone1);
                        break;
                    case 2:
                        Tablet tablet1 = new Tablet("Spotify", "Arial", false, "150x90", "Top");
                        System.out.println(tablet1);
                        break;
                    case 3:
                        System.out.println("1. Full size\n2. Medium size\n3. Small size");
                        int d = scanner.nextInt();
                        switch (d) {
                            case 1:
                                Desktop desktop1 = new Desktop("YouTube", "Arial", true, "297x210", "Centre, top");
                                System.out.println(desktop1);
                                break;
                            case 2:
                                Desktop desktop2 = new Desktop("YouTube", "Arial", true, "198x140", "Centre, top");
                                System.out.println(desktop2);
                                break;
                            case 3:
                                Desktop desktop3 = new Desktop("YouTube", "Arial", true, "100x70", "Centre, top");
                                System.out.println(desktop3);
                                break;
                        }
                        break;
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
                for (Geom item : geom) {
                    System.out.println(item);
                    item.draw();
                }
                break;
            case 4:
                Pizza pizza = new Pizza("четыре сыра, или же просто 'лучшая пицца в мире'", "??веганский??", "тесто, сыр, сыр, сыр, сыр", "всё смешать, подогреть");
                Salad salad = new Salad("цезарь", "обычный", "пшеничные гренки, пармезан, яйца, курица, помидорки", "смешать вот это всё");
                Porridge porridge = new Porridge("овсяная", "веганский", "овсяная каша + вода/молоко", "смешать, подогреть - готово");
                Recipes[] recipes = new Recipes[3];
                recipes[0] = pizza;
                recipes[1] = salad;
                recipes[2] = porridge;
                for (Recipes item : recipes) {
                    System.out.println(item);
                    item.showIngredients();
                    item.showRecipe();
                }
                break;
            case 5:
                AutoWagon autowagon = new AutoWagon(20);
                Cistern cistern = new Cistern(20, 4);
                Cistern cistern1 = new Cistern(15, 3);

                Wagon[] wagons = new Wagon[3];
                wagons[0] = autowagon;
                wagons[1] = cistern;
                wagons[2] = cistern1;

                for (Wagon item: wagons){
                    System.out.println("**");
                    System.out.println(item);
                    item.printCount();
                    System.out.println();
                    System.out.printf("weight: %.2f", item.weight());
                    System.out.println();
                }
                break;
            case 6:
                Employee employee = new Employee(25, "Inkognito", 3000, "LuNaSa");
                Student student = new Student(19, "Anonim", "univer", true);
                Student student1 = new Student(22, "anonimka", "univer1", false);
                Human[] humans = new Human[3];
                humans[0] = employee;
                humans[1] = student;
                humans[2] = student1;
                for (Human item: humans){
                    System.out.println("**");
                    System.out.println(item);
                    if (item.isSideJob()){
                        System.out.printf("%.2f", item.earnings1());
                    }
                    else System.out.printf("%.2f", item.earnings());
                    System.out.println();
                }
                break;
            default:
                System.out.println("error");
        }
    }
}

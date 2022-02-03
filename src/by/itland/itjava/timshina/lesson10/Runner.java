package by.itland.itjava.timshina.lesson10;

import java.awt.*;
import java.util.Scanner;


public class Runner {

    public static void main(String[] args) {

        System.out.println("1. Rectangle\n2. ComplexNumber\n3. Triangle\n4. Book\n5. Roll\n6. Box\n7. Room");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(3, 3));
                System.out.println(rectangle.checkSquare());
                rectangle.draw();
                break;
            case 2:
                ComplexNumber complexNumber = new ComplexNumber(5, 2);
                System.out.println(complexNumber);
                System.out.println(complexNumber.abs());
                complexNumber.updateReal(-2);
                complexNumber.updateIm(3);
                System.out.println(complexNumber);
                break;
            case 3:
                Point a = new Point(0, 0);
                Point b = new Point(5, 0);
                Point c = new Point(2, 7);
                Triangle triangle = new Triangle(a, b, c);
                System.out.printf("%.2f%n", triangle.perimeter());
                System.out.println( triangle.square());
                break;
            case 4:
                Book book = new Book ("Маленький принц программирование", 90, 15.5, 2005);
                System.out.println(book.getPrice());
                //book.updatePrice();
                System.out.println(book.pricePage());
                System.out.println(book.getPrice());
                break;
            case 5:
                Roll roll = new Roll(2, 10);
                System.out.println("Выразить значение дроби в процентах: " + roll.procRoll() + "%");
                System.out.println("вычисления суммы цифр знаменателя: " + roll.sumRoll());
                System.out.println("метод определения является ли числитель простым или составным: " + roll.checkUp());
                roll.sokrRoll();
                System.out.println(roll.getUp());
                System.out.println(roll.getDown());
                break;
            case 6:
                Box box = new Box(3, 4, 5);
                System.out.println(box.volumeSquare());
                System.out.printf("Диагональ: %.2f\n", box.diagonal());
                System.out.println(box.check());
                break;
            case 7:
                Door door = new Door(1, 2);
                Window window = new Window(2, 1);
                Room room = new Room(20, 30, 5);
                room.setDoor(door);
                room.setWin(window);
                System.out.println("Площадь комнаты с учётом дверей и окон (с потолком и полом): "+room.square1());
                System.out.println("Площадь комнаты без учёта окон и дверей (с потолком и полом): "+room.square2());
                System.out.printf("Кол-во рулонов обоев (размер трубки 0,53м на 10м), без учёта пола и потолка: %.2f\n", room.repair());
                System.out.println("Введите цену 1 рулона");
                double x = scanner.nextDouble();
                System.out.println("Цена рулона: " + x);
                System.out.printf("Цена переклейки всех обоев: %.2f денежек", x * room.repair());
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}


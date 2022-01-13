package by.itland.itjava.naumenko.lesson08;

import java.util.Scanner;

/**Прямоугольник
 Используя класс точки, создать класс Rectangle, описывающий прямоугольник. В нём хранятся два поля типа
 Point - координаты левого верхнего и правого нижнего углов. Создать следующие методы в классе Rectangle:
 - Высчитывающий площадь прямоугольника
 - Высчитывающий длину диагонали*/
public class Rectangle {
    private Point left;
    Point right;

    public Rectangle(Point left, Point right) {
        this.left = left;
        this.right = right;
    }

    double aria() {
        int a = Math.abs(left.x - right.x);
        int b = Math.abs(left.y - right.y);
        return a * b;
    }

    double diagonal() {
        return left.distance(right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        Point left = new Point(x1, y1);
        Point right = new Point(x2, y2);
        Rectangle rectangle = new Rectangle(left, right);
        System.out.println("Диагональ: " + rectangle.diagonal());
        System.out.println("Площадь: " + rectangle.aria());
    }
}

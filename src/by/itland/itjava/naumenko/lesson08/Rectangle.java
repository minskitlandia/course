package by.itland.itjava.naumenko.lesson08;

/**Прямоугольник
 Используя класс точки, создать класс Rectangle, описывающий прямоугольник. В нём хранятся два поля типа
 Point - координаты левого верхнего и правого нижнего углов. Создать следующие методы в классе Rectangle:
 - Высчитывающий площадь прямоугольника
 - Высчитывающий длину диагонали*/
public class Rectangle {
    Point left;
    Point right;

    Rectangle(Point left, Point right) {
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
        Point left = new Point(0, 3);
        Point right = new Point(4, 0);
        Rectangle rectangle = new Rectangle(left, right);
        System.out.println("Диагональ: " + rectangle.diagonal());
        System.out.println("Площадь: " + rectangle.aria());
    }
}

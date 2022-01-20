package by.itland.itjava.timshina.lesson10;

public class Runner {

    public static void main(String[] args) {
        /*Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(3, 3));
        System.out.println(rectangle.checkSquare());
        rectangle.draw();*/

        /*ComplexNumber complexNumber = new ComplexNumber(5, 2);
        System.out.println(complexNumber);
        System.out.println(complexNumber.abs());
        complexNumber.updateReal(-2);
        complexNumber.updateIm(3);
        System.out.println(complexNumber);*/

        /*Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        Point c = new Point(2, 7);

        Triangle triangle = new Triangle(a, b, c);

        System.out.printf("%.2f%n", triangle.perimeter());
        System.out.println( triangle.square());*/

        /*Book book = new Book ("Маленький принц программирование", 90, 15.5, 2005);
        System.out.println(book.getPrice());
        //book.updatePrice();
        System.out.println(book.pricePage());
        System.out.println(book.getPrice());*/

        Roll roll = new Roll(2, 10);
        System.out.println("Выразить значение дроби в процентах: " + roll.procRoll() + "%");
        System.out.println("вычисления суммы цифр знаменателя: " + roll.sumRoll());
        System.out.println("метод определения является ли числитель простым или составным: " + roll.checkUp());
        roll.sokrRoll();
        System.out.println(roll.getUp());
        System.out.println(roll.getDown());
    }
}


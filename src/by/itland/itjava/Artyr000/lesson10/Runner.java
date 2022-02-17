package by.itland.itjava.Artyr000.lesson10;

public class Runner {
    public static void main(String[] args) {

//        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(3, 3));
//        System.out.println(rectangle.checkSquare());
//        rectangle.draw();
//        ComplexNumber complexNumber = new ComplexNumber(5, 2);
//        System.out.println(complexNumber);
//        System.out.println(complexNumber.abs());
//        complexNumber.updateReal(-2);
//        complexNumber.updateIm(-3);
//        System.out.println(complexNumber);

//        Box box = new Box(2, 5, 6);
//        box.square();
//        box.volume();
//
//        Point a = new Point(0,0);
//        Point b = new Point(5,0);
//        Point c = new Point(2,7);
//
//        Triangle triangle = new Triangle(a, b, c);
//
//        System.out.printf("Perimeter %.2f \n", triangle.perimeter());
//        System.out.printf("Square %.2f \n", triangle.square());
//
//        Book book = new Book("Маленький принц", 90, 15.5, 2005);
//        System.out.println(book.getPrise());
            Rool rool = new Rool(15,45);
            System.out.println(rool.percentage());
            System.out.println(rool.sumDenominator());
            System.out.println(rool.checkSimpleNumerator());
            rool.reduce();
            rool.getUp();
            rool.getDown();
    }


}

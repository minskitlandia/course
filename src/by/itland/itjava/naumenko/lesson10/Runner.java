package by.itland.itjava.naumenko.lesson10;

public class Runner {

    public static void main(String[] args) {


//        Point left = new Point(-5, 3);
//        Point right = new Point(3, 4);
//
//        Rectangle rectangle = new Rectangle(left, right);
//        System.out.println(rectangle.checkSquare());
//        rectangle.draw();

        ComplexNumber complexNumber = new ComplexNumber(5, 2);
        System.out.println(complexNumber);
        System.out.printf("%.2f\n", complexNumber.abs());
        complexNumber.updateReal(-2);
        complexNumber.updateIm(3);
        System.out.println(complexNumber);
    }
}

package by.itland.itjava.drobyazko.lesson10;

public class Runner {
    public static void main(String[] args) {

//        Rectangle rectangle = new Rectangle(new Point(0,0), new Point(3,3));
////        System.out.println(rectangle.checkSquare());
////        rectangle.draw();
        ComplexNumber complexNumber = new ComplexNumber(5,2);
        System.out.println(complexNumber.abs());
        complexNumber.updateReal(-2);
        complexNumber.updateIm(3);
        System.out.println(complexNumber);
    }
}

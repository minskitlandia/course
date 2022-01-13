package by.itland.itjava.bulatsky.lesson10;

public class Runner {
    public static void main(String[] args) {
        Point left = new Point(0,0);
        Point right = new Point(3,3);
        Rectangle rectangle = new Rectangle(left, right);
        System.out.println(rectangle.checkSquare());
        rectangle.draw();
    }
}

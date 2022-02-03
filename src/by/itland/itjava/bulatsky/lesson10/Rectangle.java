package by.itland.itjava.bulatsky.lesson10;

public class Rectangle {

    private Point left;
    private Point right;

    public Rectangle(Point left, Point right) {
        this.left = left;
        this.right = right;
    }

    public boolean checkSquare() {
        int a = left.getX() - right.getX();
        int b = left.getY() - right.getY();
        return a == b;


    }

    public void draw() {
        int a = Math.abs(left.getX() - right.getX());
        int b = Math.abs(left.getY() - right.getY());
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}

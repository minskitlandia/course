package by.itland.itjava.Artyr000.lesson08;

public class Rectangle {

    Point leftUp;
    Point rightDown;



    public Rectangle(Point first, Point second){
        this.leftUp = first;
        this.rightDown = second;
    }

    public double diagonal(){
        return leftUp.distance(rightDown);
    }

    public double aria(){
        return Math.abs(leftUp.x - rightDown.x) * Math.abs(leftUp.y - rightDown.y);
    }

    public static void main(String[] args){
        Point pointA = new Point(3, 4);
        Point pointB = new Point(-3, -4);

        Rectangle rectangle = new Rectangle(pointA, pointB);
        System.out.println(rectangle.aria());

        System.out.println(rectangle.diagonal());
    }
}

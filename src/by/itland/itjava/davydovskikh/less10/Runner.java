package by.itland.itjava.davydovskikh.less10;

public class Runner {

    public static void main(String[] args) {
        Point a = new Point(0,0);
        Point b = new Point(5,0);
        Point c = new Point(2,7);

        Triangle triangle = new Triangle(a,b,c);

        System.out.println(triangle.perimetr());
        System.out.println(triangle.square());
    }
}
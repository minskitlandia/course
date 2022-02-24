package by.itland.itjava.Artyr000.lesson10;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;


    public Triangle() {}

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public  double perimeter(){
        return a.distance(b) + a.distance(c) + b.distance(c);
    }

    public double square(){
        double p = perimeter()/2;
        return Math.sqrt(p*(p-a.distance(b)) * (p-b.distance(c)) * (p-a.distance(c)));
    }
}

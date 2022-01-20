package by.itland.itjava.bulatsky.lesson10;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double perimetr() {


        return a.distance(b) + b.distance(c) + a.distance(c);
    }

    public double Square() {
        double p = perimetr()/2;
        return Math.sqrt(p*(p-a.distance(b))*(p-a.distance(c))*(p-c.distance(b)));

    }
}

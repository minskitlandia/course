package by.itland.itjava.timshina.lesson11.Geom;

public class Ellipse extends Geom{
    private int radius1;
    private int radius2;

    public Ellipse() {
    }

    public Ellipse(int width, String color, int radius1, int radius2) {
        super(width, color);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public int getRadius1() {
        return radius1;
    }

    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

    @Override
    public void draw() {
        System.out.println("*нарисовался элипс*");
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "width=" + getWidth() +
                ", color='" + getColor() +
                ", radius1=" + radius1 +
                ", radius2=" + radius2 +
                '}';
    }
}

package by.itland.itjava.davydovskikh.less11.geom;

public class Ring extends Geom{
    private int radius;

    public Ring() {
    }

    public Ring(int width, String color, int radius) {
        super(width, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("кольцо");
    }
    @Override
    public String toString() {
        return "Ring{" +
                "width=" + getWidth() +
                ", color='" + getColor() +
                ", radius=" + radius +
                '}';
    }
}
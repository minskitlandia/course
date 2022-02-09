package by.itland.itjava.davydovskikh.less11.geom;

public class Rect extends Geom{
    private int length;
    private int height;

    public Rect() {
    }

    public Rect(int width, String color, int length, int height) {
        super(width, color);
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("прямоугольник");
    }
    @Override
    public String toString() {
        return "Rect{" +
                "width=" + getWidth() +
                ", color='" + getColor() +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
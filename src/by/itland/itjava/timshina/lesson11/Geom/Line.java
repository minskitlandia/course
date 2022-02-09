package by.itland.itjava.timshina.lesson11.Geom;

public class Line extends Geom{
    private int length;

    public Line() {
    }

    public Line(int width, String color, int length) {
        super(width, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public void draw() {
        System.out.println("*нарисовалась линия*");
    }
    @Override
    public String toString() {
        return "Line{" +
                "width=" + getWidth() +
                ", color='" + getColor() +
                ", length=" + length +
                '}';
    }
}

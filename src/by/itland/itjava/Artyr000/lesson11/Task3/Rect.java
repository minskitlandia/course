package by.itland.itjava.Artyr000.lesson11.Task3;

public class Rect extends Geom {
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
    public void draw(){
        System.out.println("Нарисован прямоугольник");
    }

    @Override
    public String  toString() {
        return "Rect{" + "width=" + getWidth() + ", color='" + getColour() + ", lenght=" + length + ", height=" + height + '}';
    }
}

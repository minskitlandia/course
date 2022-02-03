package by.itland.itjava.bulatsky.lesson11;

public class Rect extends Geom {

    private int length;
    private int height;

    public Rect() {
    }


    public Rect(int width, String colour, int length, int height) {
        super(width, colour);
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("рисуется прямоугольник");
    }
    @Override
    public String toString() {
        return "Rect{" +
                "width=" + getWidth() +
                ", colour=" + getColour() +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}

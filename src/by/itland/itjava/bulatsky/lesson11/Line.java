package by.itland.itjava.bulatsky.lesson11;

public class Line extends Geom{
private int length;

    public Line() {
    }

    public Line(int width, String colour, int length) {
        super(width, colour);
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
        System.out.println("рисуется линия");
    }

    @Override
    public String toString() {
        return "Line{" +
                "width=" + getWidth() +
                ", colour=" + getColour() +
                "length=" + length +
                '}';
    }
}

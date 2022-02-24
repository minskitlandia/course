package by.itland.itjava.Artyr000.lesson11.Task3;

public class Ring extends Geom{
    private int radius;

    public Ring() {
    }

    public Ring(int width, String colour, int radius) {
        super(width, colour);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Нарисовалось кольцо");
    }

    @Override
    public String toString(){
        return "Ring{" + "width=" + getWidth() + ", color=" + getColour() + ", radius=" + radius + '}';
    }
}

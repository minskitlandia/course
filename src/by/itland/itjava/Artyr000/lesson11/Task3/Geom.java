package by.itland.itjava.Artyr000.lesson11.Task3;

public abstract class Geom {
    private int width;
    private String colour;
    public abstract void draw();

    public Geom() {
    }

    public Geom(int width, String colour) {
        this.width = width;
        this.colour = colour;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString(){
        return "Geom{" + "width=" + width+ ", color='" + colour + '\'' + '}';
    }
}

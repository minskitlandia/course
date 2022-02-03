package by.itland.itjava.bulatsky.lesson11;

public abstract class Geom {
    private int width;
    private String colour;


    public Geom() {
    }

    public Geom(int width, String colour) {
        this.width = width;
        this.colour = colour;
    }

    public int getWidth() {
        return width;
    }

    public String getColour() {
        return colour;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public abstract void draw();

    @Override
    public String toString() {
        return "Geom{" +
                "width=" + width +
                ", colour='" + colour + '\'' +
                '}';
    }
}

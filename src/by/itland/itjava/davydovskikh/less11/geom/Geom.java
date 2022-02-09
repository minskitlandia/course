package by.itland.itjava.davydovskikh.less11.geom;

public abstract class Geom {
    private int width;
    private String color;

    public Geom() {
    }

    public Geom(int width, String color) {
        this.width = width;
        this.color = color;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public abstract void draw();

    @Override
    public String toString() {
        return "Geom{" +
                "width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
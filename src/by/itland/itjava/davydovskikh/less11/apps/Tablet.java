package by.itland.itjava.davydovskikh.less11.apps;

public class Tablet extends Apps {
    private String size;
    private String position;

    public Tablet() {

    }

    public Tablet(String name, String font, Boolean frames, String size, String position) {
        super(name, font, frames);
        this.size = size;
        this.position = position;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "name " + getName() +
                ", font " + getFont()  +
                ", frames " + getFrames() +
                ", size " + size +
                ", position " + position +
                '}';
    }
}
package by.itland.itjava.timshina.lesson11.Apps;

public class Desktop extends Apps{
    private String size;
    private String position;

    public Desktop() {
    }

    public Desktop(String name, String font, Boolean frames, String size, String position) {
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
        return "Desktop{" +
                "frames = " + getFrames()+
                ", font = " + getFont() +
                ", name= " + getName() +
                ", size " + size  +
                ", position " + position +
                '}';
    }
}

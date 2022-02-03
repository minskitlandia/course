package by.itland.itjava.timshina.lesson11.Apps;

public class Tablet extends Apps{
    private String size;
    private int position;

    public Tablet() {
    }

    public Tablet(String name, String font, Boolean frames, String size, int position) {
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

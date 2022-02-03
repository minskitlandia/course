package by.itland.itjava.bulatsky.lesson11;

public class Ipad extends Telephone{

    String place;
    int size;


    public Ipad(String name, String font, boolean ram, String place, int size) {
        super(name, font, ram);
        this.place = place;
        this.size = size;
    }

    public String getPlace() {
        return place;
    }

    public int getSize() {
        return size;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ipad{" +
                "place='" + place + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", font='" + font + '\'' +
                ", ram=" + ram +
                '}';
    }
}

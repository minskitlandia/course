package by.itland.itjava.naumenko.lesson11;

public class Chair extends Furniture {

    private int legs;
    private int height;
    private boolean back;

    public Chair() {
    }

    public Chair(String name, int size, double price, int nojki, int height, boolean spinka) {
        super(name, size, price);
        this.legs = nojki;
        this.height = height;
        this.back = spinka;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isBack() {
        return back;
    }

    public void setBack(boolean back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return  "Stul{" +
                "name='" + getName() +
                ", size=" + getSize() +
                ", price=" + getPrice() +
                ", nojki=" + legs +
                ", height=" + height +
                ", spinka=" + back +
                '}';
    }
}

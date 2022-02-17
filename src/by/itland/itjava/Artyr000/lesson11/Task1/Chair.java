package by.itland.itjava.Artyr000.lesson11.Task1;

public class Chair extends Furniture {
    private int legs;
    private int height;
    private boolean back;

    public Chair() {
    }
    public Chair(String name, int size, double price, int legs, int height, boolean back) {
        super(name, size, price);
        this.legs = legs;
        this.height = height;
        this.back = back;
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

    public boolean getBack() {
        return back;
    }

    public void setBack(boolean back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "name='" + getName() + '\'' +
                ", size=" + getHeight() +
                ", price=" + getPrice() +
                "legs=" + legs +
                ", height=" + height +
                ", back=" + back +
                '}';
    }
}

package by.itland.itjava.bulatsky.lesson11;

public class Stul extends Meble{


    int legs;
    int height;
    boolean back;


    public Stul(){
    }

    public Stul(String name, int size, double price, int legs, int height, boolean back){
        super(name,size,price);
        this.legs = legs;
        this.height =height;
        this.back = back;
    }

    public int getLegs() {
        return legs;
    }

    public int getHeight() {
        return height;
    }

    public boolean isBack() {
        return back;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBack(boolean back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "Stul {" +
        "name='" + getName() +
        ", size=" +getSize() +
        ", price" + getPrice() +
                "legs=" + legs +
                ", height=" + height +
                ", back=" + back +
                '}';
    }
}

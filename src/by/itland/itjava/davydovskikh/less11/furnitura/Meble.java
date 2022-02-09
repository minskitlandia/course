package by.itland.itjava.davydovskikh.less11.furnitura;

public class Meble {
    private String name;
    private int size;
    private double price;

    public Meble(){}

    public Meble(String name, int size, int price){
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

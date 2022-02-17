package by.itland.itjava.Artyr000.lesson11.Task1;

public class Furniture {
    private String name;
    private int size;
    private double price;

    public Furniture() {
    }

    public Furniture(String name, int size, double price) {
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

    public int getHeight() {
        return size;
    }

    public void setHeight(int height) {
        this.size = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
package by.itland.itjava.Artyr000.lesson11.Task1;

import by.itland.itjava.Artyr000.lesson11.Task1.Furniture;

public class Polka extends Furniture {
    private int segment;
    private int size1;
    private int size2;

    public Polka() {
    }

    public Polka(String name, int size, double price, int segment, int size1, int size2) {
        super(name, size, price);
        this.segment = segment;
        this.size1 = size1;
        this.size2 = size2;
    }

    public int getSegment() {
        return segment;
    }

    public void setSegment(int segment) {
        this.segment = segment;
    }

    public int getSize1() {
        return size1;
    }

    public void setSize1(int size1) {
        this.size1 = size1;
    }

    public int getSize2() {
        return size2;
    }

    public void setSize2(int size2) {
        this.size2 = size2;
    }

    @Override
    public String toString(){
        return "Polka{" + "name='" +
                getName() + ", size=" + getHeight()
                + ", price=" + getPrice() +
                ", colvo segments=" + segment +
                ",size segment1=" +
                size1 + ", size segment2=" + size2 + '}';
    }
}

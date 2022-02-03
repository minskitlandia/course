package by.itland.itjava.davydovskikh.less11.furnitura;

import by.itland.itjava.davydovskikh.less11.furnitura.Meble;

public class Table extends Meble {
    private int kollegs;
    private  double square;

    public Table(){

    }

    public Table(String name,int size, int price,int kollegs, double square) {
        super(name,size,price);
        this.kollegs = kollegs;
        this.square = square;
    }

    public int getKollegs() {
        return kollegs;
    }

    public void setKollegs(int kollegs) {
        this.kollegs = kollegs;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + getName()+
                ",size=" + getSize()+
                ", price=" + getPrice()+
                "kollegs=" + kollegs +
                ", square=" + square +
                '}';
    }
}

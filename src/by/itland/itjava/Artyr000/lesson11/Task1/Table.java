package by.itland.itjava.Artyr000.lesson11.Task1;

import by.itland.itjava.Artyr000.lesson11.Task1.Furniture;

public class Table extends Furniture {
    private int colvo;
    private double square;

    public Table() {
    }

    public Table(String name, int size, double price, int colvo, double square) {
        super(name, size, price);
        this.colvo = colvo;
        this.square = square;
    }

    public int getColvo() {
        return colvo;
    }

    public void setColvo(int colvo) {
        this.colvo = colvo;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString(){
        return "Table {" + "name='" +
                getName() + ", size=" + getHeight()
                + ", price=" + getPrice() +
                ", nojki=" + colvo +
                ",square=" +
                square + '}';
    }
}

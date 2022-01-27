package by.itland.itjava.bulatsky.lesson11;

public class Table extends Meble{
    int legos;
    double square;

    public Table(){
    }
    public Table(String name, int size, double price, int legos, double square){
        super(name,size,price);
        this.legos = legos;
        this.square =square;
    }

    public int getLegos() {
        return legos;
    }

    public double getSquare() {
        return square;
    }

    public void setLegos(int legos) {
        this.legos = legos;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + getName() +
                ", size=" +getSize() +
                ", price" + getPrice() +
                "legos=" + legos +
                ", square=" + square +
                '}';
    }
}

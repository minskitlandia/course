package by.itland.itjava.bulatsky.lesson11;

public class Polka extends Meble{

    int count;
    int segment;

    public Polka(){
    }
    public Polka(String name, int size, double price, int count, int segment){
        super(name,size,price);
        this.count = count ;
        this.segment = segment;
}

    public int getCount() {
        return count;
    }

    public int getSegment() {
        return segment;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setSegment(int segment) {
        this.segment = segment;
    }

    @Override
    public String toString() {
        return "Polka{" +
                "name='" + getName() +
                ", size=" +getSize() +
                ", price" + getPrice() +
                "count=" + count +
                ", segment=" + segment +
                '}';
    }
}

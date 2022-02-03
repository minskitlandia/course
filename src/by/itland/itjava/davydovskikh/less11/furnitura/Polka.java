package by.itland.itjava.davydovskikh.less11.furnitura;

public class Polka extends Meble{
    private int segmenty;
    private int sizeSegmenty;

    public Polka(){

    }

    public Polka(String name, int size, int price, int segmenty, int sizeSegmenty) {
        super(name, size, price);
        this.segmenty = segmenty;
        this.sizeSegmenty = sizeSegmenty;
    }

    public int getSegmenty() {
        return segmenty;
    }

    public void setSegmenty(int segmenty) {
        this.segmenty = segmenty;
    }

    public int getSizeSegmenty() {
        return sizeSegmenty;
    }

    public void setSizeSegmenty(int sizeSegmenty) {
        this.sizeSegmenty = sizeSegmenty;
    }

    @Override
    public String toString() {
        return "Polka{" +
                "name='" + getName()+
                ",size=" + getSize()+
                ", price=" + getPrice()+
                "seg=" + segmenty +
                ", sizeSegmenty=" + sizeSegmenty +
                '}';
    }
}

package by.itland.itjava.timshina.lesson11.Wagon;

public abstract class Wagon {
    private int count;
    public double weight(){
        return 1000;
    }
    public void printCount(){};

    public Wagon() {
    }

    public Wagon(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "count=" + count +
                '}';
    }
}

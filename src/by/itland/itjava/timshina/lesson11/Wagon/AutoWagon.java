package by.itland.itjava.timshina.lesson11.Wagon;

public class AutoWagon extends Wagon{
    public AutoWagon(int count) {
        super(count);
    }

    @Override
    public double weight() {
        return super.weight()*8000;
    }

    @Override
    public void printCount() {
        super.printCount();
        System.out.printf("В вагоне %d автомобилей", getCount());
    }
    @Override
    public String toString() {
        return "AutoWagon{" +
                "count=" + getCount() +
                '}';
    }
}

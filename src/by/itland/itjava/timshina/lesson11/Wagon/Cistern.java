package by.itland.itjava.timshina.lesson11.Wagon;

public class Cistern extends Wagon{
    private double radius;

    public Cistern(int count, double radius) {
        super(count);
        this.radius = radius;
    }

    @Override
    public void printCount() {
       // super.printCount();
        System.out.printf("Цистерна содержит %d литров", getCount());
    }

    @Override
    public double weight() {
        //return super.weight();
        return Math.pow(getCount(), 2) * radius * 3.1415926;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cistern{" +
                "count=" + getCount() +
                ", radius=" + radius +
                '}';
    }
}

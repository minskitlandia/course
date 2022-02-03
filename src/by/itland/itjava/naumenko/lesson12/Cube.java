package by.itland.itjava.naumenko.lesson12;

public class Cube extends Geom implements CalcGeom, CalcVolume{

    @Override
    public void calculateAria() {
        System.out.println("Площшадь куба");
    }

    @Override
    void draw() {
        System.out.println("Нарисовали куб");
    }

    @Override
    public void getVolume() {
        System.out.println("Объём куба");

    }
}

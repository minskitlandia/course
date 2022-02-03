package by.itland.itjava.naumenko.lesson12;

public class Triangle extends Geom implements CalcGeom {
    @Override
    void draw() {
        System.out.println("Рисуем Треугольник");
    }

    @Override
    public void calculateAria(){
        System.out.println("Площадь треугольника");
    }
}

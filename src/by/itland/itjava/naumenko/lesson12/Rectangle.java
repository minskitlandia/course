package by.itland.itjava.naumenko.lesson12;

public class Rectangle extends Geom implements CalcGeom {

    @Override
    void draw() {
        System.out.println("Рисуем прямоугольник");
    }


    public void calculateAria(){
        System.out.println("Площадь прямоугольника");
    }
}

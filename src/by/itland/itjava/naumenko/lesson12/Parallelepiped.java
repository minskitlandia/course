package by.itland.itjava.naumenko.lesson12;

public class Parallelepiped extends Geom implements CalcVolume {
    @Override
    public void getVolume() {
        System.out.println("Объем параллелипипеда");
    }

    @Override
    void draw() {
        System.out.println("Нарисовали параллелипипед");
    }
}

package by.itland.itjava.materials.lesson18.patterns.creational.abstraactFactory.website;

import by.itland.itjava.materials.lesson18.patterns.creational.abstraactFactory.Developer;

public class KotlinDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("kotlin code writes");
    }
}

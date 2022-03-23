package by.itland.itjava.materials.lesson18.patterns.creational.factoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}

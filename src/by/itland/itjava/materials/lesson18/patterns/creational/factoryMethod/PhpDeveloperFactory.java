package by.itland.itjava.materials.lesson18.patterns.creational.factoryMethod;

public class PhpDeveloperFactory  implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}

package by.itland.itjava.bulatsky.lesson11;

public class Smartphone extends Telephone {
    public Smartphone(String name, String font, boolean ram) {
        super(name, font, ram);

    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "name='" + name + '\'' +
                ", font='" + font + '\'' +
                ", ram=" + ram +
                '}';
    }
}

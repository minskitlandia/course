package by.itland.itjava.bulatsky.lesson11;

public class Telephone {
    String name;
    String font;
    boolean ram;


    public Telephone() {
    }

    public Telephone(String name, String font, boolean ram) {
        this.name = name;
        this.font = font;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public String getFont() {
        return font;
    }

    public boolean isRam() {
        return ram;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setRam(boolean ram) {
        this.ram = ram;
    }
}

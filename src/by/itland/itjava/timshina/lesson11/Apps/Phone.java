package by.itland.itjava.timshina.lesson11.Apps;

public class Phone extends Apps{
    public Phone() {
    }

    public Phone(String name, String font, Boolean frames) {
        super(name, font, frames);
    }

    @Override
    public String toString() {
        return "Phone{" +
                ", frames = " + getFrames()+
                ", font = " + getFont() +
                ", name= " + getName() +
                "}";
    }
}

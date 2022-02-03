package by.itland.itjava.davydovskikh.less11.apps;

public class Phone extends Apps{
    public Phone() {

    }

    public Phone(String name, String font, Boolean frames) {
        super(name, font, frames);
    }

    @Override
    public String toString() {
        return "Phone{" +
                " frames = " + getFrames()+
                ", font = " + getFont() +
                ", name= " + getName() +
                " }";
    }
}
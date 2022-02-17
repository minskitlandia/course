package by.itland.itjava.Artyr000.lesson11.Task2;

public class Phone extends Windows {

    public Phone(String name, String shrift, boolean ramka) {
        super(name, shrift, ramka);
    }

    @Override
    public String toString(){
        return "Phone{" + "name='" +
                getName() + ", shrift=" + getShrift()
                + ", ramka=" + getRamka() + '}';
    }
}

package by.itland.itjava.Artyr000.lesson11.Task2;

public class Planshet extends Windows{
    private String mesto;
    private int size;

    public Planshet() {
    }

    public Planshet(String name, String shrift, boolean ramka, String mesto, int size) {
        super(name, shrift, ramka);
        this.mesto = mesto;
        this.size = size;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return "Planshet{" + "name='" +
                getName() + ", shrift=" + getShrift()
                    + ", ramka=" + getRamka() + ", polojenie=" + mesto
                + ", size=" + size + '}';
    }
}

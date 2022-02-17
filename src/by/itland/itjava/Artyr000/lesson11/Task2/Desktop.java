package by.itland.itjava.Artyr000.lesson11.Task2;

public class Desktop extends Windows{
    private String mesto;
    private int size;
    private int changeSIze;
    private String fullMonitore;

    public Desktop() {
    }

    public Desktop(String name, String shrift, boolean ramka, String mesto, int size, int changeSIze, String fullMonitore) {
        super(name, shrift, ramka);
        this.mesto = mesto;
        this.size = size;
        this.changeSIze = changeSIze;
        this.fullMonitore = fullMonitore;
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

    public int getChangeSIze() {
        return changeSIze;
    }

    public void setChangeSIze(int changeSIze) {
        this.changeSIze = changeSIze;
    }

    public String getFullMonitore() {
        return fullMonitore;
    }

    public void setFullMonitore(String fullMonitore) {
        this.fullMonitore = fullMonitore;
    }

    @Override
    public String toString(){
        return "Desctop{" + "name='" +
                getName() + ", shrift=" + getShrift()
                + ", ramka=" + getRamka() + ", polojenie=" + mesto
                + ", size=" + size + ", change size=" + changeSIze
                + ", full monitore=" + fullMonitore +'}';
    }
}

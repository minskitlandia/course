package by.itland.itjava.Artyr000.lesson11.Task2;

public class Windows {
    private String name;
    private String shrift;
    private boolean ramka;

    public Windows() {
    }

    public Windows(String name, String shrift, boolean ramka) {
        this.name = name;
        this.shrift = shrift;
        this.ramka = ramka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShrift() {
        return shrift;
    }

    public void setShrift(String shrift) {
        this.shrift = shrift;
    }

    public boolean getRamka() {
        return ramka;
    }

    public void setRamka(boolean ramka) {
        this.ramka = ramka;
    }
}

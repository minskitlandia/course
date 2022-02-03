package by.itland.itjava.drobyazko.lesson11;

public class Wardroab {
    private String material;
    private int ctvorka;
    private int shkafchik;

    public Wardroab(){

    }
    public Wardroab (String material, int ctvorka, int shkafchik){
        this.material = material;
        this.ctvorka = ctvorka;
        this.shkafchik = shkafchik;

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCtvorka() {
        return ctvorka;
    }

    public void setCtvorka(int ctvorka) {
        this.ctvorka = ctvorka;
    }

    public int getShkafchik() {
        return shkafchik;
    }

    public void setShkafchik(int shkafchik) {
        this.shkafchik = shkafchik;
    }
}

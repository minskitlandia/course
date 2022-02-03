package by.itland.itjava.bulatsky.lesson11;

public class Shkaf extends Meble {
    String material;
    int stvorki;
    int shkafchik;

    public Shkaf(){
    }
    public Shkaf(String name, int size, double price, String material, int stvorki, int shkafchik){
        super(name,size,price);
        this.material = material;
        this.stvorki =stvorki;
        this.shkafchik = shkafchik;
}

    public String getMaterial() {
        return material;
    }

    public int getStvorki() {
        return stvorki;
    }

    public int getShkafchik() {
        return shkafchik;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setStvorki(int stvorki) {
        this.stvorki = stvorki;
    }

    public void setShkafchik(int shkafchik) {
        this.shkafchik = shkafchik;
    }

    @Override
    public String toString() {
        return "Shkaf{" +
                "name='" + getName() +
                ", size=" +getSize() +
                ", price" + getPrice() +
                "material='" + material + '\'' +
                ", stvorki=" + stvorki +
                ", shkafchik=" + shkafchik +
                '}';
    }
}

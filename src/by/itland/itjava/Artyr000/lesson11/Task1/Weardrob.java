package by.itland.itjava.Artyr000.lesson11.Task1;

import by.itland.itjava.Artyr000.lesson11.Task1.Furniture;

public class Weardrob extends Furniture {
    private String material;
    private int number1;
    private int number2;

    public Weardrob() {
    }

    public Weardrob(String material, int number1, int number2) {
        this.material = material;
        this.number1 = number1;
        this.number2 = number2;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    @Override
    public String toString(){
        return "Weardrob{" + "name=" + getName() + ", size=" + getHeight() + ", price=" + getPrice() + ", material=" + material + ", colity=" + number1 + ", colity2=" +number2 + '}';
    }

}

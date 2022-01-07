package by.itland.itjava.davydovskikh.less8;

public class Cat {
    String name;
    byte age;

    public Cat(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public Cat(byte age, String name) {
        this(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        by.itland.itjava.materials.lesson08.Cat cat = new by.itland.itjava.materials.lesson08.Cat("Серый", (byte) 3);
        by.itland.itjava.materials.lesson08.Cat cat2 = new by.itland.itjava.materials.lesson08.Cat((byte) 3, "Пума");

        System.out.println(cat);
        System.out.println(cat2);
    }
}

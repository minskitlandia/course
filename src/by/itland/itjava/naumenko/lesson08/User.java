package by.itland.itjava.naumenko.lesson08;

import java.util.Objects;

public class User {

    String name;
    byte age;
    int height;

    public User(String name, byte age, int h) {
        this.name = name;
        this.age = age;
        this.height = h;
    }

    public User(byte age, String name, int h) {
        this(name, age, h);
    }

    public static void main(String[] args) {
        User user = new User("dsbfhjsdf",(byte)5,15);
        User user2 = new User((byte) 6, "user1", 130);
    }

}

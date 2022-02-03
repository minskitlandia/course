package by.itland.itjava.drobyazko.lesson08;

public class User {
    String name;
    byte age;
    int height;

    public User(String name, byte age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User (byte age,String name,  int height){
        this (name, age, height);
    }
    public User (byte age,  int height ,String name){
        this (name, age, height);
    }
    public User (String name,int height, byte age){
        this (name, age, height);
    }
    public User (int height ,String name, byte age){
        this (name, age, height);
    }
    public User (int height ,byte age,String name){
        this (name, age, height);
    }

    public static void main(String[] args) {
        User user = new User ("user",(byte)5,120);
        User user1 = new User ((byte)8,"user1",130);
        User user2 = new User ((byte)9,140, "user2");
        User user3 = new User ("user3",150,(byte)10);
        User user4 = new User (160,"user4", (byte)11);
        User user5 = new User (165, (byte)12,"user5");
    }


}

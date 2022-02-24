package by.itland.itjava.Artyr000.lesson08;

public class User {
    String name;
    byte age;
    int height;
    public User (String name, byte age, int h){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User ( String name, int h, byte age){
        this(name, age, h);
    }
    public User (byte age, String name, int h){
        this(name, age, h);
    }
    public User (byte age, int h, String name){
        this(name, age, h);
    }
    public User (int h, byte age, String name){
        this(name, age, h);
    }
    public User (int h, String name, byte age){
        this(name, age, h);
    }

    public static void main(String[] args) {
        User user1 = new User("user1", (byte) 5, 120);
        User user2 = new User("user2", 130, (byte) 6);
        User user3 = new User( (byte) 7,"user3", 140);
        User user4 = new User( (byte) 8, 150, "user4");
        User user5 = new User(160, "user5", (byte) 9);
        User user6 = new User(170,  (byte) 10, "user6");
    }
}

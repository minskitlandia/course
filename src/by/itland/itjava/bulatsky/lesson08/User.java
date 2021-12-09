package by.itland.itjava.bulatsky.lesson08;

public class User {
    String name;
    byte age;
    int height;

    public User(String name, byte age, int h) {
        this.name = name;
        this.age = age;
        this.height = h;
    }
    public User(byte age,String name, int h){
        this.name = name;
        this.age = age;
        this.height = h;
    }
    public User(byte age, int h, String name){
        this.name = name;
        this.age = age;
        this.height = h;
    }
    public User(String name, int h, byte age){
        this.name = name;
        this.age = age;
        this.height = h;
    }
    public User(int h, String name, byte age){
        this.name = name;
        this.age = age;
        this.height = h;
    }
    public User(int h, byte age, String name){
        this.name = name;
        this.age = age;
        this.height = h;
    }

    public static void main(String[] args) {
        User user = new User((byte) 5,"user" ,151 );
        User user1 = new User((byte) 3,132, "user1" );
        User user2 = new User("user2", (byte) 2, 101);
        User user3 = new User("user3", 200,(byte) 9);
        User user4 = new User(149,"user4", (byte) 0 );
        User user5 = new User(110,(byte) 1,"user5" );
    }
}


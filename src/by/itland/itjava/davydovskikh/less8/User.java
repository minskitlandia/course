package by.itland.itjava.davydovskikh.less8;

public class User {
    String name;
    byte age;
    int height;

    public User(String name, byte age, int height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public User(byte age,String name, int height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public User(int height,String name, byte age){
        this.name=name;
        this.age=age;
        this.height=height;
    }


    public User( byte age, int height,String name){
        this.name=name;
        this.age=age;
        this.height=height;
    }


    public User(String name, int height,byte age){
        this.name=name;
        this.age=age;
        this.height=height;
    }


    public User(int height,byte age,String name){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public static void main(String[] args) {
        User user = new User("user", (byte)16,170);
        User user2 = new User("user2", (byte)28,180);
        User user3 = new User("user3", (byte)6,120);
        User user4 = new User("user4", (byte)56,190);
        User user5 = new User("user5", (byte)15,145);
        User user6 = new User("user6", (byte)18,178);
    }

}

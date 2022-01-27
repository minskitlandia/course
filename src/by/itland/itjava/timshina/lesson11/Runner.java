package by.itland.itjava.timshina.lesson11;

public class Runner {
    public static void main(String[] args) {
        Chair taburet = new Chair("табуретка", 60, 40, 4, 50, false);
        Chair stul = new Chair("стул", 50, 30, 3, 40, true);

        System.out.println(taburet);
        System.out.println(stul);
    }
}

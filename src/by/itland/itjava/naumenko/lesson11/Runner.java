package by.itland.itjava.naumenko.lesson11;

public class Runner {
    public static void main(String[] args) {
        Chair taburet = new Chair("табуретка", 60, 40.5, 4, 50, false);
        Chair stul = new Chair("Стул", 110, 550, 6, 70, true);

        System.out.println(taburet);
        System.out.println(stul);
    }
}

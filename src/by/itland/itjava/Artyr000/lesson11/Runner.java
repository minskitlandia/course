package by.itland.itjava.Artyr000.lesson11;

import by.itland.itjava.Artyr000.lesson11.Task1.Chair;
import by.itland.itjava.Artyr000.lesson11.Task1.Polka;
import by.itland.itjava.Artyr000.lesson11.Task1.Table;
import by.itland.itjava.Artyr000.lesson11.Task2.Desktop;
import by.itland.itjava.Artyr000.lesson11.Task2.Phone;
import by.itland.itjava.Artyr000.lesson11.Task2.Planshet;
import by.itland.itjava.Artyr000.lesson11.Task3.Line;

public class Runner {
    public static void main(String[] args) {
        System.out.println('1');
        Chair chair = new Chair("Stul ", 20, 100.1, 4, 50, true);
        Polka polka = new Polka("Polka", 50, 20.5, 4, 50, 60);
        Table table = new Table("Table", 50, 100.5, 30, 25.1);
        System.out.println(chair);
        System.out.println(polka);
        System.out.println(table);
        System.out.println('2');
        Phone phone = new Phone("Iphone", "arial", true);
        Planshet planshet = new Planshet("Ipad", "arial", true, "top", 50);
        Desktop desktop = new Desktop("Desktop", "arial", true, "top", 50, 20, "max");
        System.out.println(phone);
        System.out.println(planshet);
        System.out.println(desktop);
        System.out.println('3');
        Line line = new Line(20, "blue", 20);
        


    }
}

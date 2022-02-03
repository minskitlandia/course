package by.itland.itjava.bulatsky.lesson11;

public class Runner {
    public static void main(String[] args) {
        Stul stul = new Stul("стул", 4, 4, 4, 4, true);
        Shkaf shkaf = new Shkaf("шкаф", 90, 200, "дерево", 2, 6);
        Table table = new Table("столик", 40, 50.5, 4, 64);
        Polka polka = new Polka("полочка", 13, 10.5, 3, 6);


        System.out.println(stul);
        System.out.println(shkaf);
        System.out.println(table);
        System.out.println(polka);
    }

    {
        Smartphone smartphone = new Smartphone("appstore", "калибри", false);
        Ipad ipad = new Ipad("brawlstars", "калибри", true, "прямоугольное", 1980 * 1200);
        Desktop desktop = new Desktop("telegram", "калибри", true, "прямоугольное", 1920 * 1080, 860 * 540, true);
        System.out.println(smartphone);
        System.out.println(ipad);
        System.out.println(desktop);
    }





}

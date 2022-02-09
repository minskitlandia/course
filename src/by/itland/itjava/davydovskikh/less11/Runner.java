package by.itland.itjava.davydovskikh.less11;

import by.itland.itjava.davydovskikh.less11.apps.Desktop;
import by.itland.itjava.davydovskikh.less11.apps.Phone;
import by.itland.itjava.davydovskikh.less11.apps.Tablet;
import by.itland.itjava.davydovskikh.less11.furnitura.Chair;
import by.itland.itjava.davydovskikh.less11.furnitura.Polka;
import by.itland.itjava.davydovskikh.less11.furnitura.Shkaf;
import by.itland.itjava.davydovskikh.less11.furnitura.Table;
import by.itland.itjava.davydovskikh.less11.geom.Ellipse;
import by.itland.itjava.davydovskikh.less11.geom.Geom;
import by.itland.itjava.davydovskikh.less11.geom.Ring;
import by.itland.itjava.davydovskikh.less11.geom.Rect;
import by.itland.itjava.davydovskikh.less11.geom.Line;
import by.itland.itjava.davydovskikh.less11.recipes.Pizza;
import by.itland.itjava.davydovskikh.less11.recipes.Porridge;
import by.itland.itjava.davydovskikh.less11.recipes.Salad;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        boolean oper = true;
        boolean operation = true;
        boolean komp = true;
        boolean eda = true;
        System.out.println("\nМНОГОУВАЖАЕМЫЙ!!!!Сергей Николаевич, вам предоставлен перечень заданий которая моя душа сделала.\nИтак что проверим первое?\n" +
                "1 - мебель,  2 - приложения,   3 - геометрия,   4 - рецепты");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("Добро пожаловать в нашу компанию мебели DaLuVe!, у нашей компании большой рост и мы добрались до мебели, но пока " +
                    "к сожалению у нас предоставлена не вся мебель.");
            while (oper) {
                System.out.println("\nЧто вас интересует?" +
                        "\n 1 - стулья, 2 - полки/комоды, 3 - шкафы, 4 - столы, 5 - выход");
                Scanner sc = new Scanner(System.in);
                int otvet = sc.nextInt();
                if (otvet == 1) {
                    System.out.println("Из стульев у нас выбор не самый большой. Всё что есть:\n");
                    Chair taburetka = new Chair("tабуретка", 60, 40, 4, 50, false);
                    Chair stul = new Chair("Стул", 110, 550, 6, 70, true);
                    System.out.println(taburetka);
                    System.out.println(stul);
                    System.out.println("\nСмотрим что-то дальше?" +
                            "\n 1 - да");
                    String a = scanner.next();
                    oper = a.equalsIgnoreCase("1");
                }
                if (otvet == 2) {
                    System.out.println("Данную категорию нам предоставляет компания *Полки*, у них большой ассортимент и поэтому не удивляйтесь в " +
                            "Полках есть комод)) " +
                            "\nВесь товар:\n");
                    Polka shelf = new Polka("полка", 50, 20, 3, 10);
                    Polka komod = new Polka("комод", 250, 850, 5, 50);
                    System.out.println(shelf);
                    System.out.println(komod);
                    System.out.println("\nСмотрим что-то дальше?" +
                            "\n 1 - да");
                    String a = scanner.next();
                    oper = a.equalsIgnoreCase("1");
                }
                if (otvet == 3) {
                    System.out.println("Все шкафы которые есть в наличии:\n");
                    Shkaf kupe = new Shkaf("шкаф-купе", 500, 1000, "дерево", 2, 4);
                    Shkaf bigshkaf = new Shkaf("большой шкаф", 850, 2300, "дерево + стекло", 4, 8);
                    System.out.println(kupe);
                    System.out.println(bigshkaf);
                    System.out.println("\nСмотрим что-то дальше?" +
                            "\n 1 - да");
                    String a = scanner.next();
                    oper = a.equalsIgnoreCase("1");
                }
                if (otvet == 4) {
                    System.out.println("Наши столики разбирают со скоростью света, заказали уже новую партию. Всё что осталось " +
                            "на данный момент:\n");
                    Table transformer = new Table("стол-трансформер", 150, 70, 4, 400);
                    Table lunch = new Table("стол обеденный", 140, 60, 4, 300);
                    System.out.println(transformer);
                    System.out.println(lunch);
                    System.out.println("\nСмотрим что-то дальше?" +
                            "\n 1 - да");
                    String a = scanner.next();
                    oper = a.equalsIgnoreCase("1");
                }
                if (otvet == 5) {
                    System.out.println("До свидания)");
                    break;
                }
            }
        }
        if (answer == 2) {
            System.out.println("хей! DaLuVe как обычно в деле поэтому это раздел <Приложения>");
            while (operation) {
                System.out.println("\nВыбирай гаджет:" +
                        "\n 1 - телефон,    2 - планшет,    3 - компьютер,    0 - выход");
                Scanner scnnner = new Scanner(System.in);
                int gadjet = scnnner.nextInt();
                if (gadjet == 1) {
                    System.out.println("ты выбрал телефон");
                    System.out.println("");
                    Phone iphone = new Phone("instagram", "times new roman", false);
                    System.out.println(iphone);
                    System.out.println("");
                    Phone sony = new Phone("vk", "Arial Black ", false);
                    System.out.println(sony);
                    System.out.println("\nСмотрим что-то дальше?" +
                            "\n 1 - да");
                    String a = scanner.next();
                    operation = a.equalsIgnoreCase("1");
                }
                if (gadjet == 2) {
                    System.out.println("ты выбрал планшет");
                    System.out.println("");
                    Tablet tablethuawey = new Tablet("photoshop", "Impact", false, "135x90", "top");
                    System.out.println(tablethuawey);
                    System.out.println("");
                    Tablet tabletxiaomy = new Tablet("discord", "Tahoma", false, "250x100", "top");
                    System.out.println(tabletxiaomy);
                    System.out.println("\nСмотрим что-то дальше?" +
                            "\n 1 - да");
                    String a = scanner.next();
                    operation = a.equalsIgnoreCase("1");
                }
                if (gadjet == 3) {
                    while (komp) {
                        System.out.println("ты выбрал компьютер" +
                                "\n Выбери размер:" +
                                "\n 1 - большой, 2- средний, 3-маленький");
                        Scanner scannter = new Scanner(System.in);
                        int size = scannter.nextInt();
                        if (size == 1) {
                            Desktop big = new Desktop("java", "Verdana", true, "297x210", "Centre, top");
                            System.out.println(big);
                        }
                        if (size == 2) {
                            Desktop medium = new Desktop("java", "Verdana", true, "198x140", "Centre, top");
                            System.out.println(medium);
                        }
                        if (size == 3) {
                            Desktop small = new Desktop("java", "Verdana", true, "100x70", "Centre, top");
                            System.out.println(small);
                        }
                        System.out.println("\nСмотрим что-то дальше?" +
                                "\n 1 - да");
                        String a = scanner.next();
                        operation = a.equalsIgnoreCase("1");
                    }
                }
                if (gadjet == 5) {
                    System.out.println("До свидания)");
                    break;
                }
            }
        }
        if (answer == 3) {
            System.out.println("Абстрактный класс от DaLuVe");
            Line line = new Line(2, "red", 15);
            Rect rect = new Rect(2, "blue", 15, 30);
            Ring ring = new Ring(2, "pink", 5);
            Ellipse ellipse = new Ellipse(2, "green", 5, 4);
            Geom[] geom = new Geom[4];
            geom[0] = line;
            geom[1] = rect;
            geom[2] = ring;
            geom[3] = ellipse;
            for (Geom item : geom) {
                System.out.println(item);
                item.draw();
            }
        }
        if (answer == 4) {
            System.out.println("Добро пожаловать в ресторан DaLuVe!!!" +
                    "\n ты можешь выбрать любую пиццу,салат или даже кашу и заказать, а мы еще и рецепт рассскажем что бы ты потом сделал её сам\n\n");
            while (eda) {
                System.out.println("что именно вы хотите?\n");
                System.out.println("1 - пицца, 2 - салат, 3 - каша");
                Scanner edda = new Scanner(System.in);
                int menu = edda.nextInt();
                if (menu == 1) {
                    System.out.println("ингридиентов у нас мало, представляем вам одну,но оооочень вкусную пиццу:\n");
                    Pizza pizzapolovinka = new Pizza("пицца из половинок", "собери свою пиццу из половинок", "ну сам реши",
                            "блин открой ютуб... там всё есть");
                    System.out.println(pizzapolovinka);
                }
                if (menu == 2) {
                    System.out.println("наш коронный салат!!:\n");
                    Salad kleopatra = new Salad("клеопатра", "обычный", "куриное филе, огурцы, соевая заправка (масло оливковое, соевый соус, лимонный сок, сахар), " +
                            "апельсин, ромен-салат, петрушка", "придумай сам");
                    System.out.println(kleopatra);
                }
                if (menu == 3) {
                    Porridge porridge = new Porridge("манная каша", "обычная вкусная каша", "манная каша + вода/молоко + соль и сахар", "Манную крупу, соль, сахар положить в отдельную мисочку." +
                            "За несколько секунд до закипания молока тонкой струйкой высыпать манку с сахаром и солью.После закипания помешивать кашу 2–3 " +
                            "минуты на медленном огне, затем закрыть крышкой и укутать полотенцем, оставить на 10–15 минут.");
                    System.out.println(porridge);
                }
            }
        }
    }
}

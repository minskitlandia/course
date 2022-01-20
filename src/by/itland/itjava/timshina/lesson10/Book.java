package by.itland.itjava.timshina.lesson10;

import java.time.Year;
import java.util.Locale;

public class Book {
    private String name;
    private int page;
    private double price;
    private int year;

    public Book() {

    }

    public Book(String name, int page, double price, int year) {
        this.name = name;
        this.page = page;
        this.price = price;
        this.year = year;
        checkName();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void checkName() {
        if (this.name.toLowerCase().contains("программирование")) {
            price *= 2;
        }
    }

    public double pricePage() {
        return price / page;
    }

    public void updatePrice() {
        double newprice = price;
        int old = Year.now().getValue() - year;
        while (old >= 5 && price >= 0.5 * newprice) {
            price *= 0.95;
            old -= 5;
        }
    }
}

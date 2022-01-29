package by.itland.itjava.naumenko.lesson10;

import java.time.Year;
import java.util.Date;

public class Book {

    private String name;
    private double price;
    private int page;
    private int year;

    public Book() {
    }

    public Book(String name, double price, int page, int year) {
        this.name = name;
        this.price = price;
        this.page = page;
        this.year = year;
        checkName();
        updatePrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void checkName() {
        if (name.toLowerCase().contains("программирование"))
            price *= 2;
    }

    public double prisePage() {
        return price / page;
    }

    public void updatePrice() {
        double newPrice = price;
        double newYear = year;

        while (Year.now().getValue() - newYear >= 5 && price > newPrice * 0.5) {
            price *= 0.95;
            newYear += 5;
        }
    }
}

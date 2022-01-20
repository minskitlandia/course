package by.itland.itjava.drobyazko.lesson10;

import java.time.Year;

public class Book {
    private String name;
    private double price;
    private int page;
    private int year;

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
        double newPrice = price;
        double newYear = year;
        while (2022 - year >= 5 && price > newPrice * 0.5) {
            price *= 0.95;
            newYear += 5;
        }
    }
}

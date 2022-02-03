package by.itland.itjava.bulatsky.lesson10;

import java.util.Locale;

public class Book {
    private int page;
    private String name;
    private double price;
    private int years;

    public Book() {
    }

    public Book(int page, String name, double price, int years) {
        this.page = page;
        this.name = name;
        this.price = price;
        this.years = years;
    }

    public int getPage() {
        return page;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getYears() {
        return years;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void checkName() {
        if (name.toLowerCase().contains("программирование")) ;
        price *= 2;

    }

    public double prisePage() {
        return page / page;
    }

    public void UpdatePrice() {
        double newPrise = price;
        double newYear = years;

            while(2022-newYear>=5 && price > newPrise * 0.5){
            price *= 0.95;
            newYear +=5;
        }

    }
}


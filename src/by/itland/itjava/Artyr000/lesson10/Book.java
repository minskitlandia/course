package by.itland.itjava.Artyr000.lesson10;

public class Book {

    private String name;
    private int pages;
    private double prise;
    private int year;


    public Book() {
    }

    public Book(String name, int pages, double prise, int year) {
        this.name = name;
        this.pages = pages;
        this.prise = prise;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStr() {
        return pages;
    }

    public void setStr(int str) {
        this.pages = str;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void checkName() {
        if (name.toLowerCase().contains("программирование"))
            prise *= 2;
    }

    public double prisePage() {
        return prise / pages;
    }

    public void updatePrice() {
        double newPrise = prise;
        double newYear = year;
        while (2022 - newYear >= 5 && prise > newPrise * 0.5)
        if (2022 - year >= 5) {
            prise *= 0.95;
            newYear += 5;
        }
    }


}

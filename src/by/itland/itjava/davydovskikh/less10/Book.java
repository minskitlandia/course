package by.itland.itjava.davydovskikh.less10;

public class Book {
    private String name;
    private double price;
    private int pages;
    private int year;

    public Book(){

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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void CheckName(){
        if(name.toLowerCase(). contains("программирование"))
            price *= 2;
    } 
    public double pricePages(){
        return price/pages;
    }
    public void updatePrice(){
        double newPrice = price;
        int newyear = 2022- year;
        while (newyear >= 5 && price>= 0.5 +newPrice) {
            price *= 0.95;
            newyear -= 5;

        }
    }
}


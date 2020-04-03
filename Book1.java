package Buoi6;

public class Book1 {
    private String name;
    private Author1 author;
    private double price;
    private int qty;

    public Book1(String name, Author1 author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book1(String name, Author1 author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty =qty;
    }

    public String getName() {
        return name;
    }
    public Author1 getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty =qty;
    }

    public String toString() {
        return  String.format("Book1[Name = %s, %s, price = %s, qty = %s]", name, author.toString(), price, qty);
    }

    public String getNameAuthor() {
        return author.getName();
    }
}

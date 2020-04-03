package Buoi6;

import java.util.Arrays;

public class Book2 {
    private String name;
    private Author1[] author1s;
    private double price;
    private int qty = 0;

    public Book2(String name, Author1[] author1s, double price) {
        this.name = name;
        this.author1s = author1s;
        this.price = price;

    }
    public Book2(String name, Author1[] author1s, double price, int qty) {
        this.name = name;
        this.author1s = author1s;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
    public Author1[] getAuthor1s() {
        return author1s;
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
        this.qty = qty;
    }

    public String toString() {
        return "Book2{"+ "name =" + name +", author1s = " + Arrays.toString(author1s) +", price = "+ price + ", qty = " + price + ", qty = " + qty + "}";
    }

    public String getAuthorNames() {
       String au = "";
       for (int i = 0;i < getAuthor1s().length; i++) {
           au+=getAuthor1s()[i].getName()+", ";
       }
       return au;
    }
}

package com.test.java.ch08.ex06;

public class Book {
    public String title;
    private String author;
    public int price;
    protected int dollarPrice;
    public int edition;
    protected float tax;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(int price) {
        this.price = price;
        setDollarPrice(price);
    }

    public int getPrice() {
        return price;
    }

    protected void setDollarPrice(int price) {
        dollarPrice = (int)(price / 1000f);
    }

    public int getDollarPrice() {
        return dollarPrice;
    }

    protected void setTax(float tax) {
        this.tax = tax;
    }

    protected float getTax() {
        return tax;
    }

    public void setEdition(int edition){
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }
}

package com.nazjara.escaping_references.example2;

public class Book {
    private int id;
    private String title;
    private String author;
    private Price price;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(int id, String title, String author, Price price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    // Price is immutable so returning reference on it is acceptable
    public Price getPrice() {
        return this.price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

}

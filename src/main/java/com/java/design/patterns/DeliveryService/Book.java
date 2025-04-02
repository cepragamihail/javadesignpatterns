package com.java.design.patterns.DeliveryService;

public class Book extends Product {
    private final String author;

    public Book(String title, double price, String author) {
        super(title, price);
        this.author = author;
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + getTitle() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

}

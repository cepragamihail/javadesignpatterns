package com.java.design.patterns.structural.flyweight.bookstore;

import lombok.Data;

@Data
public class Book {
    private final String name;
    private final double price;
    private final BookType type;
}

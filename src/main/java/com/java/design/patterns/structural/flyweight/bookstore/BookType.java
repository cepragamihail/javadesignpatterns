package com.java.design.patterns.structural.flyweight.bookstore;

import lombok.AllArgsConstructor;
import lombok.Getter;
/*
 * The BookType class represents the intrinsic state of a book.
 * It contains the type of the book, the distributor, 
 * and any other data that is shared among multiple books.
 * This class is immutable and serves as a flyweight.
 */
@Getter
@AllArgsConstructor
public class BookType {
    private final String type;
    private final String distributor;
    private final String otherData;
}

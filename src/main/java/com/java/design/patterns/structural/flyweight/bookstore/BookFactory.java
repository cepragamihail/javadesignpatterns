package com.java.design.patterns.structural.flyweight.bookstore;

import java.util.HashMap;
import java.util.Map;

/*
 * The BookFactory class is responsible for creating and managing the BookType objects.
 * It ensures that only one instance of each BookType is created and reused.
 * This is the core of the Flyweight pattern, where shared objects are used to minimize memory usage.
 */
public class BookFactory {
    private static final Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String otherData) {
        if (!bookTypes.containsKey(type)) {
            bookTypes.put(type, new BookType(type, distributor, otherData));
        }
        return bookTypes.get(type);
    }
}

package com.java.design.patterns.structural.flyweight.bookstore;

public class Flyweight {

    private static final int BOOK_TYPES = 2;
    private static final int BOOKS_TO_INSERT = 10_000_000;

    public static void main(String[] args) {
        Store store = new Store();
        // Simulating the storage of a large number of books
        for (int i = 0; i < BOOKS_TO_INSERT; i++) {
            String type = (i % BOOK_TYPES == 0) ? "Fiction" : "Non-Fiction";
            String distributor = (i % BOOK_TYPES == 0) ? "Distributor A" : "Distributor B";
            String otherData = "Other Data " + i;
            store.storeBook("Book " + i, Math.random() * 100, type, distributor, otherData);
        }
        // Print the stored books
        // Note: In a real-world scenario, you might want to limit the number of books printed
        // to avoid overwhelming the console output. Here, we print all for demonstration purposes.
        store.printBooks();
    }
}

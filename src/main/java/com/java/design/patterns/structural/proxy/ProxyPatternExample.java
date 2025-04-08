package com.java.design.patterns.structural.proxy;

public class ProxyPatternExample {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_10mb.jpg");
        Image image2 = new ProxyImage("test_20mb.jpg");

        // image1 will be loaded from disk
        image1.display();
        System.out.println();

        // image2 will be loaded from disk
        image2.display();
        System.out.println();

        // image1 will not be loaded from disk
        image1.display();
        System.out.println();
        // image2 will not be loaded from disk
        image2.display();
        System.out.println();
    }
}

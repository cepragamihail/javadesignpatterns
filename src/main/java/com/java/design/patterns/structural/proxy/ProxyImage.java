package com.java.design.patterns.structural.proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }

    @Override
    public String toString() {
        return "ProxyImage{" +
                "realImage=" + realImage +
                ", filename='" + filename + '\'' +
                '}';
    }   
}

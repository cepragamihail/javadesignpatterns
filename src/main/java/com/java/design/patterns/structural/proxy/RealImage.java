package com.java.design.patterns.structural.proxy;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public String toString() {
        return "RealImage{" +
                "filename='" + filename + '\'' +
                '}';
    }

}

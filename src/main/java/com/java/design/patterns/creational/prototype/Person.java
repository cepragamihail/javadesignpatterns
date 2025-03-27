package com.java.design.patterns.creational.prototype;

public class Person {

    public String[] names;
    public Address address;
    
    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Names: " + String.join(" ", names) + ", Address: " + address;
    }

}

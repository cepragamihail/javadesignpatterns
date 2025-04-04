package com.java.design.patterns.creational.prototype.cloneable;

public class Person implements Cloneable {

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

    // Deep copy
    @Override
    public Person clone() throws CloneNotSupportedException {
        return new Person(names.clone(), address.clone());
    }

}

package com.java.design.patterns.creational.prototype.copyconstructors;

public class Employee {

    public String name;
    public Address address;
    
    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Copy constructor
    public Employee(Employee other) {
        this.name = other.name;
        this.address = new Address(other.address);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address;
    }

}

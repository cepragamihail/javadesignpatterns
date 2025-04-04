package com.java.design.patterns.creational.prototype.copyconstructors;

public class Address {

    public String streetName;
    public int houseNumber;

    public Address(String name, int number) {
        this.streetName = name;
        this.houseNumber = number;

    }

    // Copy constructor
    public Address(Address other) {
        this.streetName = other.streetName;
        this.houseNumber = other.houseNumber;
    }

    @Override
    public String toString() {
        return "Street Name :" + this.streetName + ", House Number: " + houseNumber;
    }


}

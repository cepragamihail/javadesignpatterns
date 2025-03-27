package com.java.design.patterns.creational.prototype;

public class Address {

    public String streetName;
    public int houseNumber;

    public Address(String name, int number) {
        this.streetName = name;
        this.houseNumber = number;

    }

    @Override
    public String toString() {
        return "Street Name :" + this.streetName + ", House Number: " + houseNumber;
    }

}

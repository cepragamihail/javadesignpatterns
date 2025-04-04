package com.java.design.patterns.creational.prototype.cloneable;

public class Address implements Cloneable {

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

    // Deep copy
    @Override
    public Address clone() throws CloneNotSupportedException  {
        return new Address(streetName, houseNumber);
    }

}

package com.java.design.patterns;

import com.java.design.patterns.creational.prototype.cloneable.Address;
import com.java.design.patterns.creational.prototype.cloneable.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
            runCloneableImplementation();
    }

    public static void runCloneableImplementation() throws CloneNotSupportedException {
        Address address = new Address("123 London Road", 100);
        Person john = new Person(new String[]{"John", "Smith"}, address);

        // Person jane = john; // Shallow copy
        Person jane = john.clone(); // Deep copy

        jane.names[0] = "Jane";
        jane.address.houseNumber = 102;

        System.out.println(john);
        System.out.println(jane);
    }
}

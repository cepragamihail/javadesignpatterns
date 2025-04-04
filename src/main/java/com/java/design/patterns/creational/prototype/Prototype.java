package com.java.design.patterns.creational.prototype;

import org.apache.commons.lang3.SerializationUtils;

import com.java.design.patterns.creational.prototype.cloneable.Address;
import com.java.design.patterns.creational.prototype.cloneable.Person;
import com.java.design.patterns.creational.prototype.copyconstructors.Employee;
import com.java.design.patterns.creational.prototype.serializable.Foo;

public class Prototype {

    public static void main(String[] args) throws Exception {
        System.out.println("Implementing cloneable");
        runCloneableImplementation();
        System.out.println("=====================================");
        System.out.println("Implementing copy constructors");
        runCopyConstructorsImplementation();
        System.out.println("=====================================");
        System.out.println("Implementing clone with serializable");
        runCloneWithSerializableImplementation();
    }

        public static void runCloneableImplementation() throws CloneNotSupportedException {
        Address address = new Address("123 London Road", 100);
        Person john = new Person(new String[] { "John", "Smith" }, address);

        // Person jane = john; // Shallow copy
        Person jane = john.clone(); // Deep copy

        jane.names[0] = "Jane";
        jane.address.houseNumber = 102;

        System.out.println(john);
        System.out.println(jane);
    }

    public static void runCopyConstructorsImplementation() {
        com.java.design.patterns.creational.prototype.copyconstructors.Address address = new com.java.design.patterns.creational.prototype.copyconstructors.Address(
                "123 London Road", 100);
        Employee john = new Employee("John", address);

        Employee jane = new Employee(john);
        jane.name = "Jane";
        jane.address.houseNumber = 102;

        System.out.println(john);
        System.out.println(jane);
    }

    public static void runCloneWithSerializableImplementation() {
        Foo foo = new Foo(42, "life");
        Foo foo2 = SerializationUtils.roundtrip(foo);
        foo2.whatever = "xyz";
        System.out.println(foo);
        System.out.println(foo2);
    }

}

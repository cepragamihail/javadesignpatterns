package com.java.design.patterns.creational.prototype.copyconstructors;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;




class AddressTest {

    @Test
    void testConstructor() {
        Address address = new Address("Main Street", 123);
        assertEquals("Main Street", address.streetName);
        assertEquals(123, address.houseNumber);
    }

    @Test
    void testCopyConstructor() {
        Address original = new Address("Main Street", 123);
        Address copy = new Address(original);

        // Verify the copied values
        assertEquals(original.streetName, copy.streetName);
        assertEquals(original.houseNumber, copy.houseNumber);

        // Verify that the objects are not the same instance
        assertNotSame(original, copy);
    }

    @Test
    void testToString() {
        Address address = new Address("Main Street", 123);
        String expected = "Street Name :Main Street, House Number: 123";
        assertEquals(expected, address.toString());
    }
}
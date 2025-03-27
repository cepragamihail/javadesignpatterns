package com.java.design.patterns.creational.prototype.copyconstructors;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class EmployeeTest {

    @Test
    void testEmployeeCopyConstructor() {
        // Arrange
        Address originalAddress = new Address("123 Main St", 123);
        Employee originalEmployee = new Employee("John Doe", originalAddress);

        // Act
        Employee copiedEmployee = new Employee(originalEmployee);

        // Assert
        assertNotSame(originalEmployee, copiedEmployee, "Copied employee should not be the same instance as the original.");
        assertEquals(originalEmployee.name, copiedEmployee.name, "Names should be equal.");
        assertNotSame(originalEmployee.address, copiedEmployee.address, "Address should be a deep copy.");
        assertEquals(originalEmployee.address.streetName, copiedEmployee.address.streetName, "Street should be equal.");
        assertEquals(originalEmployee.address.houseNumber, copiedEmployee.address.houseNumber, "House number should be equal.");
    }

    @Test
    void testToString() {
        // Arrange
        Address address = new Address("456 Elm St", 123);
        Employee employee = new Employee("Jane Doe", address);

        // Act
        String result = employee.toString();

        // Assert
        assertEquals("Name: Jane Doe, Address: Street Name :456 Elm St, House Number: 123", result);
    }
}
package com.coherentsolutions.advanced.java.section02;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex06EmployeeStreamExample demonstrates a practical application of Streams.
 * It processes a list of employees, filters by salary, collects their names, and converts them to uppercase.
 */
class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Ex06EmployeeStreamExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = List.of(
                new Employee("Alice", 6000),
                new Employee("Bob", 4000),
                new Employee("Charlie", 7000),
                new Employee("David", 3000)
        );

        // Stream pipeline: filter, map, and collect
        List<String> highEarners = employees.stream()
                .filter(employee -> employee.getSalary() > 5000) // Filter by salary
                .map(Employee::getName) // Get employee names
                .map(String::toUpperCase) // Convert names to uppercase
                .collect(Collectors.toList()); // Collect into a new list

        System.out.println("Employees with salary above 5000: " + highEarners); // Output: [ALICE, CHARLIE]
    }
}

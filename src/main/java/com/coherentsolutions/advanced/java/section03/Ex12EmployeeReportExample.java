package com.coherentsolutions.advanced.java.section03;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex12EmployeeReportExample demonstrates filtering, sorting, and collecting elements from a stream
 * in a real-world example of employee data processing.
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

public class Ex12EmployeeReportExample {
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = List.of(
                new Employee("Alice", 6000),
                new Employee("Bob", 4000),
                new Employee("Charlie", 7000),
                new Employee("David", 3000)
        );

        // Stream pipeline: filter, sort, and collect into a formatted string
        String employeeReport = employees.stream()
                .filter(e -> e.getSalary() > 5000)            // Filter by salary
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()))  // Sort by salary (descending)
                .map(Employee::getName)                        // Extract employee names
                .collect(Collectors.joining(", "));            // Collect into a comma-separated string

        System.out.println("Employee Report: " + employeeReport);
    }
}

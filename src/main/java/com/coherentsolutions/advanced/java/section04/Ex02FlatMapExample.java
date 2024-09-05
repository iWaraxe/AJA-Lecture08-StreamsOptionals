package com.coherentsolutions.advanced.java.section04;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex02FlatMapExample demonstrates the use of flatMap() to flatten nested lists into a single stream.
 * It processes a list of departments, each containing employees, and flattens them into a single stream of employees.
 */
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Department {
    String name;
    List<Employee> employees;

    Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

public class Ex02FlatMapExample {
    public static void main(String[] args) {
        // List of departments, each with its own employees
        List<Department> departments = List.of(
                new Department("HR", List.of(new Employee("Alice"), new Employee("Bob"))),
                new Department("IT", List.of(new Employee("Charlie"), new Employee("David"))),
                new Department("Sales", List.of(new Employee("Eve")))
        );

        // Flattening the nested employee lists into a single stream of employees
        List<String> employeeNames = departments.stream()
                .flatMap(dept -> dept.getEmployees().stream())  // Flattening employee lists
                .map(Employee::toString)  // Converting Employee objects to names
                .collect(Collectors.toList());

        System.out.println("Employees: " + employeeNames);
    }
}

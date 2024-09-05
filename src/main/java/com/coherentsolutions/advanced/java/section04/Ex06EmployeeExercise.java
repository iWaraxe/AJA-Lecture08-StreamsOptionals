package com.coherentsolutions.advanced.java.section04;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex06EmployeeExercise demonstrates a hands-on exercise using flatMap().
 * It flattens a list of employees across departments and filters names starting with "C".
 */
class EmployeeExercise {
    String name;

    EmployeeExercise(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class DepartmentExercise {
    String name;
    List<EmployeeExercise> employees;

    DepartmentExercise(String name, List<EmployeeExercise> employees) {
        this.name = name;
        this.employees = employees;
    }

    public List<EmployeeExercise> getEmployees() {
        return employees;
    }
}

public class Ex06EmployeeExercise {
    public static void main(String[] args) {
        // List of departments with nested employees
        List<DepartmentExercise> departments = List.of(
                new DepartmentExercise("HR", List.of(new EmployeeExercise("Alice"), new EmployeeExercise("Bob"))),
                new DepartmentExercise("IT", List.of(new EmployeeExercise("Charlie"), new EmployeeExercise("David"))),
                new DepartmentExercise("Sales", List.of(new EmployeeExercise("Eve"), new EmployeeExercise("Catherine")))
        );

        // Flattening the list of lists, filtering names starting with "C", and collecting into a list
        List<String> employeeNames = departments.stream()
                .flatMap(dept -> dept.getEmployees().stream())  // Flattening employee lists
                .map(EmployeeExercise::getName)  // Getting employee names
                .filter(name -> name.startsWith("C"))  // Filtering names starting with "C"
                .collect(Collectors.toList());  // Collecting to a list

        System.out.println("Employees whose names start with 'C': " + employeeNames);
    }
}

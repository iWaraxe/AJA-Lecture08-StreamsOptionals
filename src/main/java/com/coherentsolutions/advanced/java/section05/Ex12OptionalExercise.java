package com.coherentsolutions.advanced.java.section05;

/**
 * Ex12OptionalExercise demonstrates the use of Optional with map() and orElse() to handle potentially null values.
 * The method getEmployeeName() returns an Optional, allowing for safe operation on the result.
 */
import java.util.Optional;

public class Ex12OptionalExercise {
    public static void main(String[] args) {
        // Using Optional to get the employee name safely
        String employeeName = getEmployeeName()
                .map(String::toUpperCase)  // Convert name to uppercase if present
                .orElse("Unknown Employee");  // Provide default if no name is present

        System.out.println("Employee Name: " + employeeName);
    }

    // Method returning Optional instead of possibly null value
    public static Optional<String> getEmployeeName() {
        String name = null;  // Could be null, so we wrap it in an Optional
        return Optional.ofNullable(name);
    }
}

package com.coherentsolutions.advanced.java.section06;

import java.util.List;
import java.util.Optional;

/**
 * Ex02StreamOptionalExample demonstrates the combination of Stream operations like filter and map,
 * and the use of Optional with findFirst() to handle possibly missing values.
 */
public class Ex02StreamOptionalExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "Jack", "John");

        // Stream pipeline combining filtering, mapping, and Optional
        Optional<String> firstNameWithJ = names.stream()
                .filter(name -> name.startsWith("J"))  // Filter names starting with 'J'
                .map(String::toUpperCase)  // Convert to uppercase
                .findFirst();  // Return the first match as an Optional

        // Handling the result
        firstNameWithJ.ifPresentOrElse(
                name -> System.out.println("First name with 'J': " + name),
                () -> System.out.println("No name starting with 'J' found")
        );
    }
}

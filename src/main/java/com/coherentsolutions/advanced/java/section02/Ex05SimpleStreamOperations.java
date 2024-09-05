package com.coherentsolutions.advanced.java.section02;

import java.util.List;

/**
 * Ex05SimpleStreamOperations demonstrates basic stream operations such as filter, map, and forEach.
 */
public class Ex05SimpleStreamOperations {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        // Stream pipeline using filter, map, and forEach
        names.stream()
                .filter(name -> name.length() > 3) // Filter names longer than 3 characters
                .map(s -> s.toUpperCase()) // Convert each name to uppercase
                .forEach(System.out::println); // Print each name
    }
}

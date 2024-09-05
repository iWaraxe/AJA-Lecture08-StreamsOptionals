package com.coherentsolutions.advanced.java.section03;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex11StreamPipelineExample demonstrates combining intermediate and terminal operations in Streams.
 * It filters names, maps them to uppercase, and collects the results into a list.
 */
public class Ex11StreamPipelineExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        // Filtering names with more than 3 characters, converting to uppercase, and collecting them
        List<String> processedNames = names.stream()
                .filter(name -> name.length() > 3)  // Intermediate operation
                .map(String::toUpperCase)           // Intermediate operation
                .collect(Collectors.toList());      // Terminal operation

        System.out.println("Processed names: " + processedNames);
    }
}

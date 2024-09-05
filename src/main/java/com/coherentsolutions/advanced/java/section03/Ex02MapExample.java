package com.coherentsolutions.advanced.java.section03;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex02MapExample demonstrates the use of the map() intermediate operation in Streams.
 * It transforms each element in the stream, converting names to uppercase.
 */
public class Ex02MapExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Mapping names to their uppercase equivalent
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase names: " + upperCaseNames);
    }
}
